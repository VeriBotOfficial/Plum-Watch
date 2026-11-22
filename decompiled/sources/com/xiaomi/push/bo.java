package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.af;
import com.xiaomi.push.bx;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class bo {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bo f14463a;

    /* renamed from: a, reason: collision with other field name */
    private Context f234a;

    /* renamed from: a, reason: collision with other field name */
    private by f236a;

    /* renamed from: a, reason: collision with other field name */
    private bz f237a;
    private String e;
    private String f;

    /* renamed from: a, reason: collision with other field name */
    private final String f238a = "push_stat_sp";

    /* renamed from: b, reason: collision with other field name */
    private final String f239b = "upload_time";

    /* renamed from: c, reason: collision with other field name */
    private final String f240c = "delete_time";
    private final String d = "check_time";

    /* renamed from: a, reason: collision with other field name */
    private af.a f235a = new af.a() { // from class: com.xiaomi.push.bo.1
        @Override // com.xiaomi.push.af.a
        /* renamed from: a */
        public String mo11916a() {
            return "10052";
        }

        @Override // java.lang.Runnable
        public void run() {
            com.xiaomi.channel.commonutils.logger.b.c("exec== mUploadJob");
            if (bo.this.f237a != null) {
                bo.this.f237a.a(bo.this.f234a);
                bo.this.b("upload_time");
            }
        }
    };
    private af.a b = new af.a() { // from class: com.xiaomi.push.bo.2
        @Override // com.xiaomi.push.af.a
        /* renamed from: a */
        public String mo11916a() {
            return "10054";
        }

        @Override // java.lang.Runnable
        public void run() {
            com.xiaomi.channel.commonutils.logger.b.c("exec== DbSizeControlJob");
            bx.a(bo.this.f234a).a(new bq(bo.this.c(), new WeakReference(bo.this.f234a)));
            bo.this.b("check_time");
        }
    };
    private af.a c = new af.a() { // from class: com.xiaomi.push.bo.3
        @Override // com.xiaomi.push.af.a
        /* renamed from: a */
        public String mo11916a() {
            return "10053";
        }

        @Override // java.lang.Runnable
        public void run() {
            if (bo.this.f237a != null) {
                bo.this.f237a.b(bo.this.f234a);
                bo.this.b("delete_time");
            }
        }
    };

    private bo(Context context) {
        this.f234a = context;
    }

    public static bo a(Context context) {
        if (f14463a == null) {
            synchronized (bo.class) {
                if (f14463a == null) {
                    f14463a = new bo(context);
                }
            }
        }
        return f14463a;
    }

    private boolean a() {
        return com.xiaomi.push.service.ah.a(this.f234a).a(gl.StatDataSwitch.a(), true);
    }

    public void a(bx.a aVar) {
        bx.a(this.f234a).a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        SharedPreferences.Editor edit = this.f234a.getSharedPreferences("push_stat_sp", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        p.a(edit);
    }

    public void a(String str, String str2, Boolean bool) {
        if (this.f236a != null) {
            if (bool.booleanValue()) {
                this.f236a.a(this.f234a, str2, str);
            } else {
                this.f236a.b(this.f234a, str2, str);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m11924a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public void a(String str) {
        if (a() && !TextUtils.isEmpty(str)) {
            a(ca.a(this.f234a, str));
        }
    }

    public void a(gk gkVar) {
        if (a() && com.xiaomi.push.service.az.a(gkVar.e())) {
            a(bu.a(this.f234a, c(), gkVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        return this.f234a.getDatabasePath(bp.f242a).getAbsolutePath();
    }
}
