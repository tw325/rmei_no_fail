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
}