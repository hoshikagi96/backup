package test1;

public class Switch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a=3;
		switch(a){
		case 0:
			System.out.println("aは0に等しい");
			break;
			
		case 1:
			System.out.println("aは1に等しい");
			break;
		
		default:
			System.out.println("aは0でも1でもない");
		}
		
		
		String b="赤";
		switch(b){
		case "赤":
			System.out.println("赤組です");
			break;
		
		case "白":
			System.out.println("白組です");
		}

	}

}
