package org.example;

import org.example.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg1RunsWell();
        testFactorialGivenRightArg2RunsWell();
        testFactorialGivenWrongArgMinus2ThrowsException();
    }


    //Code các Test Case để test hàm chạy đúng hay sai
    //Hàm này ứng với 1 Test Case với N = 0 hàm trả về ngon
    //Tên hàm mang ý nghĩa của Test Case luôn để giúp DEV ko nhầm lẫn
    //Kiểm tra tính thiểu đủ các test case -> Tránh nghịch lí thuốc trừ sâu
    public static void testFactorialGivenRightArg0RunsWell()
    {
        int n = 0; //cho/given n = 0
        long expectedResult = 1; //Hy vọng Giá trị ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); //thực tế là mấy đoán xem
        // so sánh
        System.out.println("Expected: " + expectedResult + " Actual: " + actualValue);
        System.out.println("Status: " + (expectedResult ==  actualValue));
    }

    public static void testFactorialGivenRightArg1RunsWell()
    {
        int n = 1; //cho/given n = 1
        long expectedResult = 1; //Hy vọng Giá trị ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); //thực tế là mấy đoán xem
        // so sánh
        System.out.println("Expected: " + expectedResult + " Actual: " + actualValue);
        System.out.println("Status: " + (expectedResult ==  actualValue));
    }

    public static void testFactorialGivenRightArg2RunsWell()
    {
        int n = 5; //cho/given n = 5
        long expectedResult = 120; //Hy vọng Giá trị ở trên sẽ là 120
        long actualValue = MathUtility.getFactorial(n); //thực tế là mấy đoán xem
        // so sánh
        System.out.println("Expected: " + expectedResult + " Actual: " + actualValue);
        System.out.println("Status: " + (expectedResult ==  actualValue));
    }
    public static void testFactorialGivenWrongArgMinus2ThrowsException()
    {
        MathUtility.getFactorial(-2);
    } //Khi đưa N = -2 Thấy ngoai lệ xuất hiện mừng rơi nước mắt
      //Code ta thiết kế là: nếu N ăn thì phải có ngoại lệ xuất hiện
      //Mà bị
}