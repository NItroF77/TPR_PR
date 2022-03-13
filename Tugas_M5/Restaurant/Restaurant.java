package Restaurant;

public class Restaurant {
	private MenuMakanan[] Makanan;
	private byte id=-1;
	public Restaurant() {
			Makanan = new MenuMakanan[10];
			for(byte i=0; i<10; i++){
	            Makanan[i] = new MenuMakanan();	//supaya Makanan[i] tidak null (memanggil constructor MenuMakanan)
	        }
	}
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.id++; 	//memindahkan penambahan value id kedalam tambahMenuMakanan
					//sehingga tidak perlu memanggil nextId setiap kali akan menambah menu.
		this.Makanan[id].setNama_makanan(nama);
		this.Makanan[id].setHarga_makanan(harga);
		this.Makanan[id].setStok(stok);
	}
	public void tambahStok(byte id_makanan, int StockToAdd) {
		this.Makanan[id_makanan].setStok(this.Makanan[id_makanan].getStok() + StockToAdd);
	}
	public void Order(byte id_makanan,int StockToReduce) {
		if(CheckOrder(id_makanan,StockToReduce)) {
			this.Makanan[id_makanan].setStok(this.Makanan[id_makanan].getStok()-StockToReduce);
			return;
		}
		System.out.println("maaf pesanan melibihi stok persediaan");
	}
	public void tampilMenuMakanan(){
		for(int i =0; i<=this.id;i++){
			if(isOutOfStock(i)) {
				System.out.println(i+1+". "+ this.Makanan[i].getNama_makanan() +"["+this.Makanan[i].getStok()+"]"+"\tRp. "+this.Makanan[i].getHarga_makanan()+" (Habis)");
			}
			else{
			System.out.println(i+1+". "+ this.Makanan[i].getNama_makanan() +"["+this.Makanan[i].getStok()+"]"+"\tRp. "+this.Makanan[i].getHarga_makanan());
			}
		}
	}
	public boolean CheckOrder(byte id_makanan,int OrderedStock) {
		if(this.Makanan[id_makanan].getStok() - OrderedStock <= 0) {
			return false;
		}
		return true;
	}
	public boolean isOutOfStock(int id){
		if(this.Makanan[id].getStok() == 0){
			return true;
		}
		else{
			return false;
		}
	}
}

