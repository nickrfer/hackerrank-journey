import java.io.*;
import java.util.*;

public class Solution {

    private static int numberOfShifts;

    public static void insertionSort(int[] ar)
    {
        // start iterating by the second element (index 1)
        for (int i = 1; i < ar.length; i++) {
            int currentElement = ar[i];
            orderElementsAsceding(i, currentElement, ar);
        }
        System.out.println(numberOfShifts);
    }

    private static void orderElementsAsceding(int i, int currentElement, int[] ar) {
        int x;
        // compares the current element to each element before it
        // in order to put them ahead, if they are bigger
        for (x = i-1; x >= 0 && ar[x] > currentElement; x--) {
            ar[x+1] = ar[x];
            numberOfShifts++;
        }
        ar[x+1] = currentElement;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
       }
       insertionSort(ar);
    }
}
