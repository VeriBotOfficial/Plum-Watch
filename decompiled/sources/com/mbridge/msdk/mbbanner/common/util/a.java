package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.o0;

/* compiled from: BannerDelivery.java */
/* loaded from: classes17.dex */
public class a {
    private static final String c = "a";

    /* renamed from: a, reason: collision with root package name */
    private final Handler f11777a = new Handler(Looper.getMainLooper());
    private boolean b;

    /* compiled from: BannerDelivery.java */
    /* renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    class RunnableC0697a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f11778a;
        final /* synthetic */ String b;
        final /* synthetic */ CampaignUnit c;

        RunnableC0697a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.f11778a = bVar;
            this.b = str;
            this.c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f11778a;
            if (bVar != null) {
                bVar.a(this.b, this.c, a.this.b);
            }
        }
    }

    /* compiled from: BannerDelivery.java */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f11779a;
        final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

        b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f11779a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11779a != null) {
                this.b.a(a.this.b);
                this.f11779a.a(this.b);
            }
        }
    }

    /* compiled from: BannerDelivery.java */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f11780a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i) {
            this.f11780a = bVar;
            this.b = str;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f11780a;
            if (bVar != null) {
                bVar.a(this.b, this.c, a.this.b);
            }
        }
    }

    /* compiled from: BannerDelivery.java */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f11781a;
        final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

        d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f11781a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11781a != null) {
                this.b.a(a.this.b);
                this.f11781a.b(this.b);
            }
        }
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        o0.b(c, "postResourceFail unitId=" + bVar2);
        this.f11777a.post(new d(bVar, bVar2));
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        o0.b(c, "postCampaignSuccess unitId=" + str);
        this.f11777a.post(new RunnableC0697a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.f11777a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i) {
        o0.b(c, "postResourceSuccess unitId=" + str);
        this.f11777a.post(new c(bVar, str, i));
    }
}
