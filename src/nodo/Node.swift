class Node{
var data: Int
var next: Node?
init node(data: Int){
	self.data= data
	self.next = nil
}
init node(data:Int, next: Node){
	self.data = data
	self.next = next
}
func getData()->Int{
	return self.data
}
func setData(d: Int){
	self.data = data
}
func getNext()->Node?{
	return self.next
}
func setNext(n: Node?){
	self.next = next
}
