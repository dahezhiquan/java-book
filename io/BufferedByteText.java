package io;

import java.io.*;

/**
 * Buffered字节处理流
 * 拷贝图片
 */
public class BufferedByteText {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "D:\\xiao.jpg";
        String destFilePath = "D:\\cheng.jpg";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
            byte[] buff = new byte[1024];
            int readLen = 0;
            // 循环读文件
            while ((readLen = bis.read(buff)) != -1) {
                // 边读边写
                bos.write(buff, 0, readLen);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert bis != null;
            bis.close();
            assert bos != null;
            bos.close();
        }
    }
}
