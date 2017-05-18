package labs.MaxMul;

/*
N개의 숫자를 입력 받아 다른 하나의 숫자로 출력하는 encoding 함수를 고안하려 한다.
N개의 숫자 중에 하나를 선택하여 그 값을 1 증가시킨 후에 모든 숫자들을 곱한다.
이 때 출력은 곱 중에서 최대값을 선택한다.

Input이면 1 2 3 출력 가능한 경우는
2*2*3(=12), 1*3*3(=9), 1*2*4(=8) 이며
이중 최대값은 12이고 출력은 12가 되어야 한다.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n = new int[3];
        n[0] = scan.nextInt(); n[1] = scan.nextInt(); n[2] = scan.nextInt();

        System.out.println(getMaxMul(n, 3));
    }

    private static int getMaxMul(int[] n, int size){
        int i;
        int mul = 1;
        int min = 0;
        int min_idx = 0;
        //최소값 인덱스를 찾는다
        for(i = 0; i < size; i++) {
            if(n[i]<min) {
                min = n[i];
                min_idx = i;
            }
        }
        //최소값을 가진 인덱스의 값을 +1
        n[min_idx]++;
        //곱하기
        for(i = 0; i < size; i++) {
            mul *= n[i];
        }
        return mul;
    }
}
