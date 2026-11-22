package com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view;

import android.view.View;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.AdsObject;
import com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.ICh4omeLike;
import com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.g;

/* loaded from: classes17.dex */
public interface c extends ICh4omeLike {
    void a(AdsObject adsObject);

    void a(String str);

    void a(String str, String str2, String str3);

    void a(String str, String str2, String str3, boolean z);

    boolean a();

    void b();

    void b(String str);

    void c();

    void c(String str);

    void d();

    void e();

    g getJSCallback();

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebViewEventListener(e eVar);
}
