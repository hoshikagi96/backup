
public class Test {
	public static void main(String[] args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="03-1234-5678";
		taro.address="東京都大田区";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="03-9876-5432";
		jiro.address="東京都板橋区";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="03-8765-4321";
		hanako.address="東京都墨田区";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		Person miho=new Person();
		miho.name="高橋美穂";
		miho.age=22;
		miho.phoneNumber="03-0123-4567";
		miho.address="東京都葛飾区";
		System.out.println(miho.name);
		System.out.println(miho.age);
		System.out.println(miho.phoneNumber);
		System.out.println(miho.address);
	}

}
