/*Here we have te solution to this https://www.freecodecamp.org/learn/coding-interview-prep/project-euler/problem-4-largest-palindrome-product
FreeCodeCamp programing excercise.
by: Sergi Arango.
*/

package numerospalindromos;

import java.util.Arrays;

public class NumerosPalindromos {

    public static void main(String[] args) {

        helloThere();
        int bigNumber = generateBiggestNumbers(6);
        System.out.println("The biggest number in range is = " + bigNumber);

        searchPalindrome(bigNumber, 0.1);
    }

    public static void helloThere() {
        System.out.println("Wellcome to the solution to: Largest palindrome product");
    }

    public static int generateBiggestNumbers(int n) {
        String strNumber = new String();
        for (int i = 0; i < n; i++) {
            strNumber += "9";
        }
        int number = Integer.parseInt(strNumber);
        return number;
    }

    public static void searchPalindrome(int biggestNumberInRange, double rangeEvaluated) {
        double rangeOf = biggestNumberInRange * rangeEvaluated;
        int rangeOfIterations = (int) Math.round(rangeOf);
        System.out.println("RangeOfIterations = " + rangeOfIterations);
        long firstNumber = biggestNumberInRange;
        long secondNumber = biggestNumberInRange;
        long multiplicationResult = 1;
        int rangeCounting = 1;
        boolean found = false;

        for (int i = 0; i < biggestNumberInRange; i++) {
            if (found == false) {
                int j = 0;
                while (j < rangeOfIterations) {
                    multiplicationResult = firstNumber * secondNumber;
                    
                    String multiplicationStr = Long.toString(multiplicationResult);
                    StringBuilder reversed = new StringBuilder(multiplicationStr);
                    String reversedMultiplicationStr = reversed.reverse().toString();
                    
                    if (multiplicationStr.equals(reversedMultiplicationStr)) {
                        System.out.println("Multiplication of " + firstNumber + " and " + secondNumber + " = " + multiplicationResult);
                        found = true;
                        break;
                    }
                    
                    secondNumber -= 1;
                    j++;
                }
            } else {
            break;
            }
            firstNumber -= 1;
            secondNumber = biggestNumberInRange;
        }
    }

}
