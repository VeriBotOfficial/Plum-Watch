package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.iy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class ky<T extends iy> extends RecyclerView.ViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
    }

    public abstract void a(T t);
}
