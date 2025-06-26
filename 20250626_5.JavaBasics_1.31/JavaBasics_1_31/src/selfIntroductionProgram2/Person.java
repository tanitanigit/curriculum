package selfIntroductionProgram2;

// クラス「Person」を定義
class Person {
	// 文字列型の「name」をフィールドに宣言(名前)
	public String name;
	// 整数型の「age」をフィールドに宣言(年齢)
	public int age;
	// 倍精度浮動小数点数型の「height」をフィールドに宣言(身長)
	public double height;
	// 倍精度浮動小数点数型の「weight」をフィールドに宣言(体重)
	public double weight;

	// 問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）
	// 整数型の「count」を静的メンバ変数としてフィールドに宣言(全体の人数をカウントする)
	public static int count = 0;

	// コンストラクタ「Person」を定義し、文字列型の「name」、整数型の「age」、
	// 倍精度浮動小数点数型の「height」、「weight」の値を受け取る
	Person(String name, int age, double height, double weight) {
		// このクラスの変数を指す「this」を使い、各引数をフィールドに代入
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください
		// インクリメントで「count」の値を1増やす(インスタンスが1つ作られるたびに人数を1増やす)
		count++;
	}

	// 浮動小数点数型のメソッド「bmi」を引数なしで定義
	public double bmi() {
	    // 倍精度浮動小数点数型の「bmi」にフィールドからweight(体重)とheight(身長)の値を取得して計算した値を代入する
        return this.weight / this.height / this.height;		
	}

	// 戻り値なしのメソッド「print」を引数なしで定義(インスタンスの情報を出力)
	public void print() {
		// 指定の文字列を表示(何人目、名前、年齢、身長、体重、BMIの値を使った自己紹介文)

		// 何人目のプロフィールかを表示
		System.out.println("-" + count + "人目のプロフィール-");
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("身長は" + this.height + "mです");
		System.out.println("体重は" + this.weight + "kgです");
		System.out.printf("BMIは%.1fです\n\n", this.bmi());
	}

	// 問題4：クラスメソッド「printCount」を定義してください（データ型：void）
	// 戻り値なしの静的メソッド「printCount」を引数なしで定義
	public static void printCount() {
		// 問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。
		// 問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
		// 指定の文字列を表示(静的メンバ変数を使って人数の合計を表示)
		System.out.println("合計" + count + "人です");
	}
}
