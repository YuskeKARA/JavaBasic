package practice13.common;

public class Employee extends Person {

	String departmentNm; //フィールド
	int departmentCnt;

	public String getDepartmentNm() { //アクセサ
		return this.departmentNm;
	}

	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}

	public int getDepartmentCnt() { //アクセサ
		return this.departmentCnt;
	}

	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}
}
