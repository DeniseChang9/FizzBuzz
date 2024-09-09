public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int n = 0;
        while (i < 1000){
            if (i % 3 == 0) {
                n++;
            }
            else if (i % 5 == 0) {
                n++;
            }
            i++;
        }
        System.out.println(n);
    }
}
