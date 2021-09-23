package com.wllx.util;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/23 15:46:42
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
public class JasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor=new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
//        String username=encryptor.encrypt("root");
//        String password=encryptor.encrypt("root123");
        String username=encryptor.decrypt("xR3Er9wq5bfXt76zCI2CgQ==");
        String password=encryptor.decrypt("KsJnzPDe76XPszbyDj1HRg==");

        System.out.println(username);
        System.out.println(password);
    }
}
