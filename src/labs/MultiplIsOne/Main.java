package labs.MultiplIsOne;

/*
어떤 수 A가 있다고 하자.
A에 다른 B를 곱하면 모든 자리의 수가 1인 숫자들이 있다.
이번 문제는 A의 배수 중에서
모든 자리의 수가 1인 숫자들 중에서
가장 작은 수 C를 찾는 것이다.
– 예) A=3
• B는 37, 37037 등이 될 수 있음.
• AxB = 111, 11111
• 찾고자 하는 수 C는 111

어떤 수 A를 입력 받아 C의 1이 몇 개인지
출력하는 프로그램을 작성하시오.
– 예) 3 [enter]
– 3
*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;

        while(i < 1000) {
            if(isOne(n*i) > 0) {
                System.out.println(isOne(n*i));
                break;
            }
            i++;
        }
    }
    //n이 1로만 이루어져 있으면 몇 자리의 1들로 이루어져 있는지 자릿수 반환
    public static int isOne(int n) {
        int c = 0;
        while(n != 0) {
            if(n%10 != 1) {
                return 0;
            }
            c++;
            n /= 10;
        }
        return c;
    }
}
