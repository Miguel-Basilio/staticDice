
public class randomnumber {

	private static int randomnumber;

	public static int OneThrow(int dices, int bounces){
	
	
			randomnumber = 1+(int )(Math.random()*6);
			return randomnumber;			
}
	public static int OneThrow(){
		randomnumber = 1+(int )(Math.random()*6);
		return randomnumber;
	}
}