package member.bean;



public class User {
	//名前とメールアドレスを保持する変数を作成
	private String name;
	private String email;
	
	//コンストラクタ
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	/*
	 * toString()メソッドをオーバーライドして、
	 * 名前とメールアドレスをコンソールに出力するメソッドを作成
	 */
	@Override
	public String toString() {
		return "名前: " + name + "メールアドレス: " + email;
	}
	// ここまで
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		 return this.email;
	}
	
	
}
