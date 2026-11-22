package com.wakeup.commonui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.anythink.expressad.foundation.h.k;
import com.wakeup.commonui.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyEditText.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u001c\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0002J\u0006\u0010!\u001a\u00020\u0018J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010#\u001a\u00020\u0018H\u0002J\u0010\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u0016J\u0018\u0010&\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(H\u0002J\u0018\u0010)\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020(H\u0002R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006-"}, d2 = {"Lcom/wakeup/commonui/view/VerifyEditText;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTextViewList", "", "Landroid/widget/TextView;", "mEditText", "Landroid/widget/EditText;", "drawableNormal", "Landroid/graphics/drawable/Drawable;", "drawableSelected", "mContext", "mInputCompleteListener", "Lcom/wakeup/commonui/view/VerifyEditText$InputCompleteListener;", "init", "", "onAttachedToWindow", "setTextViewBackground", "textView", k.c, "content", "", "getContent", "()Ljava/lang/String;", "clearContent", "setDefaultContent", "showSoftKeyBoard", "addInputCompleteListener", "inputCompleteListener", "px2sp", "pxValue", "", "sp2px", "spValue", "InputCompleteListener", "Companion", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VerifyEditText extends LinearLayout {
    private static final int DEFAULT_ITEM_COUNT = 4;
    private static final int DEFAULT_ITEM_MARGIN = 50;
    private static final int DEFAULT_ITEM_TEXT_SIZE = 14;
    private static final int DEFAULT_ITEM_WIDTH = 100;
    private static final int DEFAULT_PASSWORD_VISIBLE_TIME = 200;
    private Drawable drawableNormal;
    private Drawable drawableSelected;
    private Context mContext;
    private EditText mEditText;
    private InputCompleteListener mInputCompleteListener;
    private final List<TextView> mTextViewList;

    /* compiled from: VerifyEditText.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/wakeup/commonui/view/VerifyEditText$InputCompleteListener;", "", "complete", "", "content", "", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface InputCompleteListener {
        void complete(String content);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEditText(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mTextViewList = new ArrayList();
        init(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mTextViewList = new ArrayList();
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mTextViewList = new ArrayList();
        init(context, attributeSet);
    }

    private final void init(Context context, AttributeSet attrs) {
        this.mContext = context;
        setOrientation(0);
        setGravity(17);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.verify_EditText);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.drawableNormal = obtainStyledAttributes.getDrawable(R.styleable.verify_EditText_verify_background_normal);
        this.drawableSelected = obtainStyledAttributes.getDrawable(R.styleable.verify_EditText_verify_background_selected);
        int color = obtainStyledAttributes.getColor(R.styleable.verify_EditText_verify_textColor, ContextCompat.getColor(context, R.color.black));
        int i = obtainStyledAttributes.getInt(R.styleable.verify_EditText_verify_count, 4);
        int i2 = obtainStyledAttributes.getInt(R.styleable.verify_EditText_verify_inputType, 2);
        int i3 = obtainStyledAttributes.getInt(R.styleable.verify_EditText_verify_password_visible_time, 200);
        int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.verify_EditText_verify_width, 100.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(R.styleable.verify_EditText_verify_height, 0.0f);
        int dimension3 = (int) obtainStyledAttributes.getDimension(R.styleable.verify_EditText_verify_margin, 50.0f);
        float px2sp = px2sp(context, obtainStyledAttributes.getDimension(R.styleable.verify_EditText_verify_textSize, sp2px(context, 14.0f)));
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.verify_EditText_verify_password, false);
        obtainStyledAttributes.recycle();
        if (i < 2) {
            i = 2;
        }
        EditText editText = new EditText(context);
        this.mEditText = editText;
        Intrinsics.checkNotNull(editText);
        editText.setInputType(i2);
        EditText editText2 = this.mEditText;
        Intrinsics.checkNotNull(editText2);
        editText2.setLayoutParams(new LinearLayout.LayoutParams(1, 1));
        EditText editText3 = this.mEditText;
        Intrinsics.checkNotNull(editText3);
        editText3.setCursorVisible(false);
        EditText editText4 = this.mEditText;
        Intrinsics.checkNotNull(editText4);
        editText4.setBackground(null);
        EditText editText5 = this.mEditText;
        Intrinsics.checkNotNull(editText5);
        editText5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        EditText editText6 = this.mEditText;
        Intrinsics.checkNotNull(editText6);
        editText6.addTextChangedListener(new VerifyEditText$init$1(this, z, i3));
        addView(this.mEditText);
        setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.view.VerifyEditText$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyEditText.init$lambda$0(VerifyEditText.this, view);
            }
        });
        for (int i4 = 0; i4 < i; i4++) {
            TextView textView = new TextView(context);
            textView.setTextSize(px2sp);
            textView.setGravity(17);
            textView.setTextColor(color);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension, dimension2 == 0 ? -2 : dimension2);
            if (i4 == 0) {
                layoutParams.leftMargin = -1;
            } else {
                layoutParams.leftMargin = dimension3;
            }
            textView.setLayoutParams(layoutParams);
            setTextViewBackground(textView, this.drawableNormal);
            addView(textView);
            textView.clearFocus();
            this.mTextViewList.add(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(VerifyEditText verifyEditText, View view) {
        EditText editText = verifyEditText.mEditText;
        Intrinsics.checkNotNull(editText);
        editText.requestFocus();
        verifyEditText.showSoftKeyBoard();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        EditText editText = this.mEditText;
        Intrinsics.checkNotNull(editText);
        editText.postDelayed(new Runnable() { // from class: com.wakeup.commonui.view.VerifyEditText$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VerifyEditText.this.showSoftKeyBoard();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextViewBackground(TextView textView, Drawable drawable) {
        if (drawable != null) {
            textView.setBackground(drawable);
        }
    }

    public final String getContent() {
        EditText editText = this.mEditText;
        Intrinsics.checkNotNull(editText);
        if (TextUtils.isEmpty(editText.getText())) {
            return "";
        }
        EditText editText2 = this.mEditText;
        Intrinsics.checkNotNull(editText2);
        return editText2.getText().toString();
    }

    public final void clearContent() {
        EditText editText = this.mEditText;
        Intrinsics.checkNotNull(editText);
        editText.setText("");
        int size = this.mTextViewList.size();
        for (int i = 0; i < size; i++) {
            TextView textView = this.mTextViewList.get(i);
            textView.setText("");
            setTextViewBackground(textView, this.drawableNormal);
        }
    }

    public final void setDefaultContent(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        EditText editText = this.mEditText;
        Intrinsics.checkNotNull(editText);
        editText.setText(content);
        EditText editText2 = this.mEditText;
        Intrinsics.checkNotNull(editText2);
        editText2.requestFocus();
        char[] charArray = content.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        int min = Math.min(charArray.length, this.mTextViewList.size());
        for (int i = 0; i < min; i++) {
            String valueOf = String.valueOf(charArray[i]);
            TextView textView = this.mTextViewList.get(i);
            textView.setText(valueOf);
            setTextViewBackground(textView, this.drawableSelected);
        }
        if (this.mInputCompleteListener == null || min != this.mTextViewList.size()) {
            return;
        }
        InputCompleteListener inputCompleteListener = this.mInputCompleteListener;
        Intrinsics.checkNotNull(inputCompleteListener);
        String substring = content.substring(0, min);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        inputCompleteListener.complete(substring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSoftKeyBoard() {
        EditText editText = this.mEditText;
        Intrinsics.checkNotNull(editText);
        editText.setFocusable(true);
        EditText editText2 = this.mEditText;
        Intrinsics.checkNotNull(editText2);
        editText2.setFocusableInTouchMode(true);
        EditText editText3 = this.mEditText;
        Intrinsics.checkNotNull(editText3);
        editText3.requestFocus();
        Context context = this.mContext;
        Intrinsics.checkNotNull(context);
        Object systemService = context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this.mEditText, 1);
    }

    public final void addInputCompleteListener(InputCompleteListener inputCompleteListener) {
        this.mInputCompleteListener = inputCompleteListener;
        EditText editText = this.mEditText;
        Intrinsics.checkNotNull(editText);
        Editable text = editText.getText();
        if (TextUtils.isEmpty(text) || text.toString().length() != this.mTextViewList.size()) {
            return;
        }
        InputCompleteListener inputCompleteListener2 = this.mInputCompleteListener;
        Intrinsics.checkNotNull(inputCompleteListener2);
        inputCompleteListener2.complete(text.toString());
    }

    private final int px2sp(Context context, float pxValue) {
        return (int) ((pxValue / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    private final int sp2px(Context context, float spValue) {
        return (int) ((spValue * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
