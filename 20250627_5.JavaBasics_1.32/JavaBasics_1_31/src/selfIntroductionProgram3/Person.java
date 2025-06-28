package selfIntroductionProgram3;

//クラス「Person」を定義
class Person {
	// 整数型の「count」を静的メンバ変数としてフィールドに宣言(全体の人数をカウントする)
	public static int count = 0;
	// 問題1：インスタンスフィールドに「lastName」を追加しましょう
	// 文字列型の「lastName」をフィールドに宣言(苗字)
	public String lastName;
	// 文字列型の「firstName」をフィールドに宣言(名前)
	public String firstName;
	// 整数型の「age」をフィールドに宣言(年齢)
	public int age;
	// 倍精度浮動小数点数型の「height」をフィールドに宣言(身長)
	public double height;
	// 倍精度浮動小数点数型の「weight」をフィールドに宣言(体重)
	public double weight;

	// コンストラクタ「Person」を定義し、文字列型の「firstName」、「lastName」、
	// 整数型の「age」、倍精度浮動小数点数型の「height」、「weight」の値を受け取る
	Person(String lastName, String firstName, int age, double height, double weight) {
		// 問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
		// 問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
		// このインスタンスのフィールドを指す「this」を使い、各引数の値をフィールドに代入
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// インクリメントで「count」の値を1増やす(Personクラスのインスタンスが1つ作られるたびに人数を1増やす)
		Person.count++;
	}

	// 氏名（姓 + 名）を文字列として返すメソッド
	public String fullName() {
		// returnで「lastName」と「firstName」を+で繋げた値を返す(姓+名のフルネーム)
		return this.lastName + this.firstName;
	}

	// 戻り値なしのメソッド「print」を引数なしで定義(インスタンスの情報を出力)
	public void print() {
		// 指定の文字列を表示(何人目、フルネーム、年齢、身長、体重、BMIの値を使った自己紹介文)
		System.out.println("-" + count + "人目のプロフィール-");
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("身長は" + this.height + "mです");
		System.out.println("体重は" + this.weight + "kgです");
		System.out.printf("BMIは%.1fです\n\n", this.bmi());
	}

	// 浮動小数点数型のメソッド「bmi」を引数なしで定義
	public double bmi() {
		// 倍精度浮動小数点数型の「bmi」にフィールドからweight(体重)とheight(身長)の値を取得して計算した値を代入する
		return this.weight / this.height / this.height;
	}

	// 戻り値なしの静的メソッド「printCount」を引数なしで定義
	public static void printCount() {
		// 指定の文字列を表示(静的メンバ変数を使って人数の合計を表示)
		System.out.println("合計" + Person.count + "人です");
	}
}
