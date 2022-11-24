// Задача: Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

package HomeWork2;

/**
 * task
 */
public class task {

    public static boolean isPalindrome(String text) {
        String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
}