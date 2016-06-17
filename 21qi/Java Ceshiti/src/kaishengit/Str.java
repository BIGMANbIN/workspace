package kaishengit;

public class Str {

	public static void main(String[] args) {
		int sz_num = 0;
		int eg_num = 0;
		int zh_num = 0;
		String str = "123abc12312中国UUUU89uoiu编码98928";
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
		System.out.println("数字：" + sz_num + "英文：" + eg_num + "中文：" + zh_num);
	}
}
