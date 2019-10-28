
public class Equestria {

	public static void main(String[] args) {
		int baltimareOne = 31;
		int baltimareTwo = 15;
		int manehattanOne = 35;
		int manehattanTwo = 9;
		double total = distance(baltimareOne, baltimareTwo, manehattanOne, manehattanTwo);
		System.out.println("The distance from Baltimare to Manehattan is " + total + " sparkle fairy pony units");

		int losPegasusOne = 6;
		int losPegasusTwo = 20;
		int neighagraFallsOne = 24;
		int neighagraFallsTwo = 7;
		double newtotal = distance(losPegasusOne, losPegasusTwo, neighagraFallsOne, neighagraFallsTwo);
		System.out.println("The distance from Los Pegasus to Neighagra Falls is " + newtotal + " sparkle fairy pony units");
		
		int badlandsOne = 28;
		int badlandsTwo = 22;
		int ponyvilleOne = 16;
		int ponyvilleTwo = 13;
		double newNewTotal = distance(badlandsOne, badlandsTwo, ponyvilleOne, ponyvilleTwo);
		System.out.println("The distance from the Badlands to Ponyville is " + newNewTotal + " sparkle fairy pony units");
	}
	
	public static double distance(double exOne, double whyOne, double exTwo, double whyTwo) {
		double x = exTwo - exOne;
		double y = whyTwo - whyOne;
		
		double first = Math.pow(x,  2);
		double second = Math.pow(y,  2);
		
		double inside = first + second;
		
		double finalDistance = Math.sqrt(inside);
		
		return finalDistance;
	}
}
