import jdk.internal.jshell.tool.resources.version;

class Solution {
    public static void exchangeTwoInt(int a, int b){

        System.out.println("before a: "+ a);
        System.out.println("before b: "+ b);

        int c = a;
        a = b;
        b = c;
        System.out.println("after a: "+ a);
        System.out.println("after b: "+ b);

    }
    
}


