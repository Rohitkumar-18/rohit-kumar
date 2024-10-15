import java.util.Scanner;
public class NorthwestCornerMethod 
	{
 public static void main(String[] args) 
	 {
 Scanner scanner = new Scanner(System.in);
 // Input supply array
 System.out.print("Enter the number of supply sources: ");
 int supplyCount = scanner.nextInt();
 int[] supply = new int[supplyCount];
 System.out.println("Enter the supply values:");
 for (int i = 0; i < supplyCount; i++) {
 System.out.print("Supply " + (i + 1) + ": ");
 supply[i] = scanner.nextInt();
 }
 // Input demand array
 System.out.print("Enter the number of demand destinations: ");
 int demandCount = scanner.nextInt();
 int[] demand = new int[demandCount];
 System.out.println("Enter the demand values:");
 for (int j = 0; j < demandCount; j++) {
 System.out.print("Demand " + (j + 1) + ": ");
 demand[j] = scanner.nextInt();
 }
 // Create a matrix to hold the allocation results
 int[][] allocation = new int[supplyCount][demandCount];
 // Apply the Northwest Corner method
 int i = 0, j = 0;
 while (i < supplyCount && j < demandCount) 
	 {
 if (supply[i] < demand[j]) 
	 {
 allocation[i][j] = supply[i];
 demand[j] -= supply[i];
 i++;
 } else {
 allocation[i][j] = demand[j];
 supply[i] -= demand[j];
 j++;
 }
 }
 // Print the result
 System.out.println("Allocation Matrix:");
 for (i = 0; i < allocation.length; i++) 
	 {
 for (j = 0; j < allocation[i].length; j++) 
	 {
 System.out.print(allocation[i][j] + "\t");
 }
 System.out.println();
 }
 scanner.close();
 }
}
