package ReplitTasks;

import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);

        switch (response){
            case 'y':
                System.out.println("Your request is being processed is printed");
                break;
            case 'n':
                System.out.println("Thank you anyway for your consideration");
                break;
            case 'h':
                System.out.println("Sorry");
                break;
            default:
                System.out.println("Invalid");
        }

    }

}
