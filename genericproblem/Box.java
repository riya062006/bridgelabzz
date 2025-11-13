class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println("Integer Box: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello Riya");
        System.out.println("String Box: " + strBox.get());

        Box<Double> dblBox = new Box<>();
        dblBox.set(9.8);
        System.out.println("Double Box: " + dblBox.get());
    }
}
