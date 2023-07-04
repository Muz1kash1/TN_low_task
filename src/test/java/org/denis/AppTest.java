package org.denis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AppTest {
  int[] withDuplicates = {1, 2, 2, 2, 3, 3, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9};
  int[] withoutDuplicates = {1, 2, 3, 4, 5, 6, 7, 8, 9};

  @Test
  @DisplayName("Тест на удаление дупликатов")
  void testDeleteDuplicate() {
    assertArrayEquals(withoutDuplicates, DuplicateDeleter.removeDuplicates(withDuplicates));
  }
}
