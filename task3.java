public class task3  {
	public static int digital_root(int i){
		int res = 0;
		String s= String.valueOf(i);
		for (int j = 0; j < s.length(); j++) {
			String temp = "";
			temp += (s.charAt(j));
			res += Integer.parseInt(temp);
		}
		if (i / 10 != 0){
			return digital_root(res);
		};
		return i;
	}

	public static void main(String[] args) {
		System.out.println(digital_root(12346));
	}
}
