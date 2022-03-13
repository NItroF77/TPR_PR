package Restaurant;

import java.io.Closeable;
import java.util.Scanner;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		Scanner input = new Scanner(System.in);
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		menu.tampilMenuMakanan();
		System.out.println("masukkan menu makanan dan stok yang akan ditambah");
		menu.tambahStok((byte) (input.nextByte()-1),input.nextInt());
		menu.tampilMenuMakanan();
		System.out.println("masukkan menu makanan dan stok yang akan dipesan");
		menu.Order((byte) (input.nextByte()-1), input.nextInt());
		menu.tampilMenuMakanan();
		input.close();
	}
}
