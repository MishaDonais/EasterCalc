/*
 * This program was made by Misha Donais
 * On February 19th 2019
 * To calculate the date of Easter Sunday
 */

package eastercalc;
import java.util.Scanner;

public class EasterCalc {

    public static void main(String[] args) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        //Variables needed for caluclations
        int a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q;
        String monthStr;
        //User input
        System.out.println("Enter a year");
        int year = keyedInput.nextInt();
        //Calculations
        a = year/100;
        b = year%100;
        c = (3*(a+25))/4;
        d = (3*(a+25))%4;
        q = (8*(a+11))/25;
        f = (5*(a)+b)%19;
        g = ((19*f)+c-q)/30;
        h = (f+(11*g))/319;
        j = (60*(5-d)+b)/4;
        k = (60*(5-d)+b)%4;
        n = ((2*j)-k-g+h)%7;
        int month = ((g-h+n+114)/31);
        p = ((g-h+n+114)%31);
        int day = p+1;
        //determine the month in String format
    	if(month == 3){
            monthStr = "March";
     	} else {
            monthStr = "April";
     	}

        System.out.println("Easter Sunday will be "+ monthStr + " " + day + " on this year");
        
        
        
    }
    
}
