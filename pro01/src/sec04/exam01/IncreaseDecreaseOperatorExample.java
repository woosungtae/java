package sec04.exam01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x= 10;
		int y= 10;
		int z;
		
		System.out.println("-------------");
		x++;
		++x;
		System.out.println("x="+x);
		//x 12
		System.out.println("-------------");
		y--;
		--y;
		System.out.println("y="+y);
		//y 8
		System.out.println("-------------");
		z = x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("-------------");
		z=++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("-------------");
        z= ++x + y++;
        System.out.println("z="+z);
        System.out.println("x="+x);
        System.out.println("y="+y);
	}

}
