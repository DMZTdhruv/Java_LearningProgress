import java.util.ArrayList;
import java.util.Scanner;

import utility.EmptySpace;
import utility.Password;

public class App extends EmptySpace {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean createPassword = false;
        boolean getUserInput = true;
        String userSelection = "";

        while(getUserInput){
            System.out.println("Do you want to generate a strong password? 'Y' or 'N'");
            userSelection = scanner.nextLine().toLowerCase();

            if(userSelection.equals("y")){
                getUserInput = false;
                createPassword = true;
            } else if(userSelection.equals("n")){
                getUserInput = false;
                System.out.println("You exited program successfully");
                break;
            } 
        }
    
        while (createPassword) {
            passwordGeneratorTutorial();
            break;
        }
        scanner.close();
    }

    public static void passwordGeneratorTutorial() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        boolean isUserReady = false;
        enterLine();
        System.out.println("Let's create the strongest password for you");
        enterLine();
        dashedLine();

        String printInformation[] = {
            "You will also select the length of your password",
            "You will now select what you want in your password",
            "After this process is done you will get your password ready? 'Y' or 'N'"
        };

        enterLine();
        for(int i=0;i<3;i++){
            System.out.println(printInformation[i]);
            if(i==2) {
                String userChoice = scanner.nextLine().toLowerCase();
                if(userChoice.equals("y")){
                    isUserReady = true;
                }
            }
        }

        enterLine();
        if(isUserReady){
            generatePassword();
        }

        scanner.close();
    }  
    
    public static void generatePassword () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your password: ");
        int lengthOfPassword = scanner.nextInt();
        scanner.nextLine();
        boolean randomNumber = false;
        boolean randomCharacter = false;
        boolean randomSymbols = false;

        ArrayList<String> generatedPassword = new ArrayList<>();

        Password password = new Password();

        enterLine();
        System.out.println("Do you want to have random numbers in your password?: 'Y' or 'N' ");
        String userChoiceOfRandomNumber = scanner.nextLine().toLowerCase();
        System.out.println("Do you want to have random characters in your password?: 'Y' or 'N' ");
        String userChoiceOfRandomCharacters = scanner.nextLine().toLowerCase();
        System.out.println("Do you want to have random symbols in your password?: 'Y' or 'N' ");
        String userChoiceOfRandomSymbols= scanner.nextLine().toLowerCase();
        
        if(userChoiceOfRandomNumber.equals("y")) {
            randomNumber = true;
        }
        if(userChoiceOfRandomCharacters.equals("y")){
            randomCharacter = true;
        }
        if(userChoiceOfRandomSymbols.equals("y")){
            randomSymbols = true;
        }


        while(generatedPassword.size() < lengthOfPassword) {
            int rand = (int) (Math.random() * 3);
            if(rand == 0 && randomCharacter){
                generatedPassword.add(password.getRandomChar());
            } else if(rand == 1 && randomNumber) {
                generatedPassword.add(password.getRandomNumber() + "");
            } else if (rand == 2 && randomSymbols) {
                generatedPassword.add(password.getRandomSymbols());
            }
        }

        
        System.out.println("Your password: ");
        String stringPassword = String.join("", generatedPassword);
        System.out.println(stringPassword);

        scanner.close();
    }

}

class Test {
    public static void main(String[] args) {
        Outside out = new Outside();
        Outside.Inside in = out.new Inside();
        in.greetings();
    }
}