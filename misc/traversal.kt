data class Node(
    var value: Int? = null, 
    var left : Node? = null, 
    var right: Node? = null
)

// Inorder
// l,c,r
fun inOrder(root: Node) {
    root.left?.let { left -> inOrder(left) }
    root.value?.let { value -> println(value) }
    root.right?.let { right -> inOrder(right) }
}
 
// Preorder: c,l,r: Time Complexity O(n), visits each node once
fun preOrder(root: Node) {
    root.value?.let { value -> println(root.value) }
    root.left?.let { left -> preOrder(left) }
    root.right?.let { right -> preOrder(right) }
}

// Postorder
// l,r,c
fun postOrder(root: Node) {
    root.left?.let { left -> postOrder(left) }
    root.right?.let { right -> postOrder(right) }
    root.value?.let { value -> println(root.value) }
}

fun driver() {
    val t1 = Node(12, 
         Node(9, Node(7), Node(5)),
         Node(1, Node(2))
    )
    val t2 = Node(1, Node(2, Node(4), Node(5)), Node(3))
    //preOrder(t1)
    //preOrder(t2)
    //inOrder(t1)
    //inOrder(t2)
    //postOrder(t1)
    //postOrder(t2)
}

fun main() {
    driver()
}
