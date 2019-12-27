public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.print(" HelloWorld ");
                } else {
                    System.out.print(" Hello ");
                }
            } else if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.print("HelloWorld");
                }
                System.out.print(" World ");
            } else {
                System.out.print(i + " ");
            }

        }
    }
}
