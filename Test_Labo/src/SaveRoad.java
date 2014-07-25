import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SaveRoad implements Serializable{
	int hp;
	int exp;
	int money;
	String name;
	
	public int getHp() {
		return hp;
	}

	public int getExp() {
		return exp;
	}

	public int getMoney() {
		return money;
	}
	public String getName(){
		return name;
	}

	SaveRoad(int hp,int exp,int money,String name){
		this.hp = hp;
		this.exp = exp;
		this.money = money;
		this.name = name;
	}
	
	void kaki(){
		try {
			ObjectOutputStream objO = new ObjectOutputStream(new FileOutputStream("SaveRoaddate.save"));
			
			objO.writeObject(new SaveRoad(hp,exp,money,name));
			
			objO.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
