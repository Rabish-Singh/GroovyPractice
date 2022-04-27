package DatesAndTimes

class GetTime {
	static void main(String[] args) {
		Date olddate = new Date("05/11/2015");
		Date newdate = new Date("05/11/2015");
		Date latestdate = new Date();
		  
		println(olddate.getTime());
		println(newdate.getTime());
		println(latestdate.getTime());
	 }
  
}
