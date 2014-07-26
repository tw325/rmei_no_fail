class sum1 {
	public int sumArray(int[] x){
		if (x.length == 0){
			return 0;
		} 
		if (x.length == 1){
			return x[0];
		} else {
			return x[0] + x[1];
		}
	}

	public static void main(String[] args){
		sum1 test1 = new sum1();
		int[] teaching = new int[3];
		teaching[0]= 2;
		teaching[1]= 1;
		teaching[2]= 10; 
		System.out.println(test1.sumArray(teaching));
	}
}