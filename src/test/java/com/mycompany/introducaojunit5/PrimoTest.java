package com.mycompany.introducaojunit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilPrimoTest {

    @Test
    void isPrimo0() {
        assertFalse(MathUtil.isPrimo(0));
    }

    @Test
    void isPrimo1() {
        assertFalse(MathUtil.isPrimo(1));
    }

    @Test
    void isPrimo2() {
        assertTrue(MathUtil.isPrimo(2));
    }

    @Test
    void isPrimo3() {
        assertTrue(MathUtil.isPrimo(3));
    }

    @Test
    void isPrimo4() {
        assertFalse(MathUtil.isPrimo(4));
    }

    @Test
    void isPrimo5() {
        assertTrue(MathUtil.isPrimo(5));
    }

    @Test
    void isPrimo6() {
        assertFalse(MathUtil.isPrimo(6));
    }

    @Test
    void isPrimo13() {
        assertTrue(MathUtil.isPrimo(13));
    }

    @Test
    void isPrimoMaxInt() {
        assertTrue(MathUtil.isPrimo(Integer.MAX_VALUE));
    }
}
