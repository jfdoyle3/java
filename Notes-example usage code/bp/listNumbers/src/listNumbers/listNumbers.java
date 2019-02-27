package listNumbers;

public class listNumbers {
	
	int tNumber=0;
	String sNumber="";
	
	public listNumbers(int numberCount) {
		
		tNumber= numberCount;
	}
	public listNumbers(String numberCount) {
		sNumber=numberCount;
	}
	public void reverseCount() {
		int int1=0;
		int int2=0;
		int int3=0;
		int int4=0;
		int int5=0;
		
		int1=(tNumber%10);
		int2=(tNumber%100)/10;
		int3=(tNumber%1000)/100;
		int4=(tNumber%10000)/1000;
		int5=(tNumber%100000)/10000;
		System.out.println(int1+"\n"+int2+"\n"+int3+"\n"+int4+"\n"+int5+"\n");
	}
	public void reverseCountByString() {
		char p1;
		char p2;
		char p3;
		char p4;
		char p5;
		
		p1=sNumber.charAt(4);
		p2=sNumber.charAt(3);
		p3=sNumber.charAt(2);
		p4=sNumber.charAt(1);
		p5=sNumber.charAt(0);
		System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+p4+"\n"+p5+"\n");
	}
}
	
