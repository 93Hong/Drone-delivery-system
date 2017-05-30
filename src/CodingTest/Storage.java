package CodingTest;

import java.util.ArrayList;

/**
 * 
 * Storage class
 * 하나의 창고에 대해서 이름, 주문 처리 건수, 예상 소요 시간 등 정보를 담고있음
 *
 *
 * @author 홍기욱
 * @version 1.0, 2017.05.30
 * @see    None
 */

public class Storage {
	private String storageName; // 창고 이름
	private int numOfDel; // 주문 처리 건수
	private int time; // 예상 소요 시간
	private ArrayList<Integer> deliveryAdd; // 처리 대상

	// Constructor
	public Storage(String storageName) {
		this.storageName = storageName;
		this.numOfDel = 0;
		this.time = 0;
		deliveryAdd = new ArrayList<Integer>();
	}

	
	// getter setter
	public String getStorageName() {
		return storageName;
	}

	public void setStorageName(String storageName) {
		this.storageName = storageName;
	}

	public int getNumOfDel() {
		return numOfDel;
	}

	public void setNumOfDel(int numOfDel) {
		this.numOfDel = numOfDel;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public ArrayList<Integer> getDeliveryAdd() {
		return deliveryAdd;
	}

	public void setDeliveryAdd(ArrayList<Integer> deliveryAdd) {
		this.deliveryAdd = deliveryAdd;
	}
}
