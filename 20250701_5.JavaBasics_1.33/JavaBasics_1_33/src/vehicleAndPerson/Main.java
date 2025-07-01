package vehicleAndPerson;

//クラス「Main」を定義
class Main {
	// mainメソッド
	public static void main(String[] args) {
		// Personクラスのインスタンス「person1」を作成し、各値を渡す(苗字、名前、年齢、身長、体重)
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		
		// 実行結果を分かりやすくするため、今回作成した箇所以外の出力処理はコメントアウトしています。
		// person1のメソッド「print」を呼び出す(名前、年齢、BMIを表示)
		// person1.print();

		// Personクラスのインスタンス「person2」を作成し、各値を渡す(苗字、名前、年齢、身長、体重)
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		
		// 実行結果を分かりやすくするため、今回作成した箇所以外の出力処理はコメントアウトしています。
		// person2のメソッド「print」を呼び出す(名前、年齢、BMIを表示)
		// person2.print();
		
		// 実行結果を分かりやすくするため、今回作成した箇所以外の出力処理はコメントアウトしています。
		// Personクラスのメソッド「printCount」を呼び出す(合計人数の表示)
		// Person.printCount();
		
		// Carクラスのインスタンス「car」を作成
		Car car = new Car();
		// Bicycleクラスのインスタンス「bicycle」を作成
		Bicycle bicycle = new Bicycle();
		
		// carのメソッド「setOwner」を呼び出し、戻り値として「person1」のメソッド「fullName」を指定
		car.setOwner(person1.fullName());
		// bicycleのメソッド「setOwner」を呼び出し、戻り値として「person2」のメソッド「fullName」を指定
		bicycle.setOwner(person2.fullName());
		
		// 実行結果を分かりやすくするため、今回作成した箇所以外の出力処理はコメントアウトしています。
		// System.out.println(car.getOwner());
		// System.out.println(bicycle.getOwner());
		
		// person1のメソッド「buy」を呼び出し、戻り値として「car」を指定
		person1.buy(car);
		// person2のメソッド「buy」を呼び出し、戻り値として「bicycle」を指定
		person2.buy(bicycle);

	}

}
