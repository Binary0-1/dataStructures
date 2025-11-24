import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevel {

    static List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();

        if (root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                sum += curr.val;
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            Double runningAvg = sum / size;
            ans.add(runningAvg);
        }
        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        List<Double> ans = averageOfLevels(root);

        System.out.println(ans);
    }

}

class TreeNode {
    int val;

    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}