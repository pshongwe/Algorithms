public class Main{
	private static char [] memo;


	public static String getReversedName(String aString) {
        String result = "";
        int i = 0;
        int j = aString.length() - 1;
        char [] array = aString.toCharArray();
        while(i < j){
            if(isSpecialCharacter(aString.charAt(i))){
               i++;
            }
            else if(isSpecialCharacter(aString.charAt(j))){
                j--;
            }
            else{
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        result = new String(array);
        return result;

    }

    private static boolean isSpecialCharacter(char aCharacter) {
        return !(Character.isSpaceChar(aCharacter) || Character.isLetterOrDigit(aCharacter));
    }

	public static String convertCase(String input){
		String result = "";
		for(int i = 0; i < input.length(); i++){
			char current = input.charAt(i);
			if(Character.isUpperCase(current)){
				current = Character.toLowerCase(current);
				result += current;
			}
			else if(Character.isLowerCase(current)){
				current = Character.toUpperCase(current);
				result += current;
			}
			else result += current;		
		}
		return result;
	}

	public static String convertCaseRec(String input){		
		int slength = input.length();
		
		if(input.equals(null) || slength == 0)
			return "";		
		else if(memo != null){
				if(memo[slength - 1] == (input.charAt(slength - 1)))
					return memo[slength - 1]+"";
				else{
					char fc = input.charAt(slength-1);
					fc = flip(fc);
					memo[slength - 1] = fc;
					return convertCaseRec(input.substring(0, slength - 1))+""+fc;
				}
		}
		return new String(memo);
	}

	public static char flip(char c){
		char res = c;
		if(Character.isUpperCase(c)){
			res = Character.toLowerCase(c);
		}
		else res = Character.toUpperCase(c);
		return res;
	}
	
	private static String str = "HoLi_dAY";
	public static void main(String [] args){
		memo = new char[str.length()];
		
		System.out.println(convertCase(str));	
		System.out.println(convertCaseRec(str));

	}
}
