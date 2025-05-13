
/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */

package processing;

// スーパークラス「Character」を定義
public class Character {

	// フィールドにキャラクターのステータスを定義
	// 現在のクラスからだけアクセスできる修飾子「private」で整数型の変数「hp」をフィールドに宣言
	private int hp;
	// 現在のクラスからだけアクセスできる修飾子「private」で整数型の変数「mp」をフィールドに宣言
	private int mp;
	// 現在のクラスからだけアクセスできる修飾子「private」で整数型の変数「attack」をフィールドに宣言
	private int attack;
	// 現在のクラスからだけアクセスできる修飾子「private」で整数型の変数「speed」をフィールドに宣言
	private int speed;
	// 現在のクラスからだけアクセスできる修飾子「private」で整数型の変数「defence」をフィールドに宣言
	private int defense;

	// コンストラクタ「Character」を定義し、整数型の各変数の値を初期化する
	public Character(int hp, int mp, int attack, int speed, int defense) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「hp」にクラス「Main」から引数で受け取ったランダムな値を代入する
		this.hp = hp;
		// このクラスの変数を意味する「this」を使ってフィールド変数「mp」にクラス「Main」から引数で受け取ったランダムな値を代入する
		this.mp = mp;
		// このクラスの変数を意味する「this」を使ってフィールド変数「attack」にクラス「Main」から引数で受け取ったランダムな値を代入する
		this.attack = attack;
		// このクラスの変数を意味する「this」を使ってフィールド変数「speed」にクラス「Main」から引数で受け取ったランダムな値を代入する
		this.speed = speed;
		// このクラスの変数を意味する「this」を使ってフィールド変数「defense」にクラス「Main」から引数で受け取ったランダムな値を代入する
		this.defense = defense;
	}

	// 各ステータスのgetterとsetter（外部から安全にアクセスするため）

	// setterメソッド「setHp」を定義
	public void setHp(int hp) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「hp」にクラス「Main」から引数で受け取ったランダムな値を代入する
		this.hp = hp;
	}

	// getterメソッド「getHp」を定義
	public int getHp() {
		// このクラスの変数を意味する「this」を使ってフィールド変数「hp」の値を「return」によって戻り値として返す
		return hp;
	}

	// setterメソッド「setMp」を定義
	public void setMp(int mp) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「mp」にクラス「Main」から引数で受け取ったランダムな値を代入する
		this.mp = mp;
	}

	// getterメソッド「geMpt」を定義
	public int getMp() {
		// このクラスの変数を意味する「this」を使ってフィールド変数「mp」の値を「return」によって戻り値として返す
		return mp;
	}

	// setterメソッド「setAttack」を定義 
	public void setAttack(int attack) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「attack」にクラス「Main」から引数で受け取ったランダムな値を代入する
		this.attack = attack;
	}

	// getterメソッド「getAttack」を定義
	public int getAttack() {
		// このクラスの変数を意味する「this」を使ってフィールド変数「attack」の値を「return」によって戻り値として返す
		return attack;
	}

	// setterメソッド「setSpeed」を定義
	public void setSpeed(int speed) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「speed」にクラス「Main」から引数で受け取ったランダムな値を代入する
		this.speed = speed;
	}

	// getterメソッド「getSpeed」を定義
	public int getSpeed() {
		// このクラスの変数を意味する「this」を使ってフィールド変数「speed」の値を「return」によって戻り値として返す
		return speed;
	}

	// setterメソッド「setDefense」を定義
	public void setDefense(int defense) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「defense」にクラス「Main」から引数で受け取ったランダムな値を代入する
		this.defense = defense;
	}

	// getterメソッド「getDefense」を定義
	public int getDefense() {
		// このクラスの変数を意味する「this」を使ってフィールド変数「defense」の値を「return」によって戻り値として返す
		return defense;
	}

}
