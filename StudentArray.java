import java.util.Scanner;

public class StudentArray {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int [] grade = new int[5];
		String  [] name = new String[5];
		int sum = 0;
		
		for(int i = 0; i < grade.length; i++){
			System.out.println("Please enter the " + (i+1) + " name: " );
			name[i] = stringInput();
			System.out.println("Please enter the " + (i+1) + " grade: ");
			grade[i] = intInput();
			
		}
		int userInput = 0;
		
		do{
			System.out.println("Please enter 1 to view the grades");
		 	System.out.println("Please enter 2 to vew the average grades ");
			System.out.println("Please enter 3 to exit");
			userInput = keyboard.nextInt();
			
			if(userInput == 1){
				for(int j = 0; j < grade.length; j++ ){
					System.out.println((j+1) + " Name: " + name[j] + " Grade:" + grade[j]);
				}
			}
			if(userInput == 2){
					for(int k = 0; k < grade.length; k++ ){
						sum += grade[k];
						
					}
					double average = sum/grade.length;
					System.out.println("The average is : " + average);
				}
			if(userInput == 3){
				System.out.println("Thankyou for using this program and goodbye.");
			}
			
		}while(userInput != 3);
	}
	public static String stringInput(){
		Scanner keyboard = new Scanner(System.in);
		String x = keyboard.nextLine();
		return x;
	}
	
	public static int intInput(){
		Scanner keyboard = new Scanner(System.in);
		int x = keyboard.nextInt();
		return x;
	}
}
