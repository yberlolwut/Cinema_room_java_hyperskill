import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Boolean sym = true;
       int  n = scanner.nextInt();
       int [][] matrix = new int[n][n];
         for (int row = 0 ;row < matrix.length; row++){
            for (int col = 0; col< matrix[row].length; col++){
                matrix[row][col] = scanner.nextInt();
        }
    }
    for (int i = 0; i< matrix.length; i++) {
        for (int j = 0;j<matrix[i].length; j++) {
            if (matrix[i][j] != matrix[j][i]) {
                sym = false;
                break;
            }
        }
    }
    if(sym) System.out.println("YES");
    else    System.out.println("NO");
    }

}

