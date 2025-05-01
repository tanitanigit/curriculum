package basicClass;

// 3つ目の課題で使用するクラス「LocalDateTime」をパッケージ「java.time」からインポートする
import java.time.LocalDateTime;
// 3つ目の課題で使用するクラス「DateTimeFormatter」をパッケージ「java.time」インポートする
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		

		// Q1
		// [概要] クラスを分けたコンソール出力処理
		// [詳細] 指定のクラスから変数に代入し、コンソールに出力する。
		
		// Q1の範囲確認(テスト用)
		System.out.println();
		System.out.println("\t-Q1- ここから");
		System.out.println();

		// クラス型「Dog」の変数「dogNames」にクラス「Dog」内のコンストラクタ「Dog」から引数なしで値を代入
		Dog dogNames = new Dog();

		// Q1の問題文を表示(テスト用)
		System.out.println(">>Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。");
		// 指定の文字列を表示(「Dog」クラスのフィールドから「animalNames」の値を「dogNames」に代入して出力)
		System.out.println(dogNames.animalNames);
		
		

		// Q2
		// [概要] クラスを分けたコンソール出力処理
		// [詳細] 指定のクラスから変数に代入し、コンソールに出力する。    
		
		// Q2の範囲確認(テスト用)
		System.out.println();
		System.out.println();
		System.out.println("\t-Q2- ここから");
		System.out.println();

		// クラス型「Dog」の変数「countDogs」にクラス「Dog」内のコンストラクタ「Dog」から引数「3」で値を代入
		Dog countDogs = new Dog(3);

		// Q2の問題文を表示(テスト用)
		System.out.println(">>Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。");
		// 指定の文字列を表示(「Dog」クラスのフィールドから「countAnimals」の値を「countDogs」に代入して出力)
		System.out.println("動物の数：" + countDogs.countAnimals);
		
		

		// 3つめの課題
		// [概要] 現在の日時の出力処理
		// [詳細] 現在の日時を指定の形式でコンソールに出力する。
		
		// 3つめの課題の範囲確認(テスト用)
		System.out.println();
		System.out.println();
		System.out.println("\t-3つめの課題- ここから");
		System.out.println();

		// 「LocalDateTime」クラスの変数「currentTime」を宣言し、「.now()」で現在時刻を取得する
		LocalDateTime currentTime = LocalDateTime.now();
		// 「DateTimeFormatter」クラスの変数「formatter」を宣言し、「ofPattern」メソッドで表示形式のパターンを「yyyy-MM-dd H:m:s」に指定する
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		// now 変数を formatter の形式で文字列に変換して変数に代入します
		// 文字列型の「formattedDate」にLocalDateTimeクラスの変数「CurrentTime」を「form」メソッドを用いてDateTimeFormatterクラスの変数「formatter」で指定した表示形式に変換する
		String formattedDate = currentTime.format(formatter);
		// 3つめの問題を表示(テスト用)
		System.out.println(">>現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください");
		// 指定の文字列を表示()
		System.out.println(formattedDate);

	}
}
