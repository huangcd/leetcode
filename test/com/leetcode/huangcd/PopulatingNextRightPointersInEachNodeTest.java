package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 10:24 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class PopulatingNextRightPointersInEachNodeTest {

    @Test
    public void testConnect() throws Exception {
        TreeLinkNode root = generateTreeLinkNode(1, 15);
        PopulatingNextRightPointersInEachNode test = new PopulatingNextRightPointersInEachNode();
        test.connect(root);
        assertConnection(root);
    }

    private boolean isRightmost(TreeLinkNode node) {
        return ((node.val + 1) & node.val) == 0;
    }

    private boolean assertConnection(TreeLinkNode node) {
        if (node == null) {
            return true;
        }
        if (isRightmost(node)) {
            return assertConnection(node.left) && assertConnection(node.right);
        } else {
            Assert.assertTrue(node.next != null && node.next.val == node.val + 1);
            return node.next.val == node.val + 1 && assertConnection(node.left) && assertConnection(node.right);
        }
    }

    private TreeLinkNode generateTreeLinkNode(int current, int limit) {
        if (current > limit) {
            return null;
        }
        TreeLinkNode node = new TreeLinkNode(current);
        node.left = generateTreeLinkNode(current * 2, limit);
        node.right = generateTreeLinkNode(current * 2 + 1, limit);
        return node;
    }
}
