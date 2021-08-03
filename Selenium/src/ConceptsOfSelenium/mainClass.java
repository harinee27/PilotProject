package ConceptsOfSelenium;

public class mainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
		/*basicConcepts basics = new basicConcepts();
		basics.test();*/
			driverCommands dc = new driverCommands();
			dc.drivers();
		}
		catch(Exception e){
			System.out.println("Exception is catched");
		}
	}
}
