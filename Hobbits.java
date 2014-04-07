class Hobbits {

	String name1;
	
	public static void main (String [] args) {
		Hobbits [] h = new Hobbits[3];
		int z = -1;

				
	while (z < 2) {
			z = z + 1;
			h[z] = new Hobbits ();
			h[z].name1 = "bilbo";
			
			if (z == 1) {
				h[z].name1 = "froto";	
				
			}

			if (z == 2) {
				h[z].name1 = "sam";
			}
			
			System.out.print (h[z].name1 +" is a ");
			System.out.println("good Hobbit name");
			
	}
	}
}
