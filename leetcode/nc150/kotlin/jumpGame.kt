fun canJump(nums: IntArray): Boolean {
  val l = BooleanArray(nums.size)
  l[nums.size-1] = true
  for (i in nums.size-2 downTo 0) {
      var canReachEnd = false
      for (j in 1..nums[i]) {
          if (i+j < l.size && l[i+j]) {
              canReachEnd = true
              break
          }
      }
      l[i] = canReachEnd
  }
  return l[0]
}
