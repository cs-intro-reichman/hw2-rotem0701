// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
		int nTimes = Integer.parseInt(args[0]);
		int countGreater = 0;
		int countLessOrEven = 0;
		while (nTimes > 0) {
			if (Math.random() > 0.5) {
				countGreater ++; 
			}
			else {
				countLessOrEven ++;
			}
			nTimes --;
		}
		
		System.out.println("> 0.5: " + countGreater + " times");
		System.out.println("<= 0.5: " +countLessOrEven + " times");

		if (countGreater != 0 && countLessOrEven != 0 ) {
			 if (countGreater > countLessOrEven) {
				System.out.println ((double)countLessOrEven / countGreater );
				}
				else {
					System.out.println ((double)countGreater / countLessOrEven);
				}
	
		}
	}
}