/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */

// 実行用パッケージexectionを指定
package execution;

// ArrayListクラスをjava.utilパッケージからインポートする
import java.util.ArrayList;
// Listをjava.utilパッケージからインポートする
import java.util.List;
// Scannerクラスをjava.utilパッケージからインポートする
import java.util.Scanner;

// 処理用のパッケージ・クラス「SubPrefectures」をインポートする
import processing.SubPrefectures;
//処理用のパッケージ・クラス「SuperPrefectures」をインポートする
import processing.SuperPrefectures; // スーパークラスをインポート

//実行用のクラス「MainPrefectures」を定義
public class MainPrefectures {
	public static void main(String[] args) {
		// スーパークラス「SuperPrefectures」型の配列「prefectures」に「都道府県」「県庁所在地」「面積」の値を代入し初期化(インデックス0～10)
		SuperPrefectures[] prefectures = {
				new SubPrefectures("北海道", "札幌市", 83424),
				new SubPrefectures("青森県", "青森市", 9646),
				new SubPrefectures("岩手県", "盛岡市", 15275),
				new SubPrefectures("宮城県", "仙台市", 7282),
				new SubPrefectures("秋田県", "秋田市", 11638),
				new SubPrefectures("山形県", "山形市", 9323),
				new SubPrefectures("福島県", "福島市", 13784),
				new SubPrefectures("茨城県", "水戸市", 6097),
				new SubPrefectures("栃木県", "宇都宮市", 6408),
				new SubPrefectures("群馬県", "前橋市", 6362),
				new SubPrefectures("埼玉県", "さいたま市", 3798)
		};

		// Scannerクラスのインスタンス「scanner」を作成し、引数で標準入力「System.in」を指定
		Scanner scanner = new Scanner(System.in);

		// SuperPrefectures型のデータを追加するためのArrayList型のリスト「selected」を初期化
		List<SuperPrefectures> selected = new ArrayList<>(); // 選択された都道府県を格納するリスト

		// 入力が有効になるまで繰り返すループ
		while (true) {
			// 指定の文字列を表示
			System.out.println("都道府県の番号をカンマ区切りで入力してください");
			System.out.println("例：8,5,9");
			// 文字列型の「input」に入力された内容を受け取る
			String input = scanner.nextLine();
			// 文字列型の1次元配列「tokens」にコンソール入力を受けた文字列の「input」をカンマ区切りにして代入する
			String[] tokens = input.split(",");
			
			// ブーリアン型の「allEmpty」で、空文字で構成されていないかをチェックするフラグの作成
			boolean allEmpty = true;

			// 拡張for文で「tokens」配列の要素を1つずつ取り出し、変数「token」に代入して処理を繰り返す
			for (String token : tokens) {
			    // if文で条件として「token」から前後の空白を取り除いた結果が空文字でない(何か文字が含まれている)場合を指定
				if (!token.trim().isEmpty()) {
					// ブーリアン型の「allEmpty」にfalseを代入し、フラグを切り替える
					allEmpty = false;
					// breakでループを終了
					break;
				}
			}

			// if文で条件として「allEmpty」を指定
			// 「tokens」のすべての要素が空だった（allEmptyがtrueのままだった）場合の処理
			if (allEmpty) {
				// エラーメッセージを表示
				System.out.println("\n※※※ERROR※※※");
				System.out.println("カンマだけの入力、全て空白の入力は無効です");
				System.out.println("※※※ERROR※※※\n");
				// continueで処理をスキップしてwhileループの最初に戻る
				continue;
			}
			
			// ブーリアン型の「allValid」で、全ての入力が正しいかをチェックするフラグの作成
			boolean allValid = true;
			// ArrayList型のリスト「selected」に保存された都道府県のデータを全て削除する
			selected.clear();

			// for文で文字列型の1次元配列「tokens」の中から1つずつ要素を取り出して、文字列型の変数「token」に代入する
			for (String token : tokens) {
				// 文字列型の変数「token」からtrimで空白を取り除く
				token = token.trim();
								
			    // if文で条件としてtokenの値が空文字であるかをisEmptyメソッドで判定
				// (カンマだけが入力されていた場合にsplitの処理で空文字の要素が渡されてしまうことを想定)
			    if (token.isEmpty()) {
			    	// 指定の文字列を表示(カンマだけを入力した場合のエラー)
					System.out.println("\n※※※ERROR※※※");
			        System.out.println("空の番号が含まれています。カンマだけの入力は無効です。");
			        // ブーリアン型の「allValid」にfalseを代入し、フラグを切り替える」
			        allValid = false;
			        // breakで処理を中断
			        break;
			    }
								
				// try文で、コンソール入力で文字列型として受け付けた値を整数型に変換した際にエラーが発生した場合の処理を作成
				try {
					// 整数型の「index」にIntegerクラスのparseIntメソッドに文字列型の「token」代入して文字列型から整数型へと変換された値を代入する
					int index = Integer.parseInt(token);
					// if文で条件としてindexの値が0以上かつindexの値が「prefectures」配列(都道府県)の要素数未満の場合を指定
					if (index >= 0 && index < prefectures.length) {
						// インスタンス「selected」に対してArrayListのメソッド「add」を使い、入力された「index」の値から対応する「prefectures」配列の要素を追加する
						selected.add(prefectures[index]);
					// elseで異なる条件を指定
					} else {
						// 指定の文字列を表示(範囲外の数値を入力した場合のエラー)
						System.out.println("\n※※※ERROR※※※");
						System.out.println("「" + index + "」 は 0〜10 の範囲外の値です");
						// ブーリアン型の「allValid」にfalseを代入し、フラグを切り替える
						allValid = false;
						// breakで処理を中断
						break;
					}

					// catchでNumberFormatExeptionを受け取る
				} catch (NumberFormatException e) {
					// 指定の文字列を表示(エラー文)
					System.out.println("\n※※※ERROR※※※");
					System.out.println("「" + token + "」 は整数ではありません");
					// ブーリアン型の「allValid」にfalseを代入し、フラグを切り替える
					allValid = false;
					// breakで処理を中断
					break;
				}
			}

			// if文で条件としてブーリアン型「allValid」を指定
			if (allValid) {
				// allValidの値がtrueだった場合、breakで処理を中断(入力された全ての値が全て有効だった場合)
				break;
			// elseで「allValid」の値がfalseだった場合に行う処理を指定
			} else {
				// 指定の文字列を出力
				System.out.println("もう一度正しい形式で番号を入力してください");
				System.out.println("※※※ERROR※※※\n");
			}
		}

		// 文字列型の「order」で空の文字列を代入(昇順、降順の指定を格納する)
		String order = "";
		// while文で
		while (true) {
			// 指定の文字列を出力
			System.out.println("面積の小さい順で表示する場合は「asc」、");
			System.out.println("面積の大きい順で表示する場合は「desc」を入力してください");
			
			// 文字列型の「order」にScannerクラスのインスタンスscannerのnextLineメソッドで標準入力を受け付け、
			// trimメソッドで前後の空白文字を削除、toLowerCaseメソッドで英字を全て小文字に変換する			
			order = scanner.nextLine().trim().toLowerCase();
			// if文で条件として文字列型の「order」の値が「asc」と等しいか、もしくは「desc」と等しいかを指定
			if (order.equals("asc") || order.equals("desc")) {
				// breakで指定の値(「asc」または「desc」)と一致していた場合にループを抜ける
				break;
			// elseで文字列型の「order」の値が「asc」または「desc」ではない場合に行う処理を指定
			} else {
				// 指定の文字列を出力(指定の値以外が入力された場合のエラー文)
				System.out.println("\n※※※ERROR※※※");
				System.out.println("「asc」または「desc」と入力してください");
				System.out.println("※※※ERROR※※※\n");

			}
		}

		// if文で条件として文字列型の「order」の値が「asc」と等しい場合を指定
		if (order.equals("asc")) {
			// 「SubPrefectures」クラスのメソッド「sortByArea」で「selected」ArrayList型の「selected」の要素を面積が小さい順で並び変える
			SubPrefectures.sortByArea(selected, true);
		// elseで「order」の値が「asc」ではない場合(descの場合)を指定
		} else {
			// 「SubPrefectures」クラスのメソッド「sortByArea」で「selected」ArrayList型の「selected」の要素を面積が大きい順で並び変える
			SubPrefectures.sortByArea(selected, false); // 降順で並び替え
		}

		// for文でSubPrefectures型の「p」にselectedの値を出力する
		for (SuperPrefectures p : selected) {
			p.printInfo();
		}

		// Scannerを閉じる(リソースの解放)
		scanner.close(); // リソースの解放
	}
}