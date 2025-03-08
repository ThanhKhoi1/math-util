package org.example.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //chuẩn bị 1 mảng 2 chiều để chứa các data sẽ đưa vào test hàm Factorial() của mình
    //Hàm này phải là static - nằm ở 1 chỗ co61dinh95 trong ram để cung cấp data cho các hàm test
    public  static Object[][] initData() {
        return new Object[][] {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},
        };
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgRunsWell(int n, long expectedResult)
    {
        assertEquals(expectedResult, MathUtility.getFactorial(n));
    }
}