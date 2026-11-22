package com.wakeup.module.gpt.view;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.wakeup.common.base.BaseCallback;

/* loaded from: classes4.dex */
public class TextWatchNum implements TextWatcher {
    private final EditText etNoteContent;
    private BaseCallback<Boolean> mCallback;
    private int num = 500;
    private int selectionEnd;
    private int selectionStart;
    private final TextView tvWordNumber;
    private CharSequence wordNum;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public TextWatchNum(TextView textView, EditText editText) {
        this.tvWordNumber = textView;
        this.etNoteContent = editText;
    }

    public TextWatchNum(TextView textView, EditText editText, BaseCallback<Boolean> baseCallback) {
        this.tvWordNumber = textView;
        this.etNoteContent = editText;
        this.mCallback = baseCallback;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.wordNum = charSequence;
        BaseCallback<Boolean> baseCallback = this.mCallback;
        if (baseCallback != null) {
            baseCallback.callback(0, true);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.tvWordNumber.setText((TextUtils.isEmpty(editable) ? 0 : editable.length()) + "/500");
        this.selectionStart = this.etNoteContent.getSelectionStart();
        this.selectionEnd = this.etNoteContent.getSelectionEnd();
        if (this.wordNum.length() > this.num) {
            editable.delete(this.selectionStart - 1, this.selectionEnd);
            int i = this.selectionEnd;
            this.etNoteContent.setText(editable);
            this.etNoteContent.setSelection(i);
        }
    }
}
