package processing;

//処理用のスーパークラス「AnimalSuperClass」を定義
public class AnimalSuperClass {
	// 現在のクラスとサブクラスからアクセスできる修飾子「protected」で文字列型の変数「name」をフィールドに宣言
	protected String name;
	// 現在のクラスとサブクラスからアクセスできる修飾子「protected」で倍精度浮動小数点数型の変数「length」をフィールドに宣言
	protected double length;
	// 現在のクラスとサブクラスからアクセスできる修飾子「protected」で整数型の変数「speed」をフィールドに宣言
	protected int speed;

	// コンストラクタ「AnimalSuperClass」を定義し、引数として文字列型の「name」、
	// 倍精度浮動小数点数型の「length」、整数型の「speed」の値を受け取る
	public AnimalSuperClass(String name, double length, int speed) {
		// このクラスのフィールド変数を意味する「this」を使い、文字列型のフィールド「name」に引数の値を代入(動物名)
		this.name = name;
		// このクラスのフィールド変数を意味する「this」を使い、倍精度浮動小数点数型のフィールド「length」に引数の値を代入(体長)
		this.length = length;
		// このクラスのフィールド変数を意味する「this」を使い、整数型のフィールド「speed」に引数の値を代入(速度)
		this.speed = speed;
	}

	// メソッド「printBasicInfo」を定義し、動物の情報を出力する
	public void printBasicInfo() {
		// 指定の文字列を表示(動物名)
		System.out.println("動物名：" + name);
		// 指定の文字列を表示(体長)
		System.out.println("体長：" + length + "m");
		// 指定の文字列を表示(速度)
		System.out.println("速度：" + speed + "km/h");
	}
}
