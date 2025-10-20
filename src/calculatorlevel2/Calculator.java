package calculatorlevel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    // 속성
    private ArrayList<Integer> arrayList =  new ArrayList<>();
    //생성자

    //기능 메서드
    public int calculate(int intBox1, int intBox2, char charBox1) {
        int result = 0;
        if (charBox1 == '+') {
            result = intBox1 + intBox2;
            arrayList.add(result);
            System.out.println(arrayList);
            return result;
        } else if (charBox1 == '-') {
            result = intBox1 - intBox2;
            arrayList.add(result);
            System.out.println(arrayList);
            return result;
        }  else if (charBox1 == '*') {
            result = intBox1 * intBox2;
            arrayList.add(result);
            System.out.println(arrayList);
            return result;
        }  else if (charBox1 == '/') {
            try {
                result = intBox1 / intBox2;
                arrayList.add(result);
                System.out.println(arrayList);
            } catch (ArithmeticException e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
        }
       return 0;
    }
    // 게터
    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }
    // 세터
    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }
    public void removeResult() {
        arrayList.remove(0);
    }
}
