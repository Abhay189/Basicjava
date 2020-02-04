
public class BasicJava2 {

		public static boolean match(char lowerCaseChar, char upperCaseChar) {
			if(lowerCaseChar<='z' && lowerCaseChar >='a' && upperCaseChar>='A' && upperCaseChar <= 'Z' && upperCaseChar==lowerCaseChar) {
				return true;
			}
			else{
				return false;
			}
		}
		public static long ceiling(double num) {
			long number = (long) num;
			return number; 
		}
		public static int count(String str , String chars) {
			int strLength = str.length();
			int counter = 0;
			int i;
			int charslength = chars.length();
			for ( i=0; i < strLength; i++ ) {
				char character = str.charAt(i);
				int z;
				for(z=0;z<charslength;z++) {
					char checkchr = str.charAt(z);
					if (checkchr==character);
					{
						counter += 1;
					}
				}
			}
			// yo 
			return counter;				
		}
		public static int addHexDigits(int num) {
			
			return 1;
			
	
	}
}
