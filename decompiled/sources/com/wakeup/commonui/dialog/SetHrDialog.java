package com.wakeup.commonui.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.contrarywind.listener.OnItemSelectedListener;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.adapter.ArrayWheelAdapter;
import com.wakeup.commonui.databinding.DialogSethrBinding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class SetHrDialog extends BaseDialog<DialogSethrBinding> {
    private static SetHrDialog instance;
    private OnSetHrDialogCallBack callBack;
    private final List<String> mList;
    private int position;

    public interface OnSetHrDialogCallBack {
        void onSelect(int i);
    }

    public static synchronized void show(Context context, String[] strArr, String str, int i, OnSetHrDialogCallBack onSetHrDialogCallBack) {
        synchronized (SetHrDialog.class) {
            dismissLoading();
            SetHrDialog setHrDialog = new SetHrDialog(context, strArr, str, i);
            instance = setHrDialog;
            setHrDialog.setCallBack(onSetHrDialogCallBack);
            instance.show();
        }
    }

    public static synchronized void dismissLoading() {
        synchronized (SetHrDialog.class) {
            try {
                SetHrDialog setHrDialog = instance;
                if (setHrDialog != null && setHrDialog.isShowing()) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetHrDialog(Context context, String[] strArr, final String str, int i) {
        super(context, 0);
        int i2 = 0;
        setCanceledOnTouchOutside(true);
        ((DialogSethrBinding) this.mBinding).tvOk.setText(StringUtils.getString(R.string.device_wancheng));
        if (TextUtils.isEmpty(str)) {
            ((DialogSethrBinding) this.mBinding).tvUnit.setText("");
        } else {
            ((DialogSethrBinding) this.mBinding).tvUnit.setText(str);
        }
        ArrayList arrayList = new ArrayList();
        this.mList = arrayList;
        Collections.addAll(arrayList, strArr);
        ((DialogSethrBinding) this.mBinding).mWheelView1.setTextColorCenter(context.getResources().getColor(R.color.color_00bbff));
        ((DialogSethrBinding) this.mBinding).mWheelView1.setTextColorOut(context.getResources().getColor(R.color.textGray));
        ((DialogSethrBinding) this.mBinding).mWheelView1.setTextSize(30.0f);
        ((DialogSethrBinding) this.mBinding).mWheelView1.setCyclic(false);
        ((DialogSethrBinding) this.mBinding).mWheelView1.setDividerColor(context.getResources().getColor(R.color.transp));
        ((DialogSethrBinding) this.mBinding).mWheelView1.setAdapter(new ArrayWheelAdapter(arrayList));
        if (TextUtils.isEmpty(str)) {
            while (true) {
                if (i2 >= this.mList.size()) {
                    break;
                }
                if (i2 == i) {
                    this.position = i2;
                    ((DialogSethrBinding) this.mBinding).mWheelView1.setCurrentItem(i2);
                    break;
                }
                i2++;
            }
        } else {
            while (true) {
                if (i2 >= this.mList.size()) {
                    break;
                }
                if (Integer.valueOf(this.mList.get(i2)).intValue() == i) {
                    this.position = i2;
                    ((DialogSethrBinding) this.mBinding).mWheelView1.setCurrentItem(i2);
                    break;
                }
                i2++;
            }
        }
        ((DialogSethrBinding) this.mBinding).mWheelView1.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.wakeup.commonui.dialog.SetHrDialog$$ExternalSyntheticLambda0
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i3) {
                SetHrDialog.this.lambda$new$0(i3);
            }
        });
        ((DialogSethrBinding) this.mBinding).tvOk.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.SetHrDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetHrDialog.this.lambda$new$1(str, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i) {
        this.position = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(String str, View view) {
        if (TextUtils.isEmpty(str)) {
            this.callBack.onSelect(this.position);
        } else {
            this.callBack.onSelect(Integer.valueOf(this.mList.get(this.position)).intValue());
        }
        dismiss();
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

    public void setCallBack(OnSetHrDialogCallBack onSetHrDialogCallBack) {
        this.callBack = onSetHrDialogCallBack;
    }
}
