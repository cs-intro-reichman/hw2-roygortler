// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int c=0;
		int b=1;
		int n=Integer.parseInt(args[0]);
		String s=args[1];
		
		if(s.equals("c"))
			System.out.println("Every one of the first "+n+" hailstone sequences reached 1.");
		else
			{while(c<n){int num=b;int f=1;
				if(b==1){
					System.out.print(b+" ");
					num=4;
					while(num!=1){
						
						System.out.print(num+" ");	
						if(num%2==0)
						{
						num/=2;
						}

					else
					{num=num*3+1;
					}

					}System.out.println(1+" (4)");
				}
					
				while(num!=1)
					{	System.out.print(num+" ");	
						if(num%2==0)
						{
						num/=2;
						}

					else
					{num=num*3+1;
					}f++;}
				b++;
				if(b!=2)
					System.out.println("1"+" ("+f+")");
				c++;
				
		}System.out.println("Every one of the first "+n+" hailstone sequences reached 1.");}
	}
}
