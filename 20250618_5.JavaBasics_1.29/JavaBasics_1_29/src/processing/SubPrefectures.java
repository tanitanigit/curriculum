// 処理用パッケージ「processing」を指定
package processing;

// Comparatorをjava.utilパッケージからインポートする
import java.util.Comparator;
// Listをjava.utilパッケージからインポートする
import java.util.List;

// サブクラス「 SubPrefectures」を定義し、extendsによってスーパークラス「SuperPrefectures」を継承する(フィールドやメソッドを継承する)
public class SubPrefectures extends SuperPrefectures {

	// コンストラクタ「SubPrefectures」を定義
	public SubPrefectures(String name, String capital, double area) {
		// superで親クラスのコンストラクタを呼び出し、
		// 親クラス内の文字列型の「name」(都道府県)、文字列型の「capital」(県庁所在地)、倍精度浮動小数点数型の「area」(面積)を初期化
		super(name, capital, area);
	}

	// 静的メソッド：並び替え処理（昇順 or 降順）

	// 静的メソッド「sortByArea」を定義し、引数としてSuperPrefecturesオブジェクトのリスト「list」とブーリアン型の「ascending」を受け取る
	public static void sortByArea(List<SuperPrefectures> list, boolean ascending) {
		// if文で条件としてブーリアン型「ascending」を指定
		if (ascending) {
			// 「ascending」の値がtrueだった場合、SuperPrefectures型のリスト「list」をsortメソッドとcomparingDoubleメソッドによって面積の値を比較し並び変える
			// 比較する値は「p」(各都道府県の要素)に対して「getArea」で取り出した面積の値をラムダ式で参照し、値が小さい順で並び変える					
			list.sort(Comparator.comparingDouble(p -> p.getArea()));
		// elseで「ascending」の値がfalseだった場合に行う処理を指定
		} else {
			// 「ascending」の値がfalseだった場合、SuperPrefectures型のリスト「list」をsortメソッドで並び変える
			// SuperPrefectures型の「p1」と「p2」(都道府県)をcompareメソッドを使ってラムダ式で比較し、getAreaで取得した値が大きい順で並び変える
			list.sort((p1, p2) -> Double.compare(p2.getArea(), p1.getArea()));
		}
	}
}
