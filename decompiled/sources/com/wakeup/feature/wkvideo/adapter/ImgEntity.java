package com.wakeup.feature.wkvideo.adapter;

import android.text.TextUtils;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/* loaded from: classes3.dex */
public class ImgEntity implements MultiItemEntity {
    private final String path;

    public ImgEntity(String str) {
        this.path = str;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return !TextUtils.isEmpty(this.path) ? 1 : 0;
    }

    public String getPath() {
        return this.path;
    }
}
