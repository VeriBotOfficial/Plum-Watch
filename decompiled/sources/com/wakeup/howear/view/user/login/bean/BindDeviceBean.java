package com.wakeup.howear.view.user.login.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BindDeviceBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/wakeup/howear/view/user/login/bean/BindDeviceBean;", "", "id", "", "name", "", "image", "imageS", "<init>", "(ILjava/lang/String;II)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getImage", "getImageS", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BindDeviceBean {
    private final int id;
    private final int image;
    private final int imageS;
    private final String name;
    private boolean select;

    public static /* synthetic */ BindDeviceBean copy$default(BindDeviceBean bindDeviceBean, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bindDeviceBean.id;
        }
        if ((i4 & 2) != 0) {
            str = bindDeviceBean.name;
        }
        if ((i4 & 4) != 0) {
            i2 = bindDeviceBean.image;
        }
        if ((i4 & 8) != 0) {
            i3 = bindDeviceBean.imageS;
        }
        return bindDeviceBean.copy(i, str, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final int getImageS() {
        return this.imageS;
    }

    public final BindDeviceBean copy(int id2, String name, int image, int imageS) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new BindDeviceBean(id2, name, image, imageS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindDeviceBean)) {
            return false;
        }
        BindDeviceBean bindDeviceBean = (BindDeviceBean) other;
        return this.id == bindDeviceBean.id && Intrinsics.areEqual(this.name, bindDeviceBean.name) && this.image == bindDeviceBean.image && this.imageS == bindDeviceBean.imageS;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.image)) * 31) + Integer.hashCode(this.imageS);
    }

    public String toString() {
        return "BindDeviceBean(id=" + this.id + ", name=" + this.name + ", image=" + this.image + ", imageS=" + this.imageS + Separators.RPAREN;
    }

    public BindDeviceBean(int i, String name, int i2, int i3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
        this.image = i2;
        this.imageS = i3;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getImage() {
        return this.image;
    }

    public final int getImageS() {
        return this.imageS;
    }

    public final boolean getSelect() {
        return this.select;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }
}
