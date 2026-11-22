package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.qumeng.overseas.advlib.R;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.AdsObject;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.AppInformation;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.NativeMaterial;
import com.qumeng.overseas.advlib.__remote__.core.proto.throwable.NoSuchMaterialException;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.b;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.f;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.z;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.util.MGravity;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.g;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.ITextView;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView;
import com.qumeng.overseas.advlib.__remote__.utils.bugman.a;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.wakeup.common.functionSwitch.FunctionSwitchManager;
import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import com.wakeup.feature.user.constant.UserConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes17.dex */
public class TextViewHelper extends ViewHelper {
    public String mTextContent;

    public TextViewHelper(IView iView, View view) {
        super(iView, view);
        this.mTextContent = "";
    }

    private String getMoreLineMaxEms(String str) {
        try {
            String moreLineMaxEms = ((ITextView) this.baseView).getMoreLineMaxEms();
            return !TextUtils.isEmpty(moreLineMaxEms) ? str.substring(0, Integer.parseInt(moreLineMaxEms)) : str;
        } catch (Exception unused) {
            return str;
        }
    }

    private String getRandomDefault(String[] strArr) {
        int i;
        if (strArr == null) {
            return "";
        }
        if (strArr.length > 0) {
            i = (int) ((Math.random() * strArr.length) + 0.5d);
            if (i >= strArr.length) {
                i = strArr.length - 1;
            }
        } else {
            i = 0;
        }
        return strArr[i];
    }

