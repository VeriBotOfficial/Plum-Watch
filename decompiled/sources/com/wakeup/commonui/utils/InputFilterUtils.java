package com.wakeup.commonui.utils;

import android.text.InputFilter;
import android.text.Spanned;
import com.blankj.utilcode.util.Utils;
import com.wakeup.common.utils.ToastUtils;
import com.wakeup.commonui.R;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class InputFilterUtils {
    public static InputFilter getInputFilterWithSpace() {
        return new InputFilter() { // from class: com.wakeup.commonui.utils.InputFilterUtils$$ExternalSyntheticLambda0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return InputFilterUtils.lambda$getInputFilterWithSpace$0(charSequence, i, i2, spanned, i3, i4);
            }
        };
    }

    static /* synthetic */ CharSequence lambda$getInputFilterWithSpace$0(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!charSequence.equals(" ")) {
            return null;
        }
        ToastUtils.showToast(Utils.getApp().getString(R.string.friend_tip_1003));
        return "";
    }

    public static InputFilter getInputFilterWithSpecial() {
        return new InputFilter() { // from class: com.wakeup.commonui.utils.InputFilterUtils$$ExternalSyntheticLambda2
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return InputFilterUtils.lambda$getInputFilterWithSpecial$1(charSequence, i, i2, spanned, i3, i4);
            }
        };
    }

    static /* synthetic */ CharSequence lambda$getInputFilterWithSpecial$1(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]").matcher(charSequence.toString()).find()) {
            return null;
        }
        ToastUtils.showToast(Utils.getApp().getString(R.string.friend_tip_1003));
        return "";
    }

    public static InputFilter getInputFilterWithEmoji() {
        return new InputFilter() { // from class: com.wakeup.commonui.utils.InputFilterUtils$$ExternalSyntheticLambda1
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return InputFilterUtils.lambda$getInputFilterWithEmoji$2(charSequence, i, i2, spanned, i3, i4);
            }
        };
    }

    static /* synthetic */ CharSequence lambda$getInputFilterWithEmoji$2(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[☀-⟿]", 66).matcher(charSequence).find()) {
            return null;
        }
        ToastUtils.showToast(Utils.getApp().getString(R.string.friend_tip_1003));
        return "";
    }

    public static InputFilter getInputFilterWithMaxLength(int i) {
        return new InputFilter.LengthFilter(i) { // from class: com.wakeup.commonui.utils.InputFilterUtils.1
        };
    }
}
