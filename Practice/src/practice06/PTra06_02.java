package practice06;
/*
 * PTra06_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_02 {
	public static void main(String[] args) {

		// ★ 20回繰り返しを行うfor文を記述してください
		//-----for start
		for (int i = 0; i < 20; i++) {
			System.out.println("現在" + (i + 1) + "週目です");
			switch (i % 2) {
			case 1:
				System.out.println("奇数です");
				break;
			case 0:
				System.out.println("偶数です。");
				break;
			}
		}
	}
}
