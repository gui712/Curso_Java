package bonusString;

public class AulaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "abcde FGHIJ ABC abc DEFG  ";
		
		String s01 = original.toLowerCase();
		String coc = original.concat("Guilherme");
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println(coc);
		System.out.println("Original: -" + original + "-");
		System.out.println("toLower: -" + s01 + "-");
		System.out.println("Concat: -" + coc + "-");
		System.out.println("toUpper: -" + s02 + "-");
		System.out.println("Trim -" + s03 + "-"); // Corta os espaços.
		System.out.println("Sub(2): -" + s04 + "-");
		System.out.println("Sub(2, 9): -" + s05 + "-");
		System.out.println("Replace: -" + s06 + "-");
		System.out.println("Replace Sub: -" + s07 + "-");
		System.out.println("Index: -" + i + "-");
		System.out.println("LastIndex: -" + j + "-");
	}

}
