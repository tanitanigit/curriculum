/*

問題1：インスタンスフィールドを定義してください
・フィールド名：name(データ型：string型)
・フィールド名：age(データ型：int型)
・フィールド名：height(データ型：double型)

問題2：コンストラクタを定義してください（下記それぞれの引数）
・name
・age
・height

問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください

問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）

問題5：Main.javaの引数にweightの60を入れてください

問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）

問題7：bmiメソッドでインスタンスのBMIを返すようにしてください

問題8：インスタンスメソッド「print」を定義してください（戻り値：void）

問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください

問題10：人数の合計を「合計○人です」と出力してください。

 */

package selfIntroductionProgram;

// クラス「Main」を定義
class Main {
	// mainメソッド
	public static void main(String[] args) {
		// 問題5：Main.javaの引数にweightの60を入れてください
		// Personクラスのインスタンス「person1」を作成し、各値を渡す(名前、年齢、身長、体重)
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);
		
		// 指定の文字列を表示(Personクラスのフィールドから名前を取得)
		System.out.println(person1.name);
		// 指定の文字列を表示(Personクラスのフィールドから年齢を取得)
		System.out.println(person1.age);
		// 指定の文字列を表示(Personクラスのフィールドから身長を取得)
		System.out.println(person1.height);
		// 改行
		System.out.println();

		// person1のメソッド「print」を呼び出す(名前、年齢、BMIを表示)
		person1.print();

		// 問題10：人数の合計を「合計○人です」と出力してください。
		// 指定の文字列を表示(静的メンバ変数を使って人数の合計を表示)
		System.out.println("\n合計" + Person.count + "人です");
	}
}
