import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int[] arr2 = new int[arr.length];
        steps = steps % arr.length;
        int j = 0;
        for(int i = 0; i < arr.length;i++){
            if(i+steps < arr.length){
                arr2[i+steps] = arr[i];
            }
            else {
                arr2[j] = arr[i];
                j++;
            }
        }
        for(int i = 0; i < arr.length;i++)
            arr[i] = arr2[i];
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}