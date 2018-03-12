public class Main {

    public static void main(String[] args) {
        breaker();
    }

    public static void gotoLabel() {
        gotoJava:
        for (int i = 0; i < 10; i++) {
            innerGotoJava:
            for (int j = 0; j < 10; j++) {
                System.out.println(j + "");
                if(j > 5) {
                    continue gotoJava;
                    //   break innerGotoJava;
                }
            }
        }

        http://www.guigarage.com
        System.out.println("");
    }


    public static void testSomething() {
        int i = 0;

        given:
            i = 1;

        when:
            i ++;

        then:
            assert i == 1;
    }

    public static void breaker() {
        breakable: {
            System.out.println(1 + "");
            System.out.println(2 + "");
            if(true) {
                break breakable;
            }
            System.out.println(3 + "");
        }
        System.out.println(4 + "");
    }
}
