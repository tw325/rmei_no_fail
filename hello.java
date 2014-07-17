class hello{
	public void hello1(int n) {
		if (n == 0) {
			System.out.println("Sure come in"); 
		}
		else {
			System.out.println("Knock Knock");
			n= n-1;
			hello1(n);
		}
	}
	public static void main(String[] args){
		hello helloObject = new hello();
		helloObject.hello1(10000000);
	}
}