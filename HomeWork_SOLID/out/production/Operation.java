public class Operation {
    User user;

    public Operation(User user) {
        this.user = user;
    }

    public void save() {
        Persister persister = new Persister(user);
        persister.save();
    }

    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
