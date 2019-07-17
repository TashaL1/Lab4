import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		
		String cont = "y";
		int userInput = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Learn your squares and cubes!");
		System.out.println();
		
		while (cont.equalsIgnoreCase("y")) {
		System.out.println("Please enter an integer: ");
		userInput = scan.nextInt();
		
		System.out.println();
		System.out.printf("%-10s  %-11s %-13s\n","Number", "Squared", "Cubed");
	    System.out.printf("=======     =======     =====\n");
	    
	    
	    for (int i = 1; i <= userInput; i++) {
	    	//System.out.print(i);
	    	System.out.printf("%-10s  %-11s %-13s\n" ,(i), (int)(Math.pow(i, 2)), (int)Math.pow(i, 3));
	    
	    }
	    System.out.println();
	    System.out.println("Would you like to continue? (y/n)");
		cont = scan.next();
	    }
	
	System.out.println("Thank you for your participation ");

	scan.close();

	}

}
