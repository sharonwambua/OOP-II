import java.util.*;

class HelloTillStop {
    Scanner sc = new Scanner(System.in);

   
    void showHello() {
        String choice; // guard variable

        System.out.println("For Hello type h, anything else to stop");
        choice = sc.next(); 

        while ("h".equals(choice)) {
            System.out.println("Hello");
            choice = sc.next(); 
        }
    }
}
