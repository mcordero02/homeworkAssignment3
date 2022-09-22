package uniqueCharacters;

public class homework3 {
	static boolean uniqueCharacters(String str)
	{
		int check = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int character = (str.charAt(i) - 'a');
			
			if((check & (1 << character)) > 0) {
				return false;
			}
			check |= (1 << check);
		}
		return true;
	}
	
	public static void main (String[] args) {
		
		String f = "far";
		
		if(uniqueCharacters(f)) {
			System.out.println("Yes!");
		}
		
		else {
			System.out.println("No!");
		}
		
	}
}
