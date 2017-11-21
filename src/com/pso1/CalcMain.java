package com.pso1;

public class CalcMain {

	public static void main(String[] args){
		if(args.length == 0) {
		System.out.println("<数値1> <演算子> <数値2>");
		}
		int x = 0, z = 0;
		String y = null;
		System.out.print(args[0] + " " + args[1] + " " + args[2] + " = ");
		try {
			x = Integer.parseInt(args[0]);
			z = Integer.parseInt(args[2]);
			y = args[1];
			int n = Calc(x, y, z);

			System.out.print(n);
		}catch(ArithmeticException e) {
			System.out.print("/ by zero");
		}catch(NumberFormatException e) {

			System.out.println(e.getMessage());

		}catch(CalcException e) {
			if(e.getErrCode() == 100) {
				System.out.print("不正な演算子です");
			}else if(e.getErrCode() == 101) {
				System.out.print("計算結果が範囲外です");
			}
		}
	}



	public static int Calc(int a, String b, int c) throws CalcException{
			int result = 0;
			switch(b) {
				case "+" :
					result = a + c;
					break;
				case "-" :
					result = a - c;
					break;
				case "x" :
					result = a * c;
					break;
				case "/" :
					result = a / c;
					break;
				default :
					throw new CalcException("不正な演算子です",100);
			}
			if(result < 0 || result > 255){
				throw new CalcException("計算結果が範囲外です",101);
			}

			return result;
	}
}
