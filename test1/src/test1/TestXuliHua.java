package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestXuliHua {
	public static void main(String[] args) throws Exception {
		Peson peson = new Peson("李锐", 22);
		File file = new File("D:/dfg");
		if(!file.exists()) {
			file.mkdir();
		}
		ObjectOutputStream Out = 
				new ObjectOutputStream(new FileOutputStream("D:/dfg/f1.txt"));
				Out.writeObject(peson);
				Out.close();
		
		ObjectInputStream In =
				new ObjectInputStream(new FileInputStream("/dfg/f1.txt"));
		System.out.println(In.readObject());
		In.close();
		
	}
}
