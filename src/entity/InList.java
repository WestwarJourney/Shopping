package entity;

import java.util.Date;
//进货表
public class InList {
	int innum;
	int comnumber;//商品号
	String comname;//商品名
	String standard;//规格
	int life;//保质期
	int indenum;//进货数量
	Date indepottime;//进货日期
	double inprice;//进货价格
	int suppliernum;//供货商编号
	String suppliername;//供货商姓名
	int sphonenum;//供货商手机号
	String factory;//代表厂家
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
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
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
	public double getInprice() {
		return inprice;
	}
	public void setInprice(double inprice) {
		this.inprice = inprice;
	}
	public int getSuppliernum() {
		return suppliernum;
	}
	public void setSuppliernum(int suppliernum) {
		this.suppliernum = suppliernum;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public int getSphonenum() {
		return sphonenum;
	}
	public void setSphonenum(int sphonenum) {
		this.sphonenum = sphonenum;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
}
