import java.util.Scanner;

import javax.swing.JOptionPane;

public class task1 {
    public static void main(String[] args) throws Exception {
        int num1 = 1;
        int num2 = 2;
        
        System.out.println("Before swapping, num1 = " + num1+ " and num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

    System.out.println("After swapping, num1 = " + num1+ " and num2 = " + num2);
    }
}
