
public class Test {

	public static void main(String[] args) {
		
		String str = "1235456";
		int n;
		try {
			
			n = new Integer(str);
		} catch (Exception e) {
			n = 0;
		}
		
		System.out.println(str + ":" + n);
	}

}
