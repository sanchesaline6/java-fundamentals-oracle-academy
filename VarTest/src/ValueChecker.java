import java.util.Scanner;

public class ValueChecker {
    public static void main(String[] args) {
        int intValue;

        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Enter a number: ");
            intValue = in.nextInt();

            if(intValue == 7){
                System.out.println("That's lucky!");
            }
            else if(intValue == 13){
                System.out.println("That's unlucky!");
            }
            else if(intValue != 0){
                System.out.println("That number is neither lucky nor unlucky!");
            }

        }while(intValue != 0);


    }
}
