class Programs {
    public static void main(String[] args) {
        Person p1 = new Person("Roger");
        Person p2 = new Person("Tom");
        Person p3 = new Person("Bob");
        Person p4 = new Person("Mark");

        Queue<Person> q = new Queue<Person>();
        q.enque(p1);
        q.enque(p2);
        System.out.println(q.front());
        System.out.println(q.front());
        q.enque(p3);
        q.enque(p4);

        System.out.println(q.front());
        System.out.println(q.front());
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}