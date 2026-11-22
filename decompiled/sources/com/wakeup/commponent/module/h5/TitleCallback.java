package com.wakeup.commponent.module.h5;

import android.content.Context;
import android.view.View;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: TitleCallback.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/wakeup/commponent/module/h5/TitleCallback;", "Ljava/io/Serializable;", "onClickExpand", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "onClickMenu", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TitleCallback extends Serializable {
    void onClickExpand(Context context, View view);

    void onClickMenu(Context context, View view);
}
