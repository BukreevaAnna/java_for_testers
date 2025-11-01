public class Hello {
    public static void main(String[] args) {
            var x = 1;
            var y = 0;
            if (y == 0) {
                System.out.println("Нельзя");
            } else {
                var z = experement(x, y);
                System.out.println("good job");
            }
    }

    private static int experement(int x, int y) {
        var z = x / y;;
        return z;
    }

}
