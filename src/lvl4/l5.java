package lvl4;

import java.util.Scanner;

/**
 * @author Karl
 * @link https://web.babayan.keenetic.link/
 */
public class l5 {
    public static void main(String[] args) {

        /*
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (console.hasNextInt())
        {
           int x = console.nextInt();
            if (x < min)
                min = x;
        }
        System.out.println(min);
        */

//

        /*
        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x > max) {
                if ((x % 2) == 0) {
                    max = x;
                }
            }
        }
        System.out.println(max);

 */

        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                min2 = min;
                min = x;
            } else if (x < min2 && x != min) {
                min2 = x;
            }
        }
        System.out.println(min2);
    }
}
