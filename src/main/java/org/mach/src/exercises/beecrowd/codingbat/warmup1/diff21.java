package org.mach.src.exercises.beecrowd.codingbat.warmup1;

public class diff21 {

    int n;

    public int diff21(int n) {
        if (n > 21) {
            return Math.abs(n - 21) * 2;
        }

        return Math.abs(n - 21);
    }
}
