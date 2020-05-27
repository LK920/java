package p401;

public class Outter {
	public String field =  "Outter=field";
	public void method() {
		System.out.println("Otter-method");
	}
	public class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested=method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}

}
