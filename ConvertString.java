import java.util.Scanner;

public class ConvertString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Hiya! Welcome to a String Converter(tm)!");
        System.out.println("This is a super simple program, but it'll let you convert a string to lower or uppercase!");
        System.out.println();
        System.out.println("To get your converted string, first enter a string:");
        String stringInput = input.next();
        
        System.out.println();
        System.out.print("Next, tell me what you would like to convert it to by entering either 'upper' or 'lower':");
        
        String option = input.next().toLowerCase();
        
        if (option.equals("upper")){
            convertUppercase(stringInput);
        }
        else if (option.equals("lower")){
            convertLowercase(stringInput);
        }
        else {
            System.out.println("That wasn't an option. Please restart :(");
        }

        System.out.println();
        System.out.println("Hey, thanks for trying this out. See ya around!");
        System.out.println("-----Kassandra");

        input.close();
    }

}