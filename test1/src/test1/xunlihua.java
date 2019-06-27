package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class xunlihua {
	public static void main(String[] args) throws Exception {
		Peson peson = new Peson("张三", 18);
		
		File file = new  File("d:/abc");
		if(!file.exists()) {
			file.mkdirs();
		}
		ObjectOutputStream Out =
				new ObjectOutputStream(new FileOutputStream("d:/abc/f3.txt"));
		Out.writeObject(peson);
		Out.close();
		ObjectInputStream In = 
				new ObjectInputStream(new FileInputStream("d:/abc/f3.txt"));
		System.out.println(In.readObject());
		In.close();
	}
	
}
