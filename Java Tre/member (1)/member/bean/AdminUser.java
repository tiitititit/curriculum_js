package member.bean;

public class AdminUser extends User{
	//管理者コードを保持する変数
	private String adminCode;
	
	//コンストラクタ
	public AdminUser(String name, String email, String adminCode) {
		super(name, email);//親のコンストラクタ
		this.adminCode = adminCode;//管理者コードの設定
	}
	
	// toString()メソッドのオーバーライド
	@Override
	public String toString() {
		return "管理者ユーザー: 名前: " + getName() + "メールアドレス:" + getEmail() + adminCode;
	}
}
