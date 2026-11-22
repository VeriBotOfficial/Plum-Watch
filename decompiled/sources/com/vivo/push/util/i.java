package com.vivo.push.util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.utils.ReportUtil;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* compiled from: ConvertMsgToIntentImpl.java */
/* loaded from: classes2.dex */
public final class i extends b {
    private int e = 0;

    @Override // com.vivo.push.util.b
    protected final int a() {
        return this.e;
    }

    @Override // com.vivo.push.util.b
    protected final Intent a(Context context, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        return b(context, insideNotificationItem, notifyArriveCallbackByUser);
    }

    @Override // com.vivo.push.util.b
    protected final PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getActivity(context, (int) SystemClock.uptimeMillis(), intent, 201326592);
    }

    private Intent b(Context context, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        String packageName;
        Intent a2;
        int a3;
        try {
            packageName = context.getPackageName();
        } catch (Exception e) {
            t.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient parsing error : " + e.getMessage());
            this.e = 2159;
        }
        if (insideNotificationItem != null && !TextUtils.isEmpty(packageName)) {
            t.d("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient getSkipType ：：" + insideNotificationItem.getSkipType());
            int skipType = insideNotificationItem.getSkipType();
            if (skipType == 1) {
                a2 = a(insideNotificationItem.getParams(), packageName, context);
            } else if (skipType == 2) {
                String skipContent = insideNotificationItem.getSkipContent();
                if (!TextUtils.isEmpty(skipContent)) {
                    String lowerCase = skipContent.toLowerCase();
                    if (lowerCase.startsWith("http://") || lowerCase.startsWith("https://")) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(skipContent));
                        intent.setFlags(268435456);
                        a(intent, insideNotificationItem.getParams());
                        t.d("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient url urlAddr ::".concat(String.valueOf(skipContent)));
                        a2 = intent;
                    }
                }
                t.c(context, " 跳转参数不合法，打开网页地址不符合要求 通知未展示 2157");
                t.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient url not legal");
                this.e = ReportUtil.EXCEPTION_CODE_NET_LOC_FAIL;
                a2 = null;
            } else if (skipType == 3) {
                String skipContent2 = insideNotificationItem.getSkipContent();
                t.d("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient ：：" + insideNotificationItem.getSkipContent());
                if (notifyArriveCallbackByUser.getIntent() != null) {
                    t.d("AndroidTwelveNotifyClickIntentParam", "notifyArriveCallbackByUser.getIntent()   not null  ");
                    try {
                        a2 = notifyArriveCallbackByUser.getIntent();
                        a2.setSelector(null);
                        a2.setFlags(DivSeparatorView.DEFAULT_DIVIDER_COLOR);
                        Map<String, String> params = insideNotificationItem.getParams();
                        if (params != null && params.entrySet() != null) {
                            for (Map.Entry<String, String> entry : params.entrySet()) {
                                if (entry != null && entry.getKey() != null && !a2.hasExtra(entry.getKey())) {
                                    a2.putExtra(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        a3 = a(a2, packageName);
                    } catch (Exception e2) {
                        t.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient open activity error : ".concat(String.valueOf(skipContent2)), e2);
                        this.e = IjkMediaMeta.FF_PROFILE_H264_HIGH_10_INTRA;
                    }
                    if (a3 > 0) {
                        this.e = a3;
                        a2 = null;
                    }
                } else {
                    t.d("AndroidTwelveNotifyClickIntentParam", "notifyArriveCallbackByUser.getIntent()   is null 根据skipcontent生成跳转参数 ");
                    a2 = a(skipContent2, packageName, insideNotificationItem, context);
                }
            } else if (skipType != 4) {
                t.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient skip type error : intent null");
                this.e = 2159;
                a2 = null;
            } else {
                String skipContent3 = insideNotificationItem.getSkipContent();
                t.d("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient ：：" + insideNotificationItem.getSkipContent());
                a2 = a(skipContent3, packageName, insideNotificationItem, context);
            }
            if (a2 == null) {
                t.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient skip type error : " + insideNotificationItem.getSkipType());
                return null;
            }
            a2.putExtra("vivo_push_messageId", b());
            a2.putExtra("command_type", "reflect_receiver");
            a(a2, context);
            long j = this.b;
            this.e = 0;
            return a2;
        }
        t.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient notify == null");
        this.e = 2159;
        return null;
    }

    private Intent a(String str, String str2, InsideNotificationItem insideNotificationItem, Context context) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            parseUri.setSelector(null);
            parseUri.setPackage(str2);
            parseUri.setFlags(DivSeparatorView.DEFAULT_DIVIDER_COLOR);
            a(parseUri, insideNotificationItem.getParams());
            int a2 = a(parseUri, str2);
            if (a2 <= 0) {
                return parseUri;
            }
            this.e = a2;
            t.c(context, " 落地页未找到，通知不展示：  " + this.e);
            return null;
        } catch (Exception e) {
            t.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient open activity error : ".concat(String.valueOf(str)), e);
            this.e = IjkMediaMeta.FF_PROFILE_H264_HIGH_10_INTRA;
            return null;
        }
    }

    private Intent a(Map<String, String> map, String str, Context context) {
        Intent intent = new Intent();
        intent.setPackage(str);
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(DivSeparatorView.DEFAULT_DIVIDER_COLOR);
                a(launchIntentForPackage, map);
                return launchIntentForPackage;
            }
            this.e = 2162;
            t.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient LaunchIntent is null");
            return launchIntentForPackage;
        } catch (Exception e) {
            t.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient LaunchIntent Exception" + e.getMessage());
            return intent;
        }
    }

    private static Intent a(Intent intent, Map<String, String> map) {
        if (map != null && map.entrySet() != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    private int a(Intent intent, String str) {
        int a2 = a(intent);
        t.d("AndroidTwelveNotifyClickIntentParam", "checkSkipContentParameterLegal canfindactivity code : ".concat(String.valueOf(a2)));
        if (a2 != 0) {
            return a2;
        }
        int b = b(intent, str);
        t.d("AndroidTwelveNotifyClickIntentParam", "checkSkipContentParameterLegal packagefit code : ".concat(String.valueOf(b)));
        if (b != 0) {
            return b;
        }
        return 0;
    }

    private int a(Intent intent) {
        if (intent.resolveActivityInfo(this.c.getPackageManager(), 65536) != null) {
            return 0;
        }
        t.a("AndroidTwelveNotifyClickIntentParam", "activity is null  ");
        t.c(this.c, " 跳转参数对应的Activity找不到 通知不展示   2162");
        return 2162;
    }

    private int b(Intent intent, String str) {
        if (intent == null || TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("checkSkipContentPackageFit intent = : ");
            Object obj = intent;
            if (intent == null) {
                obj = "";
            }
            t.a("AndroidTwelveNotifyClickIntentParam", sb.append(obj).append(" mPkgName = ").append(str).toString());
            return IjkMediaMeta.FF_PROFILE_H264_HIGH_10_INTRA;
        }
        try {
            String packageName = intent.getComponent() != null ? intent.getComponent().getPackageName() : intent.getPackage();
            if (TextUtils.isEmpty(packageName) || TextUtils.equals(str, packageName)) {
                return 0;
            }
            t.d("AndroidTwelveNotifyClickIntentParam", "activity component error : local pkgName is " + str + "; but remote pkgName is " + packageName);
            t.a(this.c, " 跳转参数对应的包名不是当前应用包名    local pkgName is " + str + "; but remote pkgName is " + packageName + " code =2813");
            return 2813;
        } catch (Exception e) {
            t.a("AndroidTwelveNotifyClickIntentParam", "checkSkipContentPackage open activity error :  error " + e.getMessage());
            return IjkMediaMeta.FF_PROFILE_H264_HIGH_10_INTRA;
        }
    }
}
