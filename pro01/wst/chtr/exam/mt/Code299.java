package chtr.exam.mt;



class Data2<T>{
	T obj;
	Data2(T ob) {
		obj = ob;
	}
	T getObj() {
		return obj;
	}
	void showType() {
		System.out.println("Type of T: " + obj.getClass().getName());
	}
}
public class Code299 {

	public static void main(String[] args) {
		Data2<Integer> d1 = new Data2<Integer>(100); 
		System.out.println(d1.getObj());
		d1.showType();
		
		Data2<String> d2= new Data2<String>("JAVA");
		System.out.println(d2.getObj());
		d2.showType();
		
		Data2<Double> d3 = new Data2<Double>(5.3);
		System.out.println(d3.getObj());
		d3.showType();
	}
	}