import java.utils.Arrays;

public class LinearSearch {
    public static void linearSearch(int iSearch, int array[]) {
        int pos = -1;
        for (int i=0; i<array.length; i++) {
            if(array[i] == iSearch) {
                pos = i; 
                System.out.println(iSearch + " is at position " + pos + " in the array.");
                break;
            }
        }
        if(pos == -1) {
            System.out.println(iSearch + " is not in the array.");
        }
    }

    public static void main(String args[]) {
        int i = 2;
        int array[] = {3,6,7,2,4,8};
        linearSearch(i, array);
    }
}