package org.just.computer.mathproject.Util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCPEncoder {
    public static String encode(String str){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        str = encoder.encode(str);
        return str;
    }
    public static void main(String[] args){
        System.out.println(encode("123"));
    }
}
