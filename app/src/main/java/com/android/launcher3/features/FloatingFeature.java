package com.android.launcher3.features;

//import com.samsung.android.feature.SemFloatingFeature;

// TODO: Samsung specific code
public class FloatingFeature {
    public static String getString(String tag, String defaultValue) {
//        SemFloatingFeature instance = SemFloatingFeature.getInstance();
//        return instance != null ? instance.getString(tag, defaultValue) : defaultValue;
        return defaultValue;
    }

    public static boolean getBoolean(String tag) {
//        SemFloatingFeature instance = SemFloatingFeature.getInstance();
//        return instance != null && instance.getBoolean(tag);
        return false;
    }

    public static boolean getBoolean(String tag, boolean defaultValue) {
//        SemFloatingFeature instance = SemFloatingFeature.getInstance();
//        return instance != null ? instance.getBoolean(tag, defaultValue) : defaultValue;
        return defaultValue;
    }

    public static String getString(String tag) {
//        SemFloatingFeature instance = SemFloatingFeature.getInstance();
//        return instance != null ? instance.getString(tag) : null;
        return null;
    }

    public static int getInt(String tag) {
//        SemFloatingFeature instace = SemFloatingFeature.getInstance();
//        return instace != null ? instace.getInt(tag) : 0;
        return 0;
    }

    public static int getInt(String tag, int defaultValue) {
//        SemFloatingFeature instance = SemFloatingFeature.getInstance();
//        return instance != null ? instance.getInt(tag, defaultValue) : defaultValue;
        return defaultValue;
    }
}
