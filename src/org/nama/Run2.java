package org.nama;

public class Run2 extends Ba2{
	public static void main(String[] args) {
		getdriver();
		loadurl("http://adactin.com/HotelApp/SearchHotel.php");
		PageLog2 pg = new PageLog2();
		PageLog y =new PageLog();
		fill(y.getTxtname(),"kalaiyazhagan");
		fill(y.getTxtpass(),"8220761248");
		clickbtn(y.getBtn());
		
		dd(pg.getAd(),"location");
		dd(pg.getCr(),"hotels");
		dd(pg.getFr(),"room_type");
		dd(pg.getHo(),"room_nos");
		
		dd(pg.getNo(),"adult_room");
		dd(pg.getRo(),"child_room");
		
		
		
		fill(pg.getLoc(),"12/06/2020");
		fill(pg.getLoc(),"13/06/2020");
		clickbtn(pg.getSub());
	}

	

}
