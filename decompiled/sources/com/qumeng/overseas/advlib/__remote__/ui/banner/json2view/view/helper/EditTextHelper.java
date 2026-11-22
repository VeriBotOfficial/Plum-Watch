package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IEditText;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView;
import com.qumeng.overseas.advlib.__remote__.utils.bugman.a;

/* loaded from: classes17.dex */
public class EditTextHelper extends TextViewHelper {
    EditText editText;
    IEditText iEditText;

    public EditTextHelper(IView iView, View view) {
        super(iView, view);
        this.iEditText = (IEditText) iView;
        this.editText = (EditText) view;
    }

    private void setHint() {
        String hint = this.iEditText.getHint();
        if (TextUtils.isEmpty(hint)) {
            return;
        }
        this.editText.setHint(hint);
    }

    private void setHintColor() {
        String textColorHint = this.iEditText.getTextColorHint();
        if (TextUtils.isEmpty(textColorHint)) {
            return;
        }
        try {
            this.editText.setHintTextColor(Color.parseColor(textColorHint));
        } catch (Exception e) {
            a.a((Class) getClass(), "exp_EditTextHelper_setHintColor", (Throwable) e);
            e.printStackTrace();
        }
    }

    private void setMaxLength() {
        try {
            String maxLength = this.iEditText.getMaxLength();
            if (TextUtils.isEmpty(maxLength)) {
                return;
            }
            this.editText.addTextChangedListener(new TextWatcher(maxLength) { // from class: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.EditTextHelper.1
                private int num;
                private int selectionEnd;
                private int selectionStart;
                final /* synthetic */ String val$desc;
                private CharSequence wordNum;

                {
                    this.val$desc = maxLength;
                    this.num = Integer.parseInt(maxLength);
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    this.selectionStart = EditTextHelper.this.editText.getSelectionStart();
                    this.selectionEnd = EditTextHelper.this.editText.getSelectionEnd();
                    if (this.wordNum.length() > this.num) {
                        editable.delete(this.selectionStart - 1, this.selectionEnd);
                        int i = this.selectionEnd;
                        EditTextHelper.this.editText.setText(editable);
                        EditTextHelper.this.editText.setSelection(i);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    this.wordNum = charSequence;
                }
            });
        } catch (Exception e) {
            a.a((Class) getClass(), "exp_EditTextHelper_setMaxLength", (Throwable) e);
            e.printStackTrace();
        }
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.TextViewHelper, com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper, com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.Helper
    public void setViewProperties() {
        super.setViewProperties();
        setHint();
        setHintColor();
        setMaxLength();
    }
}
