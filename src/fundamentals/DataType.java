package fundamentals;

import java.util.Arrays;

public class DataType {

    /*
    Numeric Types - จำนวนเต็ม
        byte (8-bit signed integer)
        short (16-bit signed integer)
        int (32-bit signed integer, most commonly used)
        long (32-bit signed integer)

     Numeric Types Floating-Point (เลขทศนิยม)
        float (32-bit single-precision floating-point number)
        double (64-bit double-precision floating-point number, more commonly used)

     Character Type:
        char (16-bit Unicode character)

     Boolean Type:
        boolean (represents true or false)
     */

    public static void main(String[] args) {
       // variables use camelCase
       byte exampleOfByte = 127;
       short exampleOfShort = 32767;
       int exampleOfInt = 2147483647;
       long exampleOfLong = 9223372036854775807L;

       double exampleOfDouble = 3.14159265358979323846;
       float exampleOfFloat = 3.14159265358979323846f;

       char exampleOfChar = 'A';
       boolean isEnabled = true; // disable mean isEnabled = false


        System.out.println("args = " + Arrays.toString(args));

        System.out.println("exampleOfByte: " + exampleOfByte);
        System.out.println("exampleOfShort: " + exampleOfShort);
        System.out.println("exampleOfInt: " + exampleOfInt);
        System.out.println("exampleOfLong: " + exampleOfLong);
        System.out.println("exampleOfDouble: " + exampleOfDouble);
        System.out.println("exampleOfFloat: " + exampleOfFloat);
        System.out.println("exampleOfChar: " + exampleOfChar);
        System.out.println("isEnabled: " + isEnabled);
    }
}
