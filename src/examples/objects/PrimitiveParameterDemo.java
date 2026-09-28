package examples.objects;

public class PrimitiveParameterDemo {
    public static void main(String[] args) {
        int x = 2;
        PrimitiveParameterDemo tr = new PrimitiveParameterDemo();
        System.out.print(x);
        tr.change(x);
        System.out.print(x);
    }

    public void change(int num) {
        num = num + 1;
    }

}
