package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    final int f20028a;
    final int b;
    public final String c;
    public final String d;
    public final String e;
    private final int f;
    private final int g;

    public b(int i, int i2, int i3, int i4, String str, String str2, String str3) {
        this.f20028a = i;
        this.b = i2;
        this.g = i4;
        this.c = str;
        this.f = i3;
        this.d = str2;
        this.e = str3;
    }

    public final boolean a() {
        return TextUtils.equals(this.d, FastJsonJsonView.DEFAULT_JSONP_CONTENT_TYPE);
    }
}
