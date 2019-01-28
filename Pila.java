/* Java program to implement basic stack 
operations */
public class Pila { 
	static final int MAX = 1000; 
	int top; 
	int a[] = new int[MAX]; // Maximum size of Stack 

	boolean isEmpty() 
	{ 
		boolean retVal=false;
		if (top<0){
            retVal=true;
		}
		return retVal; 
	} 

	public Pila() 
	{ 
		top = -1;
	} 

	boolean push(int x) 
	{ 
		if (top >= (MAX - 1)) { 
			System.out.println("Overflow de la pila"); 
			return false; 
		} 
		else {
		    top=top+1; 
			a[top] = x; 
			System.out.println("Elemento "+x + " introducido a la pila"); 
			return true; 
		} 
	} 

	int pop() 
	{ 
		if (top < 0) { 
			System.out.println("La pila esta vacia"); 
			return 0; 
		} 
		else { 
			int x = a[top];
			top=top-1; 
			return x; 
		} 
	} 

	public static void main(String args[]) { 
		Pila P = new Pila(); 
		P.push(10); 
		P.push(20); 
		P.push(30); 
		System.out.println("Elemento en la cima de la pila:"+P.pop() + " "); 
		P.push(40); 
		System.out.println("Elemento en la cima de la pila:"+P.pop() + " "); 
	} 	
} 
