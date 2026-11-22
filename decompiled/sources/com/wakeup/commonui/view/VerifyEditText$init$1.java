package com.wakeup.commonui.view;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.commonui.view.VerifyEditText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyEditText.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/wakeup/commonui/view/VerifyEditText$init$1", "Landroid/text/TextWatcher;", "beforeTextChanged", "", "s", "", "start", "", Const.SP_KEY_CALL_LOC_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "afterTextChanged", "Landroid/text/Editable;", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VerifyEditText$init$1 implements TextWatcher {
    final /* synthetic */ boolean $password;
    final /* synthetic */ int $passwordVisibleTime;
    final /* synthetic */ VerifyEditText this$0;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        Intrinsics.checkNotNullParameter(s, "s");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        Intrinsics.checkNotNullParameter(s, "s");
    }

    VerifyEditText$init$1(VerifyEditText verifyEditText, boolean z, int i) {
        this.this$0 = verifyEditText;
        this.$password = z;
        this.$passwordVisibleTime = i;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        List list;
        Drawable drawable;
        List list2;
        List list3;
        Drawable drawable2;
        VerifyEditText.InputCompleteListener inputCompleteListener;
        List list4;
        VerifyEditText.InputCompleteListener inputCompleteListener2;
        Drawable drawable3;
        List list5;
        List list6;
        Drawable drawable4;
        Intrinsics.checkNotNullParameter(s, "s");
        list = this.this$0.mTextViewList;
        final TextView textView = (TextView) list.get(start);
        if (before == 0) {
            textView.setText(s.subSequence(start, s.length()));
            if (this.$password) {
                textView.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                textView.postDelayed(new Runnable() { // from class: com.wakeup.commonui.view.VerifyEditText$init$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        VerifyEditText$init$1.onTextChanged$lambda$0(textView);
                    }
                }, this.$passwordVisibleTime);
            }
            VerifyEditText verifyEditText = this.this$0;
            drawable3 = verifyEditText.drawableSelected;
            verifyEditText.setTextViewBackground(textView, drawable3);
            if (!TextUtils.isEmpty(s)) {
                list5 = this.this$0.mTextViewList;
                int size = list5.size();
                int i = start - 1;
                if (i >= 0 && i < size) {
                    list6 = this.this$0.mTextViewList;
                    TextView textView2 = (TextView) list6.get(i);
                    VerifyEditText verifyEditText2 = this.this$0;
                    drawable4 = verifyEditText2.drawableNormal;
                    verifyEditText2.setTextViewBackground(textView2, drawable4);
                }
            }
        } else {
            textView.setText("");
            VerifyEditText verifyEditText3 = this.this$0;
            drawable = verifyEditText3.drawableNormal;
            verifyEditText3.setTextViewBackground(textView, drawable);
            if (!TextUtils.isEmpty(s)) {
                list2 = this.this$0.mTextViewList;
                int size2 = list2.size();
                int i2 = start - 1;
                if (i2 >= 0 && i2 < size2) {
                    list3 = this.this$0.mTextViewList;
                    TextView textView3 = (TextView) list3.get(i2);
                    VerifyEditText verifyEditText4 = this.this$0;
                    drawable2 = verifyEditText4.drawableSelected;
                    verifyEditText4.setTextViewBackground(textView3, drawable2);
                }
            }
        }
        inputCompleteListener = this.this$0.mInputCompleteListener;
        if (inputCompleteListener != null) {
            int length = s.length();
            list4 = this.this$0.mTextViewList;
            if (length == list4.size()) {
                inputCompleteListener2 = this.this$0.mInputCompleteListener;
                Intrinsics.checkNotNull(inputCompleteListener2);
                inputCompleteListener2.complete(s.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTextChanged$lambda$0(TextView textView) {
        textView.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
}
