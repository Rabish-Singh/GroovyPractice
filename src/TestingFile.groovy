
class TestingFile {
	static void main(String[] args) {
		def file = new File('Example.txt')
		println "File? ${file.isFile()}"
		println "Directory? ${file.isDirectory()}"
	 }
}