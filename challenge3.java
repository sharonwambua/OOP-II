import javax.swing.JOptionPane;
import java.util.Scanner;

public class MyGUI {
    public static void main(String[] args) {
     JOptionPane.showMessageDialog(null,"Welcome to Java programming");
        JOptionPane.showInputDialog(null,"what is your name?");
        int Age;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Age?");
        Age = input.nextInt();

        if (Age<18){
            System.out.println("Your age is " + Age);
            System.out.println("Not adult");
        }
else{
    System.out.println("Your age is " + Age);
    System.out.println("Adult");
}
       
    }
}
