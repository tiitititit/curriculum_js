package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import member.bean.AdminUser;
import member.bean.GeneralUser;
import member.bean.User;

public class Main {
	//ユーザーを保持するリスト
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("1. 一般ユーザーを登録");
            System.out.println("2. 管理者ユーザーを登録");
            System.out.println("3. ユーザー情報を表示");
            System.out.println("4. 終了");
            System.out.print("選択してください: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // 改行文字を消費
           
            switch (choice) {
            case 1:
                registerGeneralUser(scanner);
                break;
            case 2:
                registerAdminUser(scanner);
                break;
            case 3:
                findUsers();
                break;
            case 4:
                keepRunning = false;
                break;
            default:
                System.out.println("無効な選択です。");
        }
    
         }
        

        scanner.close();
    }

    // 一般ユーザーを登録するメソッド
    public static void  registerGeneralUser(Scanner scanner) {
    	System.out.println("名前を入力してください");
    	String inputName = scanner.next();
    	
    	System.out.println("メールアドレスを入力してください");
    	String inputEmail = scanner.next();
    	
    	GeneralUser generalUser = new GeneralUser(inputName, inputEmail);
    	users.add(generalUser);//リストに一般ユーザーを登録
    	System.out.println("一般ユーザーが登録されました。");
    	
    
    }

    // 管理者ユーザーを登録するメソッド
    
    public static void registerAdminUser(Scanner scanner) {
    	System.out.println("名前を入力してください");
    	String inputName = scanner.next();
    	
    	System.out.println("メールアドレスを入力してください");
    	String inputEmail = scanner.next();
    	
    	System.out.println("管理者コードを入力してください");
    	String inputAdminCode = scanner.next();
    	
    	AdminUser adminUser = new AdminUser(inputName, inputEmail, inputAdminCode);
    	users.add(adminUser);//リストに管理者ユーザーを追加
    	System.out.println("管理者ユーザーが登録されました。");
    }

    // メールアドレスが既に登録されているか確認するメソッド
    public static boolean emailRegistered(String email) {
    	if(email == null) {
    		System.out.println("メールアドレスは登録されていません。");
    		return false;
    	}
		
    		
    }			
    		
    		
    	

    

    // 登録されたユーザーを表示するメソッド
    public static void findUsers() {
    	System.out.println("登録されたユーザーを表示します");
    	for(User user : users) {
    		System.out.println(user);
    	}
    	
    }
}

