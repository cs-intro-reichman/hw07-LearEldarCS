/** Returns the binary representation of a given integer. */
public class IntToBin {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("Binary representation of " + x + " is: " + toBinary(x));
    }

    /** Returns the binary representation of the given integer, as a string of 0's and 1's.  */
    public static String toBinary(int x) {
        //// Replace the following statement with your code

        if (x == 0) { //Base Case
            return "0";
            }
        if (x == 1) { //Base Case
            return "1";
            }
       
            int rightMostDigit = x % 2; //computes the right most digit in binary form

        return "" + toBinary(x/2) + rightMostDigit; //right most digit will be added last, importent for odd numbers
    }    
 }
