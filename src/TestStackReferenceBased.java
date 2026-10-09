
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
		
		 
		stack.push(10);
		stack.push(15);
		stack.push(20);
		
		stack.displayStack();
		
		System.out.println(isBalanced("{a{b}c}"));
		System.out.println(isBalanced("}{"));
		System.out.println(isBalanced("{{}"));
	}

}
