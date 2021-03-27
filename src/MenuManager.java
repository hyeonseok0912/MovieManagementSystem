import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args)  {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while (num != 6) {
			System.out.println("1. Add Movies");
			System.out.println("2. Delete Movies");
			System.out.println("3. Edit Movies");
			System.out.println("4. View Movies");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 5 : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				addMovie();
				
				break;

			case 2:
				deleteMovie();
				break;

			case 3:
				editMovie();
				continue;	

			case 4:
				viewMovie();
			}
		}
	}
	public static void addMovie() {
		Scanner input = new Scanner(System.in);
		System.out.print("Movie Number");
		int movieNumber = input.nextInt();
		System.out.print("Movie Name");
		String movieName = input.next();
		System.out.println(movieNumber+","+movieName);
	}
	public static void deleteMovie() {
		Scanner input = new Scanner(System.in);
		System.out.print("Movie Number");
		int movieNumber = input.nextInt();
		System.out.print("Movie Name");
		String movieName = input.next();
	}
	public static void editMovie() {
		Scanner input = new Scanner(System.in);
		System.out.print("Movie Number");
		int movieNumber = input.nextInt();
		System.out.print("Movie Name");
		String movieName = input.next();
		
		}
	public static void viewMovie() {
		Scanner input = new Scanner(System.in);
		System.out.print("Movie Number");
		int movieNumber = input.nextInt();
	
	}
}
