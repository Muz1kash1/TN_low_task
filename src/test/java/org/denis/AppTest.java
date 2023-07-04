package org.denis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest
{
    @Test
    @DisplayName("Тест с примером полиндромом")
    void testWithPolyndrom()
    {
        assertTrue(PolyndromChecker.check("аваава"));
    }

    @Test
    @DisplayName("Тест с примером неполиндромом")
    void testWithNoPolyndrom(){
        assertFalse(PolyndromChecker.check("Полиндром"));
    }
}
