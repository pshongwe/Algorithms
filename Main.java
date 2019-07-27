public class Main{


	private static char [] memo;

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
			continue;
			
		}

		return result;
	}



	public static String convertCaseRec(String input){
		
		int slength = input.length();
		
		if(input.equals(null) || slength == 0){
			return "";
		}
		else if(memo != null){
				if(memo[slength - 1] == (input.charAt(slength - 1))){
					return memo[slength - 1]+"";
				}
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
		else{
			res = Character.toUpperCase(c);
		}

		return res;
	}

	public static void main(String [] args){
		String str = "HolIdAy";
		memo = new char[str.length()];
		System.out.println(convertCase(str));
		System.out.println(convertCaseRec(str));
		
	}

}
