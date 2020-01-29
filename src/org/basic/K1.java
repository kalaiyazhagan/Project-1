package org.basic;

public class K1 extends K2{
	public void method2() {
		System.out.println("method2");

	}
	
	
	

	public static void main(String[] args) {
		K1 ob = new K1();
		ob.method2();
		ob.method1();
	}

}
