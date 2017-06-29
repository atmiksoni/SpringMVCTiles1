package com.test;

/**
 * Created by soniiatm on 6/2/2017.
 */
public class PrimeNoTest {

    /* * Second version of isPrimeNumber method, with improvement like not *
    checking for division by even number, if its not divisible by 2. */
    public static boolean isPrimeNumber(int number)
    { if (number == 2 || number == 3) {
        return true;
    }
    if (number % 2 == 0) {
        return false;
    }
    int sqrt = (int) Math.sqrt(number) + 1;
    for (int i = 3; i < sqrt; i += 2)
    {
        if (number % i == 0)
        { return false; }
    }
    return true;
    }


}
