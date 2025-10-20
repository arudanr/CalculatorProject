package calculatorlevel2;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        for(;;) {

            //양의 정수 입력 받기
            System.out.print("첫번째 양의 정수를 입력하세요: ");
            int intBox1 = scanner.nextInt();
            System.out.print("두번째 양의 정수를 입력하세요: ");
            int intBox2 = scanner.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char  charBox = scanner.next().charAt(0);

            //사칙연산 +-*/
            if(charBox == '+') {
                int sum = intBox1 + intBox2;
                System.out.println("더하기 결과값 = " + sum);
            } else if(charBox == '-') {
                int minus = intBox1 - intBox2;
                System.out.println("빼기 결과값 = " + minus);
            } else if(charBox == '*') {
                int  multiple = intBox1 * intBox2;
                System.out.println("곱셈 결과값 = " + multiple);
            } else if (charBox == '/') {
                try {
                    int  divide = intBox1 / intBox2;
                    System.out.println("나눈셈 결과값 = " + divide);
                } catch (ArithmeticException e) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
            }

            int result = calculator.calculate(intBox1, intBox2, charBox);
            System.out.println("result = " + result);

            // 탈출
            System.out.println("더 계산하시려면 아무값이나 입력해주세요. (exit 입력 시 종료)");
            String string = scanner.next();
            if(string.equals("exit")) {
                break;
            }
        }
    }
}

