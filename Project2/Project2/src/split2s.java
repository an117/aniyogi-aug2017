
public class split2s {
	public static String sandwich(String input) {
		String [] sandwich = input.split(" ");
		int indexone = 0;
		int indextwo = 0;
		for(int i = 0; indexone == 0 && !sandwich[0].equals("bread"); i++) {
			if(sandwich[i].equals("bread")) {
				indexone = i;
			}
		}
		for(int i =sandwich.length -1; indextwo == 0;i--) {
			if(sandwich[i].equals("bread")) {
				indextwo = i;
			}
		}
		String outcome = "";
		for(int i = indexone + 1; i < indextwo; i++) {
			outcome = outcome +sandwich[i]+" ";
		}
		return outcome;
	}
	
}
