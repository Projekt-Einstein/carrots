package zajecia5.zadanie4;


public class Main {
	
	public static void main(String[] args) {
		CesarCipher cesarCipher = new CesarCipher(1);
		
		String abcString = "ABC";
		String encodedABC = cesarCipher.encode(abcString);
		String decodedABC = cesarCipher.decode(encodedABC);
		
		System.out.println("Encoded: " + encodedABC);
		System.out.println("Decoded: " + decodedABC);
		
		String betterEncodedABC = cesarCipher.betterEncode(abcString, 2);
		String betterDecodedABC = cesarCipher.betterDecode(betterEncodedABC, 2);
		
		System.out.println("Better encoded: " + betterEncodedABC);
		System.out.println("Better decoded: " + betterDecodedABC);
	}
}
