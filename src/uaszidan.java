import java.util.ArrayList;
import java.util.Random;

public class uaszidan {

    public static void main(String[] args) {
        ArrayList<Integer> speeds = generateSpeeds(200);

        System.out.println("Daftar kecepatan di antara 80 - 100 km/jam:");
        displaySpeedInRange(speeds, 80, 100);

        System.out.println("\nDaftar kecepatan di bawah 80 km/jam:");
        displaySpeedBelowRange(speeds, 80);
    }

    // Method tipe 4 untuk menghasilkan kecepatan secara random dan menyimpannya dalam ArrayList
    public static ArrayList<Integer> generateSpeeds(int count) {
        ArrayList<Integer> speeds = new ArrayList<>();
        Random random = new Random();

        int i = 0;
        while (i < count) {
            int speed = random.nextInt(121); // Menghasilkan angka random antara 0 - 120
            speeds.add(speed);
            i++;
        }

        return speeds;
    }

    // Method untuk menampilkan kecepatan di antara suatu rentang tertentu
    public static void displaySpeedInRange(ArrayList<Integer> speeds, int minRange, int maxRange) {
        for (int speed : speeds) {
            if (speed >= minRange && speed <= maxRange) {
                System.out.println("Kecepatan: " + speed + " km/jam");
            }
        }
    }

    // Method untuk menampilkan kecepatan di bawah suatu nilai tertentu
    public static void displaySpeedBelowRange(ArrayList<Integer> speeds, int maxRange) {
        for (int speed : speeds) {
            if (speed < maxRange) {
                System.out.println("Kecepatan: " + speed + " km/jam");
            }
        }
    }
}