public class TestReference {
    public static void main(String[] args) {
        int x = 2;
        TestReference tr = new TestReference();
        System.out.print(x);
        tr.change(x);
        System.out.print(x);
    }

    public void change(int num) {
        num = num + 1;
    }

}
