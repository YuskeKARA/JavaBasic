/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = { "山田", "佐藤", "小林" };

	/** メールデータ（定数） */
	public static final String[] MAILDATA = { "yamada@hoge.com", "satou@hoge.com", "kobayashi@hoge.com" };

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = { "rezo0001", "rezo0002", "rezo0003" };

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
			{ "総務部", "業務部", "システム部" },
			{ "5", "10", "35" },
	};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee employee1 = new Employee();
		employee1.setUserNm("山田");
		System.out.println(employee1.getUserNm());
		employee1.setMail("yamada@hoge.com");
		System.out.println(employee1.getMail());
		employee1.setPassword("rezo0001");
		System.out.println(employee1.getPassword());
		employee1.setDepartmentNm("総務部");
		System.out.println(employee1.getDepartmentNm());

		Employee employee2 = new Employee();
		employee2.setUserNm("佐藤");
		System.out.println(employee2.getUserNm());
		employee2.setMail("satou@hoge.com");
		System.out.println(employee2.getMail());
		employee2.setPassword("rezo0002");
		System.out.println(employee2.getPassword());
		employee2.setDepartmentNm("業務部");
		System.out.println(employee2.getDepartmentNm());

		Employee employee3 = new Employee();
		employee3.setUserNm("小林");
		System.out.println(employee3.getUserNm());
		employee3.setMail("kobayashi@hoge.com");
		System.out.println(employee3.getMail());
		employee3.setPassword("rezo0003");
		System.out.println(employee3.getPassword());
		employee3.setDepartmentNm("システム部");
		System.out.println(employee3.getDepartmentNm());
	}
}
