fun jump(nums: IntArray): Int {
  var m = nums.size + 1
  val l = IntArray(nums.size)
  l[nums.size-1] = 0
  for (i in nums.size-2 downTo 0) {
    l[i] = if (nums.size-1 - i - nums[i] > 0) {
      m = nums.size + 1
      for (j in nums[i] downTo 1)
        if (i + j < nums.size) m = minOf(m, l[i+j] + 1)
      m
    } else 1
  }
  return l[0]
}
