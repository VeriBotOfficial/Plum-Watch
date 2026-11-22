package com.heytap.mcssdk.d;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.constant.c;
import com.heytap.mcssdk.constant.d;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.constant.ConfigConstant;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.NotificationSortMessage;
import com.heytap.msp.push.notification.ISortListener;
import com.heytap.msp.push.notification.PushNotification;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class b {
    private int c;
    private int d;
    private int f;
    private int g;
    private StatusBarNotification h;

    /* renamed from: a, reason: collision with root package name */
    private int f10100a = 3;
    private List<NotificationSortMessage> b = new ArrayList();
    private List<String> e = new ArrayList();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f10101a = new b();

        private a() {
        }
    }

    private int a(List<NotificationSortMessage> list, int i) {
        int size = list == null ? 0 : list.size();
        if (i <= 0 || size == 0) {
            return i;
        }
        if (size < i) {
            int i2 = i - size;
            list.clear();
            return i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            list.remove((size - 1) - i3);
        }
        return 0;
    }

    public static b a() {
        return a.f10101a;
    }

    private DataMessage a(Context context, NotificationSortMessage notificationSortMessage) {
        DataMessage dataMessage = new DataMessage(context.getPackageName(), notificationSortMessage.getMessageId());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(d.b.f10098a, "false");
            String statisticData = notificationSortMessage.getStatisticData();
            if (!TextUtils.isEmpty(statisticData)) {
                jSONObject.put(d.b.b, statisticData);
            }
            dataMessage.setStatisticsExtra(jSONObject.toString());
        } catch (JSONException unused) {
        }
        return dataMessage;
    }

    private void a(int i) {
        if (i == 7) {
            this.c++;
        } else if (i == 5) {
            this.d++;
        }
    }

    private void a(NotificationManager notificationManager, Context context, int i) {
        a(com.heytap.mcssdk.d.a.a(notificationManager, context.getPackageName()), i);
    }

    private void a(Context context, NotificationManager notificationManager, int i) {
        a(this.b, i);
        a(context, notificationManager, this.b);
    }

    private void a(Context context, NotificationManager notificationManager, List<NotificationSortMessage> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        a(context, notificationManager, jSONArray, list, arrayList);
        if (jSONArray.length() != 0) {
            try {
                jSONObject.put(d.b.c, jSONArray);
                HeytapPushManager.cancelNotification(jSONObject);
            } catch (JSONException unused) {
            }
        }
        if (arrayList.size() != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(c.a.d, arrayList);
            StatisticUtils.statisticEvent(context, hashMap);
        }
    }

    private void a(Context context, NotificationManager notificationManager, JSONArray jSONArray, List<NotificationSortMessage> list, List<DataMessage> list2) {
        for (NotificationSortMessage notificationSortMessage : list) {
            if (notificationSortMessage.isMcs()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, notificationSortMessage.getMessageId());
                    jSONObject.put(ConfigConstant.NotificationSort.EXTRA_NOTIFY_ID, notificationSortMessage.getNotifyId());
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            } else {
                list2.add(a(context, notificationSortMessage));
                this.e.add(notificationSortMessage.getMessageId());
            }
            notificationManager.cancel(notificationSortMessage.getNotifyId());
        }
    }

    private void a(NotificationSortMessage notificationSortMessage) {
        if (notificationSortMessage.getAutoDelete() != 1) {
            return;
        }
        if (this.b.size() != 0) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                NotificationSortMessage notificationSortMessage2 = this.b.get(size);
                if (notificationSortMessage.getImportantLevel() >= notificationSortMessage2.getImportantLevel() && notificationSortMessage.getPostTime() >= notificationSortMessage2.getPostTime()) {
                    this.b.add(size + 1, notificationSortMessage2);
                    return;
                }
            }
        }
        this.b.add(0, notificationSortMessage);
    }

    private void a(ISortListener iSortListener, boolean z, PushNotification.Builder builder) {
        if (iSortListener != null) {
            iSortListener.buildCompleted(z, builder, this.e);
        }
    }

    private void a(PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        Bundle bundle = new Bundle();
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, notificationSortMessage.getAutoDelete());
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, notificationSortMessage.getImportantLevel());
        bundle.putString(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, notificationSortMessage.getMessageId());
        bundle.putLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, System.currentTimeMillis());
        bundle.putBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, false);
        bundle.putString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA, notificationSortMessage.getStatisticData());
        builder.addExtras(bundle);
        builder.setGroup(notificationSortMessage.getGroup());
    }

    private void a(StatusBarNotification[] statusBarNotificationArr, int i) {
        b();
        if (statusBarNotificationArr != null && statusBarNotificationArr.length != 0) {
            for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
                Bundle bundle = statusBarNotification.getNotification().extras;
                boolean z = bundle.getBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, true);
                long j = bundle.getLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, statusBarNotification.getPostTime());
                String string = bundle.getString(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, "");
                int i2 = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, 1);
                int i3 = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, 5);
                String string2 = bundle.getString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA);
                int id2 = statusBarNotification.getId();
                if (i == id2) {
                    this.h = statusBarNotification;
                    return;
                }
                NotificationSortMessage notificationSortMessage = new NotificationSortMessage(string, i3, i2, z, j, id2, string2);
                b(i2);
                a(i3);
                a(notificationSortMessage);
            }
        }
        if (com.heytap.mcssdk.utils.d.g()) {
            com.heytap.mcssdk.utils.d.b("initParams : notDelete:" + this.g + " canDelete : " + this.f + "\n highSize : " + this.c + " normalSize :" + this.d + '\n');
            com.heytap.mcssdk.utils.d.b("canDeleteList size : " + this.b.size());
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                NotificationSortMessage notificationSortMessage2 = this.b.get(i4);
                com.heytap.mcssdk.utils.d.b("第" + i4 + "条消息 messageId : " + notificationSortMessage2.getMessageId() + " importanceLevel : " + notificationSortMessage2.getImportantLevel() + " autoDelete : " + notificationSortMessage2.getAutoDelete() + " notifyId: " + notificationSortMessage2.getNotifyId() + " postTime:" + notificationSortMessage2.getPostTime());
            }
        }
    }

    private boolean a(NotificationManager notificationManager, Context context, PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        if (com.heytap.mcssdk.utils.d.g()) {
            com.heytap.mcssdk.utils.d.b("dealCurrentMessage : deleteNumber" + (this.f + this.g) + " keepNumber : " + this.f10100a);
        }
        boolean z = true;
        if (this.f + this.g < this.f10100a) {
            notificationSortMessage.setGroup((notificationSortMessage.getAutoDelete() == -1 ? new StringBuilder(d.a.b) : new StringBuilder(d.a.c)).append(context.getPackageName()).toString());
        } else if (notificationSortMessage.getAutoDelete() == -1) {
            notificationSortMessage.setGroup(d.a.b + context.getPackageName());
            int i = this.f10100a - this.g;
            if (com.heytap.mcssdk.utils.d.g()) {
                com.heytap.mcssdk.utils.d.b("dealCurrentMessage : allowDelete :" + i);
            }
            if (i > 0) {
                a(context, notificationManager, i - 1);
            } else {
                Notification a2 = com.heytap.mcssdk.d.a.a(context, notificationSortMessage.getGroup(), builder);
                if (a2 != null) {
                    notificationManager.notify(4096, a2);
                }
            }
        } else {
            z = a(context, notificationManager, notificationSortMessage);
        }
        if (com.heytap.mcssdk.utils.d.g()) {
            com.heytap.mcssdk.utils.d.b("dealCurrentMessage : needPost :" + z);
        }
        if (z) {
            a(builder, notificationSortMessage);
            return z;
        }
        com.heytap.mcssdk.g.a.a(context, c.a.c, a(context, notificationSortMessage));
        return z;
    }

    private boolean a(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage) {
        int i = this.g;
        int i2 = this.f10100a;
        boolean z = false;
        if (i >= i2) {
            return false;
        }
        int i3 = i2 - i;
        if (com.heytap.mcssdk.utils.d.g()) {
            com.heytap.mcssdk.utils.d.b("judgeShowCurrentMessage : allowDelete" + i3);
        }
        if (notificationSortMessage.getImportantLevel() == 7 || (notificationSortMessage.getImportantLevel() != 5 ? this.c + this.d < i3 : this.c < i3)) {
            z = true;
        }
        if (z) {
            a(context, notificationManager, i3 - 1);
        }
        return z;
    }

    private boolean a(Context context, PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        Notification notification;
        int verifyNotifyId = builder.getVerifyNotifyId();
        StatusBarNotification statusBarNotification = this.h;
        if (statusBarNotification == null || verifyNotifyId == -1 || (notification = statusBarNotification.getNotification()) == null) {
            return false;
        }
        notificationSortMessage.setGroup((notificationSortMessage.getAutoDelete() == 1 ? new StringBuilder(d.a.c) : new StringBuilder(d.a.b)).append(context.getPackageName()).toString());
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, "");
        a(builder, notificationSortMessage);
        this.e.add(string);
        return true;
    }

    private boolean a(PushNotification.Builder builder, int i, int i2, String str, String str2) {
        Context context = PushService.getInstance().getContext();
        if (builder == null || context == null) {
            return false;
        }
        NotificationManager a2 = com.heytap.mcssdk.d.a.a(context);
        NotificationSortMessage notificationSortMessage = new NotificationSortMessage(str, i2, i, false, System.currentTimeMillis(), str2);
        if (!a(context, a2, notificationSortMessage, builder)) {
            return true;
        }
        a(a2, context, builder.getVerifyNotifyId());
        if (a(context, builder, notificationSortMessage)) {
            return true;
        }
        return a(a2, context, builder, notificationSortMessage);
    }

    private void b() {
        this.f = 0;
        this.g = 0;
        this.c = 0;
        this.d = 0;
        this.b.clear();
        this.e.clear();
        this.h = null;
    }

    private void b(int i) {
        if (i == -1) {
            this.g++;
        } else if (i == 1) {
            this.f++;
        }
    }

    public void a(PushNotification.Builder builder, ISortListener iSortListener) {
        if (builder == null) {
            return;
        }
        a(iSortListener, a(builder, builder.getAutoDelete(), builder.getImportantLevel(), builder.getMessageId(), builder.getStatisticData()), builder);
    }

    public boolean a(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage, PushNotification.Builder builder) {
        if (notificationSortMessage.getAutoDelete() == 0 || Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        if (!com.heytap.mcssdk.d.a.a(notificationManager, context.getPackageName(), 4096)) {
            return true;
        }
        notificationSortMessage.setGroup(d.a.b + context.getPackageName());
        a(builder, notificationSortMessage);
        return false;
    }
}
