
/*
	
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
 	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明
	
  */

package exection;

// Scannerクラスをjava.utlパッケージからインポートする
import java.util.Scanner;

// 処理用のパッケージ・クラスを「processing.AnimalSubClass」をインポートする
import processing.AnimalSubClass;

// 実行用のクラス「AnimalMain」を定義
public class AnimalMain {

	public static void main(String[] args) {

		// Scannerクラスのインスタンス「scanner」を作成し、引数で標準入力「System.in」を指定
		Scanner scanner = new Scanner(System.in);

		// while文を使って正しいパターンで入力されるまでループさせる
		while (true) {
			// 指定の文字列を表示
			System.out.println("コンソールに文字を入力してください。");
			System.out.println("入力は「動物:体長:速度」の形式で、複数の動物を入力する場合は動物ごとにカンマを挿入してください。");
			// 文字列型の「input」に入力された内容を受け取る
			String input = scanner.nextLine();

			// if文で条件としてnullまたは空白文字が入力された場合を指定
			if (input == null || input.trim().isEmpty()) {
				// 指定の文字列を表示(空白文字が入力された場合のエラー文)
				System.out.println("空白文字は使用できません。再度入力してください。\n");
				// 「continue」でループの先頭に戻る
				continue;
			}

			// 文字列型の2次元配列「validAnimals」に、照合用として動物名・体長・速度の値を代入し初期化
			String[][] validAnimals = {
					{ "ライオン", "2.1", "80" },
					{ "ゾウ", "3.2", "40" },
					{ "パンダ", "1.9", "30" },
					{ "チンパンジー", "0.94", "25" },
					{ "シマウマ", "2.4", "65" },
					{ "インコ", "0.1", "50" }
			};

			// 文字列型の1次元配列「animalData」にコンソール入力を受けた文字列型の「input」をカンマ区切りにして代入する
			String[] animalsData = input.split(",");

			// ブーリアン型の「allValid」に入力全体が正しいかどうかを判定するフラグを用意
			boolean allValid = true;

			// for文で文字列型の「data」に文字列型の配列「animalData」の各要素を1つずつ代入
			for (String data : animalsData) {
				// if文でnullや空文字のチェック
				if (data == null || data.trim().isEmpty() ) {
					// 指定の文字列を表示(エラー用のメッセージ)
					System.out.println("空の動物データが含まれていたため、スキップしました。\n");
					// continueで次に進む
					continue;
				}
				
				// 文字列型の1次元配列「parts」に文字列型の「data」の値を「：」で区切って代入する
				String[] parts = data.split(":");
				
				// if文で条件として文字列型の「parts」の要素数が3つ未満の場合を指定
				if (parts.length < 3) {
					// 指定の文字列を表示(エラー用のメッセージ)
					System.out.println("「動物名:体長:速度」の形式で値を入力してください。\n");
					// ブーリアン型の「allValid」にfalseを代入する(エラー用のフラグ)
					allValid = false;
					// breakでループを抜けて再入力
					break;
				}

				// 文字列型の「name」に文字列型の1次元配列「parts」の0にあたる値を取り出す(動物名)
				String name = parts[0];
				// 文字列型のlengthStr」に文字列型の1次元配列「parts」の1にあたる値を取り出す(体長)	
				String lengthStr = parts[1];
				// 文字列型の「speedStr」に文字列型の1次元配列「parts」の2にあたる値を取り出す(速度)
				String speedStr = parts[2];
				
				// ブーリアン型の「matched」にfalseを代入する(エラー用のフラグ)
				boolean matched = false;
				
				// try-catch構文で例外が発生する可能性のある処理を指定
				try {
					// 倍精度浮動小数点数型の「length」に文字列型の「lengthStr」)を型変換して代入(体長)
					double length = Double.parseDouble(lengthStr);
					// 整数型の「speed」に文字列型の「speedStr」を型変換して代入(速度)
					int speed = Integer.parseInt(speedStr);
					
					// for文で文字列型の1次元配列「valid」に文字列型の「validAnimals」の各要素を1つずつ代入
					for (String[] valid : validAnimals) {
						// if文を使って条件として「name(動物名)」、「lengthStr(体長)」、「speedStr(速度)」の3要素が「valid(正規表現)」と一致するかチェック
						if (valid[0].equals(name) && valid[1].equals(lengthStr) && valid[2].equals(speedStr)) {
							// AnimalSubClassのインスタンス「animal」を生成し、値を出力
							AnimalSubClass animal = new AnimalSubClass(name, length, speed);
							// 「animal」からメソッド「printFullInfo」を実行する
							animal.printFullInfo();
							
							// ブーリアン型の「matched」にtrueを代入する(チェック用フラグ)
							matched = true;
							// breakでループを抜ける（マッチ済み）
							break;
						}
					}
					// try-catch構文で例外が発生した場合に対処する処理を指定
				} catch (NumberFormatException e) {
					// 指定の文字列を表示(エラー用のメッセージ)
					System.out.println("数値形式が正しくありません。\n");
					// ブーリアン型の「allValid」でにfalseを代入する(エラー用のフラグ)
					allValid = false;
					// breakでfor文を抜ける
					break;
				}
				// if文で条件として正しいデータと一致しなかった場合を指定
				if (!matched) {
					// 指定の文字列を表示(エラー用のメッセージ)
					System.out.println("正しい情報ではありません。\n");
					// ブーリアン型の「allValid」にfalseを代入(エラー用のフラグ)
					allValid = false;
					// breakでループを抜けて再入力
					break;
				}
			}
			
			// if文で条件としてブーリアン型の「allValid」を指定
			if (allValid) {
				// breakでループを抜ける
				break;
			}
		}

		// 入力処理終了後にScannerを閉じる（リソース解放）
		scanner.close();
	}
}
