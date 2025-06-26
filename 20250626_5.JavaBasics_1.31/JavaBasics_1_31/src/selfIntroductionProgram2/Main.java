package selfIntroductionProgram2;

// クラス「Main」を定義
class Main {
	// mainメソッド
	public static void main(String[] args) {
		// Personクラスのインスタンス「person1」を作成し、各値を渡す(名前、年齢、身長、体重)
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		// person1のメソッド「print」を呼び出す(名前、年齢、BMIを表示)
		person1.print();

		// Personクラスのインスタンス「person2」を作成し、各値を渡す(名前、年齢、身長、体重)
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		// person2のメソッド「print」を呼び出す(名前、年齢、BMIを表示)
		person2.print();

		// 問題6：クラスメソッド「printCount」を呼び出してください
		Person.printCount();
	}
}
