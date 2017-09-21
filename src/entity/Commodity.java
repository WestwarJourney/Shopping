package entity;

import java.util.Date;

public class Commodity {
	int comnumber;
	String comname;
	String standard;//规格
	double price;//单价
	int stock;//库存
	Date indepottime;//生产日期
	int life;//保质期
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getIndepottime() {
		return indepottime;
	}
	public void setIndepottime(Date indepottime) {
		this.indepottime = indepottime;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	
}
