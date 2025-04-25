package curriculum_B;

// java.util.Scannerをインポートし、文字の標準入力の処理を受け付ける
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作成し、引数で標準入力「System.in」を指定
		Scanner scanner = new Scanner(System.in);
		
		// 整数型の「numberOfStudent」を宣言
		int numberOfStudents;
		
		// do-while文で生徒数の入力(2人以上になるまで繰り返す)
		do {
			// 指定の文字列を表示
			System.out.print("生徒の人数を入力してください（2以上）: ");
			// 整数型の「numberOfStudent」に生徒の人数を値として入力
			numberOfStudents = scanner.nextInt();
			
			// while文で整数型の「numberOfStundent」の値が2未満だった場合はやり直す条件を指定
		} while (numberOfStudents < 2);
		// 整数型の「scores」に2次元配列を作成し点数として値を受け付ける
		// 行：[生徒]、列：[英語・数学・理科・社会]
		int[][] scores = new int[numberOfStudents][4];
		// for文で整数型の「i」として何人目の生徒かを表示しながら各生徒の点数を入力する流れを作る
		for (int i = 0; i < numberOfStudents; i++) {
			//　指定の文字列を表示
			System.out.println((i + 1) + "人目の点数を入力してください：");
			System.out.print((i + 1) + "人目の『英語』の点数を入力してください :");
			// 「i」人目の「0」(英語)の点数を入力
			scores[i][0] = scanner.nextInt();
			//　指定の文字列を表示
			System.out.print((i + 1) + "人目の『数学』の点数を入力してください :");
			// 「i」人目の「1」(数学)の点数を入力
			scores[i][1] = scanner.nextInt();
			//　指定の文字列を表示
			System.out.print((i + 1) + "人目の『理科』の点数を入力してください :");
			// 「i」人目の「2」(理科)の点数を入力
			scores[i][2] = scanner.nextInt();
			//　指定の文字列を表示
			System.out.print((i + 1) + "人目の『社会』の点数を入力してください :");
			// 「i」人目の「3」(社会)の点数を入力
			scores[i][3] = scanner.nextInt();
		}
		
		// 改行
		System.out.println();
		
		// for文で各生徒の平均点を計算するための処理
		// 整数型の「i」を宣言し、条件として「i」の値が「numberOfStudents」に入力された生徒の人数に達するまで繰り返される処理を指定
		for (int i = 0; i < numberOfStudents; i++) {
			// 整数型の「sum」(4教科の合計点)に初期値「0」を代入して宣言
			int sum = 0;
			// for文で各教科の点数を合計するための処理
			// 整数型の「j」を宣言し、条件として「j」の値が4教科分に達するまで繰り返す
			for (int j = 0; j < 4; j++) {
				// 各教科の点数を合計する
				sum += scores[i][j];
			}
			// 倍精度浮動小数点数型「average」に、キャストした整数型の「sum」(4教科の合計点)を教科数である「4」で割り各生徒の平均点を求める
			double average = (double) sum / 4;
			// 指定の文字列を表示
			System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), average);
		}
		
		// 改行
		System.out.println();
		
		// 整数型の「subjectTotals」の配列に各教科(英語、数学、理科、社会)の合計点を代入する
		int[] subjectTotals = new int[4]; // 各教科の合計点を保存する配列
		
		// for文で各教科の点数を合計するための処理
		// 整数型の「j」に初期値「0」を代入して宣言し、条件として「j」の値が4教科分に達するまで繰り返す
		for (int j = 0; j < 4; j++) {
			// for文で内で整数型の「i」に初期値「0」を代入して宣言し、条件として「numberOfStundet」に入力された生徒の人数に達するまで繰り返される処理を指定
			for (int i = 0; i < numberOfStudents; i++) {
				// 整数型の配列「subjectTotals」に整数型の配列「scores」の教科ごとの合計点数を代入する
				subjectTotals[j] += scores[i][j];
			}
		}

		// 文字列型の配列「subjects」に各教科名を代入
		String[] subjects = { "英語", "数学", "理科", "社会" };

		// for文で各教科の平均点を出すための処理
		// 整数型の「j」に初期値「0」を代入して宣言し、条件として「j」の値が4教科分に達するまで繰り返す
		for (int j = 0; j < 4; j++) {
			// 倍精度浮動小数点数型「average」に、キャストした整数型の「j」を生徒数である整数型の「numberOfStudent」で割り各教科の平均点を求める
			double average = (double) subjectTotals[j] / numberOfStudents;
			// 指定の文字列を表示
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], average);
		}

		// 整数型の「totalAll」に初期値「0」を代入して宣言
		int totalAll = 0;
		// for文で全体の平均点の計算するための処理
		// 整数型の「i」に初期値「0」を代入して宣言し、条件として「i」の値が「numberOfStudenta」に入力された生徒の人数に達するまで繰り返される処理を指定
		for (int i = 0; i < numberOfStudents; i++) {
			// for文内で整数型の「j」に初期値「0」を代入して宣言し、条件として「j」の値が4教科分に達するまで繰り返す
			for (int j = 0; j < 4; j++) {
				// 整数型の「totalAll」に整数型の配列「scores」の各生徒の各教科の合計点数を代入する
				totalAll += scores[i][j];
			}
		}
		
		// 倍精度浮動小数点数型「overalAverage」に、キャストした整数型の「totalAll」を全生徒分の合計科目数で割った値を代入する
		double overallAverage = (double) totalAll / (numberOfStudents * 4);
		// 指定の文字列を表示
		System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);
		
		// scannerを閉じる
		scanner.close();

	}

}
