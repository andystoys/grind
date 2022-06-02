data class Node(
    var value: Int? = null, 
    var left : Node? = null, 
    var right: Node? = null
)

// remember values via closures

// in, pre, post relationships

// bfs


// T: O(n), S: O(h) h = height of tree, all dfs
// Inorder: l,c,r
fun inOrderR(root: Node) {
    root.left?.let { left -> inOrder(left) }
    root.value?.let { value -> println(value) }
    root.right?.let { right -> inOrder(right) }
}

fun inOrderI(root: Node) {
    
}

 
// Preorder: c,l,r
fun preOrderR(root: Node) {
    root.value?.let { value -> println(root.value) }
    root.left?.let { left -> preOrder(left) }
    root.right?.let { right -> preOrder(right) }
}

// Postorder: l,r,c
fun postOrderR(root: Node) {
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
    //preOrderR(t1)
    //preOrderR(t2)
    //inOrderR(t1)
    //inOrderR(t2)
    //postOrderR(t1)
    //postOrderR(t2)
}

fun main() {
    driver()
}
