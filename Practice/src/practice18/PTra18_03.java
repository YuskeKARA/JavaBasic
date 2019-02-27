/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				// ★ 1行ごとにArrayListに格納してください
				Player aaa = new Player();

				String[] playerArray = line.split(","); //カンマで区切ってあるものをわける
														// playerArrayを作って各々要素をいれる

				aaa.setPosition(playerArray[0]); //aaaにそれぞれいれる
				aaa.setName(playerArray[1]);
				aaa.setCountry(playerArray[2]);
				aaa.setTeam(playerArray[3]);

				array.add(aaa); //arrayにaaaを代入
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		Iterator<Player> i = array.iterator();               //arrayの中を別々にしたのでそこに条件と合うようなものを
		while (i.hasNext()) {
			Player aaa = i.next();
			if (aaa.getTeam().equals("レアル・マドリード") || aaa.getTeam().equals("バルセロナ")) {
				i.remove();
			}
		}

		// ★ 削除後のArrayListの中身を全件出力してください
		for (int j = 0; j < array.size(); j++) {
			System.out.println(array.get(j));
		}
	}
}

