package labs.TreePath;

public class Fraction {
    int t;
    int b;

    protected static int compare(Fraction n1, Fraction n2) {
        //n1 > n2, return 1
        if((float)n1.t/n1.b > (float)n2.t/n2.b) {
            return 1;
        }
        //n1 < n2, return -1
        else if((float)n1.t/n1.b < (float)n2.t/n2.b) {
            return -1;
        }
        //same = 0;
        else {
            return 0;
        }
    }

    protected static Fraction plus(Fraction n1, Fraction n2) {
        Fraction rslt = new Fraction();
        rslt.t = n1.t + n2.t;
        rslt.b = n1.b + n2.b;
        return rslt;
    }
    protected static Fraction minus(Fraction n1, Fraction n2) {
        Fraction rslt = new Fraction();
        rslt.t = n1.t - n2.t;
        rslt.b = n1.b - n2.b;
        return rslt;
    }
}
