package execution;

/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/

// パッケージ・クラス「processing.Message」をインポートする
import processing.Message;

public class Main {

	public static void main(String[] args) {
		// Messageクラスのインスタンス「msg」を作成し、パッケージ「processing」内のクラス「Message」のコンストラクタによってフィールドを初期化する
        Message msg = new Message();
        
        // msgの値がnullだった場合にエラーメッセージを表示(課題1.22以降に指定されたnullチェック用)
        if (msg != null) {
	        // Messageクラスのインスタンス「msg」を使ってクラス「Message」内のメソッド「printHelloJapan」を呼び出して実行する
	        msg.printHelloJapan();	
	        // Messageクラスのインスタンス「msg」を使ってクラス「Message」内のメソッド「printSushiUma」を呼び出して実行する
	        msg.printSushiUma();	
	        // Messageクラスのインスタンス「msg」を使ってクラス「Message」内のメソッド「printSushiIsWashoku」を呼び出して実行する
	        msg.printSushiIsWashoku();
	        // Messageクラスのインスタンス「msg」を使ってクラス「Message」内のメソッド「printDateTime」を呼び出して実行する
	        msg.printDateTime();	        
        } else {
        	// 指定の文字列を表示
            System.out.println("実行エラー");
        }

	}

}










