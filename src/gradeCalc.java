/* Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak... */

import java.util.Scanner;

public class gradeCalc {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);

        int mat, fzk, kmy, trkc, trh, mzk;
        double ort;

        // İlk olarak notlarımızı girmemiz lazım.

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

        // Daha sonra notlarımızın ortalamasını ekrana yazdırıyoruz.

        ort = ((mat + fzk + kmy + trkc + trh + mzk) / 6.0);
        System.out.println();
        System.out.println("Ortalamaniz : " + ort);

        // Son olarak ortalamaya göre sınıf geçip kalma durumunu kontrol ediyoruz.

        boolean kosul = ort >= 60;
        String durum = kosul ? "Sinifi Gectiniz Tebrikler :) " : "Sinifta Kaldiniz Uzgunuz :( ";
        System.out.println(durum);
    }
}