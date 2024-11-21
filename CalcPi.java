// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int number = Integer.parseInt(args[0]);
		double realPiValue = Math.PI;
		double sum = 0.0;
		double fraction; 
		for (int i = 0; i < number; i ++) {
			fraction = 1.0 / (2 * i + 1);
			sum += (i % 2 ==0 ? fraction : -fraction);
		}
		System.out.println("pi according to Java: " + realPiValue);
		System.out.println("pi, approximated:     " + sum * 4);
	}
}
