package kaishengit;

public class Maopao {

	public static void main(String[] args) {
		String str = "23,12,45,33,56,78";
		String[] strSet = str.split(",");
		for (String st : strSet) {
			System.out.println(st);
		}
		System.out.println("===========");
		System.out.println("冒泡排序结果如下：");
		int[] intSet = new int[strSet.length];
		for (int i = 0; i < intSet.length; i++) {
			intSet[i] = Integer.parseInt(strSet[i]);
		}
		for (int i = 0; i < intSet.length - 1; i++) {
			for (int j = 0; j < intSet.length - i - 1; j++) {
				if (intSet[j] > intSet[j + 1]) {
					int temp = intSet[j + 1];
					intSet[j + 1] = intSet[j];
					intSet[j] = temp;
				}
			}
		}
		for (int n : intSet) {
			System.out.println(n);
		}
	}
}
