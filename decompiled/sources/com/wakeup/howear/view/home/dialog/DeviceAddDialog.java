package com.wakeup.howear.view.home.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.commonui.utils.UIHelper;
import com.wakeup.howear.databinding.DialogDeviceAddBinding;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceAddDialog.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0014J\u0006\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u000bR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/wakeup/howear/view/home/dialog/DeviceAddDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/howear/databinding/DialogDeviceAddBinding;", "context", "Landroid/content/Context;", "style", "", "xPostion", "yPostion", "addCallback", "Lkotlin/Function0;", "", "scanCallback", "<init>", "(Landroid/content/Context;IIILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getYPostion", "()I", "getXPostion", "mAddCallback", "getMAddCallback", "()Lkotlin/jvm/functions/Function0;", "setMAddCallback", "(Lkotlin/jvm/functions/Function0;)V", "mScanCallback", "getMScanCallback", "setMScanCallback", "initViews", Constants.ON_START_KEY, "showAddDeviceDialog", "dismissAddDeviceDialog", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceAddDialog extends BaseDialog<DialogDeviceAddBinding> {
    private Function0<Unit> mAddCallback;
    private Function0<Unit> mScanCallback;
    private final int xPostion;
    private final int yPostion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAddDialog(Context context, int i, int i2, int i3, Function0<Unit> addCallback, Function0<Unit> scanCallback) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(addCallback, "addCallback");
        Intrinsics.checkNotNullParameter(scanCallback, "scanCallback");
        this.yPostion = i3;
        this.xPostion = i2;
        this.mAddCallback = addCallback;
        this.mScanCallback = scanCallback;
    }

    public final int getYPostion() {
        return this.yPostion;
    }

    public final int getXPostion() {
        return this.xPostion;
    }

    public final Function0<Unit> getMAddCallback() {
        return this.mAddCallback;
    }

    public final void setMAddCallback(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.mAddCallback = function0;
    }

    public final Function0<Unit> getMScanCallback() {
        return this.mScanCallback;
    }

    public final void setMScanCallback(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.mScanCallback = function0;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        getMBinding().viewClick.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.home.dialog.DeviceAddDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAddDialog.this.dismissAddDeviceDialog();
            }
        });
        getMBinding().addDevice.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.home.dialog.DeviceAddDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAddDialog.initViews$lambda$1(DeviceAddDialog.this, view);
            }
        });
        getMBinding().scanDevice.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.home.dialog.DeviceAddDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAddDialog.initViews$lambda$2(DeviceAddDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(DeviceAddDialog deviceAddDialog, View view) {
        deviceAddDialog.mAddCallback.invoke();
        deviceAddDialog.dismissAddDeviceDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(DeviceAddDialog deviceAddDialog, View view) {
        deviceAddDialog.mScanCallback.invoke();
        deviceAddDialog.dismissAddDeviceDialog();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        if (getMContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            Window window = getWindow();
            if (window != null) {
                window.setGravity(8388659);
            }
        } else {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setGravity(8388661);
            }
        }
        Window window3 = getWindow();
        WindowManager.LayoutParams attributes = window3 != null ? window3.getAttributes() : null;
        if (attributes != null) {
            attributes.width = UIHelper.dp2px(136.0f);
        }
        if (attributes != null) {
            attributes.height = UIHelper.dp2px(133.0f);
        }
        if (attributes != null) {
            attributes.y = this.yPostion;
        }
        if (attributes != null) {
            attributes.x = this.xPostion;
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setAttributes(attributes);
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final void showAddDeviceDialog() {
        dismissAddDeviceDialog();
        show();
    }

    public final void dismissAddDeviceDialog() {
        if (isShowing()) {
            dismiss();
        }
    }
}
