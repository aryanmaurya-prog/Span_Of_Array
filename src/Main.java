import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 145;
        arr[1] = 232;
        arr[2] = 33;
        arr[3] = 41;
        arr[4] = 599;
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
