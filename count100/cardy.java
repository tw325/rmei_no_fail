class cardy {
	// This will acureately count to cardie's death
	/* Ready!
       Recursive Function:
       has a base case && recursive function
       WE WANT A COUNTDOWN:
        SO WE START FROM 100 TO 1 :^)
        */
	public void diecardy(int n){
		if (n == 1) {
			System.out.println("Yay!" + n);

		}
		else {
			System.out.println("Day"+ n +"He's still alive :*(");
			n = n - 1;
			diecardy(n);
		}
	} 
	public static void main(String[] args){
		//instantiate cardy
		cardy newCardy = new cardy();
		newCardy.diecardy(100);

	}

}