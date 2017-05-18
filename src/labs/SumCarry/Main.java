package labs.SumCarry;
import java.util.Scanner;

/*
두 개의 자연수를 입력 받아서 더할 때
몇번의 carry가 생기는지 출력하는 프로그램을 작성하시오.
*/

public class Main {

    public static void main(String[] args) {
        int n1, n2;
        int cnt = 0;
        int carry = 0;

        Scanner scan = new Scanner(System.in);

        n1 = scan.nextInt();
        n2 = scan.nextInt();

        while(n1 != 0 && n2 != 0) {
            carry += n1%10 + n2%10;
            if(carry > 9) {
                cnt ++;
            }

            carry /= 10;
            n1 /= 10;
            n2 /= 10;
        }

        System.out.println(cnt);
    }

}
