import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end   = scanner.nextInt();
        double total = 0;
        double number = 0;

        for(int i = start; end >= i; i++){
            if(i%3 == 0){
                total += i;
                ++number;
            }

        }
        System.out.println(total/number);
    }
}
