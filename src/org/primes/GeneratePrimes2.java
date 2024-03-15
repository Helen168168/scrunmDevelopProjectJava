package org.primes;

public class GeneratePrimes2 {
    private static int s;
    private static boolean[] f;
    private static int[] primes;
    public static int[] GeneratePrimes(int maxValue) {
        if(maxValue < 2) {
            return new int[0];
        } else {
            initializeSieve(maxValue);
            sieve();
            loadPrimes();
            return primes;
        }
    }
    public static void loadPrimes() {
    int i;
    int j;
    int count = 0;
    for (i = 0; i < s; i++) {
        if (f[i]) {
            count++;
        }
    }
    primes = new int[count];
    for (i = 0, j = 0; i < s; i++) {
        if (f[i]) {
            primes[j++] = i;
        }
    }
}
    public static void sieve() {
        int j;
        int i;
        for ( i = 2; i < Math.sqrt(s) + 1; i++) {
            for (j =  2 * i; j < s; j += i) {
                f[j] = false;
            }
        }
    }
    public static void initializeSieve(int maxValue) {
         s = maxValue + 1;
        int i;
        for ( i = 0; i < s; i++) {
            f[i] = true;
        }
        f[0]=f[1]=false;
    }
}
