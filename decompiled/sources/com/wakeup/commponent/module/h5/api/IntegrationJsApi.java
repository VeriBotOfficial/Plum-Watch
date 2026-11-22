package com.wakeup.commponent.module.h5.api;

import android.webkit.JavascriptInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.storage.UserDao;
import com.wakeup.common.storage.model.UserModel;
import com.wakeup.commponent.module.h5.JsApi;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IntegrationJsApi extends JsApi {
    private static final String TAG = "AndroidInterface";

    @JavascriptInterface
    public void openAdvert() {
    }

    @JavascriptInterface
    public void buckleIntegral(String str) {
        try {
            LogUtils.i(TAG, "jsonStr = " + str);
            int i = new JSONObject(str).getInt(FirebaseAnalytics.Param.SCORE);
            UserModel user = UserDao.getUser();
            if (user == null) {
                return;
            }
            user.setIntegralScore(user.getIntegralScore() - i);
            UserDao.editUser(user);
        } catch (Exception unused) {
        }
    }

    @Override // com.wakeup.commponent.module.h5.JsApi
    public String getName() {
        return "android";
    }
}
