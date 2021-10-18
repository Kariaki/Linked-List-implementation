class CustomLinkedList {

    var firstNode: Node? = null
    var lastNode: Node? = null

    fun addLast(value: Int) {
        val newNode = Node(value)
        if (firstNode == null) {
            firstNode = newNode
            lastNode = newNode
            firstNode?.next = newNode
            return
        }
        lastNode?.next = newNode
        lastNode = newNode

    }

    fun addFirst(value: Int) {
        val newNode = Node(value)
        if (firstNode == null) {
            firstNode = newNode
            lastNode = newNode
            firstNode?.next = newNode
            return
        }
        newNode.next=firstNode
        firstNode=newNode
    }


    fun printList(first: Node) {
       if(first.next!=null) {
           println(first.value)
           printList(first.next!!)
       }

    }

    fun contains(value:Int):Boolean{
        var currentNode=firstNode
        while (!currentNode?.isLastNode()!!){
            if(currentNode.value==value)
                return true
            else{
                currentNode=currentNode.next
            }
        }
        return false
    }

    fun indexOf(value:Int):Int{
        var currentNode=firstNode
        var count=0;
        while (!currentNode?.isLastNode()!!){
            if(currentNode.value==value)
                return count
            else
                currentNode=currentNode.next

            count++;

        }
        return -1
    }

    fun removeAtFirst(){

    }

}