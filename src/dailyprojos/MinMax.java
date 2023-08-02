package dailyprojos;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int size = Integers();
        int[] elements = readElements(size);
        int min = findMin(elements);

        System.out.println(Arrays.toString(elements));
        System.out.println("min is : " + min);

    }
    public static int Integers(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sn.nextInt();
        sn.nextLine();
        return size;
    }
    public static int[] readElements(int numElements) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[numElements];
        System.out.println("Enter the elements:");

        for (int i = 0; i < numElements; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
        }
        scanner.nextLine(); // Consume newline
        return elements;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}


