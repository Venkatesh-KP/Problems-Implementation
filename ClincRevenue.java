import java.util.*;
public class ClincRevenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []a=new int [20];
        int totalIncome = 0;

        System.out.println("Enter age value (press Enter without a value to stop):");
        for(int i=0; i<5;i++) {

            a[i] = input.nextInt();
            if (a[i] < 17) {
                totalIncome = 200 + totalIncome;
            } else if (a[i] <= 17 || a[i] < 40) {
                totalIncome = 400 + totalIncome;
            } else if (a[i] > 40) {
                totalIncome = 300 + totalIncome;
            }
        }

        System.out.println("Total Income " + totalIncome + " INR");

    }
}

