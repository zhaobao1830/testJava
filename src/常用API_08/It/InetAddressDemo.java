package 常用API_08.It;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 互联网协议IP地址
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByAddress();
        System.out.println(inetAddress);
    }
}
