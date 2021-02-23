package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();  //재정의된 메소드가 호출됨
		//parent.method3(); Parent 객체에서 method3() 정의 X 따라서 실행 X

	}

}
