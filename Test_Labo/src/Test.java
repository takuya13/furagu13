import java.util.Scanner;


public class Test {
	 public static void main(String[] args){
		 int nin = 5;
		 Scanner s  = new Scanner(System.in);
		    int hp[]=new int[nin];
			int exp[]=new int[nin];
			int money[]=new int[nin];
			String name[] =new String[nin] ;
			
			for(int i = 1 ; i < nin ; i++){
			System.out.println(i+"人目");
		    System.out.println("HPを入力");
	        hp[i] = s.nextInt();
	        System.out.println("EXPを入力");
	        exp[i] = s.nextInt(); 
	        System.out.println("MONEYを入力");
	        money[i] = s.nextInt();
	        System.out.println("名前を入力");
	        name[i] = s.next();
	        SaveRoad sr = new SaveRoad(hp[1],exp[1],money[1],name[1]);
	        sr.kaki();
 	        System.out.println("セーブしました！");
	        System.out.println("ロードしますか？[y/n]");
	        String situ = s.next();
	        if(situ.equals("y")||situ.equals("Y") ){
	        	hp[i] = getHp();
	        	exp[i] = getExp();
	        	money[i] = getMoney();
	        	name[i] = getName();
	        	System.out.println("ロードが完了しました！");
	        	System.out.println(name[1]); 
	        }else if(situ.equals("n")||situ.equals("N") ){
	        	System.out.println("ロードをキャンセルしました！");
	        }else{
	        	System.out.println("ロードに失敗しました！");
	        }
			}
	 }
	 private static int getHp() {
			// TODO 自動生成されたメソッド・スタブ
			return 0;
	}
	private static int getExp() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	private static int getMoney() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	private static String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	}
