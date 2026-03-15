import java.util.LinkedHashMap;
import java.util.Map;

public class XavierSirExe {



	public static void main(String[] args) {
		
		XavierSirExe exe1=new XavierSirExe();
		exe1.leftStarTriangle();
		exe1.leftNumTriangle();
		exe1.numRev();
		exe1.letterCount();

	}
	
	private void leftStarTriangle() {
		
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=k;j++) {
				System.out.print("*");
			}
			k++;
			System.out.println();
		}

	}
	
private void leftNumTriangle() {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

//private void pyramidPattern() {
//	
//	int rows = 5;
//	
//	for(int i=0;i<rows;i++) {
//		
//		for(int j=i;j<rows;j++)
//	}
//
//}

private void numRev() {
	
	for(int i=5;i>0;i--) {
		for(int j=i;j>0;j--) {
			System.out.print(j);
		}
		System.out.println();
	}

}

private void letterCount() {
	
	String value = "Hippopotamaus";
	Map<Character, Integer>mp = new LinkedHashMap<>();
	for(int i=0;i<value.length();i++) {
		char c = value.charAt(i);
		if(mp.containsKey(c)) {
			Integer count = mp.get(c);
			mp.put(c, count+1);
		}
		else {
			mp.put(c, 1);
		}
	}
	System.out.println(mp);
	

}

}
