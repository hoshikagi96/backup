package test1;

public class Hairetsu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] name=new String[3];
		
		name[0]="田中";
		name[1]="高橋";
        name[2]="斉藤";
        System.out.println(name[0]);
	
	
	    char[] c={'x','y','s'};
	    System.out.println(c[1]);
	    
	    int[] i={1,5,10};
	    System.out.println(i[0]);
	    
	    name[2]="加藤";
	    System.out.println(name[2]);
	    
	    String[][] country=
	    	{
	    			{"日本","タイ"},
	    			{"アメリカ","ブラジル"},
	    			{"フランス","ロシア"}
	    	};
	    System.out.println(country[1][1]);
	}
}
