import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
    // Degiskenleri olustur

        int mat, fzk, kim, turk, trh, mzk ;
        Scanner inp = new Scanner(System.in) ;
        //Kullanicidan degerleri al

        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz:");
        fzk = inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kim = inp.nextInt() ;

        System.out.print("Türkçe Notunuz:");
        turk = inp.nextInt();

        System.out.print("Tarih Notunuz:");
        trh = inp.nextInt();

        System.out.print("Müzik Notunuz:");
        mzk = inp.nextInt();

        int toplam = (mat+ fzk + kim + turk + trh + mzk) ;
        double sonuc = toplam/6 ;
        System.out.println("Ortalama Notunuz:" + sonuc);

        String result;
        result = (sonuc>60) ? "Gectiniz" : "Kaldınız" ;
        System.out.println(result);

    }
}
