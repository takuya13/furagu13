



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.imageio.stream.FileImageInputStream;
import javax.management.ObjectInstance;


public class Status {
	
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
	
	Status(){
		try {
			ObjectInputStream objI = new ObjectInputStream(new FileInputStream("SaveRoaddate.save"));
			SaveRoad sr = (SaveRoad)objI.readObject();
			objI.close();
			hp = getHp();
			exp = getExp();
			money = getMoney();
			name = getName();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
