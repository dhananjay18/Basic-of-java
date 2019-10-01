package string;

public class ApiString {
	public static void main(String[] args) {
		String str="Ram is";
		String str2="esh";
		boolean bol=true;
		String s5=String.valueOf(bol);
		System.out.println(s5);
		System.out.println(str.charAt(0));
		System.out.println(str.concat(str2));
		System.out.println(str.contains(str));
		System.out.println(str.endsWith("m"));
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		int s=str.indexOf("is");
		System.out.println(s);
		int s1=str.lastIndexOf("is");
		System.out.println(s1);
		int s2=str.length();
		System.out.println(s2);
		System.out.println(str.replace("a","e"));
		System.out.println(str.trim()+"pawar");
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.valueOf(str2));
	}

}
