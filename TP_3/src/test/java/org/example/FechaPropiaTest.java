package org.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FechaPropiaTest {

    private String fechaInicial;
    private int days;
    private String fechaEsperada;
    private boolean sumar; // booleano para indica si se quiere sumar o restar los días

    public FechaPropiaTest(String fechaInicial, int days, String fechaEsperada, boolean sumar) {
        this.fechaInicial = fechaInicial;
        this.days = days;
        this.fechaEsperada = fechaEsperada;
        this.sumar = sumar;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                // Casos de prueba para sumar fecha
                {"2019-01-01", 1, "2019-01-02", true},
                {"2019-01-01", 15, "2019-01-16", true},
                {"2019-01-01", 40, "2019-02-10", true},
                {"2019-01-01", 80, "2019-03-22", true},
                {"2019-01-01", 180, "2019-06-30", true},
                {"2019-02-27", 1, "2019-02-28", true},
                {"2019-02-28", 1, "2019-03-01", true},
                {"2019-03-01", 1, "2019-03-02", true},
                {"2019-03-01", 15, "2019-03-16", true},
                {"2019-03-01", 40, "2019-04-10", true},
                {"2019-03-01", 80, "2019-05-20", true},
                {"2019-03-01", 180, "2019-08-28", true},
                {"2020-01-01", 1, "2020-01-02", true},
                {"2020-01-01", 15, "2020-01-16", true},
                {"2020-01-01", 40, "2020-02-10", true},
                {"2020-01-01", 80, "2020-03-21", true},
                {"2020-01-01", 180, "2020-06-29", true},
                {"2020-02-27", 1, "2020-02-28", true},
                {"2020-02-28", 1, "2020-02-29", true},
                {"2020-02-29", 1, "2020-03-01", true},
                {"2020-03-01", 1, "2020-03-02", true},
                {"2020-03-01", 15, "2020-03-16", true},
                {"2020-03-01", 40, "2020-04-10", true},
                {"2020-03-01", 80, "2020-05-20", true},
                {"2020-03-01", 180, "2020-08-28", true},
                {"2020-12-15", 1, "2020-12-16", true},
                {"2020-12-15", 15, "2020-12-30", true},
                {"2020-12-15", 40, "2021-01-24", true},
                {"2020-12-15", 80, "2021-03-05", true},
                {"2020-12-15", 180, "2021-06-13", true},

                // Casos de prueba para restar fecha
                {"2019-01-01", 1, "2018-12-31", false},
                {"2019-01-01", 15, "2018-12-17", false},
                {"2019-01-01", 40, "2018-11-22", false},
                {"2019-01-01", 80, "2018-10-13", false},
                {"2019-01-01", 180, "2018-07-05", false},
                {"2019-02-27", 1, "2019-02-26", false},
                {"2019-02-28", 1, "2019-02-27", false},
                {"2020-02-29", 1, "2020-02-28", false},
                {"2020-03-01", 1, "2020-02-29", false},
                {"2020-03-01", 15, "2020-02-15", false},
                {"2020-03-01", 40, "2020-01-21", false},
                {"2020-03-01", 80, "2019-12-12", false},
                {"2020-03-01", 180, "2019-09-03", false},
                {"2020-12-15", 1, "2020-12-14", false},
                {"2020-12-15", 15, "2020-11-30", false},
                {"2020-12-15", 40, "2020-11-05", false},
                {"2020-12-15", 80, "2020-09-26", false},
                {"2020-12-15", 180, "2020-06-18", false},
        });
    }

    @Test
    public void testFechaPropia() {
        FechaPropia fecha = new FechaPropia(fechaInicial);
        if (sumar) {
            fecha.sumarDias(days);
        } else {
            fecha.restarDias(days);
        }
        assertEquals(fechaEsperada, fecha.getFecha());
    }
}

