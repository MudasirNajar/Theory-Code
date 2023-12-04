package Exception.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Enter the denominator a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //Critical statement and it can break

        try {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int j = Integer.parseInt(bufferedReader.readLine());

            int ans = 10 / a;
            System.out.println(ans);

            int[] arr = new int[4];
            for (int i = 0; i <= 4; i++) {
                System.out.println(arr[i]);
            }
        }
//        catch (ArithmeticException e) {
//            System.out.println("Dividing by 0 is not allowed");
//        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("We are out of the bounds exception");
        } catch (NullPointerException e) {
            System.out.println("This is NullPointer Exception");
        }
//        catch (Exception e) {
//            System.out.println("This is the final Exception that we are having: " + e.getMessage());
//        }
        catch (IOException e) {
            throw new RuntimeException(e); //Compile time Exception caused by BufferedReader
        } finally {
            System.out.println("This is finally block");
        }

        System.out.println("We have successfully handled that error");
    }
}
