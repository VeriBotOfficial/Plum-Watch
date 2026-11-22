package io.noties.markwon.html;

import com.tencent.open.SocialConstants;

/* loaded from: classes6.dex */
public class HtmlEmptyTagReplacement {
    private static final String IFRAME_REPLACEMENT = " ";
    private static final String IMG_REPLACEMENT = "￼";

    public static HtmlEmptyTagReplacement create() {
        return new HtmlEmptyTagReplacement();
    }

    public String replace(HtmlTag htmlTag) {
        String name = htmlTag.name();
        if ("br".equals(name)) {
            return "\n";
        }
        if (SocialConstants.PARAM_IMG_URL.equals(name)) {
            String str = htmlTag.attributes().get("alt");
            return (str == null || str.length() == 0) ? IMG_REPLACEMENT : str;
        }
        if ("iframe".equals(name)) {
            return IFRAME_REPLACEMENT;
        }
        return null;
    }
}
