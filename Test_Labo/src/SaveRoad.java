import java.util.Scanner;


public class SaveRoad {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int hp;
		int exp;
		int money;
		String name;
		
		System.out.println("HP:");
        hp = s.nextInt();
        System.out.println("EXP:");
        exp = s.nextInt(); 
        System.out.println("MONEY:");
        money = s.nextInt();
        System.out.println("NAME:");
        String a = s.nextLine();
        System.out.println("セーブしました");
        System.out.println("ステータスの初期化");
        System.out.println("-----------ステータス-----------");
        System.out.println("HP:");
        hp = s.nextInt();
        System.out.println("EXP:");
        exp = s.nextInt(); 
        System.out.println("MONEY:");
        money = s.nextInt();
        System.out.println("NAME:");
        String b = s.nextLine();
        System.out.println("ロードしますか？[y/n]");
        System.out.println("ロードの完了");
        System.out.println("-------------ステータス-----------");
        System.out.println("HP:");
        hp = s.nextInt();
        System.out.println("EXP:");
        exp = s.nextInt(); 
        System.out.println("MONEY:");
        money = s.nextInt();
        System.out.println("NAME:");
        String c = s.nextLine();
		}

	}
