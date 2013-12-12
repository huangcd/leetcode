package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date: 12/11/13
 * <p/>
 * Time: 4:09 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class UndirectedGraphNode {
    public int label;
    public ArrayList<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int x) {
        this.label = x;
        this.neighbors = new ArrayList<UndirectedGraphNode>();
    }

    public UndirectedGraphNode(int x, UndirectedGraphNode... neighbors) {
        this.label = x;
        this.neighbors = new ArrayList<UndirectedGraphNode>(Arrays.asList(neighbors));
    }
}
