abstract public class Account {
	
	protected int id;
	protected String name;
	private DataSource myData;

	public void performOperation(DataSource _myData){
		myData = _myData;
		myData.execute();
	}
}


public class Admin extends Account{

// A private string specified only with the Admin

private String AuthPassword;

public Admin(int _id, String _name, String _password){

id = _id;

name = _name;

AuthPassword = _password;

}

}


public interface DataSource {

public void execute();

}



public class Delete implements DataSource{


@Override

public void execute() {

System.out.println("Data has been deleted.");

}

}



public class MainApplication {

public static void main(String[] args) {

Admin curAdmin = new Admin(190130, "Sharon", "x11@L42%3");

User curUser = new User(4365, "James");

curAdmin.performOperation(new Update()); // Admin Updates the data.

curUser.performOperation(new View()); // User can view the data.


}

}


public class Update implements DataSource{

@Override

public void execute() {

System.out.println("Data has been Updated Successfuly!");

}

}


public class User extends Account {

public User(int _id, String _name){

id = _id;

name = _name;

}

} 


public class View implements DataSource {

@Override

public void execute() {

System.out.println("Some data to be displayed.");

}

}
