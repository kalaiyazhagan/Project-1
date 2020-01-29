package org.nama;

import org.openqa.selenium.WebDriver;

public class Run extends Ba {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Getting methods from Ba class
		getdriver();
		loadurl("https://adactin.com/HotelApp/");
		// creating object because PageLog class method is not static
		PageLog y = new PageLog();

		// Page1
		// calling methods from Ba class
		fill(y.getTxtname(), "kalaiyazhagan");
		fill(y.getTxtpass(), "8220761248");
		clickbtn(y.getBtn());

		// Page 2
		Thread.sleep(3000);

		PageLog2 z = new PageLog2();
		dd(z.getAd(), "Paris");
		dd(z.getCr(), "Hotel Creek");
		dd(z.getFr(), "Double");
		dd(z.getHo(), "2");

		fill(z.getLoc(), "12/06/2020");
		fill(z.getLoc(), "13/06/2020");
		dd(z.getNo(), "2");
		dd(z.getRo(), "2");
		clickbtn(z.getSub());
		// Page 3
		PageLog3 t = new PageLog3();
		clickbtn(t.getRd());
		clickbtn(t.getCon());
		// Page4
		PageLog4 q = new PageLog4();
		fill(q.getFir(), "kalai");
		fill(q.getLast(), "n");
		fill(q.getAdd(), "Puducherry");
		fill(q.getCc(), "74185693");
		dd(q.getTyp(), "Other");
		dd(q.getMonth(), "March");
		dd(q.getYear(), "2020");
		fill(q.getCvv(), "12741856");
		clickbtn(q.getClick());

	}

}
