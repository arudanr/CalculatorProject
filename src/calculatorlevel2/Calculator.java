package calculatorlevel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public int calculate(int intBox1, int intBox2, char charBox1) {
        if (charBox1 == '+') {
            int resultSum = intBox1 + intBox2;
            return resultSum;
        } else if (charBox1 == '-') {
            int resultSub = intBox1 - intBox2;
            return resultSub;
        }  else if (charBox1 == '*') {
            int resultMul = intBox1 * intBox2;
            return resultMul;
        }  else if (charBox1 == '/') {
            try {
                int  divide = intBox1 / intBox2;
                System.out.println("나눈셈 결과값 = " + divide);
            } catch (ArithmeticException e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
        }
        return 0;
    }
}
