
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

package exection;

// Randomクラスをjava.utlパッケージからインポートする
import java.util.Random;
// Scannerクラスをjava.utlパッケージからインポートする
import java.util.Scanner;
// パッケージ・クラス「processing.Player」をインポートする
import processing.Player;

// 実行用クラス「Main」を定義
public class Main {
	
	public static void main(String[] args) {
		
		// Scannerクラスのインスタンス「scanner」を作成し、引数で標準入力「System.in」を指定
		Scanner scanner = new Scanner(System.in);		

		// 文字列型の変数「inputName」を初期化して宣言
        String inputName = "";
		
		// 「inputName」の値がnullだった場合にエラーメッセージを表示し再入力のループ処理を行う
        // (課題1.22以降に指定されたnullチェック用)
        while (true) {
        	
        	// 指定の文字列を出力
            System.out.print("名前を入力してください：");
    		// 文字列型の「inputName」に入力された内容を受け取る
            inputName = scanner.nextLine();

            // if文で入力が「null」「空文字」「スペース」の場合にループ処理を行う
            if (inputName == null || inputName.trim().isEmpty()) {
            	// エラー用のメッセージを出力
                System.out.println("無効な値です。もう一度入力してください。");
            } else {
            	// breakで正常な値の場合にループを抜ける
                break;
            }
        }
		
		// Randomクラスのインスタンス「random」を作成
		Random random = new Random();

		// 整数型の各変数にrandomクラスのnextIntを使ってランダムな値を代入する
		int hp = random.nextInt(10000);
		int mp = random.nextInt(1000);
		int attack = random.nextInt(256);
		int speed = random.nextInt(256);
		int defense = random.nextInt(256);

		// プレイヤーオブジェクトの作成（コンストラクタを使って初期化）
		Player player = new Player(inputName, hp, mp, attack, speed, defense);

		// 指定の文字列を表示(指定の文字列に加え、Playerクラスから各値を受け取って表示する)
		System.out.println("\nこんにちは" + player.getName() + "さん");
		System.out.println("ステータス");
		System.out.println("HP：" + player.getHp());
		System.out.println("MP：" + player.getMp());
		System.out.println("攻撃力：" + player.getAttack());
		System.out.println("素早さ：" + player.getSpeed());
		System.out.println("防御力：" + player.getDefense());
		System.out.println("\nさあ冒険に出かけよう！");
		
		// スキャナを閉じる(リソースの解放)
		scanner.close();
	}
}
