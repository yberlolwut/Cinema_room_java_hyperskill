import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalElements = scanner.nextInt();
        int maxElement = 0;
        for (int i = 0; i < totalElements; i++) {
            int element = scanner.nextInt();

            if((element % 4) == 0){
                if(element > maxElement) maxElement = element;

            }

        }
        System.out.println(maxElement);
    }
}