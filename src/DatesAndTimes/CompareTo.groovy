package DatesAndTimes

class CompareTo {
	static void main(String[] args) {
		Date olddate = new Date("05/11/2015");
		Date newdate = new Date("05/11/2015");
		Date latestdate = new Date();
		  
		System.out.println(olddate.compareTo(newdate));
		System.out.println(latestdate.compareTo(newdate));
	 }
  
}
