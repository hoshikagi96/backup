package test1;

public class Ifkiso {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a=10;
		if(a<20){
			System.out.println("A");
		}
		
		int b=20;
		if(b<=30){
			System.out.println("B");
		}
		
		String c="山田";
		if(c.equals("山田")){
			System.out.println(c+"さん");
		}
		
		int a1=5;
		if(a1<10 && 3<a1){
			System.out.println("A");
		}
		
		int a2=5;
		if(a2>=5 || a2<=0){
			System.out.println("B");
		}
		
		int a3=7;
		if(a3>8){
			System.out.println("A");
		}else if(a3<10){
			System.out.println("B");
		}
		
		int a4=11;
		if(a4>8){
			System.out.println("A");
		}else if(a4<10){
			System.out.println("B");
		}
		
		int a5=3;
		if(a5>5){
			System.out.println("A");
		}else{
			System.out.println("Z");
		}
		
		int a6=20;
		if(a6<8){
			System.out.println("A");
		}else if(a6==8){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		
		int a7=18;
		if(a7>=20){
			System.out.println("成人");
		}else{
			System.out.println("未成年");
		}
		
		int age=35;
		if(age<20){
			System.out.println("未成年");
		}else if(age>80){
			System.out.println("高齢者");
		}else{
			System.out.println("成人");
		}
		
	

	}

}
