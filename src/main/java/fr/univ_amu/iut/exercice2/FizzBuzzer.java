package fr.univ_amu.iut.exercice2;

public class FizzBuzzer {

    public String computeString(int i) {

        String s = String.valueOf(i);
        if (i%3 == 0)
            s = "Fizz";
        else if (i%5 == 0)
            s = "Buzz";
        if (i%3 == 0 && i%5 == 0)
            s = "FizzBuzz";
        return s;
    }

    public String[] computeList(int i) {
        String[] src = new String[i];
        for ( int x = 1; x<=i;++x) src[x-1] = computeString(x);
        return src;

    }
}
