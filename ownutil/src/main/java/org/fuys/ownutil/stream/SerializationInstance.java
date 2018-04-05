package org.fuys.ownutil.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Kitchen implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4679286262276931096L;
	private double weight;
	private transient boolean sex;
	public Kitchen(double weight, boolean sex) {
		super();
		this.weight = weight;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Kitchen [weight=" + weight + ", sex=" + sex + "]";
	}
}


public class SerializationInstance {

	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
		
		File file = new File("e:\\fuys.txt");
		if(file.exists()==false){
			file.createNewFile();
		}
		Kitchen kitchen = new Kitchen(15, true);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(kitchen);
		oos.close();
		
		Thread.sleep(2000);
		
		if(file.exists()){
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Object obj = ois.readObject();
			if(obj!=null){
				if(obj instanceof Kitchen){
					System.out.println((Kitchen)obj);
				}
			}
			ois.close();
		}
		
	}

}
