package day0202.HW;

import java.util.Random;

public class Gugudan {
	
	public String gugudan(int num) throws RangeException {
		StringBuilder sb = new StringBuilder();
		
		if(num < 2 || num > 9) {
			throw new RangeException();
		}	// end if
		
		for(int i = 1; i < 10; i++) {
			sb.append(num).append("*").append(i).append("=").append(num*i).append("\n");
		}	// end for
		
		String result = sb.toString();
		
		return result;
	}	// Gugudan

	public static void main(String[] args) {
		Gugudan ggd = new Gugudan();
		
		try {
			String ggdResult = ggd.gugudan(new Random().nextInt(15));
			System.out.print(ggdResult);
		} catch (RangeException re) {
			re.printStackTrace();
		}	// end catch
	}	// main

}	// class