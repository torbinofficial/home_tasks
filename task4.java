import java.util.*;
public class task4 {
	public static int count_summ_pairs_by_for(int[] arr, int target){
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target){
					count++;
				};
			};
		};
		return count;
	}
	public static int count_summ_pairs_by_stream(int[] arr, int target){
		
	}
	public static void main(String[] args) {
		int[] arr = {1, 3, 6, 2, 2, 0, 4, 5};
	}
}