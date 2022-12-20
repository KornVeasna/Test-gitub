public class MyClass {
    int age;
    String name;

    public MyClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:" + name + "\nage:" + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass) {
            MyClass m = (MyClass) obj;
            return age == m.age && name.equals(m.name);
        }
        return false;
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass(20, "sna");
        MyClass mc2 = new MyClass(20, "sna");
        System.out.println("mc == m2?" + mc.equals(mc2));
    }
}