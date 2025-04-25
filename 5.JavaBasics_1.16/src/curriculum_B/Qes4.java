package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		// for文で整数型の「a」(かけられる値)を1の段から9の段まで繰り返す
		for (int a = 1; a <= 9; a++) {
			// for文で整数型の「b」(かける値)を1から9まで繰り返す
			for (int b = 1; b <= 9; b++) {
				// 文字列型の「aStr」として整数型の「a」(かけられる値)を指定の表示形式へフォーマットする
				String aStr = String.format("%02d", a);
				// 文字列型の「bStr」として整数型の「b」(かける値)を指定の表示形式へフォーマットする
				String bStr = String.format("%02d", b);
				// 文字列型の「cStr」として整数型の「c」(a * bの計算結果の値)を指定の表示形式へフォーマットする
				String cStr = String.format("%02d", a * b);

				// 指定の文字列を表示
				System.out.print(aStr + " * " + bStr + " = " + cStr);

				// if文で条件として整数型の「b」(かける値」が9だった場合を指定
				if (b == 9) {
					// 改行処理
					System.out.println();
				// 9ではない(false)場合
				} else {
					// 指定の文字列を表示(計算式と計算式の間を「||」で区切る)
					System.out.print(" || ");
				}

			}

		}

	}

}
