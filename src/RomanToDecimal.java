import java.sql.SQLOutput;

/**
 * Roman to Decimal is a program in which inputted roman numerals are
 * converted to their decimal equivalent and outputted. Invalid inputs
 * can be recognized and will be outputted as such.
 * EXTRA: my program recognizes when roman numeral inputs are
 * incorrectly formatted (ex. IIIII should be V) and outputs the correct formatting
 * 10/6/2020
 * @author Felix Liu
 */


public class RomanToDecimal {
    /**
     * Converts a string to a valid decimal (base-10 value)
     * @param roman must be an upper case string
     * @return
     */

    public static int romanToDecimal(String roman) {
        int sum = 0;
        //String letter
        for (int i = 0; i < roman.length(); i++) {
            String letter = roman.substring(i, i + 1);
            if (letter.equals("I"))
                sum += 1;
            else if (letter.equals("V"))
                sum += 5;
            else if (letter.equals("X"))
                sum += 10;
            else if (letter.equals("L"))
                sum += 50;
            else if (letter.equals("C"))
                sum += 100;
            else if (letter.equals("D"))
                sum += 500;
            else if (letter.equals("M"))
                sum += 1000;
            else
                return -1;
        }

        // handling invariants
        if(roman.indexOf("IV") != -1 || roman.indexOf("IX") != -1)
            sum -= 2;
        //else if --> find XL and XC
        if(roman.indexOf("XL") != -1 || roman.indexOf("XC") != -1)
            sum -= 20;
        //else if --> find CD CM
        if(roman.indexOf("CD") != -1 || roman.indexOf("CM") != -1)
            sum -= 200;
        return sum;
    }

        public static void main(String[] args) {
        for(String roman : args) {
            int decimal = romanToDecimal(roman.toUpperCase());
            String romanOutput = "";
            int decimalInput = decimal;
            while (decimalInput >= 1000) {
                romanOutput += "M";
                decimalInput -= 1000;
            }
            while (decimalInput >= 900){
                romanOutput += "CM";
                decimalInput -= 900;
            }
            while (decimalInput >= 500){
                romanOutput += "D";
                decimalInput -= 500;
            }
            while (decimalInput >= 400){
                romanOutput += "CD";
                decimalInput -= 400;
            }
            while (decimalInput >= 100){
                romanOutput += "C";
                decimalInput -= 100;
            }
            while (decimalInput >= 90){
                romanOutput += "XC";
                decimalInput -= 90;
            }
            while (decimalInput >= 50){
                romanOutput += "L";
                decimalInput -= 50;
            }
            while (decimalInput >= 40){
                romanOutput += "XL";
                decimalInput -= 40;
            }
            while (decimalInput >= 10){
                romanOutput += "X";
                decimalInput -= 10;
            }
            while (decimalInput >= 9){
                romanOutput += "IX";
                decimalInput -= 9;
            }
            while (decimalInput >= 5){
                romanOutput += "V";
                decimalInput -= 5;
            }
            while (decimalInput >= 4){
                romanOutput += "IV";
                decimalInput -= 4;
            }
            while (decimalInput >= 1){
                romanOutput += "I";
                decimalInput -= 1;
            }
            if (decimal == -1) {
                System.out.println("Input: " + roman + " ==> Output: invalid Roman numeral");
            } else {
                System.out.println("Input: " + roman + " ==> Output: " + decimal);
                if (!romanOutput.equalsIgnoreCase(roman)){
                    System.out.println("Roman numeral format was incorrect");
                    System.out.println("Correct format: " + romanOutput);
                }
            }
        }
    }
}

