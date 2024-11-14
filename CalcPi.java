// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int denom=1;
		double sum = 0.0;
		int number= Integer.parseInt(args[0]);
		for (int j = 0; j < number; j++){
			if (j % 2 ==0)
				sum += (double) 1 / denom;
			else
				sum = sum - ((double) 1 / denom);
			denom += 2;
		}
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, approximated:     "+sum*4);
	}
}
