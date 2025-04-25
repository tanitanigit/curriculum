package curriculum_B;

import java.util.Objects;
//java.util.Randomをインポートし、じゃんけんで相手の手をランダムに作る処理を受け付ける(Qes3)
import java.util.Random;
// java.util.Scannerをインポートし、文字の標準入力の処理を受け付ける(Qes1,2,3)
import java.util.Scanner;
// java.util.regex.Matcherをインポートし、Patternで定義された文字列と入力された文字列がマッチするかを確認する処理を受け付ける(Qes2,3)
import java.util.regex.Matcher;
// java.util.regex.Patternをインポートし、正規表現のパターンを定義する処理を受け付ける(Qes2,3)
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作成し、引数で標準入力「System.in」を指定
		Scanner scanner = new Scanner(System.in);

		// Qes1
		// [概要] 条件分岐処理
		// [詳細] ログイン時のチェックシステムを指定の条件で作成する。
		
		// Qes1の範囲確認(テスト用)
		System.out.println("\t-Qes1- ここから");
		System.out.println();

		// 文字列型の「name」を宣言
		String name;
		
		// while文で条件としてtrueを設定し、break文に行きつくまで無限ループさせる
		while (true) {
			// 指定の文字列を表示
			System.out.println("名前を入力してください");
			// 文字列型の「name」に入力された内容を取得
			name = scanner.nextLine();
			
			// if文で条件として文字列型の「name」が0以下、もしくは文字が無い場合を指定
			if ( (Objects.isNull(name) || (name.length() <= 0) ) ){				
				// 指定の文字列を表示
				System.out.println("名前を入力してください");
			// else if文で条件として文字列型の「name」が10よりも大きい場合を指定
			} else if (name.length() > 10) {
				// 指定の文字列を表示
				System.out.println("名前を10文字以内にしてください");
			// else文でif文とelse if文がfalseだった場合の処理を指定
			} else {
				// 文字列型の「name」を用い、指定の文字列を表示
				System.out.println("ユーザー名「" + name + "を登録しました");
				// while文のループを抜ける
				break;
			}
			
		}
		
		// Qes1の範囲確認(テスト用)
		System.out.println();
		System.out.println("\t-Qes1- ここまで");
		
		
		
		
		
		// Qes2
		// [概要] 条件分岐処理
		// [詳細] Qes1の内容に加え、指定の条件を追加して作成する。
		
		// Qes2の範囲確認(テスト用)
		System.out.println();
		System.out.println("\t-Qes2- ここから");
		System.out.println();
		
		// 文字列型の「name2」を宣言
		String name2;
		// 文字列型の「regex_AlphabetNum」でA～Z、a～z、0～9を代入(半角英数字の判定用)
		String regex_AlphabetNum = "^[A-Za-z0-9]+$";
		
		// while文で条件としてtrueを設定し、break文に行きつくまで無限ループさせる
		while (true) {
			// 指定の文字列を表示
			System.out.println("名前を入力してください");
			// 文字列型の「name2」に入力された内容を取得
			name2 = scanner.nextLine();
			
			// if文で条件として文字列型の「name2」が0以下、もしくは文字が無い場合を指定
			if ( (Objects.isNull(name2) || (name2.length() <= 0) ) ){				
				// 指定の文字列を表示
				System.out.println("名前を入力してください");
				// 
				continue;
			// else if文で条件として文字列型の「name2」が10よりも大きい場合を指定
			} else if (name2.length() > 10) {
				// 指定の文字列を表示
				System.out.println("名前を10文字以内にしてください");
				//
				continue;
			// else if文で条件として boolean型の「checkLogic」で文字列型の「name2」に文字列型の「regex_AlphabetNum」(半角英数字)以外が入力されていないかチェック
			} else if (checkLogic(regex_AlphabetNum, name2) ) {
				// 指定の文字列を表示
				System.out.println("半角英数字のみで名前を入力してください");
				// 
				continue;
			// else文でif文とelse if文がfalseだった場合の処理を指定
			} else {
				// 文字列型の「name2」を用い、指定の文字列を表示
				System.out.println("ユーザー名" + name2 + "を登録しました");
				// while文のループを抜ける
				break;
			}
		
		
		}
		
		// Qes2の範囲確認(テスト用)
		System.out.println();
		System.out.println("\t-Qes2- ここまで");
		
		
		
		
		
		// Qes3
		// [概要] 条件分岐処理
		// [詳細] Qes2の内容に加え、ユーザー名が正常の場合じゃんけんのシステムを起動する。
		
		// Qes3の範囲確認(テスト用)
		System.out.println();
		System.out.println("\t-Qes3- ここから");
		System.out.println();
		
		// 文字列型の「name3」を宣言
		String name3;
		
		// while文で条件としてtrueを設定し、break文に行きつくまで無限ループさせる
		while (true) {
			// 指定の文字列を表示
			System.out.println("名前を入力してください");
			// 文字列型の「name3」に入力された内容を取得
			name3 = scanner.nextLine();
			
			// if文で条件として文字列型の「name3」が0以下、もしくは文字が無い場合を指定
			if ( (Objects.isNull(name3) || (name3.length() <= 0) ) ){				
				// 指定の文字列を表示
				System.out.println("名前を入力してください");
				// 
				continue;
			// else if文で条件として文字列型の「name3」が10よりも大きい場合を指定
			} else if (name3.length() > 10) {
				// 指定の文字列を表示
				System.out.println("名前を10文字以内にしてください");
				//
				continue;
			// else if文で条件として boolean型の「checkLogic」で文字列型の「name3」に文字列型の「regex_AlphabetNum」(半角英数字)以外が入力されていないかチェック
			} else if (checkLogic(regex_AlphabetNum, name3) ) {
				// 指定の文字列を表示
				System.out.println("半角英数字のみで名前を入力してください");
				// 
				continue;
			// else文でif文とelse if文がfalseだった場合の処理を指定
			} else {
				// 文字列型の「name3」を用い、指定の文字列を表示
				System.out.println("ユーザー名" + name3 + "を登録しました");
				
				// 整数型の変数「int」を宣言し、初期値「0」を代入(じゃんけんに勝つまでにかかった合計回数の変数)
				int count = 0;
				// boolean型の変数「win」を宣言し、初期値「win」を代入(じゃんけんの勝敗のフラグの変数)
				boolean win = false;
				// Randomクラスのインスタンス「random」を作成
				Random random = new Random();
				
				// while文で条件をboolean型の変数「win」を指定し、じゃんけんで負けた場合にループする仕組みを作成
				while (!win) {
					// 文字列型「jankenInput」の値としてじゃんけんの手の入力を受け付ける
					String jankenInput = scanner.nextLine();
					// 整数型「jankenUser」を宣言
					int jankenUser;
					
					// エラーが発生する可能性のある処理を指定
					try {
						// 整数型「jankenUser」に文字列型「jankenInput」を型変換
						jankenUser = Integer.parseInt(jankenInput);
						// エラーが発生した場合(文字列型「jankenInput」が整数型「jankenUser」に変換できない場合)の処理
					} catch (NumberFormatException e) {
						// 指定の文字列を表示
						System.out.println("0(グー)、1(チョキ)、2(パー)で入力してください");
						// 次の処理に進む
						continue;
					}
					
					// if文で条件として整数型の「jankenUser」が0未満、もしくは2よりも大きい場合を指定
					if (jankenUser < 0 || jankenUser > 2) {
						// 指定の文字列を表示
						System.out.println("0(グー)、1(チョキ)、2(パー)で入力してください");
						// 次の処理に進む
						continue;
					}
					
					// 整数型の「jankenOpponent」に相手のじゃんけんの手をランダムな値として作成
					int jankenOpponent = random.nextInt(3);
					// 「count」の値に試合回数をインクリメントを使ってカウントする
					count++;
					// String型の配列を作成し、格納する値として0に「グー」、1に「チョキ」2に「パー」を指定
					String[] hands = { "グー", "チョキ", "パー" };
					// 入力したユーザー名とじゃんけんの手を表示する
					System.out.println(name3 + "の手は「" + hands[jankenUser] + "」");
					// 相手のじゃんけんの手を表示する
					System.out.println("相手の手は「" + hands[jankenOpponent] + "」");
					
					// あいこの場合の処理
					if (jankenUser == jankenOpponent) {
						// 指定の文字列を表示
						System.out.println("DRAW あいこ もう一回しましょう！");
					}
					// 勝った場合(自分がグー、相手がチョキ)、もしくは
					else if ((jankenUser == 0 && jankenOpponent == 1) ||
					// 勝った場合(自分がチョキ、相手がパー)、もしくは
							(jankenUser == 1 && jankenOpponent == 2) ||
							// 勝った場合(自分がパー、相手がグー)
							(jankenUser == 2 && jankenOpponent == 0)) {
						// 指定の文字列を表示
						System.out.println("やるやん。");
						// 指定の文字列を表示
						System.out.println("次は俺にリベンジさせて");
						// じゃんけんの勝敗のboolean型の変数「win」に「true」を代入する
						// 条件を満たすことでwhile文のループから脱する
						win = true;
					}
					// 負けた場合
					else {
						// 指定の文字列を表示
						System.out.println("俺の勝ち！");
						// 相手の手がグーで負けた場合
						if (jankenOpponent == 0) {
							// 指定の文字列を表示
							System.out.println("負けは次につながるチャンスです！");
							// 指定の文字列を表示
							System.out.println("ネバーギブアップ！");
							// 相手の手がチョキで負けた場合
						} else if (jankenOpponent == 1) {
							// 指定の文字列を表示
							System.out.println("たかがじゃんけん、そう思ってないですか？");
							// 指定の文字列を表示
							System.out.println("それやったら次も、俺が勝ちますよ");
							// 相手の手がパーで負けた場合	 
						} else if (jankenOpponent == 2) {
							// 指定の文字列を表示
							System.out.println("なんで負けたか、明日まで考えといてください。");
							// 指定の文字列を表示
							System.out.println("そしたら何かが見えてくるはずです");
						}
					}
				}
				// じゃんけんに勝つまでにかかった合計回数を整数型の変数「count」を用いて表示
				System.out.println("勝つまでにかかった合計回数は" + count + "回です");
				break;
			}
		}
		
		// Qes3の範囲確認(テスト用)
		System.out.println();
		System.out.println("\t-Qes3- ここまで");
		
		// scannerを閉じる
		scanner.close();
		
	}
	
	// boolean型の「checkLogic」を宣言。引数として「regex」「target」を
	public static boolean checkLogic(String regex, String target) {
		// boolean型の「result」に初期値として「true」を代入
		boolean result = true;
		// 「target」が「null」、もしくは空白の場合に戻り値として「false」を返す
		if (target == null || target.isEmpty())
			return false;
		// Patternオブジェクト「p1」として「regex」から半角英数の判定を取得する「regex_AlphabetNum2」の値をコンパイルする
		Pattern p1 = Pattern.compile(regex);
		// Matcherオブジェクト「m1」としてPattern オブジェクト「p1」を「target」の文字列と照らし合わせる
		Matcher m1 = p1.matcher(target);
		// boolean型の「result」にMatcherオブジェクトの「m1」が完全一致するかどうかの正誤を返す
		result = m1.matches();
		// 半角英数の場合に「false」、半角英数ではない場合に「true」を返す
		return !result;
	}
	
}
