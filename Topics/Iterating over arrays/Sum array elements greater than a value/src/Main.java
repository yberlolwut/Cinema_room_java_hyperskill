import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = Integer.parseInt(scanner.nextLine());
        // put your code here
        int sum = 0;
        for(int i : arr){
            if(i > n){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}