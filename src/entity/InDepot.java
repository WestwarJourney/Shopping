package entity;

import java.util.Date;

public class InDepot {
	int innum;
	int comnumber;
	int indenum;//进货数量
	Date indepottime;//日期
	int suppliernum;//供货商编号
	double inprice;//进价
	public double getInprice() {
		return inprice;
	}
	public void setInprice(double inprice) {
		this.inprice = inprice;
	}
	public int getInnum() {
		return innum;
	}
	public void setInnum(int innum) {
		this.innum = innum;
	}
	public int getComnumber() {
		return comnumber;
	}
	public void setComnumber(int comnumber) {
		this.comnumber = comnumber;
	}
	public int getIndenum() {
		return indenum;
	}
	public void setIndenum(int indenum) {
		this.indenum = indenum;
	}
	public Date getIndepottime() {
		return indepottime;
	}
	public void setIndepottime(Date indepottime) {
		this.indepottime = indepottime;
	}
	public int getSuppliernum() {
		return suppliernum;
	}
	public void setSuppliernum(int suppliernum) {
		this.suppliernum = suppliernum;
	}
	
}
