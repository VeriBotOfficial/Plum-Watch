package com.wakeup.common.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.blankj.utilcode.util.LanguageUtils;
import com.wakeup.common.i18n.I18nOverrideManager;
import com.wakeup.common.i18n.OverrideResources;
import java.util.Locale;

/* loaded from: classes2.dex */
public class BaseApplication extends Application {
    protected static Application sApplication;
    protected static Context sContext;
    private Resources i18nOverrideBase;
    private Resources i18nOverrideRes;

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        if (resources == null) {
            return resources;
        }
        I18nOverrideManager i18nOverrideManager = I18nOverrideManager.INSTANCE;
        if (!I18nOverrideManager.isEnabled()) {
            return resources;
        }
        if (this.i18nOverrideBase != resources || this.i18nOverrideRes == null) {
            this.i18nOverrideBase = resources;
            this.i18nOverrideRes = new OverrideResources(resources);
        }
        return this.i18nOverrideRes;
    }

    public static Context getContext() {
        return sContext;
    }

    public static Application getApplication() {
        return sApplication;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        sContext = this;
        sApplication = this;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
    }

    private void setAppLanguage() {
        LanguageUtils.applyLanguage(Locale.SIMPLIFIED_CHINESE);
    }
}
