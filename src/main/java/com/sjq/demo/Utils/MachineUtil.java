package com.sjq.demo.Utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MachineUtil {

    /**
     * 获取本机IP地址
     * @return
     */
    public static String getLocalIP(){
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        byte[] ipAddr = addr.getAddress();
        String ipAddrStr = "";
        for (int i = 0; i < ipAddr.length; i++) {
            if (i > 0) {
                ipAddrStr += ".";
            }
            ipAddrStr += ipAddr[i] & 0xFF;
        }
        //System.out.println(ipAddrStr);
        return ipAddrStr;
    }

    public static void main(String[] args) {
        System.out.println(getLocalIP());
    }
}
