public class Main{
    public static void main(String[] args) {
        String namaDepan = "Gunawan";
        String namaTengah = "Junaidi";
        String namaBelakang = "Real";
        int usia = 19;
        int targetTahunKuliah = 4;
        double ipk = 3.987654321;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.print(namaDepan + namaTengah + namaBelakang);

        char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
        String uniskastring = new String(uniskaChar);
        System.out.println(uniskastring);

        String namaLengkap = namaDepan + "" + namaTengah + "" + namaBelakang;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.substring(5, 11));
        System.out.println(namaLengkap.replace("Gunawan", "Junaidi"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split("");

        for (String nama : namaArray) {
            System.out.println(nama);

        }
    }
}

