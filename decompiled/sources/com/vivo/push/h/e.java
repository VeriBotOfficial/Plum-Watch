package com.vivo.push.h;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.util.NotifyAdapterUtil;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: NotifyOpenClientClickTask.java */
/* loaded from: classes2.dex */
public final class e extends ab {
    e(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        Intent parseUri;
        String str;
        com.vivo.push.b.p pVar = (com.vivo.push.b.p) vVar;
        InsideNotificationItem g = pVar.g();
        if (g == null) {
            com.vivo.push.util.t.d("NotifyOpenClientTask", "current notification item is null");
            return;
        }
        UPSNotificationMessage a2 = com.vivo.push.util.u.a(g);
        boolean equals = this.f14137a.getPackageName().equals(pVar.e());
        if (equals) {
            NotifyAdapterUtil.cancelNotify(this.f14137a);
        }
        if (!equals) {
            com.vivo.push.util.t.a("NotifyOpenClientTask", "notify is " + a2 + " ; isMatch is " + equals);
            return;
        }
        com.vivo.push.b.y yVar = new com.vivo.push.b.y(1030L);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("type", "2");
        hashMap.put(com.heytap.mcssdk.constant.b.c, String.valueOf(pVar.f()));
        hashMap.put("platform", this.f14137a.getPackageName());
        String a3 = com.vivo.push.restructure.a.a().e().a();
        if (!TextUtils.isEmpty(a3)) {
            hashMap.put("remoteAppId", a3);
        }
        yVar.a(hashMap);
        com.vivo.push.m.a().a(yVar);
        com.vivo.push.util.t.d("NotifyOpenClientTask", "notification is clicked by skip type[" + a2.getSkipType() + "]");
        int skipType = a2.getSkipType();
        if (skipType == 1) {
            new Thread(new f(this, this.f14137a, a2.getParams())).start();
            a(a2);
            return;
        }
        if (skipType == 2) {
            String skipContent = a2.getSkipContent();
            if (!skipContent.startsWith("http://") && !skipContent.startsWith("https://")) {
                com.vivo.push.util.t.a("NotifyOpenClientTask", "url not legal");
            } else {
                Uri parse = Uri.parse(skipContent);
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                intent.setFlags(268435456);
                b(intent, a2.getParams());
                try {
                    this.f14137a.startActivity(intent);
                } catch (Exception unused) {
                    com.vivo.push.util.t.a("NotifyOpenClientTask", "startActivity error : ".concat(String.valueOf(parse)));
                }
            }
            a(a2);
            return;
        }
        if (skipType == 3) {
            a(a2);
            return;
        }
        if (skipType != 4) {
            com.vivo.push.util.t.a("NotifyOpenClientTask", "illegitmacy skip type error : " + a2.getSkipType());
            return;
        }
        String skipContent2 = a2.getSkipContent();
        try {
            parseUri = Intent.parseUri(skipContent2, 1);
            str = parseUri.getPackage();
        } catch (Exception e) {
            com.vivo.push.util.t.a("NotifyOpenClientTask", "open activity error : ".concat(String.valueOf(skipContent2)), e);
        }
        if (!TextUtils.isEmpty(str) && !this.f14137a.getPackageName().equals(str)) {
            com.vivo.push.util.t.a("NotifyOpenClientTask", "open activity error : local pkgName is " + this.f14137a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
            return;
        }
        String packageName = parseUri.getComponent() == null ? null : parseUri.getComponent().getPackageName();
        if (!TextUtils.isEmpty(packageName) && !this.f14137a.getPackageName().equals(packageName)) {
            com.vivo.push.util.t.a("NotifyOpenClientTask", "open activity component error : local pkgName is " + this.f14137a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
            return;
        }
        parseUri.setSelector(null);
        parseUri.setPackage(this.f14137a.getPackageName());
        parseUri.addFlags(DivSeparatorView.DEFAULT_DIVIDER_COLOR);
        b(parseUri, a2.getParams());
        ActivityInfo resolveActivityInfo = parseUri.resolveActivityInfo(this.f14137a.getPackageManager(), 65536);
        if (resolveActivityInfo != null && !resolveActivityInfo.exported) {
            com.vivo.push.util.t.a("NotifyOpenClientTask", "activity is not exported : " + resolveActivityInfo.toString());
        } else {
            this.f14137a.startActivity(parseUri);
            a(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent b(Intent intent, Map<String, String> map) {
        if (map != null && map.entrySet() != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    private void a(UPSNotificationMessage uPSNotificationMessage) {
        com.vivo.push.t.b(new g(this, uPSNotificationMessage));
    }
}
