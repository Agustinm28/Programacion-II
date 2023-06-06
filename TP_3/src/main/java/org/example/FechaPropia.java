package org.example;

import lombok.Data;

@Data
public class FechaPropia {

    private String fecha;

    public FechaPropia(String fecha) {
        this.fecha = fecha;
    }

    public void sumarDias(int days) {
        // extraer el año, mes y dia del string fecha
        int year = Integer.parseInt(fecha.substring(0, 4));
        int month = Integer.parseInt(fecha.substring(5, 7));
        int day = Integer.parseInt(fecha.substring(8, 10));

        // calcular el nuevo dia sumando los dias
        day += days;

        // ajustar el mes y el año si el dia se sale del rango
        while (day > diasEnMes(month, year)) {
            day -= diasEnMes(month, year);
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        // formatear el nuevo string fecha con ceros a la izquierda si es necesario
        String newYear = String.format("%04d", year);
        String newMonth = String.format("%02d", month);
        String newDay = String.format("%02d", day);

        // actualizar el atributo fecha
        this.fecha = newYear + "-" + newMonth + "-" + newDay;
    }

    public void restarDias(int days) {
        // extraer el año, mes y dia del string fecha
        int year = Integer.parseInt(fecha.substring(0, 4));
        int month = Integer.parseInt(fecha.substring(5, 7));
        int day = Integer.parseInt(fecha.substring(8, 10));

        // calcular el nuevo dia restando los dias
        day -= days;

        // ajustar el mes y el año si el dia se sale del rango
        while (day < 1) {
            month--;
            if (month < 1) {
                month = 12;
                year--;
            }
            day += diasEnMes(month, year);
        }

        // formatear el nuevo string fecha con ceros a la izquierda si es necesario
        String newYear = String.format("%04d", year);
        String newMonth = String.format("%02d", month);
        String newDay = String.format("%02d", day);

        // actualizar el atributo fecha
        this.fecha = newYear + "-" + newMonth + "-" + newDay;
    }

    // método auxiliar que devuelve los días que tiene un mes dado un año
    private int diasEnMes(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (esBisiesto(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; // error
        }
    }

    // método que devuelve true si un año es bisiesto y false si no lo es
    private boolean esBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
