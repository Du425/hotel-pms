package com.du.pmscommon.utils.uuid;

import java.util.UUID;

/**
 * @Author DU425
 * @Date 2023/3/15 10:52
 * @Version 1.0
 * @Description
 */
public class IdUtils {

    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }

//    public static String simpleUUID() {
//        UUID uuid = UUID.randomUUID();
//        return null;
//    }

    public static String fastUUID() {
        return null;
    }

}
