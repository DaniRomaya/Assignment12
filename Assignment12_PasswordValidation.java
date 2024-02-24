import java.util.Scanner;

public class Assignment12_PasswordValidation {
    public static void main(String[] args) throws Exception {
        Scanner password = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String enterPassword = password.nextLine();
        System.out.println("Is the password between 8 and 16 characters? " + passwordLength(enterPassword));
        System.out.println("Does this password have any capital letters? " + passwordUpperCase(enterPassword));
        System.out.println("Does this password have any lower case letters? " + passwordLowerCase(enterPassword));
        System.out.println("Does the password include numbers? " + passwordNumber(enterPassword));
        System.out.println("Does the password include any special characters? " + passwordSpecial(enterPassword));
        System.out.println("Does the password satisfy the requirements? ");
        isPasswordValid(enterPassword);
        password.close();

        
    }

    public static boolean passwordLength(String password) {
        if (password.length()>=8 && password.length()<=16){
            return true;
        } 
        return false;
    }

    public static boolean passwordUpperCase(String password){
        for (char c : password.toCharArray()){
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean passwordLowerCase(String password){
        for (char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean passwordNumber(String password){
        for (int c : password.toCharArray()){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    } 
    
    public static boolean passwordSpecial(String password){
        for (char c : password.toCharArray()){
            String specialChars =  "~!@#$%^&*()-=+_";
            if(specialChars.contains(String.valueOf(c))){
                return true;
            }
        }
        return false;
    }

    public static void isPasswordValid(String password){
        int requirementsmet = 0;
        if(passwordUpperCase(password)==true){
            requirementsmet++;
        }
        if (passwordLowerCase(password) == true){
            requirementsmet++;
        }
        if (passwordNumber(password) == true){
            requirementsmet++;
        }
        if(passwordSpecial(password) == true){
            requirementsmet++;
        }
        if(requirementsmet>=3 && passwordLength(password)== true){
            System.out.println("Yes, this password satisfies the requirements.");
        } else{
            System.out.println("No, this password does not satisfy all the requirements");
        }
    }
}
