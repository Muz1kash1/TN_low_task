package org.denis;

import java.util.Arrays;

/**
 * Класс с методом удаляющим дупликаты из массива
 */
public class DuplicateDeleter {
  /**
   * Метод удаляющий дупликаты из массива
   *
   * @param arr входящий массив
   * @return входящий массив без дупликатов
   */
  public static int[] removeDuplicates(int[] arr) {
    int length = arr.length;
    int[] result = new int[length];
    int index = 0;

    for (final int k : arr) {
      boolean isDuplicate = false;

      // Проверяем, есть ли текущий элемент в результате
      for (int j = 0; j < index; j++) {
        if (k == result[j]) {
          isDuplicate = true;
          break;
        }
      }

      // Если элемент не является дубликатом, добавляем его в результат
      if (!isDuplicate) {
        result[index] = k;
        index++;
      }
    }

    // Создаем новый массив с размером, соответствующим количеству уникальных элементов
    return Arrays.copyOf(result, index);
  }
}
