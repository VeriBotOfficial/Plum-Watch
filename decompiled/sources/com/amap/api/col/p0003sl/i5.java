package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import com.autonavi.amap.mapcore.AMapEngineUtils;

/* compiled from: WaterMarkerView.java */
/* loaded from: classes11.dex */
class i5 extends qc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j5 f1686a;

    i5(j5 j5Var) {
        this.f1686a = j5Var;
    }

    @Override // com.amap.api.col.p0003sl.qc
    public void runTask() {
        Context context;
        Bitmap bitmap;
        Context context2;
        Context context3;
        Bitmap bitmap2;
        Context context4;
        Context context5;
        this.f1686a.a(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME, 0);
        this.f1686a.a(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME, 1);
        context = this.f1686a.s;
        if ("".equals(n4.a(context, "amap_web_logo", "md5_day", ""))) {
            bitmap = this.f1686a.c;
            if (bitmap != null) {
                bitmap2 = this.f1686a.d;
                if (bitmap2 != null) {
                    String b = i9.b(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME);
                    context4 = this.f1686a.s;
                    n4.b(context4, "amap_web_logo", "md5_day", b);
                    String b2 = i9.b(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME);
                    if (!"".equals(b2)) {
                        context5 = this.f1686a.s;
                        n4.b(context5, "amap_web_logo", "md5_night", b2);
                    }
                    this.f1686a.c(true);
                    return;
                }
            }
            context2 = this.f1686a.s;
            n4.b(context2, "amap_web_logo", "md5_day", "0b718b5f291b09d2b62be725dfb977b3");
            context3 = this.f1686a.s;
            n4.b(context3, "amap_web_logo", "md5_night", "4b1405462a5c910de0e0723ffd96c018");
        }
    }
}
