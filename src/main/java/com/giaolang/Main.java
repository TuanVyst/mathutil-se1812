package com.giaolang;
import com.giaolang.mathutil.core.MathUtil;

import static com.giaolang.mathutil.core.MathUtil.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenWrongArgMinus5ThrowsException();
    }
    // TEST CASE #1: Check get Factorial method with valid parameter, e.g n=0
    //STEPS/PROCEDURE
    //1. Given a valid n, e.g n=0
    //2. Call/invoke getFactorial(n=0)
    //3. Execute
    //4. EXpected Value: 1

    public static void testFactorialGivenRightArg0RunsWell(){
        long expectedValue = 1;
        int n=0;

        long actualValue = MathUtil.getFactorial(n);
        System.out.println("0! Expected Value: " + expectedValue);
        System.out.println("0! Actual Value: " + actualValue);
    }
    // TEST CASE #2: Check get Factorial method with valid parameter, e.g n=5
    //STEPS/PROCEDURE
    //1. Given a valid n, e.g n=0
    //2. Call/invoke getFactorial(n=5)
    //3. Execute
    //4. EXpected Value: 120
    public static void testFactorialGivenRightArg5RunsWell() {
        long expectedValue = 120;
        int n = 5;

        long actualValue = MathUtil.getFactorial(n);
        System.out.println("5! Expected Value: " + expectedValue);
        System.out.println("5! Actual Value: " + actualValue);
    }
    // TEST CASE #3: Check get Factorial method with Invalid parameter, e.g n=-5
    //STEPS/PROCEDURE
    //1. Given a valid n, e.g n=0
    //2. Call/invoke getFactorial(n=5)
    //3. Execute
    //4. EXpected Result:
    // The method will throw an exception

    public static void testFactorialGivenWrongArgMinus5ThrowsException() {
       int n = -5;
      MathUtil.getFactorial(n);
   }

}
