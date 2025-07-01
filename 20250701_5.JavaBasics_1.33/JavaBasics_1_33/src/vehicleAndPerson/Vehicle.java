package vehicleAndPerson;

public class Vehicle {
	// 現在のクラスからだけアクセスできる修飾子「private」で文字列型の「owner」をフィールドに宣言
	private String owner;

	// getterメソッド「getOwner」を定義
	public String getOwner() {
		// returnでフィールド変数「owner」の値を戻り値として返す
		return owner;

	}

	// setterメソッド「setOwner」を定義
	public void setOwner(String owner) {
		// このクラスの変数を意味する「this」を使ってフィールド変数「owner」に代入する
		this.owner = owner;
	}

}
