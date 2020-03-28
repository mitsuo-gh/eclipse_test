package Test;
//
//import java.util.Scanner;//javaパッケージのインポート
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //scannerのインスタンス化
//        int A = sc.nextInt(); //入力した値をAに代入
//        int B = sc.nextInt(); //入力した値をBに代入
//        int C = sc.nextInt(); //入力した値をCに代入
//
//		if (A == 5 && B == 7 && C == 5) { //5,7,5全3パターンの条件分岐
//			System.out.println("YES"); //条件がtrueだった場合に実行する出力内容
//		} else if (A == 5 && B == 5 && C == 7) {
//			System.out.println("YES");
//    	} else if (A == 7 && B == 5 && C == 5) {
//    		System.out.println("YES");
//		} else {
//			System.out.println("NO");
//		}
//    }
//}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//A & B = 5 の時 C = 7
//A & C = 5 の時 B = 7
//B & C = 5 の時 A = 7

import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
	  System.out.println("start");

	// やること
//	  標準入力の数字をList型に入れる

	  Scanner sc = new Scanner(System.in);
	  int A = sc.nextInt();
	  int B = sc.nextInt();
	  int C = sc.nextInt();

	  List<Integer> array= new ArrayList<>();
	  array.add(A);
	  array.add(B);
	  array.add(C);

	  Map<Integer, Integer> map = new HashMap<>();

	  for (int i = 0; i < 3; i++) {//
		  int v = array.get(i);//リストの数値一つずつvに入れる
		  if (!map.containsKey(v)) {//falseだった場合にvalueに1を入れる
			  map.put(v, 1);
		  } else {
			  map.put(v, map.get(v) + 1);//valueに＋1している
		  }
		  
	  }

	  if (map.get(5) == 2 && map.get(7) == 1) {
		  System.out.println("YES");
	  } else {
		  System.out.println("NO");
	  }

	  

//	  Map<Integer, Integer> map = new HashMap<>();
//      map.put(v, 1);
//      map.put(v, );
//      map.put(v, );
//      System.out.println(map);
//      System.out.println(map.get(A));

//      for(int i = 0; i < 3; i++) {
//    	  if (map[0] == 5) {
//    	  }
//      }



//	  List型の数字を一つずつ取り出し、Mapにいれる



//	  Mapの中身を見て、YESNOを標準出力に出力する






//
//    for (int i = 0; i < map.length; i++) {
//    	if (map(i) == 7) {
//
//    	}
//    }
  }
}
