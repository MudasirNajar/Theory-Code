package Exception.handling;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        try {

            A obj = new A();
            obj.letsRockTogether();
        } catch (TsunamiException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("This is Arithmetic Exception: Reason " + e.getMessage());
        }


    }

    public void letsRockTogether() throws TsunamiException {
        Scanner sc = new Scanner(System.in);
        int waterLevel = sc.nextInt();
        if (waterLevel > 100) {
            throw new TsunamiException("Tsunami has come Bhaagooo!!!");
        }


//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a == 0) {
//            throw new ArithmeticException("The value of a is: " + a);
//        }
//        int ans = 10 / a;
//
//        int b = sc.nextInt();
//
//        if (b == 0) {
//            throw new ArithmeticException("The value of b is: " + b);
//        }
//        int ans1 = 10 / b;

    }


}
