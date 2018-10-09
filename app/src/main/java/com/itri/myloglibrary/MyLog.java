package com.itri.myloglibrary;

public class MyLog {

    public static boolean isShowLOG = false;

    public static void i(String tag, String string)
    {
        if (isShowLOG)
            android.util.Log.i(tag, string);
    }
    public static void e(String tag, String string)
    {
        if (isShowLOG)
            android.util.Log.e(tag, string);
    }
    public static void d(String tag, String string)
    {
        if (isShowLOG)
            android.util.Log.d(tag, string);
    }
    public static void v(String tag, String string) {
        if (isShowLOG)
            android.util.Log.v(tag, string);
    }
    public static void w(String tag, String string) {
        if (isShowLOG)
            android.util.Log.w(tag, string);
    }
}
