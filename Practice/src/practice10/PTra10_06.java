package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] cars = new Car[3];


		Car car1 = new Car();
		car1.serialNo = 10000;
		car1.color = "Red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.serialNo = 20000;
		car2.color = "Blue";
		car2.gasoline = 40;

		Car car3 = new Car();
		car3.serialNo = 30000;
		car3.color = "Yellow";
		car3.gasoline = 45;

		cars[0] = car1;
	    cars[1] = car2;
	    cars[2] = car3;


		final int distance = 300;

		for (int i = 0; i < cars.length; i++) {

			/*
			 * ★ 変数carに格納されているインスタンスメソッドrunを使って、目的地まで進んでください
			 * ★ 先にガソリンがなくなった場合は、「目的地に到達できませんでした」を出力してください
			 * ★ 目的地についた時点で「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください
			 * ※n：runメソッドを実行した回数, xは残りのガソリンの数です
			 */
			int sum = 0; //繰り返しの前に記述しておく
			int count = 0; //sumは合計、countは実行回数
			while (true) {               //繰り返し　　＊whileは何回で終わるか不明確の時にforは回数が明確の時
				int run = cars[i].run(); //戻り値
				count++;                 //実行回数
				if (run < 0) {
					System.out.println("目的地につきませんでした。");
					break;         //おわらせる
				}
				sum += run;        //足していく
				System.out.println(sum);

				if (sum > distance) {
					System.out.println(cars[i].color+"目的地まで" + count + "時間かかりました。残りのガソリンは、" + cars[i].gasoline + "リットルです。");
					break;
				}

			}
		}

	}
}
