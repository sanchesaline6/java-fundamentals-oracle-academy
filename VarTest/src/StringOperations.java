public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Aline";
        String str3 = "You are " + str2;

        System.out.println("Welcome: " + str3);
        System.out.println("str1 length: " + str1.length());
        System.out.println("substring str3: " + str3.substring(0, 5));
        System.out.println("str2 uppercase:" + str2.toUpperCase());
    }
}
