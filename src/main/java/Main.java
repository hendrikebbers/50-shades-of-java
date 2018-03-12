public class Main {

    public static void main(String[] args) {
        $.addShutdownHook(() -> System.out.println("TSCHÜSSSSS"));

        $.addShutdownHook(() -> {
            $.sleep(2_000);
            System.out.println("TSCHÜSSSSS");
        });

        $.addShutdownHook(() -> {
            while (true) {}
        });

        $.addShutdownHook(() -> {
           System.exit(900);
        });

        System.out.println("HUHU");
    }

}
