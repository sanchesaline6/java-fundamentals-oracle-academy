public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Aline";
        String str3 = "You are " + str2;

        System.out.println("Welcome: " + str3);
        System.out.println("str1 length: " + str1.length());
        System.out.println("substring str3: " + str3.substring(0, 5));
        System.out.println("str2 uppercase:" + str2.toUpperCase());

        if(str1.compareTo(str2) != 0){
            if(str1.compareTo(str2) > 0){
                System.out.println("str1 is larger than str2");
            }
            else {
                System.out.println("str1 is less than str2");
            }
        }
        else {
            System.out.println("str1 is equal to str2");
        }

        if(str2.equals(str3)){
            System.out.println("str2 is equal to str3");
        }
        else{
            System.out.println("str2 is not equal to str3");
        }
    }
}
