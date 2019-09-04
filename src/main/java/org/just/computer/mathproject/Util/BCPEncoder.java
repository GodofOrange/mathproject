package org.just.computer.mathproject.Util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCPEncoder {
    public static String encode(String str){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        str = encoder.encode(str);
        return str;
    }
}
