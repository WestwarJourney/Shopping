package entity;

import java.util.Date;

public class OutList {
	int outnum;
	int comnumber;
	String comname;//商品名
	String standard;//规格
	double price;
	int outdenum;//出库数量
	Date outdepottime;//出库时间
	int unumber;//用户编号
	String uname;
	public int getOutnum() {
		return outnum;
	}
	public void setOutnum(int outnum) {
		this.outnum = outnum;
	}
	public int getComnumber() {
		return comnumber;
	}
	public void setComnumber(int comnumber) {
		this.comnumber = comnumber;
	}
	public String getComname() {
		return comname;
	}
	public void setComname(String comname) {
		this.comname = comname;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOutdenum() {
		return outdenum;
	}
	public void setOutdenum(int outdenum) {
		this.outdenum = outdenum;
	}
	public Date getOutdepottime() {
		return outdepottime;
	}
	public void setOutdepottime(Date outdepottime) {
		this.outdepottime = outdepottime;
	}
	public int getUnumber() {
		return unumber;
	}
	public void setUnumber(int unumber) {
		this.unumber = unumber;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
}
