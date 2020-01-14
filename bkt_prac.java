
public class bkt_prac {
	
	private char[] stack;
	private int size;
	
	public bkt_prac() {
		stack = new char[10];
		size = 0;
	}
	
	public void push(char a) {
		
		if(stack.length==size) {
			System.out.println("full.");
		} else {
			stack[size] = a;
			size += 1;
		}
	}
	
	public char pop() {
		
		char a = ' ';
		
		if(size==0) {
			System.out.println("add first.");
		} else {
			a = stack[size-1];
			stack[size-1] = ' ';
			size -= 1;
		}
		
		return a;
		
	}
	
	public boolean isEmpty() {
		
		if(size==0)
			return true;
		else
			return false;
	}
	
	
	public static boolean balance(char a, char b) {
		
		if(a=='(' && b==')')
			return true;
		if(a=='[' && b==']')
			return true;
		if(a=='{' && b=='}')
			return true;
		else
			return false;
		
	}
	
	public static boolean equal(char[] c) {
		
		bkt_prac a = new bkt_prac();
		
		for(int i=0; i<c.length; i++) {
			if(c[i]=='(' || c[i]=='[' || c[i]=='{') 
				a.push(c[i]);
			if(c[i]==')' || c[i]==']' || c[i]=='}') {
				if(a.isEmpty())
					return false;
				else if(!balance(a.pop(),c[i]))
					return false;
			}
		}
		
		if(a.isEmpty())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		char[] a = {'{','{','(',')',']'};
		
		System.out.print(equal(a));
		
	}

}
