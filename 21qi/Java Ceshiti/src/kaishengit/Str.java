package kaishengit;

public class Str {

	public static void main(String[] args) {
		int sz_num = 0;
		int eg_num = 0;
		int zh_num = 0;
		String str = "123abc12312�й�UUUU89uoiu����98928";
		char[] chars = str.toCharArray();
		for (char c : chars) {
			if (c >= '0' && c <= '9') {
				sz_num++;
			} else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				eg_num++;
			} else {
				zh_num++;
			}
		}
		System.out.println("���֣�" + sz_num + "Ӣ�ģ�" + eg_num + "���ģ�" + zh_num);
	}
}
