// Iterable thingies for java! like with while and for loops yay!
class loop {
	public void countUp(int n){
		// until condition is met the function will continue
		int count=1;
		while (count <= n){
			System.out.println(count);
			count = count + 1;
		}
	}
	public static void main(String[] args){
		loop Count10 = new loop();
		loop Count100 = new loop();
		Count10.countUp(10);
		Count100.countUp(100);
	}
}