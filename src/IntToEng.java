import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {
    	while(true){
        Scanner sc = new Scanner(System.in);
        System.out.print("input=");
        int input = sc.nextInt();
        System.out.println(translateEng(input));
        System.out.print("終了しますか(y/n)");
        String ans=sc.next();
        if(ans.startsWith("y")) break;
    	}

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String eng;
    	if(n==0)eng="zero";
    	else if(n==1)eng="one";
    	else if(n==2)eng="two";
    	else if(n==3)eng="three";
    	else if(n==4)eng="four";
    	else if(n==5)eng="five";
    	else if(n==6)eng="six";
    	else if(n==7)eng="seven";
    	else if(n==8)eng="eight";
    	else if(n==9)eng="nine";
    	else if(n==10)eng="ten";
    	else if(n==11)eng="eleven";
    	else if(n==12)eng="twelve";
    	else if(n==13)eng="thirteen";
    	else if(n==14)eng="fourteen";
    	else if(n==15)eng="fifteen";
    	else if(n==16)eng="sixteen";
    	else if(n==17)eng="seventeen";
    	else if(n==18)eng="eighteen";
    	else if(n==19)eng="nineteen";
    	else if(n==20)eng="twenty";
    	
    	else eng="翻訳できません";
        return eng;
    }
}