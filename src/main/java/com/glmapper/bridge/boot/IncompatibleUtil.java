package com.glmapper.bridge.boot;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/8/13 9:14 PM
 * @since:
 **/
public class IncompatibleUtil {

    public static String test1(){
        return "test1";
    }


    public static String test3(){
        return Incompatible.test();
    }

    public static class Incompatible {
        public static String test() {
            return "test";
        }
    }
}
