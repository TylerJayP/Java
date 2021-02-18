package abstractClass;

import java.util.ArrayList;

public class PrinterApp {

	public static void main(String[] args) {

		LaserPrinter myLaserPrinter = new LaserPrinter("Samsung Xpress");
		InkjetPrinter myInkjetPrinter = new InkjetPrinter("Canon TS202");

		ArrayList<Printer> printerList = new ArrayList<Printer>();

		printerList.add(myLaserPrinter);
		printerList.add(myInkjetPrinter);

		for (Printer el : printerList) {

			System.out.println(el);

			for (int i = 0; i < 11; i++) {

				el.print();

			}
			
			System.out.println();
			
		}

		myLaserPrinter.refillToner();
		myInkjetPrinter.refillCartridge();

		System.out.println("Remaining toner after refilling: " + myLaserPrinter.getRemainingToner());
		System.out.println("Remaining cartridge after refilling: " + myInkjetPrinter.getRemainingCartridge());

	}

}
