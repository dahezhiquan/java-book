package classes;

import java.util.Arrays;

/**
 * System类演示
 */
public class SystemTest {
    public static void main(String[] args) {
        int[] src = {1, 2, 3};
        int[] dest = new int[3];
        /**
         * 参数1：源数组
         * 参数2：从源数组的那个位置开始拷贝
         * 参数3：目标数组
         * 参数4：把源数组的数据拷贝到目标数组的那个索引
         * 参数5：从源数组拷贝多少的数到目标数组
         */
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println(Arrays.toString(dest));
        // 返回当前时间距离1970年1月1日的毫秒数
        System.out.println(System.currentTimeMillis());
        // 调用垃圾回收机制
        System.gc();
        // 退出当前程序
        // 0：程序正常退出
        System.exit(0);
    }
}
