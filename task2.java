public class task2 {
	public static String first_non_repeating_letter(String s){
		boolean flag = false;
		String res = "";
		for (int i = 0; i < s.length() - 1; i++){
			char temp=s.charAt(i);
			flag = true;
			for (int j = 0; j < s.length(); j++) {
				if ((s.charAt(j) == temp) && (i != j)){
					flag = false;
				}
			}
			if (flag){
				res+=temp;
				break ;
			}
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(s.length() - 1) == s.charAt(i)){
				flag = true;
				break ;
			};
		};
		if (!flag){
			res += s.charAt(s.length() - 1);
		}

		return res;
	}
	public static void main(String[] args) {
		System.out.println(first_non_repeating_letter("ttef"));
	}
}