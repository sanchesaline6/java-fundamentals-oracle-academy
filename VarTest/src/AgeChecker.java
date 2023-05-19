import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type your age: ");
        int age = in.nextInt();

        System.out.println("Do you hold a current driving license? [Y]es or [N]o: ");
        char holdDrivingLicense = in.next().toLowerCase().charAt(0);

        if((age > 20) && (holdDrivingLicense == 'y')){
            System.out.println("You are an adult and can hire a car'");
        }
        else {
            System.out.println("You are not an adult so cannot hire a car");
        }

        in.close();
    }
}
