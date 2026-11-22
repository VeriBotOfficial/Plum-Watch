package com.wakeup.feature.device.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.commonui.utils.CommonUtil;
import com.wakeup.feature.device.databinding.DialogSetrepeatBinding;

/* loaded from: classes3.dex */
public class SetRepeatDialog extends BaseDialog<DialogSetrepeatBinding> implements CompoundButton.OnCheckedChangeListener {
    private static SetRepeatDialog instance;
    private OnSetRepeatDialogCallBack callBack;

    public interface OnSetRepeatDialogCallBack {
        void onSelect(String str);
    }

    public static synchronized void show(Context context, String str, OnSetRepeatDialogCallBack onSetRepeatDialogCallBack) {
        synchronized (SetRepeatDialog.class) {
            dismissLoading();
            SetRepeatDialog setRepeatDialog = new SetRepeatDialog(context, str);
            instance = setRepeatDialog;
            setRepeatDialog.setCallBack(onSetRepeatDialogCallBack);
            instance.show();
        }
    }

    public static synchronized void dismissLoading() {
        synchronized (SetRepeatDialog.class) {
            try {
                SetRepeatDialog setRepeatDialog = instance;
                if (setRepeatDialog != null && setRepeatDialog.isShowing()) {
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
    public SetRepeatDialog(Context context, String str) {
        super(context, 0);
        int i = 0;
        setCanceledOnTouchOutside(true);
        ((DialogSetrepeatBinding) this.mBinding).tvOk.setText(StringUtils.getString(R.string.device_wancheng));
        ((DialogSetrepeatBinding) this.mBinding).mCheckBoxNone.setText(StringUtils.getString(R.string.clock_buchongfu));
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox1.setText(CommonUtil.getWeekStr(1, context));
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox2.setText(CommonUtil.getWeekStr(2, context));
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox3.setText(CommonUtil.getWeekStr(3, context));
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox4.setText(CommonUtil.getWeekStr(4, context));
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox5.setText(CommonUtil.getWeekStr(5, context));
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox6.setText(CommonUtil.getWeekStr(6, context));
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox7.setText(CommonUtil.getWeekStr(7, context));
        ((DialogSetrepeatBinding) this.mBinding).mCheckBoxNone.setOnCheckedChangeListener(this);
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox1.setOnCheckedChangeListener(this);
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox2.setOnCheckedChangeListener(this);
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox3.setOnCheckedChangeListener(this);
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox4.setOnCheckedChangeListener(this);
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox5.setOnCheckedChangeListener(this);
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox6.setOnCheckedChangeListener(this);
        ((DialogSetrepeatBinding) this.mBinding).mCheckBox7.setOnCheckedChangeListener(this);
        int length = str.length();
        while (i < length) {
            int i2 = i + 1;
            String substring = str.substring(i, i2);
            switch (i) {
                case 0:
                    ((DialogSetrepeatBinding) this.mBinding).mCheckBoxNone.setChecked(substring.equals("1"));
                    break;
                case 1:
                    ((DialogSetrepeatBinding) this.mBinding).mCheckBox7.setChecked(substring.equals("1"));
                    break;
                case 2:
                    ((DialogSetrepeatBinding) this.mBinding).mCheckBox6.setChecked(substring.equals("1"));
                    break;
                case 3:
                    ((DialogSetrepeatBinding) this.mBinding).mCheckBox5.setChecked(substring.equals("1"));
                    break;
                case 4:
                    ((DialogSetrepeatBinding) this.mBinding).mCheckBox4.setChecked(substring.equals("1"));
                    break;
                case 5:
                    ((DialogSetrepeatBinding) this.mBinding).mCheckBox3.setChecked(substring.equals("1"));
                    break;
                case 6:
                    ((DialogSetrepeatBinding) this.mBinding).mCheckBox2.setChecked(substring.equals("1"));
                    break;
                case 7:
                    ((DialogSetrepeatBinding) this.mBinding).mCheckBox1.setChecked(substring.equals("1"));
                    break;
            }
            i = i2;
        }
        ((DialogSetrepeatBinding) this.mBinding).tvOk.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.device.dialog.SetRepeatDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                sb.append(((DialogSetrepeatBinding) SetRepeatDialog.this.mBinding).mCheckBoxNone.isChecked() ? "1" : "0");
                sb.append(((DialogSetrepeatBinding) SetRepeatDialog.this.mBinding).mCheckBox7.isChecked() ? "1" : "0");
                sb.append(((DialogSetrepeatBinding) SetRepeatDialog.this.mBinding).mCheckBox6.isChecked() ? "1" : "0");
                sb.append(((DialogSetrepeatBinding) SetRepeatDialog.this.mBinding).mCheckBox5.isChecked() ? "1" : "0");
                sb.append(((DialogSetrepeatBinding) SetRepeatDialog.this.mBinding).mCheckBox4.isChecked() ? "1" : "0");
                sb.append(((DialogSetrepeatBinding) SetRepeatDialog.this.mBinding).mCheckBox3.isChecked() ? "1" : "0");
                sb.append(((DialogSetrepeatBinding) SetRepeatDialog.this.mBinding).mCheckBox2.isChecked() ? "1" : "0");
                sb.append(((DialogSetrepeatBinding) SetRepeatDialog.this.mBinding).mCheckBox1.isChecked() ? "1" : "0");
                SetRepeatDialog.this.callBack.onSelect(sb.toString());
                SetRepeatDialog.this.dismiss();
            }
        });
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int id2 = compoundButton.getId();
        if (id2 == com.wakeup.feature.device.R.id.mCheckBoxNone) {
            if (z) {
                ((DialogSetrepeatBinding) this.mBinding).mCheckBox1.setChecked(false);
                ((DialogSetrepeatBinding) this.mBinding).mCheckBox2.setChecked(false);
                ((DialogSetrepeatBinding) this.mBinding).mCheckBox3.setChecked(false);
                ((DialogSetrepeatBinding) this.mBinding).mCheckBox4.setChecked(false);
                ((DialogSetrepeatBinding) this.mBinding).mCheckBox5.setChecked(false);
                ((DialogSetrepeatBinding) this.mBinding).mCheckBox6.setChecked(false);
                ((DialogSetrepeatBinding) this.mBinding).mCheckBox7.setChecked(false);
                return;
            }
            return;
        }
        if ((id2 == com.wakeup.feature.device.R.id.mCheckBox1 || id2 == com.wakeup.feature.device.R.id.mCheckBox2 || id2 == com.wakeup.feature.device.R.id.mCheckBox3 || id2 == com.wakeup.feature.device.R.id.mCheckBox4 || id2 == com.wakeup.feature.device.R.id.mCheckBox5 || id2 == com.wakeup.feature.device.R.id.mCheckBox6 || id2 == com.wakeup.feature.device.R.id.mCheckBox7) && z) {
            ((DialogSetrepeatBinding) this.mBinding).mCheckBoxNone.setChecked(false);
        }
    }

    public void setCallBack(OnSetRepeatDialogCallBack onSetRepeatDialogCallBack) {
        this.callBack = onSetRepeatDialogCallBack;
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
