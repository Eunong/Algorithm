package labs.TreePath;

import java.util.Scanner;
public class Main {
    static final int LEFT = 0;
    static final int RIGHT = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fraction n = new Fraction();
        Fraction l = new Fraction();
        Fraction m = new Fraction();
        Fraction r = new Fraction();
        Fraction p = new Fraction();
        int cmp;
        int flg; //left 방향이면 0, right방향이면 1

        l.t = 0;	l.b = 1;
        m.t = 1;	m.b = 1;
        r.t = 1;	r.b = 0;

        n.t = scan.nextInt();
        n.b = scan.nextInt();

        cmp = Fraction.compare(n, m);
        if(cmp > 0) {
            p = r;
            flg = RIGHT;
        }
        else if(cmp < 0) {
            p = l;
            flg = LEFT;
        }
        else {
            return;
        }

        findingPath(n, Fraction.plus(l, m), m, Fraction.plus(m, r), p, flg);
    }

    private static void findingPath(Fraction n, Fraction l, Fraction m, Fraction r, Fraction p, int flg) {
        int cmp = Fraction.compare(n, m);
        if(cmp == 0) {
            return;
        }
        if(cmp > 0) {
            System.out.print("R");
            if(flg != RIGHT) {
                p = Fraction.minus(r, m);
            }
            findingPath(n, Fraction.plus(m, r), r, Fraction.plus(r, p), p, RIGHT);
        }
        else if(cmp < 0 ) {
            System.out.print("L");
            if(flg != LEFT) {
                p = Fraction.minus(l, m);
            }
            findingPath(n, Fraction.plus(l, p), l, Fraction.plus(m, l), p, LEFT);
        }
    }
}
