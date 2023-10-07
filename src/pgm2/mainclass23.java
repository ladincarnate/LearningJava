package pgm2;
import shapes.*;
import shapes.circle;
import shapes.square;
public class mainclass23 {

	public static void main(String[] args) {
		square sq=new square(5);
		System.out.println("the arera of square is"+sq.area());
		circle c=new circle(5);
		System.out.println("the area os circle is"+c.area());
	}

}
