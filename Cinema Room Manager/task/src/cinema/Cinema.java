package cinema;
import java.util.Objects;
import java.util.Scanner;

public class Cinema {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        final int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        final int seats = scanner.nextInt();
        String[][] cinemaPlan;
        cinemaPlan = new String[rows+1][seats+1];
        boolean exit = true;
        int totalIncome = 0;
        int ticketsSold = 0;
        seatsIntoArray(rows,seats,cinemaPlan);
        do{
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> drawSeats(rows, seats, cinemaPlan);
                case 2 -> {
                    totalIncome +=buyTicket(rows, seats, cinemaPlan);
                    ticketsSold++;
                }
                case 3 -> showStatistics(ticketsSold,totalIncome,rows,seats);
                case 0 -> exit = false;
                default -> System.out.println("Invalid input");
            }

        }while(exit);

    }
    static int buyTicket(int rows ,int seats, String[][]cinemaPlan){
        int price = 0;
        boolean ticketPurchased = true;
        do {
            System.out.println("Enter a row number:");
            int row = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            int seat = scanner.nextInt();
            if (row < 1 || row > rows || seats < 1 || seat > seats) {
                System.out.println("Wrong input!");
            }else if(Objects.equals(cinemaPlan[row][seat], "B")){
                System.out.println("That ticket has already been purchased!");
            }else {
                if (((rows) * (seats)) <= 60) {
                    price = 10;
                    cinemaPlan[row][seat] = "B";
                    System.out.println("Ticket price: $" + price);
                    ticketPurchased = false;
                } else if (row - 1 < Math.floorDiv(rows, 2)) {
                    price = 10;
                    cinemaPlan[row][seat] = "B";
                    System.out.println("Ticket price: $" + price);
                    ticketPurchased = false;
                } else {
                    price = 8;
                    cinemaPlan[row][seat] = "B";
                    System.out.println("Ticket price: $" + price);
                    ticketPurchased = false;
                }
            }
        }while(ticketPurchased);
        //drawSeats(rows,seats,cinemaPlan);
        return price;
    }
    static void seatsIntoArray(int rows,int seats,String[][] cinemaPlan){


        for (int i = 0; i <= rows  ; i++) {
            for (int j = 0; j <= seats ; j++) {
                if(i == 0 && j == 0){
                    cinemaPlan[i][j] = " ";
                } else if (j==0) {
                    cinemaPlan[i][j] = String.valueOf(i);
                } else if (i==0) {
                    cinemaPlan[i][j] = String.valueOf(j);
                } else {
                    cinemaPlan[i][j] = "S";
                }



            }

        }

    }
    static void drawSeats(int rows, int seats, String[][] cinemaPlan){
        System.out.println("Cinema:");
        for (int i = 0; i < rows +1; i++) {
            for (int j = 0; j < seats +1; j++) {
                if (j == seats ){
                    System.out.println(cinemaPlan[i][j]+ " ");
                }else {
                    System.out.print(cinemaPlan[i][j]+ " ");
                }

            }
            
        }

    }
    static void showStatistics(int ticketsSold,int totalIncome, int rows, int seats){
        System.out.printf("Number of purchased tickets: %d%n",ticketsSold);
        System.out.printf("Percentage: %5.2f%% %n",(double)ticketsSold/rows/seats*100);
        System.out.printf("Current income: $%d%n",totalIncome);
        int income =(int) (seats*(Math.floorDiv(rows,2)*10) + (seats*Math.ceil((double)rows/2)*8));
        System.out.printf("Total income: $%d%n",income);

    }
}
