package linghao.leetcode.solution;

import java.util.HashMap;

/**
 * @author linghao,
 * @date 2020/6/9,
 * @time 2:47 下午
 *
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 *
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 *
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 *
 * 示例 1:
 *
 * 输入: s = "egg", t = "add"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * 示例 3:
 *
 * 输入: s = "paper", t = "title"
 * 输出: true
 * 说明:
 * 你可以假设 s 和 t 具有相同的长度。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/isomorphic-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IsomorphicString {
    public boolean isIsomorphic(String x, String y) {
        if(x.length()!=y.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        char[] a = x.toCharArray();
        char[] b = y.toCharArray();
        for(int i=0;i<a.length;i++){
            if(map.get(a[i])==null){//a没有建立映射
                if(map.containsValue(b[i])){//b建立映射
                    return false;
                }
                map.put(a[i],b[i]);
            }else if(map.get(a[i])!=b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicString s = new IsomorphicString();
        System.out.println(s.isIsomorphic("aqd","ert"));
    }
}
