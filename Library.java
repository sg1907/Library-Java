

public class Library {

	public static void main(String[] args) {

		Book B1 = new Book("OSMANLI �NSANI", 2006, 236, "Vehbi Vakkaso�lu", "NesilYay�nlar�");
		Book B2 = new Book("OSMANCIK", 2005, 356, "Tar�k Bu�ra", "�t�kenNe�riyatA�");
		Book B3 = new Book("MALAZG�RT'TE B�R CUMA SABAHI", 2006, 220, "Yavuz Bahad�ro�lu", "NesilYay�nlar�");
		Book B4 = new Book("ROBINSON CRUSOE", 2006, 206, "Daniel Defoe",
				"KarizmaYay�nE�itimDan��manl�kReklamHizmetleriA�");
		Book B5 = new Book("SEF�LLER", 2007, 448, "Victor Hugo", "AkvaryumYay�nevi");
		Book B6 = new Book("MESNEV�'DEN H�KAYELER", 2004, 150, "Selim Hanc�o�lu", "Mu�tuYay�nlar�");
		Book B7 = new Book("VATAN YAHUT S�L�STRE", 2011, 80, "Nam�k Kemal", "ErdemYay�nlar�");
		Book B8 = new Book("HER �EYE RA�MEN SEVG�", 2012, 200, "Tolstoy", "NedenKiyapYay�nc�l�kHizmetleriSanTicLtd�ti");
		Book B9 = new Book("�AH MAT", 2012, 507, "Mario Mazzanti", "YakamozKitap");
		Book B10 = new Book("FAT�H SULTAN MEHMET", 2004, 139, "Ekrem Ye�il�ay�r", "Mu�tuYay�nlar�");
		
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
		

		Author A1 = new Author("Vehbi", "Vakkaso�lu", 1);
		Author A2 = new Author("Tar�k", "Bu�ra", 1);
		Author A3 = new Author("Yavuz", "Bahad�ro�lu", 1);
		Author A4 = new Author("Daniel", "Defoe", 1);
		Author A5 = new Author("Victor", "Hugo", 1);
		Author A6 = new Author("Selim", "Hanc�o�lu", 1);
		Author A7 = new Author("Nam�k", "Kemal", 1);
		Author A8 = new Author("Tolstoy", "", 1);
		Author A9 = new Author("Mario", "Mazzanti", 1);
		Author A10 = new Author("Ekrem", "Ye�il�ay�r", 1);

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

		Publisher P1 = new Publisher("NesilYay�nlar�", 2);
		Publisher P2 = new Publisher("�t�kenNe�riyatA�", 1);
		Publisher P3 = new Publisher("KarizmaYay�nE�itimDan��manl�kReklamHizmetleriA�", 1);
		Publisher P4 = new Publisher("AkvaryumYay�nevi", 1);
		Publisher P5 = new Publisher("Mu�tuYay�nlar�", 2);
		Publisher P6 = new Publisher("ErdemYay�nlar�", 1);
		Publisher P7 = new Publisher("NedenKiyapYay�nc�l�kHizmetleriSanTicLtd�ti", 1);
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