import java.util.Scanner;

public class PA1b{


	public static void main(String[] args) {
		Scanner Liban = new Scanner(System.in);
		System.out.println("Enter number of inches:");
		int inches = Liban.nextInt();
		int yards = inches/36;
		int feet = inches/12;
		System.out.println("Yards: " + yards);
		System.out.println("Feet: " + (inches - (yards * 36))/12);
		int inch = (inches - (yards * 36) - ((inches - (yards * 36))/12) * 12);
		System.out.println("Inches: " + inch);
		
	}

}
