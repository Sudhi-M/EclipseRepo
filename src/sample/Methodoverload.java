package sample;

class Test {
	void main() {
		System.out.println("programming languages");
	}

	void main(int id) {

		System.out.println("id should be :" + id);
	}

	void main(String name, int rollno) {

		System.out.println("Record of : " + name + " : roll no is : " + rollno);
	}
}

public class Methodoverload {
	public static void main(String[] args) {
		Test t = new Test();
		t.main();
		t.main(35);
		t.main("Lavanya", 1010);
	}
}
