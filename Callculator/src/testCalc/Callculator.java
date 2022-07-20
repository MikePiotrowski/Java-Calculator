
package testCalc;

import java.util.Scanner;

/**
 *
 * @author Michael Lee Piotrowski
 * Oct. 2017
 * First update on July 19, 2022
 * Basic calculator that will eventually become
 * a app using Javafx and CSS
 */
public class Callculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        
            double fnum, snum, answer;
            
        System.out.println("What is the first number? ");
            fnum = calc.nextDouble();
        System.out.println("What is the second number? ");
            snum = calc.nextDouble();
            answer = fnum + snum;
        System.out.println("The answer is " + answer);
                    
        
    }
    
}
