package com.qumeng.overseas.advlib.__remote__.framework.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import com.qumeng.overseas.advlib.__remote__.framework.imageloader.k;

/* loaded from: classes17.dex */
public class m implements h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile m f12970a;

    class a extends com.qumeng.overseas.advlib.__remote__.framework.imageloader.a<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f12971a;

        a(i iVar) {
            this.f12971a = iVar;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.a
        public void onResourceReady(Bitmap bitmap) {
            if (this.f12971a.a() != null) {
                this.f12971a.a().onResourceReady(bitmap);
            }
        }
    }

    private m() {
    }

    public static m c() {
        if (f12970a == null) {
            synchronized (m.class) {
                if (f12970a == null) {
                    f12970a = new m();
                }
            }
        }
        return f12970a;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.h
    public void a(Context context) {
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.h
    public void b() {
        k.e().c();
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.h
    public void a(i iVar) {
        if (iVar == null) {
            return;
        }
        if (iVar.p()) {
            k.e().c(iVar.m());
            return;
        }
        if (iVar.n()) {
            k.e().b(iVar.m()).transform(iVar.l()).into(new a(iVar));
            return;
        }
        k.d b = k.e().b();
        if (iVar.i() != null) {
            b.scaleType(iVar.i());
        }
        if (iVar.f() != null) {
            b.placeholder(iVar.f());
        }
        if (iVar.g() > 0) {
            b.placeholder(iVar.g());
        }
        if (iVar.c() != null) {
            b.error(iVar.c());
        }
        if (iVar.d() > 0) {
            b.error(iVar.d());
        }
        if (iVar.q()) {
            b.d = iVar.h();
        }
        if (iVar.r()) {
            b.thumbnail(iVar.j(), iVar.k());
        }
        if (iVar.l() != null) {
            b.transform(iVar.l());
        }
        b.grayImage(iVar.o());
        b.url(iVar.m());
        b.memoryCache(iVar.s());
        b.diskCache(true);
        b.into(iVar.e().get());
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.h
    public void a() {
        k.e().d();
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.h
    public void a(String str) {
        k.e().a(str);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.h
    public void a(Context context, String str, oqma.a aVar) {
        if (aVar != null) {
            k.a(context, str, aVar);
        }
    }
}
