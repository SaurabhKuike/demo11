package saw;
class Animal {
	void display2() {
		System.out.println("i am an animal");
	}
}
class Dog extends Animal{
	void display1() {
		System.out.println("i am a dog");
	}
}
class labrador extends Dog{
	void display() {
		System.out.println("i am a labrador");
	}
}
public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
labrador t= new labrador();
t.display();
t.display2();
t.display2();
	}
