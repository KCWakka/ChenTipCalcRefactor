import java.util.Scanner;
import java.util.ArrayList;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // to take input
        ArrayList<String> totalItemName = new ArrayList<>(); //making a list for the extra credit
        System.out.println("Welcome to the tip Calculator!");
        System.out.print("What is your total income in dollars and cents per day?: ");
        // line 8 is my freestyle, telling the user how often they can have this meal with tips
        double incomeNum = scan.nextDouble();
        scan.nextLine();
        System.out.print("How many people are in your group?: ");
        int peopleNum = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercent = scan.nextInt();
        scan.nextLine();
        TipCalculator Calc = new TipCalculator(peopleNum,tipPercent);
        // line 10 to line 17 is to input user's input into variable for calculation later
        double itemCost = 0;
        double totalItemCost = itemCost;

        while (itemCost * 1 >= 0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (put -1 to end): ");
            itemCost = scan.nextDouble();
            scan.nextLine();
            // this is to take item cost input
            if (itemCost != -1) { // to see if they want to end it
                totalItemCost += itemCost;
                System.out.print("Enter the Item: ");
                totalItemName.add(scan.nextLine());
                // line 27 to line 30 is to add money to an variable and add item name
            } else {
                totalItemCost += itemCost;
                totalItemCost++;
                //line 33 to 34 is to make sure when they end it, the -1 won't interfere in the calculation
                // the ++ neutralize although i could just left else empty
            }

        }

        System.out.println("--------------------");
        System.out.println("Total bill before tip: $" + totalItemCost);
        System.out.println("Total Percentage: " + tipPercent + "%");
        System.out.println("Income per day: $" + incomeNum);
        double tipCost = Math.round ( (totalItemCost * (tipPercent / 100.0)) * 100 ) / 100.0;
        // line 44- doing math and input it into a variable as i am going to use that many time
        System.out.println("Total tip: $" + tipCost);
        double totalCost = tipCost + totalItemCost;
        //line 47, same reason as 44
        System.out.println("Total bill with tip: $" + (Math.round (totalCost * 100.0) / 100.0));
        System.out.println("Per person cost before the tip: $" + Math.round (totalItemCost / peopleNum * 100) / 100.0);
        System.out.println("Tip per person : $" + Math.round (tipCost / peopleNum * 100) / 100.0); // rounding
        System.out.println("Total cost per person: $" + Math.round (totalCost / peopleNum * 100) / 100.0); //rounding
        System.out.println("You can get a meal like this approximately every " + Math.round (totalCost / incomeNum + 0.5) + " days or day!");
        // line 53 is to tell how many days it take for the meal
        System.out.println("--------------------");
        System.out.println("Items ordered:");
        String item;
        for (int i = 0; i < totalItemName.size(); i++) {
            // line 58 to 61-a way to take out certain item out of the list and print it
            item = totalItemName.get(i);
            System.out.println(item);
        }
    }
}