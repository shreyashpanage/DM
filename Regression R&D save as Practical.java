import java.util.ArrayList;
import java.util.List;

public class Practical {
    public static void main(String[] args) {
        // Create a list of R&D spending
        List<Integer> rAndDSpending = new ArrayList<>();
        rAndDSpending.add(2);
        rAndDSpending.add(31);
        rAndDSpending.add(11);
        rAndDSpending.add(40);
        rAndDSpending.add(4);
        rAndDSpending.add(30);
        rAndDSpending.add(34);
        rAndDSpending.add(53);
        rAndDSpending.add(25);
        rAndDSpending.add(20);
        rAndDSpending.add(8);

        // Create a list of profit
        List<Integer> profit = new ArrayList<>();
        profit.add(5);
        profit.add(20);
        profit.add(40);
        profit.add(53);
        profit.add(30);
        profit.add(34);
        profit.add(11);
        profit.add(31);
        profit.add(25);
        profit.add(20);
        profit.add(3);

        // Find the index of the year 1996
        int yearIndex = rAndDSpending.indexOf(8);

        // Find the profit of the firm in 1996
        int profitIn1996 = profit.get(yearIndex);

        // Print the profit of the firm in 1996
        System.out.println("The profit of the firm in 1996 is " + profitIn1996 + " million.");
    }
}
