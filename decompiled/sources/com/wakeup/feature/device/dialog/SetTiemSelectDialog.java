package com.wakeup.feature.device.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.contrarywind.listener.OnItemSelectedListener;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.adapter.ArrayWheelAdapter;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.device.databinding.DialogTimeSelectLayoutBinding;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class SetTiemSelectDialog extends BaseDialog<DialogTimeSelectLayoutBinding> {
    private static SetTiemSelectDialog instance;
    private OnSetTimeDialogCallBack callBack;
    private List<String> mListHour;
    private List<String> mListMin;
    private int position;
    private int position2;
    private int position3;
    private int position4;

    public interface OnSetTimeDialogCallBack {
        void onSelect(int i, int i2, int i3, int i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTiemSelectDialog(Context context, String[] strArr, String[] strArr2, int i, int i2, int i3, int i4) {
        super(context, 0);
        int i5 = 0;
        setCanceledOnTouchOutside(true);
        ((DialogTimeSelectLayoutBinding) this.mBinding).tvOk.setText(StringUtils.getString(R.string.device_wancheng));
        this.mListHour = new ArrayList();
        this.mListMin = new ArrayList();
        for (String str : strArr) {
            this.mListHour.add(str);
        }
        for (String str2 : strArr2) {
            this.mListMin.add(str2);
        }
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView1.setTextColorCenter(context.getResources().getColor(R.color.color_00bbff));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView1.setTextColorOut(context.getResources().getColor(R.color.textGray));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView1.setTextSize(30.0f);
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView1.setCyclic(false);
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView1.setDividerColor(context.getResources().getColor(R.color.transp));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView1.setAdapter(new ArrayWheelAdapter(this.mListHour));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView2.setTextColorCenter(context.getResources().getColor(R.color.color_00bbff));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView2.setTextColorOut(context.getResources().getColor(R.color.textGray));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView2.setTextSize(30.0f);
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView2.setCyclic(false);
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView2.setDividerColor(context.getResources().getColor(R.color.transp));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView2.setAdapter(new ArrayWheelAdapter(this.mListMin));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView3.setTextColorCenter(context.getResources().getColor(R.color.color_00bbff));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView3.setTextColorOut(context.getResources().getColor(R.color.textGray));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView3.setTextSize(30.0f);
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView3.setCyclic(false);
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView3.setDividerColor(context.getResources().getColor(R.color.transp));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView3.setAdapter(new ArrayWheelAdapter(this.mListHour));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView4.setTextColorCenter(context.getResources().getColor(R.color.color_00bbff));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView4.setTextColorOut(context.getResources().getColor(R.color.textGray));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView4.setTextSize(30.0f);
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView4.setCyclic(false);
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView4.setDividerColor(context.getResources().getColor(R.color.transp));
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView4.setAdapter(new ArrayWheelAdapter(this.mListMin));
        int i6 = 0;
        while (true) {
            if (i6 >= this.mListHour.size()) {
                break;
            }
            if (Integer.valueOf(this.mListHour.get(i6)).intValue() == i) {
                this.position = i6;
                ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView1.setCurrentItem(i6);
                break;
            }
            i6++;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.mListHour.size()) {
                break;
            }
            if (Integer.valueOf(this.mListHour.get(i7)).intValue() == i3) {
                this.position3 = i7;
                ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView3.setCurrentItem(i7);
                break;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= this.mListMin.size()) {
                break;
            }
            if (Integer.valueOf(this.mListMin.get(i8)).intValue() == i2) {
                this.position2 = i8;
                ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView2.setCurrentItem(i8);
                break;
            }
            i8++;
        }
        while (true) {
            if (i5 >= this.mListMin.size()) {
                break;
            }
            if (Integer.valueOf(this.mListMin.get(i5)).intValue() == i4) {
                this.position4 = i5;
                ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView4.setCurrentItem(i5);
                break;
            }
            i5++;
        }
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView1.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.wakeup.feature.device.dialog.SetTiemSelectDialog$$ExternalSyntheticLambda0
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i9) {
                SetTiemSelectDialog.this.lambda$new$0(i9);
            }
        });
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView2.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.wakeup.feature.device.dialog.SetTiemSelectDialog$$ExternalSyntheticLambda1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i9) {
                SetTiemSelectDialog.this.lambda$new$1(i9);
            }
        });
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView3.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.wakeup.feature.device.dialog.SetTiemSelectDialog$$ExternalSyntheticLambda2
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i9) {
                SetTiemSelectDialog.this.lambda$new$2(i9);
            }
        });
        ((DialogTimeSelectLayoutBinding) this.mBinding).mWheelView4.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.wakeup.feature.device.dialog.SetTiemSelectDialog$$ExternalSyntheticLambda3
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i9) {
                SetTiemSelectDialog.this.lambda$new$3(i9);
            }
        });
        ((DialogTimeSelectLayoutBinding) this.mBinding).tvOk.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.device.dialog.SetTiemSelectDialog$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetTiemSelectDialog.this.lambda$new$4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i) {
        this.position = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(int i) {
        this.position2 = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(int i) {
        this.position3 = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(int i) {
        this.position4 = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(View view) {
        this.callBack.onSelect(Integer.parseInt(this.mListHour.get(this.position)), Integer.parseInt(this.mListMin.get(this.position2)), Integer.parseInt(this.mListMin.get(this.position3)), Integer.parseInt(this.mListMin.get(this.position4)));
        dismiss();
    }

    public static synchronized void show(Context context, String[] strArr, String[] strArr2, int i, int i2, int i3, int i4, OnSetTimeDialogCallBack onSetTimeDialogCallBack) {
        synchronized (SetTiemSelectDialog.class) {
            dismissLoading();
            SetTiemSelectDialog setTiemSelectDialog = new SetTiemSelectDialog(context, strArr, strArr2, i, i2, i3, i4);
            instance = setTiemSelectDialog;
            setTiemSelectDialog.setCallBack(onSetTimeDialogCallBack);
            instance.show();
        }
    }

    public static synchronized void dismissLoading() {
        synchronized (SetTiemSelectDialog.class) {
            try {
                SetTiemSelectDialog setTiemSelectDialog = instance;
                if (setTiemSelectDialog != null && setTiemSelectDialog.isShowing()) {
                    instance.dismiss();
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                instance = null;
                throw th;
            }
            instance = null;
        }
    }

    public void setCallBack(OnSetTimeDialogCallBack onSetTimeDialogCallBack) {
        this.callBack = onSetTimeDialogCallBack;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
