import java.util.ArrayList;

public class exercicio {
	
	public static void main (String[] args) {
		
		//new exercicio().q1();
		new exercicio().q2();
		//new exercicio().q3();
		//new exercicio().q4();
		//new exercicio().q5();
		//new exercicio().q6();
		//new exercicio().q7();
		//new exercicio().q8();
	}
	public void q1() {
		int n1 = 103;
		int n2 = 2;
		int result = 0; 
		
		for(int cont = n2; cont > 0; cont--) {
			result +=n1;
		}
		System.out.println(result);		
	}
	
	public void q2() {
		int n1 = 10;
		int n2 = 4;
		int result = 0;
		int count = n1;
		
		while(count > 0) {
			count -= n2;
			result++;
			
		}
		System.out.println(result);
	}
	
	public void q3(){
		int n1 = 10;
		int n2 = 2;
		
		for(int i = n2; i > 1; i--) {		
			n1 *= n1;
		}
			System.out.println(n1);
		
	}

	public void q4(){
		String numero = "1234";
		
		for(int i = numero.length() - 1; i >= 0; i--) {
		 numero.charAt(i);
			System.out.print(numero.charAt(i));
			
		}	
}
	public void q5() {
		int n1 = 13;
		
		if(n1 % n1 == 0 && n1 % 1 == 0 && n1 % 2 != 0) {
		System.out.println(1);	
			
		}else  {
			System.out.println(0);
		}
	}
	
	public void q6() {
		int n1 = 10;
		
		for(int i = n1 - 1; i > 1; i--) {
			n1 *= i; 
			
		}
		System.out.println(n1);
	}
	
	public void q7() {
		
		String p = "ovo";
		int count = 0;
		int i = 0;
		int e = p.length() - 1;
		
		while(i <= p.length() - 1) {		
			
			char c1 = p.charAt(i);
			char c2 = p.charAt(e);
			e--;
			i++;
			
			if (c1 == c2) {
				count++;
				
			}		
		}
	
		if(count == p.length()) {
			
			System.out.println("ok");
		}else {
			System.out.println("NO");
		}
}
	public void q8() {
		
		String p = "cat";
		ArrayList<String> l = new ArrayList<String>();
		
	for(int e = p.length() - 1; e > 0; e--) {
		
		for(int i = 0; i < p.length() - 1; i++) {
			

			
		}
	}
	
	}
	
	public void q9() {
		
		
	}
	
	public void q10() {
		
		
	}
}