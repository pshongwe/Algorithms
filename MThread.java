public class MThread extends Thread{


	private static char [] memo;
	private static String str = "HoLidAY";

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
		
		memo = new char[str.length()];
		Main m = new Main();
		Thread t1 = new Thread(new ThreadA());
		Thread t2 = new Thread(new ThreadB());
		t1.start();
		t2.start();

		m.start();

	}


class ThreadA implements Runnable {	
	public void run(){

		System.out.println(MThread.convertCaseRec(str));
		
	}

}

class ThreadB implements Runnable {

	public void run(){

		System.out.println(MThread.convertCase(str));
	}

}
}
