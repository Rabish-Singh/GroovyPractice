package map

class ContainsKey {
	static void main(String[] args) {
		def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
		println(mp.containsKey("TopicName"));
		println(mp.containsKey("Topic"));
	 }
}
