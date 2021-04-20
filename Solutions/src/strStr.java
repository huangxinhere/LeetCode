public class strStr {
    public static void main(String[] args) {
        String haystack = "mississippi";//mississippi
        String needle = "issip";//issip
        char hay[] = haystack.toCharArray();
        char need[] = needle.toCharArray();
        System.out.println(strStr(haystack,needle));

    }

    public static int strStr(String haystack, String needle) {
        char hay[] = haystack.toCharArray();
        char need[] = needle.toCharArray();
        boolean flag2 = true;
        //char first = need[0];预防first为空

        //needle为空
        if (need.length == 0){
            return 0;
        }else {
            //needle长
            if (need.length <= hay.length) {
                for (int i = 0; i < hay.length - need.length + 1; i++) {
                    //第一个相等,每次都重新比较
                    flag2 = true;
                    if (need[0] == hay[i]) {
                        for (int j = i + 1, count = 1; count < need.length; j++, count++) {
                            //往后对比，不相等则false
                            if (hay[j] != need[count]) {
                                flag2 = false;
                                break;
                            }
                        }
                        if (flag2 == true) {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }
    }


}
