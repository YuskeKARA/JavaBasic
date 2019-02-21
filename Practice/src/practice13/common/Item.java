package practice13.common;

public class Item {

	private String name; //フィールド
	private int additionalDamage;

	public String getName() { //アクセサ
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAdditionalDamage() {
		return this.additionalDamage;
	}

	// setter
	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	public Item(String name, int additionalDamage) { //コンストラクタ  ()の中に引数
		this.name = name;
		this.additionalDamage = additionalDamage;
	}
}
