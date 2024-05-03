public class Tugas_String {
    public static void main(String[] args) {
        String nama = "Abdul Shabur Nurhadi Ikram";

        System.out.println("Hasil dari Method Lenght : " + nama.length());
        System.out.println("Hasil dari Method Substring : " + nama.substring(0, 6));
        System.out.println("Hasil dari Method ChartAt : " + nama.charAt(13));
        System.out.println("Hasil dari Method toLowerCase : " + nama.toLowerCase());
        System.out.println("Hasil dari Method toUpper : " + nama.toUpperCase());
        System.out.println("Hasil dari Method Replace : " + nama.replace("Abdul", "Galang"));
        System.out.println("Hasil dari Method Contains : " + nama.contains("Ikram"));
        System.out.println("Hasil dari Method Equals : " + nama.equals("Ikram"));
        System.out.println("Hasil dari Method EqualsIgnorCase : " + nama.equalsIgnoreCase("shabur"));
        System.out.println("Hasil dari Method EndsWith : " + nama.endsWith("m"));
    }
}