package com.baidu.ar.libloader;

import android.content.Context;
import com.baidu.ar.ARType;
import com.baidu.ar.libloader.ILibLoader;

/* loaded from: classes12.dex */
public class b implements ILibLoader {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7071a = false;
    public d b = new d();

    @Override // com.baidu.ar.libloader.ILibLoader
    public void load(Context context, ILibLoader.b bVar) {
        this.f7071a = true;
        this.b.b();
        this.b.a();
        if (bVar != null) {
            bVar.onSuccess();
        }
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void prepareCaseRes(ARType aRType, String str, String str2, ILibLoader.a aVar) {
        if (aVar != null) {
            aVar.a(aRType, str, str2);
        }
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void release() {
        d dVar = this.b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void require(String str) {
        System.loadLibrary(str);
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void setLibLoadPlugin(ILibLoaderPlugin iLibLoaderPlugin) {
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void setLibReadyListener(String str, ILibLoader.c cVar) {
        if (cVar != null) {
            if (this.f7071a) {
                cVar.onReady();
            } else {
                this.b.a(str, cVar);
            }
        }
    }
}
