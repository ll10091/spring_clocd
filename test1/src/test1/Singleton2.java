package test1;

public class Singleton2 {
	//懒汉模式
	
	//声明变量
	private static volatile Singleton singleton=null;
	
	//私有构造函数
	private Singleton2() {}
	
	//提供处理方法
	public static Singleton getInstance() {
		if(singleton==null) {
		synchronized (Singleton.class) {
			if(singleton==null) {
				Singleton2 singleton = new Singleton2();
			}
		}
		}
		return singleton;
	}
}
