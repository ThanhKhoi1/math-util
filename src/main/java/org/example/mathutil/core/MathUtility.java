package org.example.mathutil.core;

public class MathUtility {
    // Class này
    //0! = 1
    //20! vừa đủ kiểu long, 21! kiểu long chứa ko nối, trình
    //quy ước hàm này chỉ n từ 0...20
    // code hàm thì cũng đồng thời phải kiểm thử

    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            //return -1;
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        }
        if(n == 0) {
            return 1; //early return, thoát sớm nếu có thể!!!
        }
        // khỏi viết else cho code nhìn đẹp
        //n bắt đầu từ 1...
        //thuật toán con heo đất, nhân dân, cộng dòn
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    // Test case #1
    //> Verify GetFactorial() with N = 0
    // (1) Given N with 0
    // (2) Call getFactorial(N)

    //> Expected value/result: The method will return 1

    //> Test case #2
    //> Verify getFactorial
    // (1) Given N wtih 1
    // (2) Call getFactorial (N)

    //> Test case #1
    //> Verify getFactorial() with N
    //> Steps/Procedure
    //  (1) Given N with 5
    //  (2) Call getFactorial(N)

    //> Expected Value/Result: The Method will return 120

    //Còn nhiều Test Case nữa!!!
}
