package com.wakeup.common.base;

import androidx.viewbinding.ViewBinding;
import com.wakeup.common.base.BaseViewModel;
import kotlin.Metadata;

/* compiled from: BaseBottomDialogFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, d2 = {"Lcom/wakeup/common/base/BaseBottomDialogFragment;", "vm", "Lcom/wakeup/common/base/BaseViewModel;", "vb", "Landroidx/viewbinding/ViewBinding;", "Lcom/wakeup/common/base/BaseDialogFragment;", "<init>", "()V", "gravity", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BaseBottomDialogFragment<vm extends BaseViewModel, vb extends ViewBinding> extends BaseDialogFragment<vm, vb> {
    @Override // com.wakeup.common.base.BaseDialogFragment
    protected int gravity() {
        return 80;
    }
}
