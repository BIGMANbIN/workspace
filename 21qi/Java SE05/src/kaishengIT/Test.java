package kaishengIT;

public class Test {

	public static void main(String[] args) {
		
		String[] name = new String[10];
		
		name[0] = "Tom";
		name[1] = "Jim";
		name[2] = "hanhan";
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("ĞÕÃûÎª: ");
		String n = sc.next();
		
		for(int i = 0; i < name.length; i++){
			
			if(name[i] == null){
				name[i] = n;
				break;
			}
		}
		
		System.out.println("=============");
		
		for(String nam : name){
			if(nam != null){
				
				System.out.println(nam);
			}
			
		}
		
	}

}
