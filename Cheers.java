// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	        String cheer = args [0].toUpperCase();s
            int number = Integer.parseInt(args[1]);
            String specialLetters = "AEFHILMNORSX";
            int isSpecial =0; 
            for (int i = 0; i < cheer.length(); i ++) {
                isSpecial = (specialLetters.indexOf(cheer.charAt(i)));
                System.out.println("Give me " + (isSpecial == -1 ? "a " : "an") + " " + cheer.charAt(i) + ": " + cheer.charAt(i) + "!");
            }
            System.out.println("What does that spell?");
            for (int j = 0; j < number; j ++) {
                System.out.println(cheer + "!!!");
            }
        }
        
}
