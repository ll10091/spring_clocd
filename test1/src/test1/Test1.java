package test1;

public class Test1 {
public static void main(String[] args) {
	char[][] a= {
			{'1','2','3','4'},
			{'5','6','7','8'},
			{'9','1','1','1'}
	};
	//j是外层循环,递增
	//i是内存循环递减
	
	for(int j= 0;j<a[0].length; j++) {
		for (int i = a.length-1; i>=0;i--) {
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
}
}
