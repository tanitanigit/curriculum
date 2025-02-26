package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		// 1
		// [概要] ローカル変数処理
		// [詳細] 9個の型に変数の宣言をする。
		
		// バイト型の変数「byt」を宣言
		byte byt;
		// 短整数型の変数「sho」を宣言
		short sho;
		// 整数型の変数「in_t」を宣言
		int in_t;
		// 長整数型の変数「lon」を宣言
		long lon;
		// 単精度浮動小数点数型の変数「flo」を宣言
		float flo;
		// 倍精度浮動小数点数型の変数「dou」を宣言
		double dou;
		// 文字型の変数「cha」を宣言
		char cha;
		// 文字列型の変数「str」を宣言
		String str;
		// ブーリアン型の変数「boo」を宣言
		boolean boo;
		
		// 2
		// [概要] 変数の初期化処理
		// [詳細] 9個の変数に初期値を代入する。
		
		// バイト型の変数「byt」に初期値「0」を代入
		byt = 0;
		// 短整数型の変数「sho」に初期値「0」を代入
		sho = 0;
		// 整数型の変数「in_t」に初期値「0」を代入
		in_t = 0;
		// 長整数型の変数「lon」に初期値「0」を代入
		lon = 0;
		// 単精度浮動小数点数型の変数「flo」に初期値「0.0」を代入
		flo = 0.0f;
		// 倍精度浮動小数点数型の変数「dou」に初期値「0.0」を代入
		dou = 0.0;
		// 文字型の変数「cha」に初期値「\u0000」を代入
		cha = '\u0000';
		// 文字列型の変数「str」に初期値「null」を代入
		str = null;
		// ブーリアン型の変数「boo」に初期値「false」を代入
		boo = false;
		
		// 3
		// [概要] 変数の代入処理
		// [詳細] 変数に指定の値を代入する。
		
		// バイト型の変数「byt」に「10」を代入
		byt = 10;
		// 短整数型の変数「sho」に「100」を代入
		sho = 100;
		// 整数型の変数「in_t」に「1000」を代入
		in_t = 1000;
		// 長整数型の変数「lon」に「10000」を代入
		lon = 10000;
		// 単精度浮動小数点数型の変数「flo」に「9.5」を代入
		flo = 9.5f;
		// 倍精度浮動小数点数型の変数「dou」に「10.5」を代入
		dou = 10.5;
		// 文字型の変数「cha」に「a」を代入
		cha = 'a';
		// 文字列型の変数「str」に「ハロー」を代入
		str = "ハロー";
		// ブーリアン型の変数「boo」に「true」を代入
		boo = true;
		
		// 4
		// [概要] コンソール出力処理
		// [詳細] 上記の変数を用いて指定の値を出力する。
		
		// 「11110」を出力
		System.out.println(byt + sho + in_t + lon);
		// 「20」を出力
		System.out.println(byt + byt);
		// 「aハローtrue」を出力
		System.out.println(cha + str + boo);
		// 「11130」を出力(数字を全て足す)
		System.out.println(byt + sho + in_t + lon + flo + dou);
		// 「10000000000」を出力(小数点以外の数字を全てかける)
		System.out.println(byt * sho * in_t * lon);
		// 「0.105」を出力(10.5割る100をする)
		System.out.println(dou / sho);
		// 「-90」を出力(10引く100をする)
		System.out.println(byt - sho);
		// 改行
		System.out.println();
		
		// 5
		// [概要] コンソール出力の修正処理
		// [詳細] プログラムを修正して指定の値を出力する。
		
		// 整数型の変数「num」を宣言し「20」を代入
		int num  = 20;
		// 整数型の変数「num1」を宣言し「23」を代入
		int num1 = 23;
		
		// 整数型の変数同士の和算で指定の値を出力
		System.out.println("ハローJAVA" + (num + num1));
		// 改行
		System.out.println();
		
		// 6
		// [概要] コンソール出力処理
		// [詳細] 指定の変数を用いてフォーマット通りの値を出力する。

		// 文字列型の変数「name」を宣言し「山田太郎」を代入
		String name   = "山田太郎";
		// 整数型の変数「age」を宣言し「18」を代入
		int age 	  = 18;
		// 倍精度浮動小数点数型の変数「height」を宣言し「170.5」を代入
		double height = 170.5;
		// 倍精度浮動小数点数型の変数「weight」を宣言し「62.2」を代入
		double weight = 62.2;
		// 文字列型の変数「food」を宣言し「寿司」を代入
		String food   = "寿司";
		
		// 文字列型の変数「name」を用いて指定の値を出力
		System.out.println("はじめまして" + name + "です");
		// 整数型の変数「age」を用いて指定の値を出力
		System.out.println("年齢は" + age + "歳です");
		// 倍精度浮動小数点数型の変数「height」を用いて指定の値を出力
		System.out.println("身長は" + height + "cmです");
		// 倍精度浮動小数点数型の変数「weight」を用いて指定の値を出力
		System.out.println("体重" + weight + "kgです");
		// 文字列型の変数「food」を用いて指定の値を出力
		System.out.println("好きな食べ物は" + food + "です");
		// 改行
		System.out.println();
		
		// 7
		// [概要] BMIの出力
		// [詳細] 6で使用した変数を用いてBMIを計算し、値を出力する。

		// 倍精度浮動小数点数型の変数「height2」を宣言し、身長の単位をcmからmに計算した値を代入
		double height2 = height / 100;
		// 倍精度浮動小数点数型の変数「BMI」を宣言し、BMIを計算した値を代入
		double BMI 	   = weight / (height2 * height2 );
		// 倍精度浮動小数点数型の変数「BMI2」を宣言し、「BMI」で計算した値を小数第二位で四捨五入し、小数第一位までの値が表示される計算したものを代入
		double BMI2	   = ((double)Math.round(BMI * 10)) / 10;
		
		// 倍精度浮動小数点数型の変数「BMI2」を用いて指定の値を出力
		System.out.println("BMIは" + BMI2 +"です");
		// 改行
		System.out.println();
		
		
		// 8
		// [概要] コンソール出力処理
		// [詳細] 6で使用した変数に再代入して値を出力する。
		
		// 文字列型の変数「name」に「鈴木一郎」を再代入
		name    = "鈴木一郎";
		// 整数型の変数「age」に「24」を再代入
		age     = 24;
		// 倍精度浮動小数点数型の変数「height」に「168.5」を再代入
		height  = 168.5;
		// 倍精度浮動小数点数型の変数「weight」に「64.2」を再代入
		weight  = 64.2;
		// 文字列型の変数「food」に「オムライス」を再代入
		food    = "オムライス";
		// 倍精度浮動小数点数型の変数「height2」に身長の単位をcmからmに計算した値を再代入
		height2 = height / 100;
		// 倍精度浮動小数点数型の変数「BMI」にBMIを計算した値を再代入
		BMI 	= weight / (height2 * height2 );
		// 倍精度浮動小数点数型の変数「BMI2」に「BMI」で計算した値を小数第二位で四捨五入し、小数第一位までの値が表示される計算したものを再代入
		BMI2    = ((double)Math.round(BMI * 10)) / 10;
		
		// 文字列型の変数「name」を用いて指定の値を出力
		System.out.println("はじめまして" + name + "です");
		// 整数型の変数「age」を用いて指定の値を出力
		System.out.println("年齢は" + age + "歳です");
		// 倍精度浮動小数点数型の変数「height」を用いて指定の値を出力
		System.out.println("身長は" + height + "cmです");
		// 倍精度浮動小数点数型の変数「weight」を用いて指定の値を出力
		System.out.println("体重" + weight + "kgです");
		// 文字列型の変数「food」を用いて指定の値を出力
		System.out.println("好きな食べ物は" + food + "です");
		// 倍精度浮動小数点数型の変数「BMI2」を用いて指定の値を出力
		System.out.println("BMIは" + BMI2 +"です");
		// 改行
		System.out.println();
		
		// 9
		// [概要] コンソール出力
		// [詳細] 8で使用した変数を和算で自己代入して値を出力する。

		// 整数型の変数「age3」を宣言し、「age」を和算で自己代入した値を代入する
		int age3	   = age += age;
		// 倍精度浮動小数点数型の変数「height3」を宣言し、「height」を和算で自己代入した値を代入
		double height3 = height += height;
		// 倍精度浮動小数点数型の変数「weight」を宣言し、「weight」を和算で自己代入した値を代入
		double weight3 = weight += weight;
		// 倍精度浮動小数点数型の変数「height2」に身長の単位をcmからmに計算した値を再代入
		height2  	   = height / 100;
		// 倍精度浮動小数点数型の変数「BMI」に「BMI」で計算した値を小数第二位で四捨五入し、小数第一位までの値が表示される計算したものを再代入
		BMI 		   = weight / (height2 * height2 );
		// 倍精度浮動小数点数型の変数「BMI2」に「BMI」で計算した値を小数第二位で四捨五入し、小数第一位までの値が表示される計算したものを再代入
		BMI2   	       = ((double)Math.round(BMI * 100)) / 100;		
		
		// 文字烈型の変数「name」を用いて指定の値を出力
		System.out.println("はじめまして" + name + "です");
		// 整数型の変数「age3」を用いて指定の値を出力
		System.out.println("年齢は" + age3 + "歳です");
		// 倍精度浮動小数点数型の変数「height3」を用いて指定の値を出力
		System.out.println("身長は" + height3 + "cmです");
		// 倍精度浮動小数点数型の変数「weight3」を用いて指定の値を出力
		System.out.println("体重" + weight3 + "kgです");
		// 文字列型の変数「food」を用いて指定の値を出力
		System.out.println("好きな食べ物は" + food + "です");
		// 倍精度浮動小数点数型の変数「BMI2」を用いて指定の値を出力
		System.out.println("BMIは" + BMI2 +"です");
		// 改行
		System.out.println();
		
		// 10
		// [概要] 演算子を用いた処理
		// [詳細] 8で使用した年齢を参照して値を出力する。
		
		// 9で自己代入された値を戻すため、整数型の変数「age」に「24」を再代入
		age     = 24;
		// 比較演算子を用いて、8で使用した年齢が25歳以上であれば「true」を出力
		System.out.println(age >= 25);
		// 改行
		System.out.println();
		
		// 11
		// [概要] 数値から文字列への型変換処理
		// [詳細] 8で使用した年齢、身長、体重を文字列型に型変換し、繋げて値を出力する。

		// 9で自己代入された値を戻すため、整数型の変数「height」に「168.5」を再代入
		height  = 168.5;
		// 9で自己代入された値を戻すため、整数型の変数「weight」に「64.2」を再代入
		weight  = 64.2;

		// 8で使用した整数型の変数「age」を文字列型の変数「age4」へ型変換
		String age4	   = String.valueOf(age);
		// 8で使用した倍精度浮動小数点数型の変数「height」を文字列型の変数「height4」へ型変換
		String height4 = String.valueOf(height);
		// 8で使用した倍精度浮動小数点数型の変数「weight」を文字列型の変数「weight4」へ型変換
		String weight4 = String.valueOf(weight);
		
		// 文字列型の変数に型変換を行った「age4」「height4」「weight4」の値を繋げて出力
		System.out.println(age4 + height4 + weight4);
		// 改行
		System.out.println();
		
		// 12
		// [概要] 文字列から数値への型変換処理
		// [詳細] 11で使用した年齢と身長を整数型に変換して値を出力する。

		// 11で使用した文字列型の変数「age4」を整数型の変数「age5」に型変換
		int age5	   = Integer.parseInt(age4);
		// 11で使用した文字列型の変数「height4」を倍精度浮動小数点数型の変数「height5」に型変換
		double height5 = Double.parseDouble(height4);
		// 倍精度浮動小数点数型の変数「height5」を整数型の変数「height6」に型キャスト
		int height6    = (int)height5;
		// 整数型に型変換を行った変数「age5」を出力
		System.out.println(age5);
		// 倍精度浮動小数点数型に型変換を行った変数「height5」を出力
		System.out.println(height6);
		// 改行
		System.out.println();
		
		// 13
		// [概要] 演算子を用いた処理
		// [詳細] 12で使用した年齢、指定の条件に合う場合はtrueを出力する。
		
		// 比較演算子・論理演算しを用いて、12で使用した年齢が25もしくは身長が160以上であれば「true」を出力
		System.out.println(age5 == 25 || height5 >= 160);
	}
}
