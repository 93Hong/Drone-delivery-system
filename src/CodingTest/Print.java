package CodingTest;

/**
 * 
 * Print class
 * 결과 출력
 *
 *
 * @author 홍기욱
 * @version 1.0, 2017.05.30
 * @see    None
 */

public class Print {
	public void printResult(SetStorage st) {
		// 각 창고에 대해서
		for (int i = 0; i < st.getStorageList().size(); i++) {

			Storage s = st.getStorageList().get(i);
			System.out.println(s.getStorageName() + "창고");
			System.out.println("주문 처리 건수 " + s.getNumOfDel() + "건");
			System.out.println("예상 소요 시간: " + s.getTime() + "분");
			System.out.println("처리 대상");

			for (int j = 0; j < s.getDeliveryAdd().size(); j++) {
				System.out.println(s.getDeliveryAdd().get(j));
			}
			System.out.println();
		}
	}
}
