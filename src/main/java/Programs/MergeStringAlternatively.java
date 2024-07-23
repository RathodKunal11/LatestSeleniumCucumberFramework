package Programs;

public class MergeStringAlternatively {
	
	public static void main(String[] args) {
		String str1="abc";
		String str2="pqr";
	
		int maxLength = Math.max(str1.length(), str2.length());
		
		StringBuilder result = new StringBuilder();
		System.out.println(maxLength);
		
		for(int i=0;i<maxLength;i++) {
			if(i<str1.length()) {
				result.append(str1.charAt(i));
			}
			if(i<str2.length()) {
				result.append(str2.charAt(i));
			}
		}
		
		System.out.println(result);
		
	}

}
