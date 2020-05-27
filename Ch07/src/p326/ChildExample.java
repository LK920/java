package p326;

import p325.Child;
import p325.Parent;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2 = "data2"   //불가능 가져오는 값이 parent이기에 child에 있는 값은 못가져옴
		 * parent.method3();
		 */
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}

}
