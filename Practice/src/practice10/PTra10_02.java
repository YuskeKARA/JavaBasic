package practice10;
/*
 * PTra10_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_02 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください
		User us ;

		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください
		User us1 = new User();

		// ★ 変数usに格納されているインスタンスのuserIdフィールドに、101を代入してください
		us1.userId = 101;

		// ★ 変数usに格納されているインスタンスのuserNmフィールドに、"リゾーム太郎"を代入してください
		us1.userNm = "リゾーム太郎";

		// ★ 変数usに格納されているインスタンスのmailフィールドに、"rhizome@hoge.com"を代入してください
		us1.mail = "rhizome@hoge.com";

		// ★ 変数usに格納されているインスタンスのpasswordフィールドに、"1qazxcv"を代入してください
		us1.password = "1qazxcv";

		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		System.out.println(us1.userId);
		System.out.println(us1.userNm);
		System.out.println(us1.mail);
		System.out.println(us1.password);
	}
}
