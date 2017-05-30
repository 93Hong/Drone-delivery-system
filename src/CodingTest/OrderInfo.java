package CodingTest;

/**
 * 
 * OrderInfo class
 * Generic class of order information
 *
 *
 * @author 홍기욱
 * @version 1.0, 2017.05.30
 * @see    None
 */

public class OrderInfo<L, R> {
	private L l;
	private R r;

	public OrderInfo(L l, R r) {
		this.l = l;
		this.r = r;
	}

	// getter setter
	public L getL() {
		return l;
	}

	public R getR() {
		return r;
	}

	public void setL(L l) {
		this.l = l;
	}

	public void setR(R r) {
		this.r = r;
	}
}