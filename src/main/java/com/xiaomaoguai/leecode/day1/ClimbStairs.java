package com.xiaomaoguai.leecode.day1;

/**
 * @author August.Zhang
 * @version v1.0.0
 * @date 2020/4/22 12:03 PM
 * @since JDK 1.8
 */
public class ClimbStairs {

	public static void main(String[] args) {
		Solution1 solution1 = new Solution1();
		System.out.println(solution1.climbStairs(4));
	}

}


//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
// 注意：给定 n 是一个正整数。
//
// 示例 1：
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶
//
// 示例 2：
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
//
// Related Topics 动态规划


//leetcode submit region begin(Prohibit modification and deletion)
class Solution1 {

	public int climbStairs(int n) {
		if (n <= 2) {
			return n;
		}
		int num = 0;
		for (int i = 3; i < n-3; i++) {

		}
		return climbStairs (n - 1) + climbStairs(n - 2) ;
	}

}
//leetcode submit region end(Prohibit modification and deletion)
