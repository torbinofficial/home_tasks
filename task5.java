import java.util.*;
class task5 {
	public static List<String[]> guests(String s){
		String[] arr = s.split(";");
		List<String[]> arr_splited = new ArrayList<String[]>();
		for (int i = 0; i < arr.length; i++) {
			arr_splited.add(arr[i].split(":"));
		}
 		for (int i = 0; i < arr.length - 1; i++){ 
        	for (int j = 0; j < arr.length - i - 1; j++){ 
            	if (arr_splited.get(j)[1].compareTo(arr_splited.get(j+1)[1]) > 0) { 
                	List<String[]> temp = new ArrayList<String[]>();
                	temp.add(arr_splited.get(j)); 
                	temp.add(arr_splited.get(j+1));
                	arr_splited.set(j, temp.get(1));
                	arr_splited.set(j+1, temp.get(0)); 
            	} 
            }
        }
        for (int i = 0; i < arr.length - 1; i++){ 
        	for (int j = 0; j < arr.length - i - 1; j++){ 
            	if ((arr_splited.get(j)[0].compareTo(arr_splited.get(j+1)[0]) > 0) && (arr_splited.get(j)[1] == arr_splited.get(j+1)[1])) { 
                	List<String[]> temp = new ArrayList<String[]>();
                	temp.add(arr_splited.get(j)); 
                	temp.add(arr_splited.get(j+1));
                	arr_splited.set(j, temp.get(1));
                	arr_splited.set(j+1, temp.get(0)); 
            	} 
            }
        }
        System.out.println(arr_splited.get(1)[1]);
        System.out.println(arr_splited.get(1)[0]);
        return arr_splited;
	} 
	public static void main(String[] args) {
		String s = "Fred:Corwill;Barney:Tornzbull;Adam:Corwill";
		List<String[]> arr_splited = new ArrayList<String[]>();
		arr_splited = guests(s);
	}
}