package practice13.common;

public class SuperHero extends Hero {
	//コンストラクタがないので親の引数がくる。この場合Heroクラスのもの

	private Item equipment;
	public int attack() {
		return super.attack() + equipment.getAdditionalDamage();
	}

	public void setEqupment(Item equipment) {
		this.equipment = equipment;
	}

	public Item getsetEqupment() {
		return this.equipment;
	}
}
