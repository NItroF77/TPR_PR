package Kelas;

class KelasSatu{
    {
    System.out.println(11); //akan tereksekusi setiap memanggil constructor
    }                       //dengan posisi tereksekusi sebelum memanggil constructor
    
    static{                 //akan tereksekusi ketika pertama kali class diakses.
        System.out.println(2);
    }
    public KelasSatu(int i){//constructor dengan 1 parameter berupa integer.
        System.out.println(3);
    }
    public KelasSatu(){     //constructor tanpa parameter.
        System.out.println(4);
    }
}