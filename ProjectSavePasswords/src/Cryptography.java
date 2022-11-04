import java.util.Scanner;


public class Cryptography {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String m = s.nextLine();
		System.out.println(m);
		System.out.println(cryptoC(m,3));
//		
		
	}
	public static String cryptoC(String str,int countShift) {
		String newStr = "";
		int indexChar = -1;
		char[] charsAndSymbols = {'!','@','#','$','%','^','&','*','№',';',':',
				'*','?','a','b','c','d','e','f','g','h','i','j','k','l','m','n',
				'o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N',
				'O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9','0'};
		
		for (int i = 0;i<str.length();i++) {
			
			char c = str.charAt(i);
			for (int j = 0;j<charsAndSymbols.length;j++) {
				if(c==charsAndSymbols[j]) {
					indexChar = j;
					break;
				}
			}
			if(indexChar==-1) {
				System.out.println("Ошибка ввода, возможно, есть символы, которых нет в алфавите, сообщите разработчику.");
				System.exit(0);
			}
			newStr += charsAndSymbols[(indexChar+countShift)%charsAndSymbols.length];
				
			
			
		}
		return newStr;
	}
		
	

}
