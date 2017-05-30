package CodingTest;

import java.util.ArrayList;

/**
 * 
 * SetStorage class
 * 각 창고에 대한 정보를 담고있음
 *
 *
 * @author 홍기욱
 * @version 1.0, 2017.05.30
 * @see    None
 */

public class SetStorage {
	ArrayList<Storage> storageList;
	
	// Constructor
	public SetStorage() {
		storageList = new ArrayList<>();
		
		Storage stA = new Storage("A");
		Storage stB = new Storage("B");
		Storage stC = new Storage("C");
		
		storageList.add(stA);
		storageList.add(stB);
		storageList.add(stC);
	}
	
	
	// getter setter
	public ArrayList<Storage> getStorageList() {
		return storageList;
	}

	public void setStorageList(ArrayList<Storage> storageList) {
		this.storageList = storageList;
	}
}
