package processing;

//処理用のサブクラス「AnimalSubClass」を定義(「AnimalSuperClass」を継承)
public class AnimalSubClass extends AnimalSuperClass {

	// 現在のクラスからだけアクセスできる修飾子「private」で文字列型の変数「scientificName」をフィールドに宣言(学名)
	private String scientificName;

	// コンストラクタ「AnimalSubClass」を定義し、引数として文字列型の「name」、
	// 倍精度浮動小数点数型の「length」、整数型の「speed」の値を受け取る
	public AnimalSubClass(String name, double length, int speed) {
		// スーパークラス「AnimalSuperClass」のコンストラクタを呼び出し、文字列型の「name」、
		// 倍精度浮動小数点数型の「length」、整数型の「speed」を初期化する
		super(name, length, speed);
		// このクラスのフィールド変数を意味する「this」を使い、文字列型のフィールド「scientificName」に引数の値を代入(学名)
		this.scientificName = getScientificName(name);
	}

	// 現在のクラスからだけアクセスできる修飾子「private」で文字列型を返すメソッド「getScientificName」を定義し、引数として文字列型の「name」を返す
	private String getScientificName(String name) {
		// 文字列型の引数「name」の値によって処理を分岐
		switch (name) {
		// 文字列型の変数「name」の値が「ライオン」の場合
		case "ライオン":
			// 学名として「」を返す
			return "パンテラ レオ";
		// 文字列型の変数「name」の値が「ゾウ」の場合
		case "ゾウ":
			// 学名として「ロキソドンタ・サイクロティス」を返す
			return "ロキソドンタ・サイクロティス";
		// 文字列型の変数「name」の値が「パンダ」の場合
		case "パンダ":
			// 学名として「アイルロポダ・メラノレウカ」を返す
			return "アイルロポダ・メラノレウカ";
		// 文字列型の変数「name」の値が「チンパンジー」の場合
		case "チンパンジー":
			// 学名として「パン・トゥログロディテス」を返す
			return "パン・トゥログロディテス";
		// 文字列型の変数「name」の値が「シマウマ」の場合
		case "シマウマ":
			// 学名として「チャップマンシマウマ」を返す
			return "チャップマンシマウマ";
		// 文字列型の変数「name」の値が「インコ」の場合
		case "インコ":
			// 学名として「不明」を返す
			return "不明";
		// 文字列型の変数「name」の値が上記以外その他の場合
		default:
			// 学名として「不明」を返す
			return "不明";
		}
	}

	// メソッド「printFullInfo」を定義する
	public void printFullInfo() {
		// スーパークラスの「AnimalSuperClass」からメソッド「printBasicInfo」を呼び出す
		printBasicInfo();
		// 指定の文字列を表示(学名)
		System.out.println("学名：" + scientificName);
		// 改行
		System.out.println();
	}
}
