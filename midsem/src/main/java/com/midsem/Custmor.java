package com.midsem;

public class Custmor {

	private int cid;
	private String cname;
	private String caddress;
	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the caddress
	 */
	public String getCaddress() {
		return caddress;
	}
	/**
	 * @param caddress the caddress to set
	 */
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public Custmor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Custmor(int cid, String cname, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Custmor [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + "]";
	}

}
