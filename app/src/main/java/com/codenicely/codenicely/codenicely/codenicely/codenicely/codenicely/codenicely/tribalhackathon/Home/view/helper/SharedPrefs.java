package com.codenicely.codenicely.codenicely.codenicely.codenicely.codenicely.codenicely.tribalhackathon.Home.view.helper;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by aman on 3/2/17.
 */
public class SharedPrefs {

    private static final String PREF_NAME = "welcome";

    private static final String PREF_NAME_LOGIN = "Login";
    private static final String KEY_IS_LOGGEDIN = "isLoggedIn";
    private static final String KEY_ID = "id";
    private static final String KEY_COMPANY_NAME = "company_name";
    private static final String KEY_FCM = "fcm";
    private static final String KEY_ACCESS_TOKEN = "access_token";
    private static final String KEY_USER_LANGUAGE = "lang_type";
    private static final int KEY_VERSION = 1;
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    private static final String PROFILE_IMAGE = "profile_image";
    private static final String MOBILE= "mobile";
    private static final String EMAIL= "email";
    private static final String AADHAAR= "aadhaar";
    private static final String ADDRESS = "address";
    private static final String STATE = "state";
    private static final String IS_FIRST_TIME_LOGIN ="firstTimeLogin" ;
    private static final String NOTIFICATION_COUNT ="count";
    private static final String FCM_TOKEN = "fcm_token";
    // LogCat tag
    private static String TAG = "Shared Preference";

    // Shared Preferences
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    public SharedPrefs(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public String getProfileImage() {
        return pref.getString(PROFILE_IMAGE, "profile_image");
    }


    public void setProfileImage(String profile_image) {

        editor.putString(PROFILE_IMAGE, profile_image);
        editor.commit();

    }

    public static int getKeyVersion() {
        return KEY_VERSION;
    }

    public String getCompanyName() {
        return pref.getString(KEY_COMPANY_NAME, "Name");
    }

    public void setCompanyName(String company_name) {

        editor.putString(KEY_COMPANY_NAME, company_name);
        editor.commit();


    }
    public String getAccessToken() {

        return pref.getString(KEY_ACCESS_TOKEN, "1");
    }

    public void setAccessToken(String accessToken) {
        editor.putString(KEY_ACCESS_TOKEN, accessToken);
        editor.commit();
    }
    public void setKeyId(int id){
        editor.putInt(KEY_ID,id);
        editor.commit();
    }
    public int getId(){
        return pref.getInt(KEY_ID,0);
    }
    public int getUserLanguage() {
        return pref.getInt(KEY_USER_LANGUAGE, 0);
    }

    public void setUserLanguage(int userLanguage) {
        editor.putInt(KEY_USER_LANGUAGE, userLanguage);
        editor.commit();
    }

    public boolean isFirstTimeLogin() {
        return pref.getBoolean(IS_FIRST_TIME_LOGIN, true);
    }

    //Welcome_Screen
    public void setFirstTimeLogin(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LOGIN, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    //Welcome_Screen
    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public static String getKeyFcm() {
        return KEY_FCM;
    }
    public void setFcm(String fcm){editor.putString(KEY_FCM, fcm);
        editor.commit();

    }
    public boolean isLoggedIn() {
        return pref.getBoolean(KEY_IS_LOGGEDIN, false);
    }

    public void setLoggedIn(boolean loggedIn) {
        editor.putBoolean(KEY_IS_LOGGEDIN, loggedIn);
        editor.commit();
    }


    public String getMobile() {
        return MOBILE;
    }

    public String getEmail() {

        return EMAIL;
    }

    public String getFcmToken() {
        return FCM_TOKEN;
    }

    public void setFcmtoken(String fcm) {

        editor.putString(FCM_TOKEN,fcm);
        editor.commit();
    }


    public void setMobile(String mobile) {
        editor.putString(MOBILE, mobile);
        editor.commit();
    }
    public void setEmail(String email) {
        editor.putString(MOBILE, email);
        editor.commit();
    }
    public String getAadhaar() {

        return AADHAAR;
    }
    public void setAadhaar(String aadhaar) {
        editor.putString(AADHAAR, aadhaar);
        editor.commit();
    }

    public String getADDRESS() {
        return ADDRESS;
    }
    public void setADDRESS(String address) {
        editor.putString(ADDRESS, address);
        editor.commit();
    }

    public String getSTATE() {
        return STATE;
    }
    public void setSTATE(String state) {
        editor.putString(STATE, state);
        editor.commit();
    }

    public int getNotificationCount() {
        return pref.getInt(NOTIFICATION_COUNT,0);
    }
    public void setNotificationCount(int count) {
        editor.putInt(NOTIFICATION_COUNT, count);
        editor.commit();
    }
}
