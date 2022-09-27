import java.util.Scanner;

public class PA1a {


	public static void main(String[] args) {
		Scanner Liban = new Scanner(System.in);
		System.out.println("Enter number of yards:");
		int yards = Liban.nextInt();
		System.out.println("Enter number of feet:");
		int feet = Liban.nextInt();
		System.out.println("Enter number of inches:");
		int inches = Liban.nextInt();
		int newFeet = feet * 12;
		int newYards = yards *36;
		int total = inches + newFeet + newYards;
		System.out.println("Total number of inches: " + total);
	}

}
