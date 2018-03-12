public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("1");
            throw new Exception("ARGH!");
        } finally {
            System.out.println("2");
            return;
        }
    }

}
