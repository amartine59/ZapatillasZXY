package amartine59.zxy;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
   public void masculino_zapatilla_Nike_cuatropares(){
        int cant = 4, precio=120000;
        int res = Metodos.totalPagar(cant,precio);
        assertEquals(480000,res,0);
    }

    public void femenino_zapatilla_puma_dospares(){
        int cant = 2, precio=110000;
        int res = Metodos.totalPagar(cant,precio);
        assertEquals(220000,res,0);
    }

    public void masculino_clasico_puma_trespares(){
        int cant = 3, precio = 100000;
        int res = Metodos.totalPagar(cant,precio);
        assertEquals(300000,res,0);
    }
}
