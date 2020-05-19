package com.mycompany.introducaojunit5;

import static com.mycompany.introducaojunit5.MathUtil.mdc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {
    
    @Test
    public void testMdcAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado,obtido);
    }
    @Test
    public void testMdcAImparP1() {
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testMdc_P1_Quando_B_Positivo() {
        final int a = 6;
        final int b = 2;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido, 0.0);
    }
    @Test
    void testMdc_P1_Quando_B_Negativo() {
        final int a = 6;
        final int b = -2;
        final int esperado = 2;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido, 0.0);
    }
    @Test
    void testMdc_P3_Quando_A_Positivo() {
        final int a = 6;
        final int b = 0;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido, 0.0);
    }
    @Test
    void testMdc_P3_Quando_A_Negativo() {
        final int a = -6;
        final int b = 0;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido, 0.0);
    }

    @Test
    void testMdc_P4() {
        final int m = 2;
        final int a = 6;
        final int b = 0;
        final int esperado = m * MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(m * a, m * b);
        assertEquals(esperado, obtido, 0.0);
    }

    @Test
    void testMdc_obtidoadoIgual1() {
        final int a = 9;
        final int b = 2;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido, 0.0);
    }

    @Test
    void testMdc_P5() {
        final int a = 9;
        final int b = 2;
        final int c = 5;
        final int esperado = MathUtil.mdc(a, c) * MathUtil.mdc(b, c);
        final int obtido = MathUtil.mdc(a * b, c);
        assertEquals(esperado, obtido, 0.0);
    }

    @Test
    void testMdc_P6() {
        final int a = 9;
        final int b = 2;
        final int esperado = MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMdc_P7() {
        final int a = 8;
        final int b = 2;
        final int esperado = MathUtil.mdc(-a, b);
        final int obtido = MathUtil.mdc(a, -b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMdc_P8() {
        final int a = 9;
        final int esperado = a;
        final int obtido = MathUtil.mdc(a, a);
        assertEquals(esperado, obtido);
    }


    @Test
    void testMdc_P12_obtidoadoPrimo() {
        final int p = 11;
        final int a = p;
        final int esperado = p;
        final int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMdc_P12_obtidoadoIgual1() {
        final int p = 11;
        final int a = 2;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcParaCasoGeral() {
        final int a = 30;
        final int b = 12;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMdc_DiversosResultado1() {
        final int esperado = 1;
        final int obtido = MathUtil.mdc(2, 3, 5);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMdc_DiversosResultadoMaior1() {
        final int esperado = 2;
        final int obtido = MathUtil.mdc(4, 2, 8);
        assertEquals(esperado, obtido);
    }
    @Test
    void testMultiplosValores(){
        final int a = 30;
        final int b = 12;
        final int c = 4;
        final int esperado = 2; 
        final int obtido = mdc(a,b,c);
        assertEquals(esperado,obtido);
    }
    @Test
    void testNenhumParametro(){
        assertThrows(IllegalArgumentException.class, () -> mdc());
    }
    @Test
    void testNulo(){
        assertThrows(NullPointerException.class, () -> mdc());
    }
}
