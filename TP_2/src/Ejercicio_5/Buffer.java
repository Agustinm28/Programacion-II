package Ejercicio_5;

import java.util.LinkedList;
import java.util.Queue;
public class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int maxSize;

    public Buffer(int maxSize) {
        this.maxSize = maxSize;
    }

    public Queue<Integer> getQueue() {
        return queue;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setQueue(Queue<Integer> queue) {
        this.queue = queue;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized void produce(int value) {
        while (queue.size() == maxSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException("Programa finalizado");
            }
        }
        queue.add(value);
        System.out.println("Producido: " + value);
        notifyAll();
    }

    public synchronized int consume() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException("Programa finalizado");
            }
        }
        int value = queue.remove();
        System.out.println("Consumido: " + value);
        notifyAll();
        return value;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

