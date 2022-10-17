package Task5;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        int a[] = {1,0,5,34,55,32};
        minMax(a);
        System.out.print("Min value: " + a[0] + "\n" + "Max value: " + a[a.length-1]);
    }

    public static void minMax(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[i] < a[j]) {
                    int tmp;
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}
