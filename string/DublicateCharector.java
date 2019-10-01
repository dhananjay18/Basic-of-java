package string;

import java.util.HashMap;

public class DublicateCharector {
	public static  Character findMaxofChar(String text)
	{
		HashMap<Character, Integer>map=new HashMap<>();
		Character maxchar=' ';
		long max=Integer.MIN_VALUE;
		for (int i = 0; i < text.length(); i++) {
			Character current =text.charAt(i);
			if (map.containsKey(current)) {
				map.put(current, map.get(current)+1);

			}
			else
			{
				map.put(current, 1);
			}
			if (map.get(current)>max) {
				maxchar=current;
				max=map.get(current);

			}

		}

		return maxchar;

	}
	public static void main(String[] args) {
		String text="asddfgghjkl";
		System.out.println("The max charectore is :"+findMaxofChar(text));
	}

}