package com.xiaomaoguai.leecode.day1;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author August.Zhang
 * @version v1.0.0
 * @date 2020/4/22 11:33 PM
 * @since JDK 1.8
 */
public class RightSideView {

	public static void main(String[] args) {
		Solution3 solution3 = new Solution3();
		TreeNode1 treeNode1 = new TreeNode1(1);
		TreeNode1 treeNode2 = new TreeNode1(2);
		TreeNode1 treeNode3 = new TreeNode1(3);
		TreeNode1 treeNode4 = new TreeNode1(4);

		treeNode1.left = treeNode2;
		treeNode1.right = treeNode3;
		treeNode2.left = treeNode4;

		List<Integer> integers = solution3.rightSideView(treeNode1);
		System.out.println(integers);
	}

}

class Solution3 {

	public List<Integer> rightSideView(TreeNode1 root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode1> queue = new LinkedList<>();
		//加入头结点
		queue.add(root);
		// 判断条件
		while (!queue.isEmpty()) {
			//遍历每一层
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode1 node = queue.poll();
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
				if (i == size - 1) {  //每一层最后一个
					list.add(node.val);
				}
			}
		}
		return list;
	}

}

class TreeNode1 {

	public int val;

	public TreeNode1 left;

	public TreeNode1 right;

	TreeNode1(int x) {
		val = x;
	}

}
