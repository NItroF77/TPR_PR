package UpinIpin;

public class Item {
    private String name;
    private Item() {
        name = "Ipin"; //constructor yang terenkapsulasi
    }
    public Item(String name) {
        this(); //memanggil construktor yang terenkapsulasi
        System.out.println(this.name);
    }
}
