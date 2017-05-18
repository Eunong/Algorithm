package labs.PalindromeNumber;
/*
어떤 숫자 n와 n을 뒤집은 n’을 합하는 것을 반복하여 palindrome을 찾고자 한다.
예) 1st step : n= 195, n’ = 591, n+n’ = 786
2nd step : n = 786, n’ = 687, n+n’ = 1473
3rd step : n = 1473, n’ = 3743, n+n’ = 5214
4th step : n = 5214, n’ = 4125, n+n’ = 9339
Got it!!

• 어떤 숫자 n을 입력 받아서 palindrome까지 도달하는데
몇 번의 뒤집어서 더하기를반복하는 지와 palindrome number를 출력하시오.
(1000번을 넘지 않는데까지만 계산)
예) 195 [enter]
4 9339
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(findPalindromeNumber(n));
    }

    static int findPalindromeNumber(int n) {
        int i = 0;
        while(i < 1000) {
            if(n == reverse(n)) {
                break;
            }
            n += reverse(n);
            i++;
        }
        return i;
    }

    static int reverse(int n) {
        int r = 0;
        while(n != 0) {
            r = r*10 + n%10;
            n /= 10;
        }
        return r;
    }
}
