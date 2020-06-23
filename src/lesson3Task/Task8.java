package lesson3Task;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numb1 = new int[10];
        int[] numb2 = new int[10];
        float[] numb3 = new float[10];
        for (int a = 0; a < 10; a++) {
            numb1[a] = r.nextInt(10);
            numb2[a] = r.nextInt(10);
            numb3[a] = (float)numb1[a] / numb2[a];
        }
        System.out.println(Arrays.toString(numb1));
        System.out.println(Arrays.toString(numb2));
        System.out.println(Arrays.toString(numb3));
        int sum = 0;
        for (int i = 0; i < numb3.length; i++) {
            if (numb3[i] % 1 == 0)
                sum++;
        }
        System.out.println(sum);
    }
}
