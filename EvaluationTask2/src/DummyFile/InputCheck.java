//課題2 InputCheck.java
package DummyFile;

class InputCheck {
	private String str;
	public InputCheck(String str) {
		if(str == null) {
			str = "";
		}
		this.str = str; //thisの追加　
		//クラスのフィールドに値を代入するためには、thisを使用してフィールドを明示的する必要がある。
		//メソッドやコンストラクタの引数と、クラスのフィールドが同じ名前を持つ場合、
		//デフォルトではメソッドやコンストラクタ内でその名前が使われると、引数を指すことになってしまう。
	}
	
	protected boolean isNumeric() {
		if (this.str == "") {
			return false;
			}
		for (int i = 0; i < this.str.length(); i++) {
			char c = this.str.charAt(i);
			if (c < '0' || c > '9') {
				return false;
				}
			}
		return true;
	}
	
	protected boolean checkSize() {
	if(this.str.length() <= 10) {
		if(Math.abs(Integer.parseInt(this.str)) <= 1024*1024*100) {
			return true;
			}
		return false;
		}
	else {
		return false;
		}
	}
}