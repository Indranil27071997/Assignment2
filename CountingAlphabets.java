package beginingJava;

public class CountingAlphabets {

	public static void main(String[] args) {
		CountingAlphabets a = new CountingAlphabets();
		a.CountingAlphabets("Hello World");
	
	}
	public void CountingAlphabets(String str) {
		char[] strArr;
		do {
			strArr = str.toCharArray();
			char ch = strArr[0];
			int count = 1;
			for (int i = 1; i < strArr.length; i++) {
				if (ch == strArr[i]) {
					count++;
				}
			}
			
			if (((ch != ' ') && (ch != '\t'))) {
				System.out.println(ch + " - " + count);
			}
			
			str = str.replace("" + ch, "");
		} while (strArr.length > 1);
	}


		// TODO Auto-generated method stub

}


