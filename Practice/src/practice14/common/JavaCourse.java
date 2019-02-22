package practice14.common;

public class JavaCourse implements Course {

	public String getCourseName() {
		return "【Eラーニング】Java";
	}

	public String[] getCourseUnit() {         //String[]型(クラス型配列)なのでインスタンスを作って値いれて返す
		String[] unit = {"式と演算","制御構文","メソッド","配列","ブジェクト指オ向","継承","高度な継承"};
		return unit;
	}

}
