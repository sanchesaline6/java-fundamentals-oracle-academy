import java.util.Scanner;

public class InputVariables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean boolValue;
        byte byteVal;
        char charValue;
        short shortValue;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;

        System.out.println("Please enter a boolean value: ");
        boolValue = in.nextBoolean();

        System.out.println("Please enter a byte value: ");
        byteVal = in.nextByte();

        System.out.println("Please enter a char value: ");
        charValue = in.next().charAt(0);

        System.out.println("Please enter a short value: ");
        shortValue = in.nextShort();

        System.out.println("Please enter a integer value: ");
        intVal = in.nextInt();

        System.out.println("Please enter a long value: ");
        longVal = in.nextLong();

        System.out.println("Please enter a float value: ");
        floatVal = in.nextFloat();

        System.out.println("Please enter a double value: ");
        doubleVal = in.nextDouble();

        in.close();

        System.out.println("Boolean value: " + boolValue);
        System.out.println("Byte value: " + byteVal);
        System.out.println("Char value: " + charValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Integer value: " + intVal);
        System.out.println("Long value: " + longVal);
        System.out.println("Float value: " + floatVal);
        System.out.println("Double value: " + doubleVal);
    }
}
