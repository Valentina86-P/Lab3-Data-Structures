
import java.util.Scanner;

public class TestStackReferenceBased {
	public static boolean isBalanced(String s) {
		StackReferenceBased stack = new StackReferenceBased();
		int i = 0;
		
		while(i<s.length()) {
			char ch = s.charAt(i);
			
			if(ch=='{') {
				stack.push('{');
			}
			else if (ch=='}') {
				if(stack.isEmpty()) {
					return false;
				}
				Object openBrace =stack.pop();
			}
			i++;
		}
		return stack.isEmpty();
		
		
	}
	public static void main(String[]args) {
		StackReferenceBased stack = new StackReferenceBased();
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		while (choice != 6) {
			System.out.println("Welcome to StackTest! Please select a number from the list.");
			System.out.println("1. Push a string on to the stack");
			System.out.println("2. Pop a string from the stack");
			System.out.println("3. Peek at the top of the stack");
			System.out.println("4. Empty the stack");
			System.out.println("5. Check if a string has balanced brackets.");
			System.out.println("6. Quit the program");
			
			choice = input.nextInt();
			input.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter a string to push:");
				String item = input.nextLine();
				stack.push(item);
				break;
			case 2:
				if (stack.isEmpty()) {
					System.out.println("Nothing to pop, the stack is empty.");
				}
				else {
					System.out.println("Popped: " + stack.pop());
				}
				break;
			case 3:
				if (stack.isEmpty()) {
					System.out.println("Nothing to peek at, the stack is empty.");
				}
				else {
					System.out.println("Top of the stack: " + stack.peek());
				}
				break;
			case 4:
				stack.popAll();
				System.out.println("The stack has been emptied.");
				break;
			case 5:
				System.out.println("Enter a string to check:");
				String text = input.nextLine();
				if (isBalanced(text)) {
					System.out.println("The brackets are balanced.");
				}
				else {
					System.out.println("The brackets are NOT balanced.");
				}
				break;
			case 6:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Please choose a number from 1 to 6.");
			}

			if (choice != 6) {
				stack.displayStack();
			}
		

		}
		input.close();

		}
	}
