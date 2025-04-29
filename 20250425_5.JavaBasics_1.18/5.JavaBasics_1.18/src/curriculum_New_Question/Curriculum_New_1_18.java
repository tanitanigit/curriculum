package curriculum_New_Question;

// Q5で使用するRandomクラスをjava.utilパッケージからインポートする
import java.util.Random;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
			
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static void main(String[] args) {
    
	// Q1
	// [概要] 指定の文字列の表示
	// [詳細] mainで指定した引数で処理されたメソッドの内容をコンソールに出力する。
	
	// Q1の範囲確認(テスト用)
	System.out.println();
	System.out.println("\t-Q1- ここから");
	System.out.println();
	
	// Q1の問題文を表示
	System.out.println("＞Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。");
	// メソッド「Q1hello」を呼び出し、引数として「JavaSE」「11」を代入
	Q1hello("JavaSE", 11);
	
	// Q2
	// [概要] 指定の文字列の表示
	// [詳細] mainで指定した引数で処理されたメソッドの内容をコンソールに出力する。

	// Q2の範囲確認(テスト用)
	System.out.println();
	System.out.println("\t-Q2- ここから");
	System.out.println();
	
	// Q2の問題文を表示
	System.out.println("＞Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください");
	// 	メソッド「Q2multiplyNumbers」を呼び出し、引数として「3」「4」を代入
    Q2Q4multiplyNumbers(3, 4);
	
	// Q3
	// [概要] 指定の文字列の表示
	// [詳細] mainで指定した引数で処理されたメソッドの内容をコンソールに出力する。
	
	// Q3の範囲確認(テスト用)
	System.out.println();
	System.out.println("\t-Q3- ここから");
	System.out.println();
	
	// Q3の問題文を表示
	System.out.println("＞Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください");
	// 整数型の配列「Q3numbers」を宣言し、「1」「2」「3」「4」「5」を代入
	 int[] Q3numbers = {1, 2, 3, 4, 5};
	 // メソッド「Q3printArray」を呼び出し、引数として「Q3numbers」を代入
     Q3printArray(Q3numbers);
	
	// Q4
 	// [概要] 指定の文字列の表示
 	// [詳細] mainで指定した引数で処理されたメソッドの内容をコンソールに出力する。
	
	// Q4の範囲確認(テスト用)
	System.out.println();
	System.out.println("\t-Q4- ここから");
	System.out.println();
	
	// Q4の問題文を表示
	System.out.println("＞Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。");
	// メソッド「Q2Q4multiplyNumbers」を呼び出し、引数として「2.5」「3.5」を代入
    Q2Q4multiplyNumbers(2.5, 3.5);
	
	// Q5
	// [概要] 指定の文字列の表示
	// [詳細] mainで指定した引数で処理されたメソッドの内容をコンソールに出力する。
	
	// Q5の範囲確認(テスト用)
	System.out.println();
	System.out.println("\t-Q5- ここから");
	System.out.println();
	
	// Q5の問題文を表示
	System.out.println("＞Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して");
	System.out.println("＞格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。");
	System.out.println("＞※0は出力＆格納しないようにしてください。");
	// 整数型の配列「Q5randomNumbers」を宣言し、メソッド「Q5generateRandomNumbers」を呼び出して引数として「5」を代入した結果を格納する
	int[] Q5randomNumbers = Q5generateRandomNumbers(5);
	
	// Q6
	// [概要] 指定の文字列の表示
	// [詳細] mainで指定した引数で処理されたメソッドの内容をコンソールに出力する。
	
	// Q6の範囲確認(テスト用)
	System.out.println();
	System.out.println("\t-Q6- ここから");
	System.out.println();
	
	// Q6の問題文を表示
	System.out.println("＞Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。");
	System.out.println("＞※小数点以下も表示されるようにしてください。");	
    // 倍精度浮動小数点数型の「Q6average」を宣言し、メソッド「Q6calculateAverage」を呼び出して引数として「Q5randomNumbers」を代入した結果を格納する
    double Q6average = Q6calculateAverage(Q5randomNumbers);
	
	// Q7
	// [概要] 指定の文字列の表示
	// [詳細] mainで指定した引数で処理されたメソッドの内容をコンソールに出力する。
	
	// Q7の範囲確認(テスト用)
	System.out.println();
	System.out.println("\t-Q7- ここから");
	System.out.println();
	
	//Q7の問題文を表示
	System.out.println("＞Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください	");
	// メソッド「07isAverageAbove50」を呼び出し、引数として倍精度浮動小数点数型の「Q6average」を代入
	Q7isAverageAbove50(Q6average);
	
	}
	
	// Q1用のメソッドを定義
	// 文字列型の「Q1text」と整数型の「Q1number」を宣言し、引数としてそれぞれにmainメソッドから「JavaSE」と「11」を格納する
	// つまり「text = JavaSE」「number = 11」となる
	public static void Q1hello(String Q1text, int Q1number) {
	        // 引数「Q1text」と「Q1number」を用いながら指定の文字列を表示する
	        System.out.println("Hello " + Q1text + " " + Q1number);
	    }
	
	// Q2用のメソッドを定義
	// int型の「Q2a」「Q2b」を宣言し、引数としてそれぞれにmainメソッドから「3」「4」を代入する
		public static void Q2Q4multiplyNumbers(int Q2a, int Q2b) {
			// 	整数型の「Q2result」を宣言し、Q2aとQ2bを掛け算した値を代入する
			int Q2result = Q2a * Q2b;
			// 指定の文字列を表示する
			System.out.println(Q2result);
	}
	
	// Q3用のメソッドを定義
	// 整数型の配列「Q3array」を宣言し、引数としてmainメソッドから「1」「2」「3」「4」「5」を代入する
    public static void Q3printArray(int[] Q3array) {
    	// for文でQ3arrayの要素数分だけ繰り返す
        for (int Q3i = 0; Q3i < Q3array.length; Q3i++) {
        	// 指定の文字列を表示する
            System.out.println(Q3array[Q3i]);
        }
    }
    
    // Q4用のメソッドを定義    
    // 倍精度浮動小数点数型の「Q4a」「Q4b」を宣言し、引数としてメソッドから「2.5」「3.5」を代入する
    public static void Q2Q4multiplyNumbers(double Q4a, double Q4b) {
    	// 倍精度浮動小数点数型の「Q4result」を宣言し、Q4aとQ4bを足した値を代入する
        double Q4result = Q4a + Q4b;
        // 指定の文字列を表示する
        System.out.println(Q4result);
    }

    // Q5用のメソッドを定義    
    // 整数型の「Q5count」を宣言し、引数としてメソッドから「5」を受け取る
    public static int[] Q5generateRandomNumbers(int Q5count) {
    	// Randomクラスの「Q5Rondom」へランダムな数字を作るためのオブジェクトを作成
        Random Q5rand = new Random();
        // 整数型の配列「Q5numbers」に整数型の引数「Q5count」を代入
        int[] Q5numbers = new int[Q5count];
        
        // for分でQ5countの数だけ繰り返す
        for (int Q5i = 0; Q5i < Q5count; Q5i++) {
        	// 整数型の「Q5randomNumber」に1～100のランダムな整数を作成
            int Q5randomNumber = Q5rand.nextInt(100) + 1;
            // 整数型のQ5numbers配列に、ランダムに作成された「Q5randomNumber」を格納する
            Q5numbers[Q5i] = Q5randomNumber;
            // 指定の文字列を表示する
            System.out.println(Q5randomNumber);
        }
        
        // returnで配列を返す
        return Q5numbers;
    }
    
    // Q6用のメソッドを定義    
    // 整数型の配列「Q6numbers」を宣言し、引数としてメソッドから整数型の配列「Q5randomNumber」に格納された値を受け取る
    public static double Q6calculateAverage(int[] Q6numbers) {
        // 整数型の「Q6sum」を宣言し0を代入して初期化する
        int Q6sum = 0;
        
        // for文で整数型の配列「Q6Number」の中の要素をすべて取り出して、合計を計算する
        for (int Q6i = 0; Q6i < Q6numbers.length; Q6i++) {
        	// 整数型の配列「Q6Number」の要素を1つずつ足していく」
            Q6sum += Q6numbers[Q6i];
        }
        
        // 倍精度浮動小数点数型の「Q6average」を宣言し、平均値を求める
        double Q6average = (double) Q6sum / Q6numbers.length;
        
        // 指定の文字列を表示
        System.out.println(Q6average);
        
        // returnで平均値を返す
        return Q6average;
    }
    
    // Q7用のメソッドを定義    
    // Q6で作った平均値を引数で受け取る
    public static boolean Q7isAverageAbove50(double Q7average) {
        
        // if文で条件として「Q7average」が50以上だった場合を指定
        if (Q7average >= 50) {
            // 指定の文字列を表示
            System.out.println(true);
            // returnでtrueを返す
            return true;
        // else文で50未満だった場合を指定
        } else {
            // 指定の文字列を表示
            System.out.println(false);
            // returnでfalseを返す
            return false;
        }
    }
    
}