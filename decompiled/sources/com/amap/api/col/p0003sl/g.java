package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.f;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import com.autonavi.aps.amapapi.utils.Utils;
import io.livekit.android.room.util.MediaConstraintKeys;

/* compiled from: ApsServiceCore.java */
/* loaded from: classes11.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    f f1656a;
    Context b;
    Messenger c = null;

    public g(Context context) {
        this.f1656a = null;
        this.b = null;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.f1656a = new f(applicationContext);
    }

    public IBinder a(Intent intent) {
        f.a aVar;
        f fVar = this.f1656a;
        fVar.getClass();
        String stringExtra = intent.getStringExtra("a");
        if (!TextUtils.isEmpty(stringExtra)) {
            a9.a(fVar.i, stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("b");
        fVar.c = stringExtra2;
        z8.c(stringExtra2);
        String stringExtra3 = intent.getStringExtra("d");
        if (!TextUtils.isEmpty(stringExtra3)) {
            d9.a(stringExtra3);
        }
        f fVar2 = this.f1656a;
        fVar2.getClass();
        if (MediaConstraintKeys.TRUE.equals(intent.getStringExtra("as")) && (aVar = fVar2.h) != null) {
            aVar.sendEmptyMessageDelayed(9, 100L);
        }
        Messenger messenger = new Messenger(this.f1656a.h);
        this.c = messenger;
        return messenger.getBinder();
    }

    public void b() {
        try {
            f fVar = this.f1656a;
            if (fVar != null) {
                fVar.h.sendEmptyMessage(11);
            }
        } catch (Throwable th) {
            CoreUtil.reportError(th, "ApsServiceCore", "onDestroy");
        }
    }

    public int c() {
        f fVar = this.f1656a;
        return (fVar == null || fVar.w.isSelfStartServiceEnable()) ? 3 : 2;
    }

    public void a() {
        try {
            f.x = false;
            this.f1656a.n = Utils.getTimeBoot();
            this.f1656a.o = Utils.getTime();
            this.f1656a.b();
        } catch (Throwable th) {
            CoreUtil.reportError(th, "ApsServiceCore", "onCreate");
        }
    }
}
