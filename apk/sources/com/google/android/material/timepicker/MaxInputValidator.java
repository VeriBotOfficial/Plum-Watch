package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes3.dex */
class MaxInputValidator implements InputFilter {
    private int max;

    public MaxInputValidator(int r1) {
        this.max = r1;
    }

    public void setMax(int r1) {
        this.max = r1;
    }

    public int getMax() {
        return this.max;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int r3, int r4, Spanned spanned, int r6, int r7) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(r6, r7, charSequence.subSequence(r3, r4).toString());
            if (Integer.parseInt(sb.toString()) <= this.max) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
