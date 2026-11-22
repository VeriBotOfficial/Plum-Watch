package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.wakeup.module.glasses.bean.GlassesFilmTopicBean;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class cl {

    /* renamed from: a, reason: collision with other field name */
    private static final List<String> f286a = Arrays.asList(GlassesFilmTopicBean.TOPIC_WX, GlassesFilmTopicBean.TOPIC_NC, GlassesFilmTopicBean.TOPIC_XY, GlassesFilmTopicBean.TOPIC_FN, "005");

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f14491a = null;

    public static void a(String str, String str2) {
    }

    public static boolean a(Context context) {
        if (f14491a == null) {
            try {
                if (!j.m12358a(context)) {
                    f14491a = false;
                }
                String m12476a = com.xiaomi.push.service.q.m12476a(context);
                if (!TextUtils.isEmpty(m12476a) && m12476a.length() >= 3) {
                    f14491a = Boolean.valueOf(f286a.contains(m12476a.substring(m12476a.length() - 3)));
                } else {
                    f14491a = false;
                }
                a("Sampling statistical connection quality: " + f14491a);
            } catch (Throwable th) {
                f14491a = false;
                com.xiaomi.channel.commonutils.logger.b.c("Push-ConnectionQualityStatsHelper", "Determine sampling switch error: " + th);
            }
        }
        return f14491a.booleanValue();
    }

    static void a(String str) {
        a("Push-ConnectionQualityStatsHelper", str);
    }
}
