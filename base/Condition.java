package base;

/**
 * 分支
 */
public class Condition {
    public static void main(String[] args) {
        // if...else
        int a = 521;
        if (a == 521){
            System.out.println("我爱你！");
        } else {
            System.out.println("我不爱你！");
        }

        // if...else if...else
        int x = 30;
        if( x == 10 ){
            System.out.print("Value of X is 10");
        }else if( x == 20 ){
            System.out.print("Value of X is 20");
        }else if( x == 30 ){
            System.out.print("Value of X is 30");
        }else{
            System.out.print("这是 else 语句");
        }

        // 嵌套分支
        int b = 30;
        int c = 10;
        if( b == 30 ){
            if( c == 10 ){
                System.out.println("B = 30 and C = 10");
            }
        }

        // switch - case
        char level = 'C';
        switch (level)
        {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("要努力了哦~");
                break;
            default:
                System.out.println("成绩异常");
        }
        // switch的穿透现象
        int i = 1;
        switch(i){
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("default");
        }
    }
}
