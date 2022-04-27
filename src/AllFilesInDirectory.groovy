
class AllFilesInDirectory {
	static void main(String[] args) {
		new File("Temp").eachFileRecurse() {
		   file -> println file.getAbsolutePath()
		}
	 }
}
