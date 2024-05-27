///**
// * File : DiskonLambda.java
// * Deskripsi : EImplementasi lambda dasar, digunakan untuk meghitung diskon.
// */
//public class DiskonLambda {
//    public static void main(String[] args) {
//        //tanpa lambda
//        IDiskon diskonMerdeka = new IDiskon() {
//            public double hitungDiskon(int harga) {
//                return harga - (harga * 0.3);
//            }
//        };
//        //dengan lamda
//        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
//        //dengan lambda dengan blok statement 
//        IDiskon diskonBiasa = (harga) -> {
//            return harga - (harga * 0.1);
//        };
//        System.out.println("Diskon Merdeka : "+diskonMerdeka.hitungDiskon(45000));
//        System.out.println("Diskon Lebaran : "+diskonLebaran.hitungDiskon(45000));
//        System.out.println("Diskon Biasa : "+diskonBiasa.hitungDiskon(45000));
//    }
//}
