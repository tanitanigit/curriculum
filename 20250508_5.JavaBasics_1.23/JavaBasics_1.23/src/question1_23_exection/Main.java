package question1_23_exection;

/*

	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h

*/

// パッケージ・クラス「question1_23_processing.Lion」をインポートする
import question1_23_processing.Lion;
		
public class Main {

	public static void main(String[] args) {
		
		// Lionクラスのインスタンス「lionData」を作成し、パッケージ「question1_23_processing」内のクラス「Lion」のコンストラクタにそれぞれ指定の引数を渡す
		Lion lionData = new Lion("ライオン", 2.1, 80);
			// Lionクラスのインスタンス「lionData」から指定の文字列を出力する
			lionData.printLion();

	}

}
