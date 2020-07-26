package com.engaged.sitegui;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashSet;
import java.util.Set;

public class SavePreference {
    Set<String> set = new HashSet<String>();
    static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public void setUserName(String email) throws JSONException {
        set.add("{'email':'" + email  +"'}");
    }


    public void setPrefPassword(String password) throws JSONException {
        set.add("{'password':'" + password  +"'}");
    }

    public void setPrefStoreNumber(Context ctx, String storeID) throws JSONException {

        set.add("{'storeID':'" + storeID  +"'}");
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putStringSet("set", set);
        editor.commit();
    }

    public Set<String> getSavedPrefSet()
    {
        return set;
    }


}
