// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int c=0,b=1;
		double i=1.0;
		double d=1.0;
		int number=Integer.parseInt(args[0]);
		while(c<number){
			if(c%2==1){
				i=i-(d/(b+2));
				
			}else
				{i+=d/(b+2);
				
				}c++;
			b+=2;
		}System.out.println(i*4);
	}
}
