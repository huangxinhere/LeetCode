public class s_14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int i,j,min=200,flag=0,count=0;
        int[] a = new int[201];
        char c;
//首先排除特殊情况：0或空
        if (strs == null || strs.length == 0) {
            return "";
        }
//最短字符串的长度，确保遍历列的时候不会越界
        for(i=0;i < strs.length;i++)
        {
            a[i] = strs[i].length();
            if (a[i]==0) return "";
            if(a[i]<min) min=a[i];
        }
        for(j=0;j<min;j++)
        {
            c = strs[0].charAt(j);//第一行的每列比较标准（字符
            for(i=0;i<strs.length;i++)
            {
                if(strs[i].charAt(j)==c)//返回指定索引位置的char值
                    continue;
                count=j-1;//能跳到这里表示这次肯定不行
                flag=1;//不相等的情况下
                break;
            }
            if(flag==1) break;
        }
        if (flag==0) count = j-1;//循环完毕都相同
        if(count==-1)
            return "";
        else
            return strs[0].substring(0,count+1);//hello（0，3）——>el结束位的前一个
    }
}
//if (strs == null || strs.length == 0) {
//            return "";
//        }
//        int length = strs[0].length();
//        int count = strs.length;
//        for (int i = 0; i < length; i++) {
//            char c = strs[0].charAt(i);
//            for (int j = 1; j < count; j++) {
//                if (i == strs[j].length() || strs[j].charAt(i) != c) {
//                    return strs[0].substring(0, i);
//                }
//            }
//        }
//        return strs[0];
//    }
//如果有，两种情况，要么遍历完最短那个，要么提前终止，两个情况（||）直接返回
//没有，再另外返回
//要想想不借助另外开辟的内存能不能解决问题
