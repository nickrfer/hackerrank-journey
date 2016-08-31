import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void quickSort(int[] ar){
        int pivot = ar[0];
        QuickSortList list = new QuickSortList();

        for (int i = 0; i < ar.length; i++){
            list.slotInElement(ar[i], pivot);
        }

        list.printContent();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        quickSort(ar);
    }

    private static class QuickSortList {
        List<Integer> leftList = new ArrayList<Integer>();
        List<Integer> equalList = new ArrayList<Integer>();
        List<Integer> rightList = new ArrayList<Integer>();

        public void slotInElement(int element, int pivot) {
            if (element < pivot) {
                leftList.add(element);
            } else if (element == pivot) {
                equalList.add(element);
            } else {
                rightList.add(element);
            }
        }

        public void printContent() {
            List<Integer> completeList = Stream.concat(Stream.concat(
                leftList.stream(), equalList.stream()), rightList.stream())
                .collect(Collectors.toList());

            for (Integer element : completeList) {
                System.out.print(element + " ");
            }
        }
    }
}
