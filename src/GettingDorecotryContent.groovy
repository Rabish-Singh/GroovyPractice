
class GettingDorecotryContent {
	static void main(String[] args) {
		def rootFiles = new File("Documents").listRoots()
		rootFiles.each {
		   file -> println file.absolutePath
		}
	 }
}
