package Range

class RangeDemo {
static void main(String[] args) {
	def rint=1..10;
	println(rint);
	for(int i=0;i<rint.size();i++) {
		println(i);
	}
	println(rint.contains(3));
}
}
