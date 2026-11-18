package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zznk extends IllegalArgumentException {
    zznk(int r3, int r4) {
        super("Unpaired surrogate at index " + r3 + " of " + r4);
    }
}
