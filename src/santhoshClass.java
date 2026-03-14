
public class santhoshClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		int a=5;  //a=10
//		int b=10;	//b=5
//		
//		b=a+b; //15
//		a=b-a;  //a=10
//		b=b-a;  //b=5
//		System.out.println(a+"   "+b);
		
		int a=1234; //a=4321
		int reverse = 0;
		while(a>0) {
			int lastNum = a%10; //4
			reverse = reverse*10+lastNum; //4
			a = a/10; //123
		}
		
		System.out.println(reverse);
		
		

	}

}
