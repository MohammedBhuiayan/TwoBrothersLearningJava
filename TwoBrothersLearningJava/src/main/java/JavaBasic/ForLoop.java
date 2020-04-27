package JavaBasic;

public class ForLoop {

	public static void main(String[] args) {
		
		String name = "Arifur Rahman Rajib";
		
		int count = 0;
		
		
		for (int i=0; i<name.length(); i++) {
			
			if (name.charAt(i) == 'a') {

			count = count +1;
			
			}
			
			
		}
		
		System.out.println(count);
		
		
	}

}
