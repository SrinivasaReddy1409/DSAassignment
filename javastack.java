import java.util.*;
public class dsa9{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of parantheses: ");
		while(sc.hasNextLine()){
		String s=sc.nextLine();
		  Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                System.out.println("false");;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    System.out.println("false");
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    System.out.println("false");
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    System.out.println("false");
                break;
            }
        }
        System.out.println(stack.isEmpty());
	}
    }
}

