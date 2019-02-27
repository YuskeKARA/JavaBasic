/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(array); //シャッフルして先頭からの意味

		for (Player bbb : array) {
			if (bbb.getPosition().equals("GK")) {

				System.out.println(bbb);
				break;
			}
		}

		int i = 0;

		for (Player j : array) {
			if (j.getPosition().equals("DF")) {
				System.out.println(j);
				i++;
			}
			if (i > 3) {
				break;
			}
		}
		int k = 0;

		for (Player l : array) {
			if (l.getPosition().equals("MF")) {
				System.out.println(l);
				k++;
			}
			if (k > 3) {
				break;
			}

		}
		int m = 0;

		for (Player n : array) {
			if (n.getPosition().equals("FW")) {
				System.out.println(n);
				m++;
			}
			if (m > 1) {
				break;
			}
		}
	}
}
