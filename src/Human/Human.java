package Human;

public class Human {
	String presentLocation;
	String belonging;

	public Human(){ //コンストラクタの設定
		this.presentLocation = "自宅";
		this.belonging = "歯ブラシ";
	}

	public void move(String presentLocation) {
		if (this.presentLocation == presentLocation) {
			System.out.println("既に" + this.presentLocation + "にいます");
		} else {
			System.out.println(this.presentLocation + "から" + presentLocation + "へ移動しました");
		}
		this.presentLocation = presentLocation;
	}

	public void hold(String belonging) {
		System.out.println(this.belonging + "から" + belonging + "に持ち替えました");
		this.belonging = belonging;
	}

	public void get() {
		System.out.println(this.presentLocation + "で" + this.belonging + "を使用します");
		if ("川".equals(this.presentLocation) && "釣竿".equals(this.belonging)) {
			System.out.println("魚が釣れました");
		} else if ("山".equals(this.presentLocation) && "スコップ".equals(this.belonging)) {
			System.out.println("松茸が取れました");
		} else if ("森".equals(this.presentLocation) && "虫取り網".equals(this.belonging)) {
			System.out.println("カブトムシが取れました");
		} else {
			System.out.println("何も取れませんでした");

		}
	}
}
