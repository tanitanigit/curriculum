// 処理用パッケージ「processing」を指定
package processing;

// 処理用のクラス「SuperPrefectures」を定義
public class SuperPrefectures {
	// 現在のクラスからだけアクセスできる修飾子「private」を使って文字列型の「name」をフィールドに宣言(都道府県名)
	private String name;
	// 現在のクラスからだけアクセスできる修飾子「private」を使って文字列型の「capital」をフィールドに宣言(県庁所在地)
	private String capital;
	// 現在のクラスからだけアクセスできる修飾子「private」を使って倍精度浮動小数点数型の「area」をフィールドに宣言(面積(km2))
	private double area;
	
	// コンストラクタ「SuperPrefectures」を定義
	public SuperPrefectures(String name, String capital, double area) {
		// このクラスのフィールド変数を指す「this」で文字列型の「name」に引数の値を代入
		this.name = name;
		// このクラスのフィールド変数を指す「this」で文字列型の「capital」に引数の値を代入
		this.capital = capital;
		// このクラスのフィールド変数を指す「this」で倍精度浮動小数点数型の「area」に引数の値を代入
		this.area = area;
	}

	// getterメソッド「getName」を定義
	public String getName() {
		// nameの値を「return」によって戻り値として返す
		return name;
	}

	// setterメソッド「name」を定義
	public void setName(String name) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「name」にクラス「MainPrefectures」から引数で受け取った値を代入する
		this.name = name;
	}

	// getterメソッド「getCapital」を定義
	public String getCapital() {
		// capitalの値を「return」によって戻り値として返す
		return capital;
	}

	// setterメソッド「setCapital」を定義
	public void setCapital(String capital) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「capital」にクラス「MainPrefectures」から引数で受け取った値を代入する
		this.capital = capital;
	}

	// getterメソッド「getArea」を定義
	public double getArea() {
		// areaの値を「return」によって戻り値として返す
		return area;
	}

	// setterメソッド「setArea」を定義
	public void setArea(double area) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「area」にクラス「MainPrefectures」から引数で受け取った値を代入する
		this.area = area;
	}
	
	// メソッド「printInfo」を定義し、各都道府県の情報を表示する
	public void printInfo() {
		// 指定の文字列を表示(都道府県名)
		System.out.println("都道府県名：" + name);
		// 指定の文字列を表示(県庁所在地)
		System.out.println("県庁所在地：" + capital);
		// 指定の文字列を表示(面積)
		System.out.println("面積：" + area + "km²");
		// 改行処理用
		System.out.println();
	}
}
