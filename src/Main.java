import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kmPrice, distance, discountedPrice, ageDisPrice;
        int age;
        int flightType;

        System.out.println("Please enter flight type: \n1- One way \n2- Round trip");
        flightType = input.nextInt();
        if (flightType == 1 || flightType == 2) {
            System.out.println("Please enter destination distance (km): ");
            distance = input.nextDouble();
            System.out.println("Please enter your age: ");
            age = input.nextInt();
            kmPrice = (0.10 * distance);
            if (flightType == 1) {
                if (age < 12) {
                    ageDisPrice = kmPrice / 2;
                    System.out.print("Total price is: " + ageDisPrice + "$");
                }
                if (age >= 12 && age <= 24) {
                    ageDisPrice = kmPrice - (kmPrice * 0.1);
                    System.out.print("Total price is: " + ageDisPrice + "$");
                }
                if (age > 65) {
                    ageDisPrice = kmPrice - (kmPrice * 0.3);
                    System.out.print("Total prices is: " + ageDisPrice + "$");
                }
                else
                    kmPrice = distance * 0.10;
                System.out.print("Total prices is: " + kmPrice + "$");
            }
            if (flightType == 2) {
                if (age < 12) {
                    ageDisPrice = (kmPrice / 2);
                    discountedPrice = 2 * (ageDisPrice - (ageDisPrice * 0.2));
                    System.out.print("Total price is: " + discountedPrice + "$");
                }
                if (age >= 12 && age <= 24) {
                    ageDisPrice = kmPrice - (kmPrice * 0.1);
                    discountedPrice = 2 * (ageDisPrice - (ageDisPrice * 0.2));
                    System.out.print("Total price is: " + discountedPrice + "$");
                }
                if (age > 65) {
                    ageDisPrice = kmPrice - (kmPrice * 0.3);
                    discountedPrice = 2 * (ageDisPrice - (ageDisPrice * 0.2));
                    System.out.print("Total prices is: " + discountedPrice + "$");

                }
                else
                    kmPrice = 2 * (distance * 0.10);
                System.out.print("Total prices is: " + kmPrice + "$");
            }
        }
        else System.out.print("Flight type must be 1 or 2. \nPlease restart the program.");

        }

    }
