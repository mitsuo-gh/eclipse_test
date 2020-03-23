package Person;

class Person {
	  public String firstName; //Kate
	  public String lastName;//Jones
	  public int age;//27
	  public double height;//1.6
	  public double weight;//50.0

	  Person(String firstName, String lastName, int age, double height, double weight) {
	    this.firstName = firstName;//インスタンスを生成した際にフィールド変数に引数を代入
	    this.lastName = lastName;//インスタンスを生成した際にフィールド変数に引数を代入
	    this.age = age;//インスタンスを生成した際にフィールド変数に引数を代入
	    this.height = height;//インスタンスを生成した際にフィールド変数に引数を代入
	    this.weight = weight;//インスタンスを生成した際にフィールド変数に引数を代入
	  }
	  
	  // fullNameメソッドを定義してください
	  public String fullName() {
	    return this.firstName + " " + this.lastName;//メソッドを呼び出した際にKate Jonesを戻している
	  }
	  
	  // bmiメソッドを定義してください
	  public double bmi() {
	    return this.weight / this.height / this.height;//メソッドを呼び出した際にbmiを計算した値を戻している
	  }
	  
	}
