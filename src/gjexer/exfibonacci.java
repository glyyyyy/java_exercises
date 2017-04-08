package gjexer;

public class exfibonacci {
	public static void main (String args []){
		int x = 7;
		int numb1 = 1;
        int numb2 = 1;
        int temp = 0;
		for(int a=1; a <= x ; a++ ){
			 System.out.println(numb2+ " ");
	            temp = numb1;
	            numb1 = numb2;
	            numb2 = temp + numb2;
		}
	}
}

