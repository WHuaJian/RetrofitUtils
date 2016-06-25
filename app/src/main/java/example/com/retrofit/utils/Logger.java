package example.com.retrofit.utils;

import com.apkfuns.logutils.LogUtils;

import example.com.retrofit.BuildConfig;

/**
 * Created by weihuajian on 16/5/19.
 */
public class Logger {
    private static boolean isDEBUG = true;

    static {
        isDEBUG = BuildConfig.ISDEBUG;
        LogUtils.configAllowLog = isDEBUG;
    }

    public static void i(String value) {
        if (isDEBUG) {
            LogUtils.i(value);
        }
    }

    public static boolean isDEBUG() {
        return isDEBUG;
    }

    public static void d(String value) {
        if (isDEBUG) {
            LogUtils.d(value);
        }
    }


    public static void e(String value) {
        if (isDEBUG) {
            LogUtils.e(value);
        }
    }


    public static void v(String value) {
        if (isDEBUG) {
            LogUtils.v(value);
        }
    }

    /**
     * 打印json
     *
     * @param value
     */
    public static void json(String value) {
        if (isDEBUG) {
            LogUtils.json(value);
        }
    }

}
