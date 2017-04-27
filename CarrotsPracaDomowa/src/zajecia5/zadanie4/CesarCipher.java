package zajecia5.zadanie4;

public class CesarCipher {
	private static final int DEFAULT_SHIFT = 2;
	
	private int shift;
	
	public CesarCipher() {
		shift = DEFAULT_SHIFT;
	}
	
	public CesarCipher(int shift) {
		this.shift = shift;
	}
	
	/*
	 * StringBuilder jest obiektem pozwalajacym na tworzenie napisow.
	 * Normalnie obiekt typu string jest obiektem nie modyfikowalnym tzn ze jak robimy "A" + "B" 
	 * to powstanie nowy obiekt, a nie ,,dokleimy'' do tego z lewej.
	 * StringBuilder pozwala na takie doklejanie, a co za tym idzie nie zzera nam zasobow.
	 */
	
	public String encode(String text) {
		StringBuilder builder = new StringBuilder();
		
		for (char c : text.toCharArray()) {
			builder.append((char)(c + shift));
		}
		
		return builder.toString();
	}
	
	public String decode(String text) {
		StringBuilder builder = new StringBuilder();
		
		for (char c : text.toCharArray()) {
			builder.append((char) (c - shift));
		}
		
		return builder.toString();
	}
	
	public String betterEncode(String text, int shiftChange) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < text.length(); i++) {
			char nextChar = text.charAt(i);
			
			builder.append((char) (nextChar + shift + i * shiftChange));
		}
		
		return builder.toString();
	}
	
	public String betterDecode(String text, int shiftChange) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < text.length(); i++) {
			char nextChar = text.charAt(i);
			
			builder.append((char) (nextChar - shift - i * shiftChange));
		}
		
		return builder.toString();
	}
	
}
