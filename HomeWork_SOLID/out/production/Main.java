public class Main {
	public static void main(String[] args) {
		User user = new User("Bob");
		Operation operation = new Operation(user);
		operation.report();
		operation.save();
	}
}