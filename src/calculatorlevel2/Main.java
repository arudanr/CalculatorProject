package calculatorlevel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        ArrayList<Integer> number = new ArrayList<>();

        for(;;) {

            //양의 정수 입력 받기
            System.out.print("첫번째 양의 정수를 입력하세요: ");
            int intBox1 = scanner.nextInt();
            System.out.print("두번째 양의 정수를 입력하세요: ");
            int intBox2 = scanner.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char  charBox = scanner.next().charAt(0);

            //사칙연산 +-*/
            int result = calculator.calculate(intBox1, intBox2, charBox);
            number.add(result);
            System.out.println("result = " + result);
            System.out.println(number);

            // 탈출
            System.out.println("더 계산하시려면 아무값이나 입력해주세요. (exit 입력 시 종료)");
            String string = scanner.next();
            if(string.equals("exit")) {
                break;
            }
        }
    }


}

