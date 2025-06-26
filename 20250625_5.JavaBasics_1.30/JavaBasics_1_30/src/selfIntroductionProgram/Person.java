package selfIntroductionProgram;

// クラスPersonを定義
class Person {

	// 問題1：インスタンスフィールドを定義してください
	// ・フィールド名：name(データ型：string型)
	// ・フィールド名：age(データ型：int型)
	// ・フィールド名：height(データ型：double型)
	// 文字列型の「name」をフィールドに宣言(名前)
	String name;
	// 整数型の「age」をフィールドに宣言(年齢)
	int age;
	// 倍精度浮動小数点数型の「height」をフィールドに宣言(身長)
	double height;
	
	// 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	// 倍精度浮動小数点数型の「weight」をフィールドに宣言(体重)
	double weight;
	// 整数型の「count」を静的メンバ変数としてフィールドに宣言(全体の人数をカウントする)
	static int count = 0;

	// 問題2：コンストラクタを定義してください（下記それぞれの引数）
	// name,age,height
	// コンストラクタ「Person」を定義し、文字列型の「name」、整数型の「age」、
	// 倍精度浮動小数点数型の「height」、「weight」の値を受け取る
	Person(String name, int age, double height, double weight) {
		
		// 問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください		
		// このクラスの変数を指す「this」を使い、各引数をフィールドに代入
		this.name = name;
		this.age = age;
		this.height = height;
		// 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
		this.weight = weight;

		// インクリメントで「count」の値を1増やす(インスタンスが1つ作られるたびに人数を1増やす)
		count++;
	}

	// 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	// 浮動小数点数型のメソッド「bmi」を引数なしで定義
	double bmi() {
		// 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
	    // 倍精度浮動小数点数型の「rawBmi」にフィールドからweight(体重)とheight(身長)の値を取得して計算した値を代入する
	    double rawBmi = this.weight / (this.height * this.height);

	    // 整数部分だけ残し、小数点以下を切り捨て（例：20.79 → 20.0）
	    // 倍精度浮動小数点数型の「truncatedBmi」にMathクラスのfloorメソッドを使ってrawBmiの値の小数点以下を切り捨てた値を代入する
	    double truncatedBmi = Math.floor(rawBmi);
	    
	    //returnで倍精度浮動小数点数型の「truncateedBmi」の値を戻り値として返す
	    return truncatedBmi;
		
	}

	// 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	// 戻り値なしのメソッド「print」を引数なしで定義
	void print() {
		// 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
		// 指定の文字列を表示(名前、年齢、BMIの値を使った自己紹介文)
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.printf("BMIは%.1fです\n", this.bmi());
	}
}
