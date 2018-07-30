package com.situ.day9.homework;

public class JianLi {
	//vi
	//工商管理登记表 gouShangGuanLiDengJiBiao  xsgldjb
	private String xm;// 姓名
	private String xb;// 性别
	private int nl;// 年龄
	private String jtzz;// 家庭住址
	private String xl;// 学历

	public JianLi() {
		super();
	}

	public JianLi(String xm, String xb, int nl, String jtzz, String xl) {
		super();
		this.xm = xm;
		this.xb = xb;
		this.nl = nl;
		this.jtzz = jtzz;
		this.xl = xl;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public int getNl() {
		return nl;
	}

	public void setNl(int nl) {
		this.nl = nl;
	}

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}

	public String getXl() {
		return xl;
	}

	public void setXl(String xl) {
		this.xl = xl;
	}

	@Override
	public String toString() {
		return "JianLi [xm=" + xm + ", xb=" + xb + ", nl=" + nl + ", jtzz=" + jtzz + ", xl=" + xl + "]";
	}

}
