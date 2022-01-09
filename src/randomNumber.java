import java.util.Random;
import java.util.Scanner;

public class randomNumber {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Random random =new Random();

        System.out.println("***********Welcome***********");

        System.out.println("System Calculating Random number...");
        int randomNumber=random.nextInt(10);
        System.out.println("\nYou have 10 rights to Win!..");

        for (int i = 0; i < 10; i++) {
            System.out.println("Number of trial:"+i);
            System.out.print("Please provide a number:");
            int number=scanner.nextInt();

            if(number==randomNumber){
                System.out.println("Congratulations you catch the correct number");
                break;
            }
            else if(number>randomNumber){
                System.out.println("You should provide smaller number");
            }
            else {
                System.out.println("You should provide bigger number");
            }
        }
        System.out.println("Closing the system");
    }
        }

