package string;

public class NumberToString {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	public int numberOutputInString(String str)
	{
		int count=0;
		for (int i = 0; i <= str.length()-1; i++) {
			if (str.charAt(i)!='.') {
				count++;	
			}
			else {
				break;
			}

		}
		return count;

	}

}
