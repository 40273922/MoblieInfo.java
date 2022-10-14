package taxis;

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
        while (true) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount:");

            if (a.hasNextDouble()) {
                double b = a.nextDouble();
            } else {
                System.out.println("请重新输入：");
            }

            double r = 0;
            for (int i = 0; i < 6; i++) {
                r = (r + 100) * 1.00417;
            }

            System.out.println("After the sixth month, the account value is $" + r);
    }

    }
}
