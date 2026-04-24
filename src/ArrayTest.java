public class ArrayTest {
    public static void main(String[] args) {
        int i, j, l;
        int[] a = {2, 1, 4, 8, 9, 5, 3};
        for (i = 0; i < a.length - 1; i++) {
            int k = i;
            for (j = i; j < a.length; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            int temp = a[i];
            a[i] = a[k];
            a[k] = temp;

            System.out.printf("i=%d,j=%d,k=%d\t", i, j, k);
            for (l = 0; l < a.length; l++)
                System.out.print(a[l] + "  ");
            System.out.println();
        }
    }
}
