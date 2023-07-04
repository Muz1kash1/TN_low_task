package org.denis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
  @Test
  @DisplayName("Тест переворачивания строки")
  void testReverseWithExample() {
    assertEquals("нолс", StringReverser.reverseString("слон"));
  }
}
