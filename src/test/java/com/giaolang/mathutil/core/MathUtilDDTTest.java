package com.giaolang.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {
            // chuẩn bị bộ data để riêng sau đó fill vào
            // mảng 2 chiều, gồm giá trị kì vọng | con n!
            public static Object[][] initTestData() {
                // mảng 2 chiều
                // Object[] [] dataset = {,,,,};  // ={các phần tử của mảng cách nhau bằng dấu phẩy ,}
                Object[] [] dataset = {{5,120},
                                       {6,720},
                                       {4,24},
                                       {3,6},
                                       {2,2},
                                       {1,1},
                                       {0,1}};
                return dataset;
            }
            @ParameterizedTest
            @MethodSource("initTestData")
            public void testFactorialGivenRightArgRunsWell(int n, long expected){
                assertEquals(expected, MathUtil.getFactorial(n));
            }
}