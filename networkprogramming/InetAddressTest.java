package networkprogramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress类演示
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        // 获取本机的InetAddress对象：主机名 + IP地址
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        // 根据主机名获取InetAddress对象
        InetAddress host1 = InetAddress.getByName("Dahe-Windows11");
        System.out.println(host1);

        // 根据域名获取InetAddress对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);

        // 通过InetAddress对象获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);

        // 通过InetAddress对象获取主机名或者域名
        String hostName = host2.getHostName();
        System.out.println(hostName);
    }
}
