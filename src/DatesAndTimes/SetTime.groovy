package DatesAndTimes

class SetTime {
	static void main(String[] args) {
		Date olddate = new Date();
		Date newdate = new Date();
		Date latestdate = new Date();
		  
		olddate.setTime(10000);
		newdate.setTime(10000);
		latestdate.setTime(10000);
		  
		println(olddate.toString());
		println(newdate.toString());
		println(latestdate.toString());
	 }
}
