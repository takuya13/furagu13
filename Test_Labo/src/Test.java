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
			System.out.println(i+"�l��");
		    System.out.println("HP�����");
	        hp[i] = s.nextInt();
	        System.out.println("EXP�����");
	        exp[i] = s.nextInt(); 
	        System.out.println("MONEY�����");
	        money[i] = s.nextInt();
	        System.out.println("���O�����");
	        name[i] = s.next();
	        SaveRoad sr = new SaveRoad(hp[1],exp[1],money[1],name[1]);
	        sr.kaki();
 	        System.out.println("�Z�[�u���܂����I");
	        System.out.println("���[�h���܂����H[y/n]");
	        String situ = s.next();
	        if(situ.equals("y")||situ.equals("Y") ){
	        	hp[i] = getHp();
	        	exp[i] = getExp();
	        	money[i] = getMoney();
	        	name[i] = getName();
	        	System.out.println("���[�h���������܂����I");
	        	System.out.println(name[1]); 
	        }else if(situ.equals("n")||situ.equals("N") ){
	        	System.out.println("���[�h���L�����Z�����܂����I");
	        }else{
	        	System.out.println("���[�h�Ɏ��s���܂����I");
	        }
			}
	 }
	 private static int getHp() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			return 0;
	}
	private static int getExp() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 0;
	}
	private static int getMoney() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 0;
	}
	private static String getName() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return null;
	}
	}