    private String getSource() {
        try {
            return this.baseView.getAdsObject().getNativeMaterial().source_mark;
        } catch (NoSuchMaterialException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void setEllipsize() {
        char c;
        String ellipsize = ((ITextView) this.baseView).getEllipsize();
        if (TextUtils.isEmpty(ellipsize)) {
            return;
        }
        ellipsize.hashCode();
        ellipsize.hashCode();
        switch (ellipsize.hashCode()) {
            case -1074341483:
                if (ellipsize.equals(FunctionSwitchManager.KEY_MIDDLE)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (ellipsize.equals("end")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (ellipsize.equals("start")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 839444514:
                if (ellipsize.equals("marquee")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                ((TextView) this.view).setEllipsize(TextUtils.TruncateAt.MIDDLE);
                break;
            case 1:
                ((TextView) this.view).setEllipsize(TextUtils.TruncateAt.END);
                break;
            case 2:
                ((TextView) this.view).setEllipsize(TextUtils.TruncateAt.START);
                break;
            case 3:
                this.view.setFocusable(true);
                this.view.setFocusableInTouchMode(true);
                ((TextView) this.view).setHorizontallyScrolling(true);
                ((TextView) this.view).setEllipsize(TextUtils.TruncateAt.MARQUEE);
                ((TextView) this.view).setMarqueeRepeatLimit(-1);
                this.view.setSelected(true);
                break;
        }
    }

    private void setGravity() {
        String gravity = this.baseView.getGravity();
        if (TextUtils.isEmpty(gravity)) {
            return;
        }
        ((TextView) this.view).setGravity(MGravity.getGravityInt(gravity));
    }

    private void setIncludeFontPadding() {
        String includeFontPadding = ((ITextView) this.baseView).getIncludeFontPadding();
        if (TextUtils.isEmpty(includeFontPadding)) {
            return;
        }
        ((TextView) this.view).setIncludeFontPadding(g.b(includeFontPadding));
    }

    private void setLineSpacingExtra() {
        if (TextUtils.isEmpty(((ITextView) this.baseView).getLineSpacingExtra())) {
            return;
        }
        ((TextView) this.view).setLineSpacing((int) g.a(this.view.getContext(), r0), 1.0f);
    }

    private void setMaxEms() {
        String maxEms = ((ITextView) this.baseView).getMaxEms();
        if (TextUtils.isEmpty(maxEms)) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(maxEms);
            if (parseInt > 0) {
                ((TextView) this.view).setMaxEms(parseInt);
            }
        } catch (NumberFormatException e) {
            a.a((Class) getClass(), "NumberFormatException_TextViewHelper_setMaxEms", (Throwable) e);
            e.printStackTrace();
        }
    }

    private void setMaxLines() {
        if (g.b(((ITextView) this.baseView).getSingleLine())) {
            ((TextView) this.view).setSingleLine(true);
            return;
        }
        String maxLines = ((ITextView) this.baseView).getMaxLines();
        if (TextUtils.isEmpty(maxLines)) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(maxLines);
            if (parseInt > 0) {
                ((TextView) this.view).setMaxLines(parseInt);
            }
        } catch (NumberFormatException e) {
            a.a((Class) getClass(), "NumberFormatException_TextViewHelper_setMaxLines", (Throwable) e);
            e.printStackTrace();
        }
    }

    private void setMaxWidth() {
        int a2;
        String maxWidth = ((ITextView) this.baseView).getMaxWidth();
        if (TextUtils.isEmpty(maxWidth) || (a2 = (int) g.a(this.view.getContext(), maxWidth)) <= 0) {
            return;
        }
        ((TextView) this.view).setMaxWidth(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: Exception -> 0x0055, TRY_LEAVE, TryCatch #0 {Exception -> 0x0055, blocks: (B:2:0x0000, B:7:0x000f, B:17:0x0039, B:19:0x0047, B:21:0x001f, B:24:0x0029), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setPaintFlags() {
        /*
            r4 = this;
            com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView r0 = r4.baseView     // Catch: java.lang.Exception -> L55
            com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.ITextView r0 = (com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.ITextView) r0     // Catch: java.lang.Exception -> L55
            java.lang.String r0 = r0.getPaintFlags()     // Catch: java.lang.Exception -> L55
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L55
            if (r1 == 0) goto Lf
            goto L59
        Lf:
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L55
            r2 = -873197205(0xffffffffcbf4116b, float:-3.1990486E7)
            r3 = 1
            if (r1 == r2) goto L29
            r2 = -183242525(0xfffffffff513f0e3, float:-1.8753745E32)
            if (r1 == r2) goto L1f
            goto L33
        L1f:
            java.lang.String r1 = "STRIKE_THRU_TEXT_FLAG"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L33
            r0 = r3
            goto L34
        L29:
            java.lang.String r1 = "UNDERLINE_TEXT_FLAG"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L33
            r0 = 0
            goto L34
        L33:
            r0 = -1
        L34:
            if (r0 == 0) goto L47
            if (r0 == r3) goto L39
            goto L59
        L39:
            android.view.View r0 = r4.view     // Catch: java.lang.Exception -> L55
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L55
            android.text.TextPaint r0 = r0.getPaint()     // Catch: java.lang.Exception -> L55
            r1 = 17
            r0.setFlags(r1)     // Catch: java.lang.Exception -> L55
            return
        L47:
            android.view.View r0 = r4.view     // Catch: java.lang.Exception -> L55
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L55
            android.text.TextPaint r0 = r0.getPaint()     // Catch: java.lang.Exception -> L55
            r1 = 9
            r0.setFlags(r1)     // Catch: java.lang.Exception -> L55
            return
        L55:
            r0 = move-exception
            r0.printStackTrace()
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.TextViewHelper.setPaintFlags():void");
    }

    private void setScrollBars() {
        String scrollbars = ((ITextView) this.baseView).getScrollbars();
        if (TextUtils.isEmpty(scrollbars)) {
            return;
        }
        if (scrollbars.equals("vertical")) {
            this.view.setVerticalScrollBarEnabled(true);
            ((TextView) this.view).setMovementMethod(ScrollingMovementMethod.getInstance());
        } else if (scrollbars.equals("horizontal")) {
            this.view.setHorizontalScrollBarEnabled(true);
            ((TextView) this.view).setMovementMethod(ScrollingMovementMethod.getInstance());
        }
    }

    private void setSpeTextSpan() {
        String highLightText = ((ITextView) this.baseView).getHighLightText();
        String highLightColor = ((ITextView) this.baseView).getHighLightColor();
        if (!TextUtils.isEmpty(highLightText) && !TextUtils.isEmpty(highLightColor) && this.mTextContent.contains(highLightText)) {
            try {
                showHighLightText((TextView) this.view, this.mTextContent, highLightText, Color.parseColor(highLightColor));
                return;
            } catch (Exception e) {
                a.a((Class) getClass(), "exp_TextViewHelper_setText3", (Throwable) e);
                e.printStackTrace();
            }
        }
        boolean b = g.b(((ITextView) this.baseView).getExcludeAdSign());
        String upperCase = this.mTextContent.toUpperCase();
        if (b) {
            return;
        }
        if ((upperCase.equals("AD") || upperCase.equals(e.a().getResources().getString(R.string.qm_oversea_AD)) || upperCase.equals(e.a().getResources().getString(R.string.qm_oversea_AD_))) && this.baseView.getAdsObject() != null) {
            if (this.mTextContent.startsWith("AD")) {
                this.mTextContent = this.mTextContent.replace("AD", "Ad");
            }
            if (TextUtils.isEmpty(this.baseView.getAdsObject().getAdLogoUrl())) {
                this.mTextContent = getSource() + " " + this.mTextContent;
            } else {
                View view = this.view;
                com.qumeng.overseas.advlib.__remote__.ui.elements.a.a((TextView) view, view.getContext(), this.mTextContent, this.baseView.getAdsObject().getAdLogoUrl());
            }
            ((TextView) this.view).setText(this.mTextContent);
            n.c("applovinad_textview", "getAdLogoUrl: " + this.baseView.getAdsObject().getAdLogoUrl(), new Object[0]);
        }
    }

    private void setTag() {
        String tag = this.baseView.getTag();
        if (TextUtils.isEmpty(tag)) {
            return;
        }
        this.view.setTag(tag);
    }

    private void setTextColorSelector() {
        String pressedTextColor = ((ITextView) this.baseView).getPressedTextColor();
        String textColor = TextUtils.isEmpty(this.baseView.getConfigTextColor()) ? ((ITextView) this.baseView).getTextColor() : this.baseView.getConfigTextColor();
        if (TextUtils.isEmpty(pressedTextColor) || TextUtils.isEmpty(textColor)) {
            return;
        }
        try {
            ((TextView) this.view).setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{Color.parseColor(pressedTextColor), Color.parseColor(textColor)}));
        } catch (IllegalArgumentException e) {
            a.a((Class) getClass(), "IllegalArgumentException_TextViewHelper_setTextColorSelector", (Throwable) e);
            e.printStackTrace();
        }
    }

    private void setTextShadow() {
        try {
            if (TextUtils.isEmpty(this.baseView.getShadowRadius()) || TextUtils.isEmpty(this.baseView.getShadowDx()) || TextUtils.isEmpty(this.baseView.getShadowDy())) {
                return;
            }
            ((TextView) this.view).setShadowLayer(g.a(this.view.getContext(), this.baseView.getShadowRadius()), g.a(this.view.getContext(), this.baseView.getShadowDx()), g.a(this.view.getContext(), this.baseView.getShadowDy()), Color.parseColor(this.baseView.getShadowColor()));
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    private void setTextStyle() {
        if (g.b(((ITextView) this.baseView).getForceBold())) {
            ((TextView) this.view).setTypeface(Typeface.defaultFromStyle(1));
        }
        String textStyle = TextUtils.isEmpty(this.baseView.getConfigTextStyle()) ? ((ITextView) this.baseView).getTextStyle() : this.baseView.getConfigTextStyle();
        if (TextUtils.isEmpty(textStyle)) {
            return;
        }
        textStyle.hashCode();
        textStyle.hashCode();
        switch (textStyle) {
            case "monospace":
                ((TextView) this.view).setTypeface(Typeface.MONOSPACE);
                break;
            case "italic":
                ((TextView) this.view).setTypeface(Typeface.defaultFromStyle(2));
                break;
            case "normal":
                ((TextView) this.view).setTypeface(Typeface.defaultFromStyle(0));
                break;
            case "bold":
                if (!"monospace".equals(((ITextView) this.baseView).getTypeface())) {
                    ((TextView) this.view).getPaint().setFakeBoldText(true);
                    break;
                } else {
                    ((TextView) this.view).getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
                    ((TextView) this.view).getPaint().setStrokeWidth(0.2f);
                    break;
                }
        }
    }

    public static void showHighLightText(TextView textView, String str, String str2, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), indexOf, str2.length() + indexOf, 33);
        textView.setText(spannableStringBuilder);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper
    public float aopRadius(float f) {
        TextPaint paint = ((TextView) this.view).getPaint();
        Rect rect = new Rect();
        String text = ((ITextView) this.baseView).getText();
        paint.getTextBounds(text, 0, text.length(), rect);
        int paddingTop = this.view.getPaddingTop();
        return (rect.height() + paddingTop + this.view.getPaddingBottom()) * f * 2.0f;
    }

    public void setTextColor() {
        String textColor = TextUtils.isEmpty(this.baseView.getConfigTextColor()) ? ((ITextView) this.baseView).getTextColor() : this.baseView.getConfigTextColor();
        if (TextUtils.isEmpty(textColor)) {
            return;
        }
        try {
            ((TextView) this.view).setTextColor(Color.parseColor(textColor));
        } catch (IllegalArgumentException e) {
            a.a((Class) getClass(), "IllegalArgumentException_TextViewHelper_setTextColor", (Throwable) e);
            e.printStackTrace();
        }
    }

    public void setTextSize() {
        String textSize = TextUtils.isEmpty(this.baseView.getConfigTextSize()) ? ((ITextView) this.baseView).getTextSize() : this.baseView.getConfigTextSize();
        if (TextUtils.isEmpty(textSize)) {
            return;
        }
        if (textSize.endsWith("px")) {
            ((TextView) this.view).setTextSize(0, Integer.parseInt(textSize.replace("px", "")));
            return;
        }
        if (textSize.endsWith("sp")) {
            ((TextView) this.view).setTextSize(2, Integer.parseInt(textSize.replace("sp", "")));
        } else if (textSize.endsWith("dp")) {
            ((TextView) this.view).setTextSize(1, (int) Float.parseFloat(textSize.replace("dp", "")));
        } else if (textSize.endsWith("dip")) {
            ((TextView) this.view).setTextSize(1, (int) Float.parseFloat(textSize.replace("dip", "")));
        }
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper, com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.Helper
    public void setViewProperties() {
        setVisible();
        setPadding();
        setMargin();
        setEllipsize();
        setLineSpacingExtra();
        setTextStyle();
        setPaintFlags();
        setIncludeFontPadding();
        setMaxLines();
        setTextColor();
        setTextColorSelector();
        setText();
        setTextSize();
        setGravity();
        setMaxEms();
        setBackground(this.view);
        setMaxWidth();
        ViewHelper.startViewAnimation(this.view, this.baseView.getViewAnimation());
        setTag();
        setSpeTextSpan();
        setScrollBars();
        setTextShadow();
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper
    protected void setVisible() {
        super.setVisible();
    }

    public void setText() {
        String text = ((ITextView) this.baseView).getText();
        String data = this.baseView.getData();
        ArrayList arrayList = new ArrayList();
        arrayList.add(data);
        String priorityData = ((ITextView) this.baseView).getPriorityData();
        if (!TextUtils.isEmpty(priorityData)) {
            String[] split = priorityData.split("->");
            if (split.length > 0) {
                arrayList.addAll(Arrays.asList(split));
            }
        }
        Iterator it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            str = getTextString(this.baseView.getAdsObject(), (String) it.next(), text);
            if (!str.equals("")) {
                break;
            }
        }
        String moreLineMaxEms = getMoreLineMaxEms(str);
        this.mTextContent = moreLineMaxEms;
        ((TextView) this.view).setText(moreLineMaxEms);
    }

    public String getTextString(AdsObject adsObject, String str, String str2) {
        int i;
        String str3;
        String str4;
        String str5;
        if (!TextUtils.isEmpty(str) && adsObject != null && adsObject.native_material != null) {
            String trim = str.trim();
            if (trim.contains("[") && trim.contains("]")) {
                try {
                    return getTextString(this.baseView.getAdsObject().getAds().get(Integer.parseInt(trim.substring(trim.indexOf("[") + 1, trim.indexOf("]")))), trim.substring(0, trim.indexOf("[")), str2);
                } catch (Exception e) {
                    a.a((Class) getClass(), "exp_TextViewHelper_setText", (Throwable) e);
                    e.printStackTrace();
                }
            } else {
                if (trim.equals("title")) {
                    return adsObject.native_material.title + "";
                }
                if (trim.equals("ext_video_tag_title")) {
                    try {
                        if (!TextUtils.isEmpty(adsObject.native_material.ext_video_tag_title)) {
                            return adsObject.native_material.ext_video_tag_title + "";
                        }
                        if (!TextUtils.isEmpty(adsObject.getSourceMark())) {
                            return adsObject.getSourceMark();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else if (trim.equals("duration")) {
                    try {
                        return f.a(adsObject.getVideoDuration());
                    } catch (Exception e3) {
                        a.a((Class) getClass(), "exp_TextViewHelper_setText2", (Throwable) e3);
                        e3.printStackTrace();
                    }
                } else {
                    if (trim.equals("desc")) {
                        return adsObject.native_material.desc + "";
                    }
                    if (trim.equals("app_name")) {
                        return adsObject.native_material.app_name + "";
                    }
                    String str6 = "this_app_name";
                    if (trim.equals("this_app_name")) {
                        return b.e(this.view.getContext(), this.view.getContext().getPackageName()) + "";
                    }
                    String str7 = "app_version";
                    if (trim.equals("app_version")) {
                        return adsObject.getAppVersion();
                    }
                    if (trim.equals("developers")) {
                        return adsObject.getDevelopers();
                    }
                    if (trim.equals("ldate")) {
                        return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(((Long) adsObject.getStash("ldate", Long.valueOf(System.currentTimeMillis()))).longValue()));
                    }
                    if (trim.equals("interaction_type")) {
                        int i2 = adsObject.native_material.interaction_type;
                        String[] split = this.baseView.getDefaultData().split(",");
                        if (split != null && split.length > i2) {
                            return split[i2];
                        }
                    } else if (trim.equals("randomDefault")) {
                        String[] split2 = this.baseView.getDefaultData().split(",");
                        if (split2 != null && split2.length > 0) {
                            int random = (int) ((Math.random() * split2.length) + 0.5d);
                            if (random >= split2.length) {
                                random = split2.length - 1;
                            }
                            return split2[random];
                        }
                    } else if (!trim.equals("%1s的广告") && !trim.equals("source")) {
                        if (!TextUtils.isEmpty(str2) && str2.contains("%1s")) {
                            String[] split3 = trim.split(",");
                            if (!TextUtils.isEmpty(this.baseView.getDefaultData())) {
                                String[] split4 = this.baseView.getDefaultData().split(",");
                                String[] strArr = new String[split3.length];
                                int i3 = 0;
                                while (i3 < split3.length) {
                                    String[] strArr2 = split3;
                                    if (split3[i3].equals(UserConstants.SEX)) {
                                        int intValue = ((Integer) adsObject.getStash(strArr2[i3], 0)).intValue();
                                        String[] split5 = split4[i3].split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                        i = i3;
                                        if (split5 != null && split5.length > intValue) {
                                            strArr[i] = split5[intValue];
                                        } else {
                                            strArr[i] = "";
                                        }
                                        str3 = str6;
                                        str5 = str7;
                                    } else {
                                        i = i3;
                                        if (!strArr2[i].equals("random")) {
                                            str3 = str6;
                                            str4 = str7;
                                            if (strArr2[i].equals("randomDefault")) {
                                                String[] split6 = split4[i].split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                                if (split6 != null) {
                                                    strArr[i] = getRandomDefault(split6);
                                                } else {
                                                    strArr[i] = "";
                                                }
                                            } else if (!strArr2[i].equals("app_player_num")) {
                                                if (!strArr2[i].equals("title")) {
                                                    if (!strArr2[i].equals("app_name")) {
                                                        if (strArr2[i].equals("developers")) {
                                                            AppInformation appInformation = adsObject.native_material.app_information;
                                                            strArr[i] = appInformation != null ? appInformation.developers : AppInformation.DEFAULT_DEVELOPERS;
                                                        } else {
                                                            str5 = str4;
                                                            if (strArr2[i].equals(str5)) {
                                                                AppInformation appInformation2 = adsObject.native_material.app_information;
                                                                strArr[i] = appInformation2 != null ? appInformation2.app_version : "1.0.0";
                                                            } else if (strArr2[i].equals("app_comment_num")) {
                                                                strArr[i] = new DecimalFormat(",###").format(adsObject.native_material.app_comment_num);
                                                            } else if (trim.equals(str3)) {
                                                                strArr[i] = b.e(this.view.getContext(), this.view.getContext().getPackageName());
                                                            } else {
                                                                strArr[i] = String.valueOf(adsObject.getStash(strArr2[i], split4[i]));
                                                            }
                                                        }
                                                    } else {
                                                        strArr[i] = adsObject.native_material.app_name;
                                                    }
                                                } else {
                                                    strArr[i] = adsObject.native_material.title;
                                                }
                                            } else {
                                                try {
                                                    strArr[i] = adsObject.getNativeMaterial().app_player_num + "";
                                                } catch (NoSuchMaterialException e4) {
                                                    strArr[i] = split4[i];
                                                    e4.printStackTrace();
                                                }
                                            }
                                        } else {
                                            int parseInt = Integer.parseInt(split4[i].split(Constants.ACCEPT_TIME_SEPARATOR_SERVER)[0]);
                                            str3 = str6;
                                            str4 = str7;
                                            strArr[i] = String.valueOf((int) ((Math.random() * (Integer.parseInt(r0[1]) - parseInt)) + parseInt));
                                        }
                                        str5 = str4;
                                    }
                                    str7 = str5;
                                    str6 = str3;
                                    split3 = strArr2;
                                    i3 = i + 1;
                                }
                                return z.a(str2, strArr).replace(DialPromoBanner.NONE, "");
                            }
                        } else {
                            try {
                                String defaultData = this.baseView.getDefaultData();
                                if (TextUtils.isEmpty(defaultData)) {
                                    defaultData = "";
                                }
                                String str8 = (String) adsObject.getStash(trim, defaultData);
                                if (!TextUtils.isEmpty(str8)) {
                                    return str8 + "";
                                }
                                Field field = NativeMaterial.class.getField(trim);
                                field.setAccessible(true);
                                return ((String) field.get(adsObject.native_material)) + "";
                            } catch (IllegalAccessException e5) {
                                a.a((Class) getClass(), "IllegalAccessException_TextViewHelper_setText", (Throwable) e5);
                                e5.printStackTrace();
                            } catch (NoSuchFieldException e6) {
                                a.a((Class) getClass(), "NoSuchFieldException_TextViewHelper_setText", (Throwable) e6);
                                e6.printStackTrace();
                            }
                        }
                    } else {
                        if (trim.equals("%1s的广告")) {
                            if (!TextUtils.isEmpty(getSource())) {
                                return z.a(trim, getSource());
                            }
                            return this.view.getContext().getResources().getString(R.string.qm_oversea_AD);
                        }
                        if (trim.equals("source")) {
                            if (!TextUtils.isEmpty(getSource())) {
                                return getSource();
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.view.getLayoutParams();
                            marginLayoutParams.width = 1;
                            marginLayoutParams.height = 1;
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = 0;
                            marginLayoutParams.topMargin = 0;
                            marginLayoutParams.bottomMargin = 0;
                            this.view.setLayoutParams(marginLayoutParams);
                            this.view.setPadding(0, 0, 0, 0);
                            this.view.setVisibility(4);
                        }
                    }
                }
                return "";
            }
        }
        String randomRange = ((ITextView) this.baseView).getRandomRange();
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        if (!TextUtils.isEmpty(randomRange)) {
            try {
                return String.format(str2, String.valueOf((int) ((Math.random() * (Integer.parseInt(r0[1]) - r2)) + Integer.parseInt(randomRange.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER)[0]))));
            } catch (NumberFormatException e7) {
                a.a((Class) getClass(), "NumberFormatException_TextViewHelper_setText", (Throwable) e7);
                e7.printStackTrace();
            }
        }
        return str2;
    }
}
