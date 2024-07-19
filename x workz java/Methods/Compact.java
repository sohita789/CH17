class Compact {

    public static void wa(String[] args) {
        printMessage("Hello, World!");
    }

    public static void printMessage(String message) {
        if (message == null) {
            System.out.println("Message is null.");
            return; 
        }

        System.out.println(message);
    }
}
   