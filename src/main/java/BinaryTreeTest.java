import java.util.Scanner;

/**
 * Project name(项目名称)：算法_二叉树的实现之中序遍历
 * Package(包名): PACKAGE_NAME
 * Class(类名): BinaryTreeTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/17
 * Time(创建时间)： 10:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class BinaryTreeTest
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int data[] = new int[n];
        while (in.hasNext())
        {
            int item = in.nextInt();
            data[i++] = item;
        }
        BinaryTree.TreeNode root = tree.createTree(data);
        tree.inOrder(root);
    }
}
