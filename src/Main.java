import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String namaDepan = "Riski";
        String namaBelakang = "Nurliana";
        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.45;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println(namaDepan + namaBelakang);

        char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        String namaLengkap = namaDepan + " " +
                namaDepan + " " + namaBelakang;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.replace("Ris", "Nur"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split(" ");

        for (String nama : namaArray){
            System.out.println(nama);
        }
    }
}