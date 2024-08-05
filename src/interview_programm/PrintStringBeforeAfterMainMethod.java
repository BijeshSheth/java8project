package interview_programm;

public class PrintStringBeforeAfterMainMethod {

    static {
        System.out.print("Hi ");

        Runtime.getRuntime().addShutdownHook(new Thread(()->
                System.out.print(" How are you?")
        ));
    }

    public static void main(String[] args) {

        System.out.print("Bijesh");
    }
}
