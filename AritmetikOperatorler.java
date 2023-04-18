//AritmetikOperatörler

public class Driver {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		float z = 20f;
		
		System.out.println(x + y); //x ve y birer operanttır. bize yeni bir değişken döndürür.
		System.out.println(x - y);
		
		//javada bütün veri tiplerinin signed vardır. 
		//javada bütün veri tipleri + veya - olabilir.
		//c ve c++taki gibi unsigned ifade yoktur
		
		System.out.println(x * y);
		System.out.println(x / z); //bölme operatöründe iki ifadeden birinin float olması gerekir. iki ifade de int olursa sonuç 0
		
		System.out.println(8 % 3); //% modulus ifadesidir. bölümden kalanı verir
		//modulus operatörü bir sayının tek mi çift mi olduğunu anlamak için sıklıkla kullanıllır.
		System.out.println(4 % 2); //çift sayı sonuç 0
		System.out.println(5 % 2); // tek sayı sonuç 1
		//if operatörünün içine konulursa tek mi çift mi olduğu kontrol edilir.
		
		//BÜTÜNLEŞİK OPERATÖRLER
		
		int a = 10;
		//a = a + 2; //== ifadesi matematikteki eşittir anlamındadır/ = ifadesi atama operatörü
		a+= 2; //yukarıdaki ifade ile aynıdır. bütünleşik operatör kullanıldı.
		System.out.println(a);
		//+= -= /= *= olarak kullanılabilir.
		
		//POSTFİX PREFİX İFADELER
		int q = 12;
		System.out.println(q++); //postfix operatörü Önce değişkenin değeri ekrana basılır sonra 1 arttırılır.
		System.out.println(q);
		
		int w = 15;
		System.out.println(++w); //prefix operatörü. Önce w değeri 1 artırarak sonra ekrana bastırır.
		System.out.println(w);
		
		
	}
