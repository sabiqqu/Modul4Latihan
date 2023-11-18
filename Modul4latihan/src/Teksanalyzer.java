import java.util.Scanner;

public class Teksanalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        String wordToFind = "";
        int charCount = 0;
        int wordCount = 0;
        int wordFindCount = 0;

        while (true) {
            System.out.println("\n === MENU TEKS ANALYZER === ");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    text = scanner.nextLine();
                    System.out.println("Teks telah dimasukkan!");
                    break;
                case 2:
                    if (text.isEmpty()) {
                        System.out.println("Anda belum memasukkan teks.");
                    } else {
                        charCount = text.length();
                        System.out.println("Jumlah karakter dalam teks: " + charCount);
                    }
                    break;
                case 3:
                    if (text.isEmpty()) {
                        System.out.println("Anda belum memasukkan teks.");
                    } else {
                        String[] words = text.split("\\s+");
                        wordCount = words.length;
                        System.out.println("Jumlah kata dalam teks: " + wordCount);
                    }
                    break;
                case 4:
                    if (text.isEmpty()) {
                        System.out.println("Anda belum memasukkan teks.");
                    } else {
                        System.out.print("Masukkan kata yang ingin dicari: ");
                        wordToFind = scanner.nextLine();
                        String lowerCaseText = text.toLowerCase();
                        String lowerCaseWordToFind = wordToFind.toLowerCase();
                        String[] splitText = lowerCaseText.split("\\s+");
                        for (String word : splitText) {
                            if (word.equals(lowerCaseWordToFind)) {
                                wordFindCount++;
                            }
                        }
                        System.out.println("Kata '" + wordToFind + "' ditemukan sebanyak " + wordFindCount + " kali dalam teks.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        }
    }
}