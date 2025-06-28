/*
 * 
 * 問題1：インスタンスフィールドに「lastName」を追加しましょう
 * 問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
 * ※順番はfirstNameの次
 * 問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
 * 
 */
package selfIntroductionProgram3;

//クラス「Main」を定義
class Main {
	// mainメソッド
	public static void main(String[] args) {
		// Personクラスのインスタンス「person1」を作成し、各値を渡す(苗字、名前、年齢、身長、体重)
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// person1のメソッド「print」を呼び出す(名前、年齢、BMIを表示)
		person1.print();

		// Personクラスのインスタンス「person2」を作成し、各値を渡す(苗字、名前、年齢、身長、体重)
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		// person2のメソッド「print」を呼び出す(名前、年齢、BMIを表示)
		person2.print();

		// Personクラスのメソッド「printCount」を呼び出す(合計人数の表示)
		Person.printCount();
	}
}
