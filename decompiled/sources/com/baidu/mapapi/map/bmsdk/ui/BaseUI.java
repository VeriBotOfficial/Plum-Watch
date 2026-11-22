package com.baidu.mapapi.map.bmsdk.ui;

import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;

/* loaded from: classes13.dex */
public abstract class BaseUI {

    /* renamed from: a, reason: collision with root package name */
    private BmBaseUI f8029a;
    private String b;
    protected onBaseUIListener listener;

    public interface onBaseUIListener {
        void onBaseUIRemove(BaseUI baseUI);

        void onBaseUIUpdate(BaseUI baseUI);
    }

    public BmBaseUI getBmBaseUI() {
        return this.f8029a;
    }

    public String getClickAction() {
        return this.b;
    }

    public void remove() {
        onBaseUIListener onbaseuilistener = this.listener;
        if (onbaseuilistener != null) {
            onbaseuilistener.onBaseUIRemove(this);
        }
    }

    public void setClickAction(String str) {
        this.b = str;
    }

    public void setListener(onBaseUIListener onbaseuilistener) {
        this.listener = onbaseuilistener;
    }
}
