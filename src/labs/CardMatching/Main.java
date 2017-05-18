package labs.CardMatching;


/*
아래와 같이 8개의 숫자가 적여 있는 카드 네 장이 있다.
– Card 1 : 1 2 3 4 5 6 7 8
– Card 2 : 1 2 3 4 9 10 11 12
– Card 3 : 1 2 5 6 9 10 13 14
– Card 4 : 1 3 5 7 9 11 13 15

“있어”/”없어＂를 각각 Y, N로 하여 입력을
주면 숫자를 출력하는 프로그램을 작성하
라.
• 예) YNYY [입력]
• 5 [출력]
*/

import java.util.Scanner;

public class Main {
    static final int CARD_CNT = 4;
    static final int NUMBER_CNT = 16;
    static final int NUM_IN_CARD = 8;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

		/*
		// case1.
		int[][] card = {
			{1,2,3,4,5,6,7,8},
			{1,2,3,4,9,10,11,12},
			{1,2,5,6,9,10,13,14},
			{1,3,5,7,9,11,13,15}
		};

		String s = scan.next();
		//input String to int array
		int input[] = new int[CARD_CNT];
		for(int i=0; i<CARD_CNT; i++) {
			if(s.charAt(i) == 'Y') {
				input[i] = 1;
			} else if(s.charAt(i) == 'N') {
				input[i] = 0;
			}
		}

		for(int i=1; i<=NUMBER_CNT; i++) {
			int flg = 1;
			for(int j=0; j<CARD_CNT; j++) {
				if(input[j] != contains(card[j], NUM_IN_CARD, i)) {
					flg = 0;
					break;
				}
			}
			if(flg == 1) {
				System.out.println(i);
				break;
			}
		}

	private static int contains(int[] a, int n, int target) {
		for(int i=0; i<n; i++) {
			if(a[i] == target)
				return 1;
		}
		return 0;
	}

		// case2. String으로 숫자별로 적혀있는 카드 파악해서 비교하기
		String n[] = {
				"YYYY",
				"YYYN",
				"YYNY",
				"YYNN",
				"YNYY",
				"YNYN",
				"YNNY",
				"YNNN",
				"NYYY",
				"NYYN",
				"NYNY",
				"NYNN",
				"NNYY",
				"NNYN",
				"NNNY"
		};

		String s = scan.next();

		for (int i = 0; i < NUMBER_CNT; i++) {
			if (s.equals(n[i])) {
				System.out.println(i + 1);
				break;
			}
		}
		*/

        // case3.
        int[][] card = {
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}
        };

        String s = scan.next();
        //input String to int array
        int input[] = new int[CARD_CNT];
        for(int i=0; i<CARD_CNT; i++) {
            if(s.charAt(i) == 'Y') {
                input[i] = 1;
            } else if(s.charAt(i) == 'N') {
                input[i] = 0;
            }
        }

        for(int i=0; i<NUMBER_CNT; i++) {
            int flg = 1;
            for(int j=0; j<CARD_CNT; j++) {
                if(card[j][i] != input[j]) {
                    flg = 0;
                    break;
                }
            }
            if(flg == 1) {
                System.out.println(i+1);
                break;
            }
        }
    }
}


