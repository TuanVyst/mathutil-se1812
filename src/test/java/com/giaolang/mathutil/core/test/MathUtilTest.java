package com.giaolang.mathutil.core.test;

import com.giaolang.mathutil.core.MathUtil;
import org.junit.jupiter.api.Test;

//import static com.giaolang.mathutil.core.MathUtil.getFactorial;
import static com.giaolang.mathutil.core.MathUtil.*;
// import static chỉ dành cho những hàm static, để giúp ta rút gọn gọi hàm
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
            // @Test là ghi chú, đánh dấu, kí hiệu - annotation
            // annotation báo hiệu rằng hàm này có thể
    // một class test có thể có nhiều @Test


    // TEST CASE #1: Check get Factorial method with valid parameter, e.g n=0
    //STEPS/PROCEDURE
    //1. Given a valid n, e.g n=0
    //2. Call/invoke getFactorial(n=0)
    //3. Execute
    //4. EXpected Value: 1

    public  void testFactorialGivenRightArg0RunsWell(){
        long expectedValue = 1;
        int n=0;

        long actualValue = getFactorial(n);
        assertEquals(expectedValue, actualValue);
        // so sánh xem expected value có bằng actual value hay ko

    }
   @Test
    public void testFactorialGivenRightArg5RunsWell(){
        assertEquals(120, getFactorial(5));
    }
    @Test
    public void testFactorialGivenWrongArgThrowException(){
        assertEquals(5, getFactorial(-5));
    }
}