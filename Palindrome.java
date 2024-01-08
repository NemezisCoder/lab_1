public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) { // Проверяем, является ли строка s палиндромом
                System.out.println(s + " is a palindrome");
            } else {
                System.out.println(s + " is not a palindrome");
            }
        }
    }

    public static String reverseString(String s) { // Метод для переворачивания строки
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome(String s) { // Метод для проверки, является ли строка палиндромом
        String reversed = reverseString(s);
        return s.equals(reversed);
    }
}