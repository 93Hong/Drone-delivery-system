package CodingTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * 
 * ReadFile class
 * json library를 사용하여 파싱 후 객체에 저장
 *
 *
 * @author 홍기욱
 * @version 1.0, 2017.05.30
 * @see    None
 */

public class ReadFile {
	private String fileName;

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void storeOrder(Orders o) {
		JSONParser parser = new JSONParser();

		try {
			JSONObject orders = (JSONObject) parser.parse(new FileReader(fileName));

			JSONArray order = (JSONArray) orders.get("orders");

			for (Object c : order) {

				JSONObject orderInfo = (JSONObject) c;

				int orderNo = Integer.parseInt(String.valueOf(orderInfo.get("orderNo")));
				int address = ((String) orderInfo.get("address")).charAt(0) - 48;

				ArrayList<OrderInfo<Integer, Integer>> or = o.getOrders();

				or.add(new OrderInfo<Integer, Integer>(orderNo, address));
			}

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
