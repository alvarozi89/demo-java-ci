package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testSuma() {
        int resultado = App.suma(2, 3);
        assertEquals(5, resultado);
    }
}
