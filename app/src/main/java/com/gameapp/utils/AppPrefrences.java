package com.gameapp.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class AppPrefrences {

    private static SharedPreferences mPrefs;
    private static SharedPreferences.Editor mPrefsEditor;

    public static boolean isUserLoggedOut(Context ctx) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        return mPrefs.getBoolean("is_logged_in", true);
    }

    public static void setUserLoggedOut(Context ctx, Boolean value) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        mPrefsEditor = mPrefs.edit();
        mPrefsEditor.putBoolean("is_logged_in", value);
        mPrefsEditor.commit();
    }

    public static boolean isUserSkiped(Context ctx) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        return mPrefs.getBoolean("loginSkip", false);
    }

    public static void setUserSkiped(Context ctx, Boolean value) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        mPrefsEditor = mPrefs.edit();
        mPrefsEditor.putBoolean("loginSkip", value);
        mPrefsEditor.commit();
    }

    public static boolean isIntroComplete(Context ctx) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        return mPrefs.getBoolean("intro", false);
    }

    public static void setIntroComplete(Context ctx, Boolean value) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        mPrefsEditor = mPrefs.edit();
        mPrefsEditor.putBoolean("intro", value);
        mPrefsEditor.commit();
    }

    public static String getUserName(Context ctx) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        return mPrefs.getString("userName", "");
    }

    public static void setUserName(Context ctx, String value) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        mPrefsEditor = mPrefs.edit();
        mPrefsEditor.putString("userName", value);
        mPrefsEditor.commit();
    }

    public static String getUserEmail(Context ctx) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        return mPrefs.getString("userEmail", "");
    }

    public static void setUserEmail(Context ctx, String value) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        mPrefsEditor = mPrefs.edit();
        mPrefsEditor.putString("userEmail", value);
        mPrefsEditor.commit();
    }

    public static String getUserPhone(Context ctx) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        return mPrefs.getString("userPhone", "");
    }

    public static void setUserPhone(Context ctx, String value) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        mPrefsEditor = mPrefs.edit();
        mPrefsEditor.putString("userPhone", value);
        mPrefsEditor.commit();
    }

    public static String getUserId(Context ctx) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        return mPrefs.getString("userId", "");
    }

    public static void setUserId(Context ctx, String value) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        mPrefsEditor = mPrefs.edit();
        mPrefsEditor.putString("userId", value);
        mPrefsEditor.commit();
    }

    public static String getCartItemCount(Context ctx) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        return mPrefs.getString("cartItem", "0");
    }

    public static void setCartItemCount(Context ctx, String value) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        mPrefsEditor = mPrefs.edit();
        mPrefsEditor.putString("cartItem", value);
        mPrefsEditor.commit();
    }

    public static String getPaymentDetails(Context ctx) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        return mPrefs.getString("paymentJson", "0");
    }

    public static void setPaymentDetails(Context ctx, String value) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        mPrefsEditor = mPrefs.edit();
        mPrefsEditor.putString("paymentJson", value);
        mPrefsEditor.commit();
    }

    public static String getFirebaseToken(Context ctx) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        return mPrefs.getString("FirebaseToken", "");
    }

    public static void setFirebaseToken(Context ctx, String value) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        mPrefsEditor = mPrefs.edit();
        mPrefsEditor.putString("FirebaseToken", value);
        mPrefsEditor.commit();
    }

    public static void clearAllPreferences(Context ctx) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        mPrefsEditor = mPrefs.edit();
        mPrefsEditor.clear();
        mPrefsEditor.commit();
    }

}
