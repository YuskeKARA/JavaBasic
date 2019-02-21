package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		String bookName = new java.util.Scanner(System.in).nextLine();

		Book[] booklist = FileReaderClass.readBookDataFile();  //インスタンスを呼び出し　staticがついてる静的フィールド

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		for (int i = 0; i < booklist.length; i++) {
			if (booklist[i].title.contains(bookName)) {     //i番目にあるbooklistの呼び出し
				System.out.println(booklist[i].dispBookInfo());
			}

		}

	}
}
