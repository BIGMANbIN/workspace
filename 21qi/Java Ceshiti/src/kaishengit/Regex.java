package kaishengit;

public class Regex {

	public static void main(String[] args) {
		String num = "372922199405121737";
		String reg = "\\d{17}(\\d|X|x)";
		if (num.matches(reg)) {

			String y = num.substring(6, 10);
			String m = num.substring(10, 12);
			String d = num.substring(12, 14);

			System.out.println("�������ڣ�" + y + "��" + m + "��" + d + "��");
			Character ch = num.charAt(16);
			int sex = Integer.parseInt(ch.toString());
			if (sex % 2 == 0) {
				System.out.println("�Ա�Ů");
			} else {
				System.out.println("�Ա���");
			}
		} else {
			System.out.println("���֤���벻���ڣ������������롭��");
		}
	}
}
