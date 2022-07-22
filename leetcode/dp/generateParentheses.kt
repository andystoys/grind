fun generateParenthesis(n: Int): List<String> {
    val l = mutableListOf<String>()
    fun dfs(n: Int, m: Int, s: String) {
        if (n == 0 && m == 0) l.add(s)
        if (n > 0) dfs(n-1, m, "$s(")
        if (m > 0 && n < m) dfs(n, m-1, "$s)")
    }
    dfs(n, n, "")
    return l.toList()
}
