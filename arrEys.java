class arrEys {
	public static void main(String[] args){
		int array1[] = new int[100];
		int count = 0;
		while (count < 100) {
			array1[count] = count;
			System.out.println(array1[0]);
			System.out.println(array1[count]);
			count = count + 1;

		}
	}
}
