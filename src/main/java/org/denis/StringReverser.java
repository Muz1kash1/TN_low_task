package org.denis;

/**
 * Класс с методом переворачивающим строки
 */
public class StringReverser {
  /**
   * Метод разворачивающий строку
   *
   * @param string строка
   * @return перевернутая строка
   */
  public static String reverseString(String string) {
    StringBuilder reversed = new StringBuilder(string);
    reversed.reverse();
    return reversed.toString();
  }
}
