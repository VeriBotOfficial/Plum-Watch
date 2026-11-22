package com.xmly.businesssdk.webview.url;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DefaultUrlParamParser.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xmly/businesssdk/webview/url/DefaultUrlParamParser;", "Lcom/xmly/businesssdk/webview/url/UrlParamParser;", "()V", "albumIdPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "phonePattern", "trackIdPattern", "isAlbumId", "", RemoteMessageConst.MessageBody.PARAM, "", "isPhoneNumber", "isSearchKeyword", "isTrackId", "parseUrlParams", "", "url", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultUrlParamParser implements UrlParamParser {
    private final Pattern phonePattern = Pattern.compile("^1[3-9]\\d{9}$");
    private final Pattern albumIdPattern = Pattern.compile("^\\d+$");
    private final Pattern trackIdPattern = Pattern.compile("^\\d+$");

    @Override // com.xmly.businesssdk.webview.url.UrlParamParser
    public boolean isAlbumId(String param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return !StringsKt.isBlank(param) && this.albumIdPattern.matcher(param).matches();
    }

    @Override // com.xmly.businesssdk.webview.url.UrlParamParser
    public boolean isPhoneNumber(String param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return !StringsKt.isBlank(param) && this.phonePattern.matcher(param).matches();
    }

    @Override // com.xmly.businesssdk.webview.url.UrlParamParser
    public boolean isSearchKeyword(String param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return !StringsKt.isBlank(param);
    }

    @Override // com.xmly.businesssdk.webview.url.UrlParamParser
    public boolean isTrackId(String param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return !StringsKt.isBlank(param) && this.trackIdPattern.matcher(param).matches();
    }

    @Override // com.xmly.businesssdk.webview.url.UrlParamParser
    public Map<String, String> parseUrlParams(String url) {
        int indexOf$default;
        Intrinsics.checkNotNullParameter(url, "url");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!StringsKt.isBlank(url) && (indexOf$default = StringsKt.indexOf$default((CharSequence) url, '?', 0, false, 6, (Object) null)) != -1) {
            String substring = url.substring(indexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            Iterator it = StringsKt.split$default((CharSequence) substring, new String[]{"&"}, false, 0, 6, (Object) null).iterator();
            while (it.hasNext()) {
                List split$default = StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 0, 6, (Object) null);
                if (split$default.size() == 2) {
                    linkedHashMap.put(split$default.get(0), split$default.get(1));
                }
            }
        }
        return linkedHashMap;
    }
}
