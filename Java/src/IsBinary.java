import java.util.Scanner;

/**
 * A binary number is written as combination of 1's and 0's.
 * Binary number 100 indicates 4.
 *
 * Write a program which accepts a number and prints whether it is binary or not.
 *
 * For Ex:
 *      1) if user inputs 1040400 then it should print "Not Binary".
 *      2) if user inputs 1000100 then it should print "Binary".
 */
public class IsBinary {

    public static void main( String[] args ) throws Exception {

        int num;
        boolean flag = true;

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        try {
            num = sc.nextInt();
            String numString = Integer.toString( num );

            for (char c : numString.toCharArray() ) {

                if( c > '1' ){
                    System.out.println("Not Binary.");
                    flag = false;
                    break;
                }
            }

            if( flag ){
                System.out.println("Binary.");
            }

        } catch ( Exception e ) {
            System.out.println( e.getMessage() );
        }
    }
}
