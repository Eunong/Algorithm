package labs.HandShaking;

import java.util.Scanner;

/**
 월요일에 원탁에 회의를 하려고 직원들이 모여 있다.
 회의 시작 전에 서로 악수를 하려고 하는데
 팔이 겹치지 않게 하면서
 모두 악수를 하는 방법의 수를 구하는 프로그램을 작성하시오.
 case 1 : 2     sol1 : 1
 case 2 : 6     sol2 : 5
 case 3 : 10    sol3 : 42
 case 4 : 32    sol4: 35357670
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long[] a = new long[n/2];

        if(n >= 2)
            a[0] = 1;
        if(n >= 4)
            a[1] = 2;

        System.out.println(handshakingCount(a, n/2));
    }

    private static long handshakingCount(long[] a, int n) {
        if(a[n-1] != 0) {
            return a[n-1];
        }

        for(int i=1; i<=n-2; i++) {
            a[n-1] += handshakingCount(a, i) * handshakingCount(a, n - 1 - i);
        }
        a[n - 1] += (handshakingCount(a, n - 1) * 2);

        return a[n - 1];
    }
}