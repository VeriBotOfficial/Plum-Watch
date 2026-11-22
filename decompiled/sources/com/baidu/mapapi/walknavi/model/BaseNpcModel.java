package com.baidu.mapapi.walknavi.model;

import android.graphics.Bitmap;

/* loaded from: classes13.dex */
public class BaseNpcModel {

    /* renamed from: a, reason: collision with root package name */
    private String f8223a = "";
    private String b = "";
    private String c = "";
    private Bitmap d = null;
    private String e = "";
    private boolean f = false;

    public String getDownLoadKey() {
        return this.f8223a;
    }

    public Bitmap getIcon() {
        return this.d;
    }

    public String getLocalPath() {
        return this.e;
    }

    public String getModelSize() {
        return this.c;
    }

    public String getOriginTitle() {
        return this.b;
    }

    public boolean isLoadFromLocal() {
        return this.f;
    }

    public void setDownLoadKey(String str) {
        this.f8223a = str;
    }

    public void setIcon(Bitmap bitmap) {
        this.d = bitmap;
    }

    public void setLoadFromLocal(boolean z) {
        this.f = z;
    }

    public void setLocalPath(String str) {
        this.e = str;
    }

    public void setModelSize(String str) {
        this.c = str;
    }

    public void setOriginTitle(String str) {
        this.b = str;
    }
}
