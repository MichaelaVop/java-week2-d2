public class Random {

    public static int getRandom(int... numbers) {
        while (true) {
            int random = (int) Math.round(Math.random() * 54);
            boolean found = false;

            // System.out.println("random " + random);

            for (int number: numbers) {
                if (number == random) {
                    found = true;
                }
            }

            if (!found) {
                return random;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getRandom(1, 2, 3, 4, 5));
        System.out.println(getRandom(1, 2, 3, 4, 5));
        System.out.println(getRandom(1, 2, 3, 4, 5));
        System.out.println(getRandom(1, 7, 10, 2, 9));
        System.out.println(getRandom(1, 7, 10, 2, 9));
    }
}