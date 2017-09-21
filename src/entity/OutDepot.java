package entity;

import java.util.Date;

public class OutDepot {
	int outnum;//出库编号
	int comnumber;
	int outdenum;//出库数量
	Date outdepottime;//出库时间
	int unumber;//用户编号
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
	
}
