/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                Node node = queue.poll();
                arr.add(node.data);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        res.add(arr);
        }
        return res;
    }
}