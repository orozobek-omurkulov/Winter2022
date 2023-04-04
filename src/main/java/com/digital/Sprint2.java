package com.digital;

public class Sprint2 {
    public Sprint2(boolean[] isEq) {
    }

    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (Boolean i : arr) {
            if (i == true) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
