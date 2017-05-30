package CodingTest;

/**
 * 
 * Main class
 * 전처리 과정과 다른 클래스 호출
 * fileName에 json파일 경로를 입력해야함
 *
 *
 * @author 홍기욱
 * @version 1.0, 2017.05.30
 * @see    None
 */

public class Main {

	public static void main(String args[]) {
		String fileName = "order.json";
		init(fileName);
	}

	public static void init(String fileName) {
		Orders orders = new Orders();

		ReadFile read = new ReadFile();
		read.setFileName(fileName);
		read.storeOrder(orders);

		SetStorage st = new SetStorage();

		Algorithm alg = new Algorithm();
		alg.solve(st, orders);

		Print pr = new Print();
		pr.printResult(st);
	}

}
