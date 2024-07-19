package thread;

public class PrintString {

    static {
        System.out.print("Hi ");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("/b How are you? ");
        }));

        //Runtime.getRuntime().
    }


    public static void main(String[] args) {
        System.out.println("Bijesh");
    }
}
