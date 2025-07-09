package JatTask5;

import java.util.Scanner;

public class HotelTariff {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int month=sc.nextInt();
	  double roomRentPerDay=sc.nextDouble();
	  int numberOfDays=sc.nextInt();
	  double totalRent;
	  boolean PeakSeason=true;
	  switch(month) {
	  case 4:
	  case 5:
	  case 6:
	  case 11:
	  case 12:
		  PeakSeason=true;
		  break;
		  default:
			  PeakSeason=false;
	  }
	  if(PeakSeason) {
		  totalRent=roomRentPerDay*1.2*numberOfDays;
	  }else {
		  totalRent=roomRentPerDay*numberOfDays;
	  }
	  System.out.printf("%.2f\n",totalRent);
	  sc.close();
  }
}
