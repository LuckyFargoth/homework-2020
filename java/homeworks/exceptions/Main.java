package homeworks.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        try {
//            throw new CustomException();
//        } catch (CustomException customException) {
//            System.err.println("Exception occurred\n");
//            try {
//                throw new CustomException();
//            } catch (CustomException e) {
//                e.printStackTrace();
//                System.err.println("\nException occurred");
//            } finally {
//                System.err.println("\nProblem solved");
//            }
//        }
        System.out.println("Create a new user?\n" +
                "1.Yes 2. No ");
        int input = Integer.parseInt(reader.readLine());
        if (input == 1) {
            User customUser = new User();

            System.out.println("Enter your name");
            String nameInput = reader.readLine();
            customUser.setName(nameInput);


            System.out.println("Enter your age");
            int ageInput = Integer.parseInt(reader.readLine());
            try {
                customUser.setAge(ageInput);
            } catch (IncorrectAgeInputException incorrectAgeInputException) {
                System.err.println("\nIncorrect user age! Age should be more than 0 and less than 200'. \nTry again! ");
                while (ageInput < 0 || ageInput >= 200) {
                    ageInput = Integer.parseInt(reader.readLine());
                    if (ageInput < 0 || ageInput >= 200)
                        System.err.println("\nIncorrect user age! Age should be more than 0 and less than 200'. \nTry again! ");
                }
            } finally {
                System.out.println("Thank you, user created\n");
                customUser.setAge(ageInput);
                System.out.println(customUser.toString());
            }
        } else {
            return;
        }
    }


}
