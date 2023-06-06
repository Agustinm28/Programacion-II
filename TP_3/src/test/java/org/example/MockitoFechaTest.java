package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MockitoFechaTest {

    @Test
    public void sumarDiasTest() {
        // mock de la clase FechaPropia
        FechaPropia fechaPropia = mock(FechaPropia.class);

        when(fechaPropia.getFecha()).thenReturn("2019-01-01");
        fechaPropia.sumarDias(180);
        when(fechaPropia.getFecha()).thenReturn("2019-06-30");
        assertEquals("2019-06-30", fechaPropia.getFecha());

        when(fechaPropia.getFecha()).thenReturn("2019-02-27");
        fechaPropia.sumarDias(1);
        when(fechaPropia.getFecha()).thenReturn("2019-02-28");
        assertEquals("2019-02-28", fechaPropia.getFecha());

        when(fechaPropia.getFecha()).thenReturn("2019-02-28");
        fechaPropia.sumarDias(1);
        when(fechaPropia.getFecha()).thenReturn("2019-03-01");
        assertEquals("2019-03-01", fechaPropia.getFecha());

        when(fechaPropia.getFecha()).thenReturn("2019-03-01");
        fechaPropia.sumarDias(1);
        when(fechaPropia.getFecha()).thenReturn("2019-03-02");
        assertEquals("2019-03-02", fechaPropia.getFecha());

        when(fechaPropia.getFecha()).thenReturn("2019-03-01");
        fechaPropia.sumarDias(15);
        when(fechaPropia.getFecha()).thenReturn("2019-03-16");
        assertEquals("2019-03-16", fechaPropia.getFecha());
    }

    @Test
    public void restarDiasTest() {
        FechaPropia fechaPropia = mock(FechaPropia.class);

        when(fechaPropia.getFecha()).thenReturn("2020-02-29");
        fechaPropia.restarDias(1);
        when(fechaPropia.getFecha()).thenReturn("2020-02-28");
        assertEquals("2020-02-28", fechaPropia.getFecha());

        when(fechaPropia.getFecha()).thenReturn("2020-03-01");
        fechaPropia.restarDias(1);
        when(fechaPropia.getFecha()).thenReturn("2020-02-29");
        assertEquals("2020-02-29", fechaPropia.getFecha());

        when(fechaPropia.getFecha()).thenReturn("2020-03-01");
        fechaPropia.restarDias(15);
        when(fechaPropia.getFecha()).thenReturn("2020-02-15");
        assertEquals("2020-02-15", fechaPropia.getFecha());

        when(fechaPropia.getFecha()).thenReturn("2020-03-01");
        fechaPropia.restarDias(40);
        when(fechaPropia.getFecha()).thenReturn("2020-01-21");
        assertEquals("2020-01-21", fechaPropia.getFecha());
    }
}




