
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String ortaMetin="İlginizi çekebilir";
		
		String altMetin="Vade sürsesi";
		
		// Değişken isimlendirmeleri javada camelCase şeklinde yazılır; camelCase'de ilk kelimenin ilk harfi küçük diğer kelimelerin ilk harfi büyük yazılır.
		
		System.out.println(ortaMetin);
		
		// yazdırılacak olan değişkenler çift tırnak içinde yazılmaz.sadece ekrana yazıdırılmak istenen metinler çift tırnak içerisinde yazdırılır.
		
		int vade=12;
		double dolarDun=18.20;
		double dolarBugun=18.20;
		
		boolean doalrDustuMu=true;
		
		String okYonu="";
		
		if (dolarBugun<dolarDun) {//false
			okYonu="down.svg";
			System.out.println(okYonu);
			
		}
		else if(dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
			
		}
		String[] krediler= {"Hızlı Kredi","Maaşını Halkbanktan Alanlar","Mutlu Emekli"};
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		//Bir sitede yüzlerce ürün olduğundan dolayı tek tek yapılamaz ve bunun için döngüler kullanılır
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	
	}

}
