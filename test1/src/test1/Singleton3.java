package test1;

public class Singleton3 {
	//声明变量
	private static Singleton singleton=null;
	//构造私有函数
	private Singleton3() {}
	//提供处理方法
	public static Singleton getInstance() {
		if(singleton==null) {
			Singleton3 singleton3 = new Singleton3();
		
		}
		return singleton;
	}
}
