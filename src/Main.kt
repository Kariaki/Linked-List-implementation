fun main() {

    var list=CustomLinkedList()
    list.addLast(23)
    list.addLast(45)
    list.addLast(1)
    list.addLast(90)
    list.addLast(-1)
    list.addLast(12)
    list.addFirst(100)
    list.addLast(6)
    list.printList(list.firstNode!!)

    println(list.indexOf(10))

}