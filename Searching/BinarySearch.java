import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[]) {
        int arr[] = {3,6,8,21,45,67,90};
        int key = 67;
        binarySearch(key, arr);
        int arr2[] = {4,6,7,8,9,22,56};
        int key2 = 10;
        binarySearch(key2, arr2);
    }

    public static void binarySearch( int key, int[] sequence ) {
        int bottom = 0;
        int top = sequence.length - 1;
        int mid = 0;
        int keyPosition = -1;

        while( bottom <= top && keyPosition == -1 ) {
            mid = ( top + bottom ) / 2;
            if( sequence[ mid ] == key ) {
                keyPosition = mid;
            }
            else {
                if( sequence[ mid ] < key ) {
                    bottom = mid + 1;
                }
                else {
                    top = mid - 1;
                }
            }
        }
        if (keyPosition != -1) {
            System.out.println("Your key, "+ key +", is at position "+ keyPosition + " in the sequence, "+ Arrays.toString(sequence));
        }
        else {
            System.out.println("Your key, "+ key +", is not in the sequence, "+ Arrays.toString(sequence));
        }

    }
}

