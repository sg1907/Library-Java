

public class Library {

	public static void main(String[] args) {

		Book B1 = new Book("OSMANLI ÝNSANI", 2006, 236, "Vehbi Vakkasoðlu", "NesilYayýnlarý");
		Book B2 = new Book("OSMANCIK", 2005, 356, "Tarýk Buðra", "ÖtükenNeþriyatAÞ");
		Book B3 = new Book("MALAZGÝRT'TE BÝR CUMA SABAHI", 2006, 220, "Yavuz Bahadýroðlu", "NesilYayýnlarý");
		Book B4 = new Book("ROBINSON CRUSOE", 2006, 206, "Daniel Defoe",
				"KarizmaYayýnEðitimDanýþmanlýkReklamHizmetleriAÞ");
		Book B5 = new Book("SEFÝLLER", 2007, 448, "Victor Hugo", "AkvaryumYayýnevi");
		Book B6 = new Book("MESNEVÝ'DEN HÝKAYELER", 2004, 150, "Selim Hancýoðlu", "MuþtuYayýnlarý");
		Book B7 = new Book("VATAN YAHUT SÝLÝSTRE", 2011, 80, "Namýk Kemal", "ErdemYayýnlarý");
		Book B8 = new Book("HER ÞEYE RAÐMEN SEVGÝ", 2012, 200, "Tolstoy", "NedenKiyapYayýncýlýkHizmetleriSanTicLtdÞti");
		Book B9 = new Book("ÞAH MAT", 2012, 507, "Mario Mazzanti", "YakamozKitap");
		Book B10 = new Book("FATÝH SULTAN MEHMET", 2004, 139, "Ekrem Yeþilçayýr", "MuþtuYayýnlarý");
		
		B1.loanBook();
		B1.bookInfo();

		B2.bookInfo();
		
		B3.bookInfo();
		
		B4.loanBook();
		B4.bookInfo();
	
		B5.loanBook();
		B5.bookInfo();
		
		B6.bookInfo();
		
		B7.loanBook();
		B7.bookInfo();
		
		B8.bookInfo();
		
		B9.loanBook();
		B9.bookInfo();

		B10.bookInfo();
		

		Author A1 = new Author("Vehbi", "Vakkasoðlu", 1);
		Author A2 = new Author("Tarýk", "Buðra", 1);
		Author A3 = new Author("Yavuz", "Bahadýroðlu", 1);
		Author A4 = new Author("Daniel", "Defoe", 1);
		Author A5 = new Author("Victor", "Hugo", 1);
		Author A6 = new Author("Selim", "Hancýoðlu", 1);
		Author A7 = new Author("Namýk", "Kemal", 1);
		Author A8 = new Author("Tolstoy", "", 1);
		Author A9 = new Author("Mario", "Mazzanti", 1);
		Author A10 = new Author("Ekrem", "Yeþilçayýr", 1);

		A1.authorInfo();
		A2.authorInfo();
		A3.authorInfo();
		A4.authorInfo();
		A5.authorInfo();
		A6.authorInfo();
		A7.authorInfo();
		A8.authorInfo();
		A9.authorInfo();
		A10.authorInfo();

		Publisher P1 = new Publisher("NesilYayýnlarý", 2);
		Publisher P2 = new Publisher("ÖtükenNeþriyatAÞ", 1);
		Publisher P3 = new Publisher("KarizmaYayýnEðitimDanýþmanlýkReklamHizmetleriAÞ", 1);
		Publisher P4 = new Publisher("AkvaryumYayýnevi", 1);
		Publisher P5 = new Publisher("MuþtuYayýnlarý", 2);
		Publisher P6 = new Publisher("ErdemYayýnlarý", 1);
		Publisher P7 = new Publisher("NedenKiyapYayýncýlýkHizmetleriSanTicLtdÞti", 1);
		Publisher P8 = new Publisher("YakamozKitap", 1);

		P1.publisherInfo();
		P2.publisherInfo();
		P3.publisherInfo();
		P4.publisherInfo();
		P5.publisherInfo();
		P6.publisherInfo();
		P7.publisherInfo();
		P8.publisherInfo();
		
		Book B0 = new Book();

		currentLibraryStatus(B0.totalCount, B0.loanedCount);

	}

	public static void currentLibraryStatus(int TotalCount, int LoanedCount) {

		System.out.println("**************************************");
		System.out.println("LOANED   : " + LoanedCount);
		System.out.println("EXISTING : " + (TotalCount - LoanedCount));
		System.out.println("TOTAL    : " + TotalCount);
		System.out.println("**************************************");

	}

}