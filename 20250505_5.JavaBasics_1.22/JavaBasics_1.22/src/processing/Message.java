package processing;

// クラス「LocalDateTime」をパッケージ「java.time」からインポートする(現在日時を扱う)
import java.time.LocalDateTime;
// クラス「DateFormatter」をパッケージ「java.time」からインポートする(日時の表示形式を変更する)
import java.time.format.DateTimeFormatter; // 日時の表示形式を整えるクラス

public class Message {
	// 現在のクラスからだけアクセスできる修飾子「private」で文字列型の変数「helloJapan」をフィールドに宣言
    private String helloJapan;
    // 現在のクラスからだけアクセスできる修飾子「private」で文字列型の変数「sushiUma」をフィールドに宣言
    private String sushiUma;
    // 現在のクラスからだけアクセスできる修飾子「private」で文字列型の変数「sushiIsWashoku」をフィールドに宣言
    private String sushiIsWashoku;

    // コンストラクタ「Message」を定義する(引数なし)
    public Message() {
        // このクラスの変数を意味する「this」を使ってフィールド変数「helloJapan」に指定の値を代入
        this.helloJapan = "こんにちは！ここは日本です！";
        // このクラスの変数を意味する「this」を使ってフィールド変数「sushiUma」に指定の値を代入
        this.sushiUma = "この寿司はうまい";
        // このクラスの変数を意味する「this」を使ってフィールド変数「sushiIsWashoku」に指定の値を代入
        this.sushiIsWashoku = "寿司は和食です";
    }

    // コンソール出力用のメソッド(helloJapan)
    public void printHelloJapan() {
    	// このクラスの変数を意味する「this」を使ってフィールド変数「helloJapan」に代入された値「こんにちは！ここは日本です！」を出力
        System.out.println(this.helloJapan);
    }

    // コンソール出力用のメソッド(sushiUma)
    public void printSushiUma() {
    	// このクラスの変数を意味する「this」を使ってフィールド変数「sushiUma」に代入された値「この寿司はうまい」を出力
        System.out.println(this.sushiUma);
    }

    // コンソール出力用のメソッド(sushiIsWashoku)
    public void printSushiIsWashoku() {
    	// このクラスの変数を意味する「this」を使ってフィールド変数「sushiIsWashoku」に代入された値「寿司は和食です」を出力
        System.out.println(this.sushiIsWashoku);
    }

    // 現在の日時を出力するメソッド
    public void printDateTime() {
        // 日付と時間を表すクラス「LocalDateTime」を使い、「LocalDateTime.now()」から現在のPCのシステム時間を取得する
        LocalDateTime now = LocalDateTime.now();

        // 日付や時刻を文字列に整えるクラス「DateTimeFormatter」を使い、
        // 「ofPattern("yyyy/MM/dd HH:mm:ss")」から日時を「yyyy/MM/dd HH:mm:ss」形式に指定する
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        // 文字列型の変数「formatDateTime」にyyyy/MM/dd HH:mm:ss形式に指定した日時の変数「format」を代入する
        String formattedDateTime = now.format(format);

        // 指定の文字列を表示する(yy/MM/dd HH:mm:ss形式に指定した日時)
        System.out.println("今の現在日時は" + formattedDateTime + "です");
    }


}




