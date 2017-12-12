
public class BinaryExponentiation {
	
	public static Integer calc(int base, int exp) {
		if(exp == 0) {
			return 1;
		}else if(exp%2 == 0) {
			return calc(base*base, exp/2);
		}else {
			return base*calc(base*base, (exp-1)/2);
		}
	}
	
	public static Integer modularCalc(int base, int exp, int m) {
		if(exp == 0) {
			return 1;
		}else if(exp%2 == 0) {
			return modularCalc(base*base%m, exp/2, m);
		}else {
			return base*modularCalc(base*base%m, exp/2, m);
		}
	}

	public static void main(String[] args) {
		System.out.println(calc(2,8));;
		System.out.println(modularCalc(2, 8, 7));
	}

}
