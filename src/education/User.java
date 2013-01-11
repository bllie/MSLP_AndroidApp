package education;

/**
 * User of Application. Teacher.
 * @author Павел
 */
public class User {
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}

	public User(String newName, String newPassword) {
		name = newName;
		password = newPassword;
	}
}