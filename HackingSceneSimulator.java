import java.util.Random;

public class HackingSceneSimulator {
    // ANSI escape codes för färger
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int delay = 10; // Millisekunder för fördröjning mellan varje tecken
        int charLength = 1000;

        if (args.length > 1 && args[1] != null) {
            // Försök konvertera strängen till ett heltal
            try {
                charLength = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                // Om strängen inte kan konverteras till ett heltal, hantera felet här
                System.out.println("Det andra kommandoradsargumentet är inte ett heltal.");
            }
        }

        System.out.println(ANSI_CYAN + "\nInitiating hack..." + args[0] + "\n" + ANSI_RESET);

        for (int i = 0; i < charLength; i++) {
            char randomChar = (char) (random.nextInt(94) + 33); // Slumpmässigt tecken mellan ASCII 33 och 126
            System.out.print(ANSI_GREEN + randomChar + ANSI_RESET);
            Thread.sleep(delay);
        }

        System.out.println(ANSI_CYAN + "\n\nHack complete!\n" + ANSI_RESET);
    }
}