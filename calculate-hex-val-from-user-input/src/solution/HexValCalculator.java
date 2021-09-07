package solution;

import textio.TextIO;

public class HexValCalculator {
    public static void main (String [] Args) {
        System.out.println("Please type a hexadecimal number to translate.");
        String userInput = TextIO.getln();
        System.out.println("Ok, the decimal value of the hexadecimal value you entered is " + calculateHexVal(userInput) + ".");
    }
        static int getHexValue(char chr){
        switch (chr){
            case('0'):
                return 0;
            case('1'):
                return 1;
            case('2'):
                return 2;
            case('3'):
                return 3;
            case('4'):
                return 4;
            case('5'):
                return 5;
            case('6'):
                return 6;
            case('7'):
                return 7;
            case('8'):
                return 8;
            case('9'):
                return 9;
            case('a'):
            case('A'):
                return 10;
            case('b'):
            case('B'):
                return 11;
            case('c'):
            case('C'):
                return 12;
            case('d'):
            case('D'):
                return 13;
            case('e'):
            case('E'):
                return 14;
            case('f'):
            case('F'):
                return 15;
            default:
                throw new IllegalArgumentException("Sorry, "+ chr + " is not a legal hexadecimal character.");
        }
    }
    static int calculateHexVal(String str){
        int hexVal = 0;
        for(int i=0; i<str.length(); i++){
            hexVal = (hexVal*16)+getHexValue(str.charAt(i));
        }
        return hexVal;
    }

}
