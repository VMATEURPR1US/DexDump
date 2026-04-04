package com.v7878.hooks.pmpatch;

import android.util.Log;

import com.v7878.zygisk.ZygoteLoader;

public class Main {
    public static String TAG = "DEX_DUMP";

    public static void premain() {
        // nop
    }

    @SuppressWarnings("ConfusingMainMethod")
    public static void main() {
        Log.i(TAG, "Injected into " + ZygoteLoader.getPackageName());
        try {
            ClassLoaderInit.init();
        } catch (Throwable th) {
            Log.e(TAG, "Exception", th);
        }
        Log.i(TAG, "Done");
    }
}
