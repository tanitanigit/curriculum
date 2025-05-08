package question1_23_processing;

/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	
*/

public class Lion {
	// 現在のクラスからだけアクセスできる修飾子「private」で文字列型の変数「lionName」をフィールドに宣言
	private String lionName;
	// 現在のクラスからだけアクセスできる修飾子「private」で倍精度浮動小数点数型の変数「lionLength」をフィールドに宣言
	private double lionLength;
	// 現在のクラスからだけアクセスできる修飾子「private」で整数型の変数「lionSpeed」をフィールドに宣言
	private int lionSpeed;	
	
	// コンストラクタ「Lion」を定義し、引数として文字列型の「lionName」、
	// 倍精度浮動小数点数型の変数「lionLength」、整数型の「lionSpeed」の値を受け取る
	public Lion(String lionName, double lionLength, int lionSpeed) {
		// このクラスの変数を意味する「this」を使い、setterを通して値を設定」
		this.setLionName(lionName);
		this.setLionLength(lionLength);
		this.setLionSpeed(lionSpeed);
	}

	// setterメソッド「setLionName」を定義
	public void setLionName(String lionName) {	
		
		// 「lionName」の値がnullだった場合にエラーメッセージを表示(課題1.22以降に指定されたnullチェック用)
		if (lionName == null) {
			// 不正な引数が渡されるときに扱うクラス「IllegalArgumentExeption」を使い、エラー時の文字列を表示
			throw new IllegalArgumentException("実行エラー");
		}		
		// このクラスの変数を意味する「this」を使ってフィールド変数「lionName」にクラス「main」から引数で受け取った値を代入する
		this.lionName = lionName;		

	}
	// getterメソッド「getLionName」を定義
	public String getLionName(){
		// このクラスの変数を意味する「this」を使ってフィールド変数「lionName」の値を「return」によって戻り値として返す
		return this.lionName;
	}
	
	// setterメソッド「setLionLength」を定義
	// nullが入る可能性が無いプリミティブ型のためnullチェックは不要
	public void setLionLength(double lionLength) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「lionLength」にクラス「main」から引数で受け取った値を代入する
		this.lionLength = lionLength;
	}
	// getterメソッド「getLionLength」を定義
	public double getLionLength() {
		// このクラスの変数を意味する「this」を使ってフィールド変数「lionLength」の値を「return」によって戻り値として返す
		return this.lionLength;
	}
	
	// setterメソッド「setLionSpeed」を定義
	// nullが入る可能性が無いプリミティブ型のためnullチェックは不要
	public void setLionSpeed(int lionSpeed) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「lionSpeed」にクラス「main」から引数で受け取った値を代入する
		this.lionSpeed = lionSpeed;
	}
	// getterメソッド「getLionSpeed」を定義
	public int getLionSpeed() {
		// このクラスの変数を意味する「this」を使ってフィールド変数「lionSpeed」の値を「return」によって戻り値として返す
		return this.lionSpeed;
	}
	
	// 指定の文字列を出力するメソッド「printLion」を定義
	public void printLion() {
		System.out.println("動物名：" + this.getLionName() );
		System.out.println("体長：" + this.getLionLength() + "m");
		System.out.println("速度：" + this.getLionSpeed() + "km/h");
	}

}
