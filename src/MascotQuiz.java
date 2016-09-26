import java.util.Scanner;
/*
 * add comments as needed but all executable code must appear
 * between the two large comment blocks below.
*/
public class MascotQuiz {

	public static void main(String[] args) {

		int score = 0;
		
		String greeting = 
				"In this game, I ask you four questions about mascots for "
				+"US collegiate sports teams." +
				"\nYou get 1 point for each correct answer, "
				+"0 points if you type don't know, "
				+"and you lose a point for wrong answers.";
		final String schoolOptions = "University of Michigan, "
				+"University of Nebraska, "
				+"University of Oklahoma, "
				+"University of Wisconsin";
		final String mascotOptions = 
				"Badgers, Cornhuskers, Sooners, Wolverines";
		String prompt1 = 
				"\nType 1 and I'll give you the mascot and "
				+"you give give the school. \n"
				+"Type 2 and I'll give you the school and "
				+"you give me the mascot. \n"
				+"Type 3 and I'll quit.";		
		
		System.out.println( greeting );
		
		/*************************************************************
		 *  Do NOT delete, move, or change the lines of code above this:
		 * All of your code should appear between these comments.
		 ************************************************************/
		/*
		 * Name: Adam Sieger
		 * Section: 0303
		 * TA: Sravanthi Bondugula
		 * Propose: This program asks the user 4 questions about colleges and their mascots and allows them to retake it after they are finished with it.
		 */
		Scanner sc = new Scanner(System.in); //used for reading in int
		boolean yesOrNo = true; //used for the answer the user used for when asked to play again
		int userChoice; //stores the choice the user made during the prompt
		int questionNumber = 1;  //creates a number that is used to keep track of which question the player is on
		String userAnswer = ""; //stores the answer the user typed for the question
		String correctAnswer = ""; //stores the correct name for the answer of whatever question is asked
		String questionAsked = ""; //stores the name of the school/mascot to identify
		
		do{
			
			System.out.println(prompt1);
			userChoice = sc.nextInt();
			sc.nextLine();
			
			
			if(userChoice == 1){ //gives the user a mascot to identify with a school
				System.out.println("Answer with one of: " + schoolOptions);
				
				
				if(questionNumber == 1){
					correctAnswer = "University of Oklahoma";
					questionAsked = "Sooners";
				}
				else if(questionNumber == 2){
					correctAnswer = "University of Wisconsin";
					questionAsked = "Badgers";
				}
				else if(questionNumber == 3){
					correctAnswer = "University of Michigan";
					questionAsked = "Wolverines";
				}
				else if(questionNumber == 4){
					correctAnswer = "University of Nebraska";
					questionAsked = "Cornhuskers";
					
				}
				
				System.out.print( questionAsked + " ? ");
				
				userAnswer = sc.nextLine();
				
				if(userAnswer.equals(correctAnswer))
					score += 1;
				else if(userAnswer.equalsIgnoreCase("don't know"))
					score += 0;
				else
					score -= 1;	
			}
			
			else if(userChoice == 2){ //gives a user a school to identify a mascot with
				System.out.println("Answer with one of: " + mascotOptions);
				
				if(questionNumber == 1){
					questionAsked = "University of Oklahoma";
					correctAnswer = "Sooners";
				}
				else if(questionNumber == 2){
					questionAsked = "University of Wisconsin";
					correctAnswer = "Badgers";
				}
				else if(questionNumber == 3){
					questionAsked = "University of Michigan";
					correctAnswer = "Wolverines";
				}
				else if(questionNumber == 4){
					questionAsked = "University of Nebraska";
					correctAnswer = "Cornhuskers";
				}
				
				System.out.print(questionAsked + " ? ");
				
				userAnswer = sc.nextLine();
				
				if(userAnswer.equals(correctAnswer))
					score += 1;
				else if(userAnswer.equalsIgnoreCase("don't know"))
					score += 0;
				else
					score -= 1;	
			}
			
			else{ //used for when the user enters a "3"
				System.out.println("Your score is " + score);
				System.exit(1);
			}
			questionNumber++;
			
			if(questionNumber == 5){ //after four questions are asked, the program asks the user if he/she wants to play again
				
				System.out.print("\nWould you like to play again(Yes/No): ");
				if(sc.nextLine().equalsIgnoreCase("no")){
					yesOrNo = false;
					}
				else{ //resets the quiz when the user wants to play again
					score = 0;
					questionNumber = 1;
				}
			}
				
		}while(yesOrNo);
		sc.close();

		
		/*************************************************************
		 *  Do NOT delete, move, or change this next line of code:
		 * This should be the last line of code in your program!
		 ************************************************************/
		System.out.println( "\nBye. Your score is " + score );
	}

}
