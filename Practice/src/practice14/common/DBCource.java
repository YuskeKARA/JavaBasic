package practice14.common;

public class DBCource implements Course {
	public String getCourseName() {
		return "【Eラーニング】DB基礎";
	}

	public String[] getCourseUnit() {
		String[] unit = {"DB基礎","SQL基礎","正規化","SQL応用"};
		return unit;
	}
}
