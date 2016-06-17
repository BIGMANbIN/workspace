package kaishengit;

public class Test {
	// 1.¶ñººÊ½
	private Test(){
		
	}
	private static Test test = new Test();
	
	public static Test getInstance(){
		return test;
	}
	
//	7.µİ¹éËã·¨
	public static void main(String[] args) {
		System.out.println(a(5));
	}
	static int a(int n){
		if(n == 1){
			return 1;
		}
		return 2*a(n-1)+1;
		
	}
}
	
	



