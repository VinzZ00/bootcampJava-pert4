import java.util.ArrayList;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		// OOP -> Object Oriented Programming 
		// Vector, Arraylist, Hashmap, Scanner, Integer, Boolean, Random, Calendar 
		// new
		// stack memory -> primitive type variable, alamat ke suatu heap 
		// memorry (Suatu object). namaobject@alamat
		// heap memory -> menyimpan object 
		
		// 3 concept OOP
		// Encapsulation -> mengelompokan berberapa variable dan method menjadi 1 class,
		// dan membatasi pengaksesan kepada field/variable dari kelas tersebut.
		// 1 class itu terdiri dari field/variable dan method atau behavior.
		// inheritance -> 
		/*
		 * konsep inheritance membagi kelas menjadi 2 jenis yaitu parent dan child
		 * setiap variable dan method yang ada diparent akan diturunkan kepada 
		 * childnya yang mengextends dia, 
		 * peraturan dalam mengextends ke sebuah class
		 * 1. 1 class cuma bisa mengextends 1 parent class (cuma bisa ada 1 parent)
		 * 2. 1 class bisa menjadi parent dari 1 child ataupun lebih (bisa di 
		 * extends oleh lebih dari 1 class)
		 * 
		 * kita bisa mengextends dari class biasa, ataupun class abstract
		 * interface bisa di implement lebih dari 1 class dan 1 class bisa implement lebih dari 1 interface.
		 */
		// polymorphism
		/*
		 * 1. overload -> pembuatan method yang memiliki nama yang sama tapi mengunakan tipe data parameter yang berbeda, jumlah parameter ataupun return type yang berbeda.
		 *  
		 * 2. override -> 
		 */
		
//		person mahasiswa1 = new person() {
//			
//			public void displayNama() {
//				// TODO Auto-generated method stub
//				System.out.println("Nama");
//			}
//		};
//		mahasiswa1.displayNama();
		
//		OOPExample();
		upAndDownCasting();
	}
	
	public void upAndDownCasting() {
		// apa itu up casting?
		/*
		 *  parsing/casting dari child menjadi parent
		 */
		
		// apa itu down casting?
		/*
		 * parsing/casting dari parent menjadi child
		 */
		mahasiswa andi = new mahasiswa("Andi", 17, "24541245322", 3.8);
		Dosen Budi = new Dosen("Budi", 30, "D20253", 10_000);
		andi.setDosenPembimbing(Budi);
		
		ArrayList<Object> semuaObject = new ArrayList<>();
		semuaObject.add(false);
		semuaObject.add(1);
		semuaObject.add("Ini String");
		
		
		ArrayList<person> keluargaBinus = new ArrayList<>();
		
		keluargaBinus.add(andi);
		keluargaBinus.add(Budi);
		keluargaBinus.add(new Dosen("Elvin", 20, "D65203", 10_000));
		
		ArrayList<mahasiswa> mahasiswaSaja = new ArrayList<mahasiswa>();
		ArrayList<Dosen> dosenSaja = new ArrayList<Dosen>();
		
		for (person Person : keluargaBinus) {
			if (Person instanceof mahasiswa) {
				mahasiswa m1 = (mahasiswa) Person;
				mahasiswaSaja.add(m1);
				m1.displayNIK();
			} else {
				Dosen d = (Dosen) Person;
				dosenSaja.add(d);
				System.out.println(d.getNoDosen());
			}
		}
		
		System.out.println("Jumlah Keluarga BINUS " + keluargaBinus.size() );
		System.out.println("Jumlah Dosen Binus " + dosenSaja.size());
		System.out.println("Jumlah mahasiswa binus " + mahasiswaSaja.size());
		
//		mahasiswa andiDowncasting = (mahasiswa) keluargaBinus.get(0);
	}
	
	public void OOPExample() {
		mahasiswa andi = new mahasiswa("Andi", 17, "24541245322", 3.8);
		andi.displayNama();
		andi.setNama("Budi");
		andi.displayNama();
		andi.displayNIK();
		
		andi.setDosenPembimbing(new Dosen("Budi", 30, "D20253", 10_000));
		System.out.println("Dosen pembimbing before " + andi.getDosenPembimbing().getNama());;
		andi.getDosenPembimbing().setNama("Dodi");
		System.out.println("Dosen pembimbing after " + andi
				.getDosenPembimbing()
				.getNama());
		System.out.println(andi.getDosenPembimbing().getGaji());
		andi.getDosenPembimbing().setGaji(andi.getDosenPembimbing().getGaji() +  (andi.getDosenPembimbing().getGaji() * 0.5), "b12345");
		System.out.println(andi.getDosenPembimbing().getGaji());
		System.out.println(andi.displayInstance());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
		
//		int[] a = new int[3];
//		
//		System.out.println(a);
	}

}
