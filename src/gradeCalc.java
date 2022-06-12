import java.util.Scanner;
public class gradeCalc {
    public static void main(String[] args) {

        int mat,fzk,kmy,trkc,trh,mzk;
        double ort;
        Scanner grade = new Scanner(System.in);

        System.out.println();
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = grade.nextInt();
        System.out.print("Fizik Notunuzu Giriniz : ");
        fzk = grade.nextInt();
        System.out.print("Kimya Notunuzu Giriniz : ");
        kmy = grade.nextInt();
        System.out.print("Turkce Notunuzu Giriniz : ");
        trkc = grade.nextInt();
        System.out.print("Tarih Notunuzu Giriniz : ");
        trh = grade.nextInt();
        System.out.print("Muzik Notunuzu Giriniz : ");
        mzk = grade.nextInt();

        ort = ((mat+fzk+kmy+trkc+trh+mzk)/6.0);
        System.out.println();
        System.out.println("Ortalamaniz : "+ ort);

        boolean kosul = ort >= 60;
        String durum = kosul ? "Sinifi Gectiniz Tebrikler :) " : "Sinifta Kaldiniz Uzgunuz :( ";
        System.out.println(durum);
    }
}