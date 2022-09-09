package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 5, 7, 9, 2, -4, 6, 8, 7, 9, 1};
        rangeReverse(arr1, 0, 7);
        System.out.println(Arrays.toString(arr1));
    }

    public static void rangeReverse(int[] a, int beg, int end) {
//        if(beg>end) {
//            //reverse the role of these two bounds
//            int newBeg = end;
//            int newEnd = beg;
//            beg = newBeg;
//            end = newEnd;
        /*} else*/ if(beg < 0) {
            //beg assumed to be zero
            beg = 0;}
//        } else if(end > a.length-1) {
//            //end assumed to be the largest valid index
//            end = a.length - 1;
//        } else if(beg < 0 || end > a.length-1) {
//            //input array unchanged
//            a = a;
//        }
        int[] newArray = new int[(end-beg)+1];
        for(int i = 0; i<=end; i++) {
            newArray[i] = a[i];
        }
        int maxIndex = newArray.length;
        int halfLength = newArray.length / 2;
        for(int i = beg; i<a[halfLength]; i++) {
            int temp = newArray[i];
            newArray[i] = newArray[maxIndex - i];
            newArray[maxIndex - i] = temp;
        }
    }

}
