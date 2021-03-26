/**
 * Created by USER on 24/02/2021.
 */
public class Repert {
    public static int repeatCount(int arr[], int elem, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == elem) {
                count++;
            }
        }
        return (count == 0 ? 0 : count);
    }

    public static void main(String args[]) {
        for (int i = 0; i <13 ; i++) {
            int a[] = {0, 15, 0,5, 6,8,8,6, 1, 15, 7, 0, 04};
            int num = a[i];
            System.out.println("The Duplicate number: " + num + " The number of repetitions: " + repeatCount(a, num, 13));
        }

    }
}
