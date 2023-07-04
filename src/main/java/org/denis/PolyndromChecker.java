package org.denis;

/**
 * Класс с методом определяющим полиндромы
 */
public class PolyndromChecker {
  /**
   * Метод определяющий явлется ли строка полиндромом
   *
   * @param string строка
   * @return предикат
   */
  public static boolean check(String string) {
      string = string.replaceAll("\\s+", "").toLowerCase();

      int left = 0;
      int right = string.length() - 1;

      while (left < right) {
          if (string.charAt(left) != string.charAt(right)) {
              return false; // Найдены несоответствующие символы
          }
          left++;
          right--;
      }
      return  true;
  }
}
