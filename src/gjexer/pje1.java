package gjexer;

public class pje1 {
	public static void main (String args []){
		int count = 10;
		int total = 0;
		while (count < 1000){
				if ((count %3 )==0){
					total = total + count;
				} else if ((count %5)==0){
					total = total + count;
				}
			count++;
		}
		System.out.print(total);
	}
	
}
