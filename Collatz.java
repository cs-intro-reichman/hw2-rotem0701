// Demonstrates the Collatz conjecture.

public class Collatz {
	public static void main(String args[]) {
		int valueN = Integer.parseInt(args[0]); 
		String mode = args[1];
		for (int seed = 1; seed <= valueN; seed++){
			int number = seed;
			int count =1;
			String sequence = number + " ";
			if (number == 1){ //Handle specific case where the seed is 1
				 sequence += "4 2 1 ";
				 count = 4;
			}
			while (number !=1){
				if (number % 2 ==0){
					number = number / 2;
				}
				else{
					number = number * 3 + 1;
				}
				count ++;
				sequence += number + " ";
			}
			if (mode.equals("v")){
				System.out.print(sequence + "("+ count + ")");
				System.out.println();
			}

		}
			System.out.print("Every one of the first " + valueN + " hailstone sequences reached 1.");
	}
}

