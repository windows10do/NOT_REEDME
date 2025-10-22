public class Stranger {

    private final String name;

    public Stranger(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return false; // Denies its own identity
    }

    @Override
    public String toString() {
        return "Stranger named " + name;
    }

    public static void main(String[] args) {
        Stranger s = new Stranger("Echo");

        System.out.println("Object: " + s);
        System.out.println("Does the object equal itself? " + s.equals(s));

        Stranger s2 = s;
        System.out.println("Does the object equal its alias? " + s.equals(s2));
        System.out.println("Reference equality (s == s2): " + (s == s2));
    }
}
