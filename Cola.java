/* Java program to implement basic stack 
operations */
public class Cola { 
	static final int MAX = 1000; 
	int end;
	int a[] = new int[MAX]; // Maximum size of Stack 

	boolean isEmpty() 
	{ 
		boolean retVal=false;
		if (end<0){
            retVal=true;
		}
		return retVal; 
	} 

	public Cola() 
	{ 
		end = -1;
	} 

	boolean Encolar(int x) 
	{ 
		if (end >= (MAX - 1)) { 
			System.out.println("Cola llena!!"); 
			return false; 
		} 
		else {
		    end=end+1; 
			a[end] = x; 
			System.out.println("Elemento "+x + " introducido a la cola"); 
			return true; 
		} 
	} 

	int Descolar() 
	{ 
		if (end < 0) { 
			System.out.println("La cola esta vacia"); 
			return 0; 
		} 
		else { 
			int x = a[0];
			for (int i=1;i<=end;i++){
				a[i-1]=a[i];
			}
			end=end-1; 
			return x; 
		} 
	} 

	public void listar(){
		for (int i=0;i<=end;i++){
			System.out.println("Elemento en posicion "+i+" : "+a[i]);
		}
	}

	public static void main(String args[]) { 
		Cola Q = new Cola(); 
		Q.Encolar(10); 
		Q.Encolar(20); 
		Q.Encolar(30); 
		Q.listar();
		System.out.println("Elemento al inicio de la cola:"+Q.Descolar() + " "); 
		Q.listar();
		Q.Encolar(40);
		Q.listar(); 
		System.out.println("Elemento al inicio de la cola:"+Q.Descolar() + " ");
		Q.listar(); 
	} 	
} 
