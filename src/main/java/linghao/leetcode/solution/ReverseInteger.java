package linghao.leetcode.solution;

/**
 * @author linghao,
 * @date 2020/6/9,
 * @time 9:34 上午
 *
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseInteger {

    public int reverse(int x) {
        int y=0;
        while (x!=0){
            if(y*10L>Integer.MAX_VALUE||y*10L<Integer.MIN_VALUE){
                System.out.println(0);
                return 0;
            }
            y=x%10+y*10;
            x=x/10;
        }
        System.out.println(y);
        return y;
    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        r.reverse(1534236469);
    }
}
