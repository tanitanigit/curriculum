package curriculum_B;

// java.util.Randomをインポートし、残り台数をランダムに作る処理を受け付ける
import java.util.Random;
// java.util.Scannerをインポートし、文字の標準入力の処理を受け付ける
import java.util.Scanner;


public class Qes6 {

	public static void main(String[] args) {
		 
		 // Scannerクラスのインスタンスを作成し、引数で標準入力「System.in」を指定
		 Scanner scanner = new Scanner(System.in);
		 // Randomクラスのインスタンス「random」を作成
		 Random random = new Random();
		 
		 // 文字列型「input」へ入力された内容を取得
		 String input = scanner.nextLine();
		 // 入力された文字列を「、」で分割して配列に格納
		 String[] items = input.split("、");
		 
		 // 拡張for文で配列の各要素を1つずつ取り出す
		 for (String item : items) {
		
			   // 文字列型「item」の前後の空白を削除
			   item = item.trim();
			   // 文字列型「stock」に0〜11までのランダムな整数を生成(残り台数)
			   int stock = random.nextInt(12);
			  
			   // 文字列型「displayName」を宣言し、条件演算子を使って出力する商品名を決定(テレビとディスプレイを同じ商品として扱う)
			   String displayName = (item.equals("ディスプレイ")) ? "ディスプレイ" : item;
			  
			   // switch文で商品名に応じた処理へ分岐
			   switch (item) {
			   
			  		 // 「テレビ」と「ディスプレイ」は同じケースにまとめる
			  		 case "テレビ":
			  		 case "ディスプレイ":
			  		 // 最大個数11からランダムに引いた値を残り台数とする
			  		 int displayStock = 11 - random.nextInt(12);
			  		 	 // 指定の文字列を出力()
			  		 	 System.out.println(displayName + "の残り台数は" + displayStock + "台です");
			  		 	 break;
			  		 // 「パソコン」が入力された場合
			  		 case "パソコン":
			  			 // 指定の文字列を出力(パソコンの残り台数)
			  			 System.out.println("パソコンの残り台数は" + stock + "台です");
			  			 break;
			  		 // 「冷蔵庫」が入力された場合
			  		 case "冷蔵庫":
			  			 // 指定の文字列を出力(冷蔵庫の残り台数)
			  			 System.out.println("冷蔵庫の残り台数は" + stock + "台です");
			  			 break;
			  		 //「扇風機」が入力された場合
			  		 case "扇風機":
			  			 // 指定の文字列を出力(扇風機の残り台数)
			  			 System.out.println("扇風機の残り台数は" + stock + "台です");
			  			 break;
			  		 // 「洗濯機」が入力された場合
			  		 case "洗濯機":
			  			 // 指定の文字列を出力(洗濯機の残り台数)
			  			 System.out.println("洗濯機の残り台数は" + stock + "台です");
			  			 break;
			  		 // 「加湿器」が入力された場合
			  		 case "加湿器":
			  			 // 指定の文字列を出力(加湿器の残り台数)
			  			 System.out.println("加湿器の残り台数は" + stock + "台です");
			  			 break;
			  		 // 指定の商品名以外の値が入力された場合
			  		 default:
			  			 // 指定の文字列を出力(エラーメッセージ)
			  			 System.out.println("『 " + item + " 』は指定の商品ではありません");
			  			 break;
			   }
		 }
	
	 // Scannerを閉じる
	 scanner.close();
	 
	 }
}
