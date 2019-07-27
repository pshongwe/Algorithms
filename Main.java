public class Main{


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
		else{
			char fc = input.charAt(slength-1);
			fc = flip(fc);
	
			return convertCaseRec(input.substring(0, slength - 1))+""+fc;
		}
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

		System.out.println(convertCase(str));
		System.out.println(convertCaseRec(str));
		
	}

}
