
public class main {
	public static void main(String[] args) {
		double x = Double.MAX_VALUE;
		double x1 = x - 0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000001;
		double x2 = x + 0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000001;
		double y1 = x1/(x1+2);
		double y2 = x2/(x2+2);
		double result = (y1+y2)/2;
		System.out.print(result);
	} 
}
