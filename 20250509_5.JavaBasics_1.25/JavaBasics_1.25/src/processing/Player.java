
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

// サブクラス「Player」にスーパークラス「Character」を継承して定義
public class Player extends Character {

	// 現在のクラスからだけアクセスできる修飾子「private」で文字列型の変数「name」をフィールドに宣言
	private String name;

	// コンストラクタ「Player」を定義し、文字列型の変数「name」と整数型の各変数の値を初期化する
	public Player(String name, int hp, int mp, int attack, int speed, int defense) {

		// スーパークラス「Character」のコンストラクタを呼び出す
		super(hp, mp, attack, speed, defense);
		// このクラスの変数を意味する「this」を使ってフィールド変数「name」にクラス「Main」から引数で受け取った値を代入する
		this.name = name;
	}

	// setterメソッド「setName」を定義
	public void setName(String name) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「lionSpeed」にクラス「Main」から引数で受け取った値を代入する
		this.name = name;
	}

	// geetName「getName」を定義
	public String getName() {
		// このクラスの変数を意味する「this」を使ってフィールド変数「name」の値を「return」によって戻り値として返す
		return this.name;
	}

}
