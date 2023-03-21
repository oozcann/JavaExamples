import java.util.Scanner;

import ExtraFoodDecorators.*;
import SizeDecorators.*;
import WrapTypes.*;

public class WrapFactory {

	Scanner scanner = new Scanner(System.in);
	
	Wrap wrap = null;
	public void askWrapType () {
		
		System.out.println("WrapFactory'ye Hoşgeldiniz...");
		System.out.println("Lütfen istediğiniz wrap çeşidini seçiniz.");
		
		String options = "1.Tavuk\n2.Köfte\n3.Falafel";
		
		System.out.println(options);
		System.out.print("Seçiminiz : ");
		int wrapType = scanner.nextInt();
		
		if (wrapType == 1) {
			wrap = new Chicken();
		}
		else if (wrapType == 2) {
			wrap = new Meat();
		}
		else if (wrapType == 3) {
			wrap = new Falafel();
		} else {
			System.out.println("Böyle bir çeşidimiz mevcut değildir.");
		}
		System.out.println(wrap.getDescription());
	}
	
	public void askExtraFood () {
		
		boolean selectionContinues= true;
		
		while (selectionContinues) {
			System.out.println("Extra Ürün seçiniz : ");
			String options = "1.Peynir\n2.Patates Kızartması\n3.İçecek\n4.Boy seçimine git";
			
			System.out.println(options);
			System.out.print("Seçiminiz : ");
			int extraType = scanner.nextInt();
			
			if (extraType == 1) {
				wrap = new Cheese(wrap);
			}
			else if (extraType == 2) {
				wrap = new Fries(wrap);
			}
			else if (extraType == 3) {
				wrap = new Drink(wrap);
			}
			else if (extraType == 4) {
				selectionContinues = false;
			} else {
				System.out.println("Böyle bir çeşidimiz mevcut değildir.");
			}
		}
		
	}
	
	
	public void askSize () {
		
		System.out.println("Boy seçiniz : ");
		String options = "1.Küçük\n2.Orta\n3.Büyük";
		
		System.out.println(options);
		System.out.print("Seçiminiz : ");
		int sizeType = scanner.nextInt();
		
		if (sizeType == 1) {
			wrap = new Small(wrap);
		}
		else if (sizeType == 2) {
			wrap = new Medium(wrap);
		}
		else if (sizeType == 3) {
			wrap = new Large(wrap);
		}else {
			System.out.println("Böyle bir boy mevcut değildir.");
		}
		
	}
	
	public void showWrapInfoAndPrice() {
		System.out.println("Seçiminiz : " + wrap.getDescription() + "\n Ücret : $" + wrap.cost());
	}
	
	public void prepareWrap() throws InterruptedException {
		
		askWrapType();
		askExtraFood();
		askSize();
		showWrapInfoAndPrice();
		
		System.out.println("Ürününüz Hazırlanıyor...");
		Thread.sleep(3000);
		System.out.println("Teşekkür ederiz... Afiyet olsun :)");
	}
	
}


