package com.engaged.sitegui;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SavePreference {
    static final String PREF_USER_NAME= "";
    static final String PREF_PASSWORD="";
    static final String PREF_STOREID="";
    static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setUserName(Context ctx, String userName)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_USER_NAME, userName);
        editor.commit();
    }

    public static String getUserName(Context ctx)
    {
        return getSharedPreferences(ctx).getString(PREF_USER_NAME, null);
    }

    public static void setPrefPassword(Context ctx, String password)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_PASSWORD, password);
        editor.commit();
    }

    public static String getPrefPassword(Context ctx)
    {
        return getSharedPreferences(ctx).getString(PREF_PASSWORD, null);
    }

    public static void setPrefStoreNumber(Context ctx, String storeID)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_STOREID, storeID);
        editor.commit();
    }

    public static String getPrefStoreNumber(Context ctx)
    {
        return getSharedPreferences(ctx).getString(PREF_STOREID, null);
    }

}
