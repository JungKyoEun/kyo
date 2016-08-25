package ex02.mvc;

public class DeptDTO { // table Dept2 - Model 
    // dcode dname pdept area 
	int dcode;
	String dname;
	int pdept;
	String area;
	
	public int getDcode() {
		return dcode;
	}
	public void setDcode(int dcode) {
		this.dcode = dcode;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getPdept() {
		return pdept;
	}
	public void setPdept(int pdept) {
		this.pdept = pdept;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
