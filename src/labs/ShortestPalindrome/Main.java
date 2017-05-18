package labs.ShortestPalindrome;

/*
 임의의 문자열 s를 입력 받아 n개의 (0개 이상) 문자를
s 뒤로 이어 붙여서 회문을 만들고 싶다.
이 때 만들어지는 회문의 갯수는 여러 개가 될 수 있는데
이 중 그 길이가 제일 짧은 것을 출력하라.

입력이 abcb 이면 가능한 출력은 abcba, abcbcba 등이 될 수 있으며
가장 짧은 회문은 abcba 이다.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(getShortestPalindrome(s));
    }

    private static String getShortestPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (j >= 0) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j--;
            System.out.println(j);
        }

        if (i == s.length()) {
            return s;
        }

        String append = new StringBuilder(s.substring(i)).reverse().toString();
        return append + s;
    }

//    private static boolean isPalindrome(String s) {
//        int n = s.length();
//        for(int i=0; i<n/2; i++) {
//            if(s.charAt(i) != s.charAt(n-1-i)) {
//                return false;
//            }
//        }
//        return true;
//    }
}