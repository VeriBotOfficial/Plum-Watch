package com.wakeup.commonui.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.google.android.material.timepicker.TimeModel;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogTimePickerBinding;
import com.wakeup.commonui.utils.UIHelper;
import com.wakeup.module.record.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: TimePickerDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/wakeup/commonui/dialog/TimePickerDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/commonui/databinding/DialogTimePickerBinding;", "context", "Landroid/content/Context;", "mDate", "", "callback", "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;JLkotlin/jvm/functions/Function1;)V", "getMDate", "()J", "setMDate", "(J)V", "mHandler", "Landroid/os/Handler;", "initViews", Constants.ON_START_KEY, "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimePickerDialog extends BaseDialog<DialogTimePickerBinding> {
    private final Function1<Long, Unit> callback;
    private long mDate;
    private final Handler mHandler;

    public final long getMDate() {
        return this.mDate;
    }

    public final void setMDate(long j) {
        this.mDate = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimePickerDialog(Context context, long j, Function1<? super Long, Unit> callback) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mDate = j;
        this.callback = callback;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.mDate * 1000);
        final int i = calendar.get(11);
        final int i2 = calendar.get(12);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 24; i3++) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            arrayList.add(format);
        }
        getMBinding().hourPicker.setData(arrayList);
        getMBinding().hourPicker.setIndicator(false);
        getMBinding().hourPicker.setItemTextSize(UIHelper.dp2px(16.0f));
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < 60; i4++) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            arrayList2.add(format2);
        }
        getMBinding().minutePicker.setData(arrayList2);
        getMBinding().minutePicker.setIndicator(false);
        getMBinding().minutePicker.setItemTextSize(UIHelper.dp2px(16.0f));
        this.mHandler.postDelayed(new Runnable() { // from class: com.wakeup.commonui.dialog.TimePickerDialog$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TimePickerDialog.initViews$lambda$0(TimePickerDialog.this, i, i2);
            }
        }, 50L);
        getMBinding().tvConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.TimePickerDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimePickerDialog.initViews$lambda$1(TimePickerDialog.this, view);
            }
        });
        getMBinding().tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.TimePickerDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimePickerDialog.this.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(TimePickerDialog timePickerDialog, int i, int i2) {
        timePickerDialog.getMBinding().hourPicker.setSelectedItemPosition(i);
        timePickerDialog.getMBinding().minutePicker.setSelectedItemPosition(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(TimePickerDialog timePickerDialog, View view) {
        int currentItemPosition = timePickerDialog.getMBinding().hourPicker.getCurrentItemPosition();
        int currentItemPosition2 = timePickerDialog.getMBinding().minutePicker.getCurrentItemPosition();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, currentItemPosition);
        calendar.set(12, currentItemPosition2);
        long timeInMillis = calendar.getTimeInMillis() / 1000;
        timePickerDialog.mDate = timeInMillis;
        timePickerDialog.callback.invoke(Long.valueOf(timeInMillis));
        timePickerDialog.dismiss();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(17);
        window.setWindowAnimations(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
