package test1;

public class Singleton {
//饿汉模式
	//直接创造对象
	private static Singleton singleton=new Singleton();
	//私有构造函数
	private Singleton() {}
	//返回对象实例
	public static Singleton getInstaance() {
		return singleton; 
	}
	
	
	
}
