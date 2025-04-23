public class inverted_star {
    public static void main(String[] args) {
        int n = 17;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <=n-line-2; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
