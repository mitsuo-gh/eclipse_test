package Person;

public class Main {

	public static void main(String[] args) {
	Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);//コンストラクタに引数で情報を渡している

    System.out.println(person1.fullName());
    System.out.println(person1.age);
    System.out.println(person1.bmi());
	person1.fullName();
	}


}
