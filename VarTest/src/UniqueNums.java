import java.util.Scanner;

public class UniqueNums {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int num = 0;
        int numValues = 0;
        boolean valid = true;
        Scanner in = new Scanner(System.in);

        while (numValues < numbers.length){
            do{
                valid = true;
                System.out.print("Enter a unique number: ");
                num = in.nextInt();

                for (int i = 0; i < numValues; i++){
                    if(numbers[i] == num){
                        System.out.println("Number already exists");
                        valid = false;
                        break;
                    }
                }

            }while (!valid);

            numbers[numValues] = num;
            numValues++;
        }

        in.close();

        System.out.println("Unique numbers array");
        for (int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
