public class Main2 {
    public static void main(String[] args) {
        int a = 256, b = 99, c = 999, d = 1;
        int max_ab = (a > b) ? a : b;
        int max_cd = (c > d) ? c : d;
        int final_max = (max_ab > max_cd) ? max_ab : max_cd;
        System.out.println("final_max=" + final_max);
    }
}
