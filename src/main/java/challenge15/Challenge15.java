package challenge15;


import java.util.Scanner;


public class Challenge15 {

    static final String PASSWORD = "thisisnotmypassword";

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.println("What is the password?");
        String givenPassword = inputs.nextLine();

        if(givenPassword.compareTo(PASSWORD)==0)
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");

        }

    }
}
