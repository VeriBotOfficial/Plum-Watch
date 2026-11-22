package com.wakeup.howear.view.home;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.view.View;
import com.wakeup.common.network.entity.other.SubassemblyEntity;
import kotlin.Metadata;

/* compiled from: IndexFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/wakeup/howear/view/home/SubassemblyLongListener;", "", "onLongClickSubViewAction", "", ParameterNames.INFO, "Lcom/wakeup/common/network/entity/other/SubassemblyEntity;", "v", "Landroid/view/View;", "onClickSubViewAction", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SubassemblyLongListener {
    void onClickSubViewAction(SubassemblyEntity info);

    void onLongClickSubViewAction(SubassemblyEntity info, View v);
}
