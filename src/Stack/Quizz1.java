package Stack;

public class Quizz1 {
	
	public static void main(String []args) {
		String s="12 5 3 2 + - *";
		String tokens[]=s.split(" ");
		int x[]=new int[4];
		int i=0;	
		int counter=0;
		char y[]=new char[3];
		boolean notdone =true;
		
		while(notdone) {
			try {
				
					x[i]=Integer.parseInt(tokens[i]);
					System.out.println(x[i]);
				
				
			}
			catch(NumberFormatException e) {
			
				y[counter++]=tokens[i].charAt(0);
				if(i==tokens.length)	notdone=false;
			}
	//		System.out.println(y[0]+" "+y[1]+" "+y[2]);
		i=i+1;		
		}
	}	
}
