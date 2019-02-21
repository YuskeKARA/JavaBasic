package practice13.common;

public class Item {

	String name;                            //フィールド
	int additionalDamage;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {       //アクセサ
		this.name = name;
	}

	public int getAdditionalDamage() {
		return this.additionalDamage;
	}

	// setter
	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	Item() {
		this.name = name;                    //コンストラクタ
		this.additionalDamage = additionalDamage;
	}
}
