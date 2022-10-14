package Taxis;

import java.util.Scanner;

/**
 * &#064;program: LiXi
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-14 09:38
 **/
public class LiXi {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount:");
        double b =a.nextDouble();
       double r = 0 ;
        for( int i = 0;i < 6;i++ ){
            r = (r + 100)*1.00417;
        }
        System.out.println("After the sixth month, the account value is $"+r);
    }

}
