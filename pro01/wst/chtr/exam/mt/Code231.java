package chtr.exam.mt; 
       class Data<T extends Number>{
     T obj;
     Data(T ob){
    	 obj = ob;
     }
     int calMultiple(int n) {
    	 return obj.intValue()*n;
     }
     }


public class Code231 {

	public static void main(String[] args) {
		Data<Integer> d = new Data<Integer>(100);
		int result = d.calMultiple(5);
		System.out.println(result);
		
		Data<Double> e = new Data<Double>(17.5);
		int result2 = e.calMultiple(5);
		System.out.println(result2);

	}

}
