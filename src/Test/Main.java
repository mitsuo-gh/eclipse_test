package Test;

import java.util.Scanner;//javaパッケージのインポート

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scannerのインスタンス化
        int A = sc.nextInt();//入力した値をAに代入
        int B = sc.nextInt();//入力した値をBに代入
        int C = sc.nextInt();//入力した値をCに代入

		if (A == 5 && B == 7 && C == 5) { //5,7,5全3パターンの条件分岐
			System.out.println("YES"); //条件がtrueだった場合に実行する出力内容
		} else if (A == 5 && B == 5 && C == 7) {
			System.out.println("YES");
    	} else if (A == 7 && B == 5 && C == 5) {
    		System.out.println("YES");
		} else {
			System.out.println("NO");
		}
    }
}

//A & B = 5 の時 C = 7
//A & C = 5 の時 B = 7
//B & C = 5 の時 A = 7
