import java.util.Scanner;
class AirlineReservationSystem
{
	private static boolean[]seats=new boolean[10];
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.println("1.Reserve a Seat");
			System.out.println("2.View all seats");
			System.out.println("3.Exit");
			int choice=input.nextInt();
			if(choice==1){
				reserveSeat();
			}
			else if(choice==2){
				viewSeats();
			}
			else if(choice==3){
				System.exit(0);
				break;
			}
			else{
				System.out.println("Invalid Choice,please try again");
			}
		}
		input.close();
	}
	private static void reserveSeat(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Seat Number=");
		int seatNum=s.nextInt();
		if(seats[seatNum-1]==false){
			seats[seatNum-1]=true;
			System.out.println("Seat Reserved.Thank you");
		}
		else{
			System.out.println("Sorry,this seat is already received");
		}
	}
	private static void viewSeats(){
		for(int i=0;i<seats.length;i++){
			System.out.print("Seat "+(i+1)+":");
			if(seats[i]==true)
			{
				System.out.print(" Reserved\n");
			}
			else{
				System.out.print(" Available\n");
			}
		}
	}
}