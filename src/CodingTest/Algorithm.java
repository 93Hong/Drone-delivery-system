package CodingTest;

import java.util.ArrayList;

/**
 * 
 * Algorithm class
 * 각 창고에서 어느 지역으로 드론을 보낼지 결정하는 알고리즘
 *
 *
 * @author 홍기욱
 * @version 1.0, 2017.05.30
 * @see    None
 */

public class Algorithm {
	// 지역별 배송 소요시간
	public int[][] d = { { 10, 20, 60 }, { 25, 10, 40 }, { 30, 20, 25 }, { 50, 40, 15 }, { 60, 55, 20 } };
	
	// 창고에서 보유하고 있는 드론의 개수
	public int[] storageSize = { 20, 25, 15 };
	public int[] temp = { 20, 25, 15 };

	// Algorithm
	public void solve(SetStorage st, Orders orders) {
		ArrayList<OrderInfo<Integer, Integer>> order = orders.getOrders();

		for (int i = 0; i < order.size(); i++) {
			int size = (int) order.get(i).getR() - 1;
			int index = getMinIndex(size);

			// 해당 창고의 드론 여분이 있을 때
			if (storageSize[index] != 0) {
				storageSize[index]--;

				Storage storage = st.getStorageList().get(index);

				storage.getDeliveryAdd().add(order.get(i).getL());
				storage.setNumOfDel(storage.getNumOfDel() + 1);
				storage.setTime(storage.getTime() + d[size][index]);
			}
			// 해당 창고의 드론 여분이 없을 때
			else {
				// 드론을 복귀시키고
				storageSize[index] = temp[index];
				
				// 왕복 시간을 고려해서 Weight를 줌
				d[size][index] *= 2;
				i--;
				continue;
			}
		}
	}

	// 최소값의 인덱스
	public int getMinIndex(int index) {
		if (d[index][0] <= d[index][1] && d[index][0] <= d[index][2])
			return 0;
		else if (d[index][1] <= d[index][0] && d[index][1] <= d[index][2])
			return 1;
		return 2;
	}
}
