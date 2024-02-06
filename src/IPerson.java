interface IPerson {
    void myAbstract();

    default void myDefault() {
        System.out.println("From default method.");
    }

    static void myStatic() {
        System.out.println("From static method.");
    }
}

