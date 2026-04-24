public class VariableScope {
    public static void main(String args[]) {
        int i = 10;
        int k = 10;
        {
            k = 10;
            System.out.println("i=" + i);
            System.out.println("k=" + k);
        }
        System.out.println("i=" + i);
        System.out.println("k=" + k);
    }
}
