public class Main {
    public static void main(String[] args) {
        CustomList<User> user = new CustomList<>();
        user.add(new User("oleg", "smirnov"));
        user.add(new User("alex", "popov"));
        user.add(new User("ivan", "ivanov"));
        user.add(new User("ivan", "ivanov"));
        user.add(new User("ivan", "ivanov"));
        user.add(new User("oleg", "smirnov"));

        for (Node<User> node : user) {
            System.out.println(node.getData());
        }

    }
}
