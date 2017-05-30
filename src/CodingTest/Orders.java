package CodingTest;

import java.util.ArrayList;

/**
 * 
 * Orders class
 * order set을 저장하고있음
 *
 *
 * @author 홍기욱
 * @version 1.0, 2017.05.30
 * @see    None
 */

public class Orders {
	// set of order
	private ArrayList<OrderInfo<Integer, Integer>> orders;

	// Constructor
	public Orders() {
		this.orders = new ArrayList<OrderInfo<Integer, Integer>>();
	}

	// getter setter
	public ArrayList<OrderInfo<Integer, Integer>> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<OrderInfo<Integer, Integer>> orders) {
		this.orders = orders;
	}
}
