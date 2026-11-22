package com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.qumeng.overseas.advlib.__remote__.framework.imageloader.l;
import com.qumeng.overseas.advlib.__remote__.utils.j;
import com.qumeng.overseas.advlib.ui.resid.ResourceID;
import java.io.File;
import java.text.DecimalFormat;

/* loaded from: classes17.dex */
public class a implements c {
    private Context h;
    private int i;
    private Notification j;
    private NotificationManagerCompat k;
    private RemoteViews l;
    private DecimalFormat m = new DecimalFormat(".0");
    private String n;
    private String o;
    private Intent p;

    /* renamed from: q, reason: collision with root package name */
    private int f12920q;
    private com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.c r;
    private String s;
    private String t;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.a$a, reason: collision with other inner class name */
    class C0796a extends com.qumeng.overseas.advlib.__remote__.framework.imageloader.a<Bitmap> {
        C0796a() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.a
        public void onResourceReady(Bitmap bitmap) {
            if (bitmap != null) {
                a.this.l.setImageViewBitmap(ResourceID.DOWNLOAD_IV_APP_LOGO, bitmap);
                a.this.e();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oqmo.a.makeText(a.this.h, "连接异常，请稍后再试", 1).show();
        }
    }

    protected a(Context context, int i, String str, String str2) {
        this.h = context;
        this.k = NotificationManagerCompat.from(context);
        this.i = i;
        this.o = str;
        this.t = str2;
        l.c().preload("https://cdn.adseye.com/nsdk/res/imgstatic/qm_download_ stimulate.png");
        l.c().preload("https://cdn.adseye.com/nsdk/res/imgstatic/qm_download_common_logo.png");
    }

    private void d() {
        try {
            this.k.cancel(this.i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.k.notify(this.i, this.j);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.c
    public void cancel() {
        d();
        this.f12920q = 4;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.c
    public void onInstalled(String str) {
        if (this.f12920q == 4) {
            return;
        }
        this.l.setTextViewText(ResourceID.DOWNLOAD_TV_APP_NAME, String.format("%s - 安装完成", this.n));
        this.l.setTextViewText(ResourceID.DOWNLOAD_TV_CONTROL, "打开应用");
        this.l.setViewVisibility(ResourceID.DOWNLOAD_TV_PROGRESS_CONTAINER, 8);
        this.l.setViewVisibility(ResourceID.DOWNLOAD_PB_PROGRESSBAR, 8);
        e();
        this.f12920q = 5;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.c
    public void onPause() {
        if (this.f12920q == 4) {
            return;
        }
        this.l.setTextViewText(ResourceID.DOWNLOAD_TV_CONTROL, "继续下载");
        this.l.setTextViewText(ResourceID.DOWNLOAD_TV_PROGRESS_VALUE, "下载暂停");
        e();
        this.f12920q = 6;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.c
    public void a(String str, String str2) {
        if (com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.b.a(this.o) != null) {
            return;
        }
        if (!TextUtils.isEmpty(this.o)) {
            com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.b.a(this.o, this);
        }
        this.n = str2;
        if (TextUtils.isEmpty(str2)) {
            this.n = "该应用";
        }
        RemoteViews remoteViews = new RemoteViews(this.h.getPackageName(), ResourceID.DOWNLOAD_LAYOUT_NOTIFICATION);
        this.l = remoteViews;
        int i = ResourceID.DOWNLOAD_TV_CANCEL;
        remoteViews.setTextViewText(i, "取消");
        if (com.qumeng.overseas.advlib.__remote__.core.proto.utils.b.b(this.h, this.o)) {
            this.l.setTextViewText(ResourceID.DOWNLOAD_TV_APP_NAME, String.format("%s - 安装完成", this.n));
            this.l.setTextViewText(ResourceID.DOWNLOAD_TV_CONTROL, "打开应用");
            this.l.setViewVisibility(ResourceID.DOWNLOAD_TV_PROGRESS_CONTAINER, 8);
            this.l.setViewVisibility(ResourceID.DOWNLOAD_PB_PROGRESSBAR, 8);
        } else {
            this.l.setViewVisibility(ResourceID.DOWNLOAD_TV_PROGRESS_CONTAINER, 0);
            this.l.setTextViewText(ResourceID.DOWNLOAD_TV_APP_NAME, this.n);
            this.l.setTextViewText(ResourceID.DOWNLOAD_TV_CONTROL, "暂停");
            this.l.setProgressBar(ResourceID.DOWNLOAD_PB_PROGRESSBAR, 100, 0, false);
        }
        Intent intent = new Intent(e.f12925a);
        intent.putExtra(e.c, this.o);
        intent.putExtra(e.d, str);
        try {
            this.l.setOnClickPendingIntent(i, Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(this.h, this.i, intent, 201326592) : PendingIntent.getBroadcast(this.h, this.i, intent, 134217728));
        } catch (Throwable unused) {
        }
        Intent intent2 = new Intent(e.b);
        this.p = intent2;
        intent2.putExtra(e.c, this.o);
        this.p.putExtra(e.d, str);
        try {
            this.l.setOnClickPendingIntent(ResourceID.DOWNLOAD_TV_CONTROL, Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(this.h, this.i, this.p, 201326592) : PendingIntent.getBroadcast(this.h, this.i, this.p, 134217728));
        } catch (Throwable unused2) {
        }
        this.j = new NotificationCompat.Builder(this.h, com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.b.b).setWhen(System.currentTimeMillis()).setSmallIcon(ResourceID.DOWNLOAD_IC_SMALL_ICON).setCustomContentView(this.l).setAutoCancel(false).setOnlyAlertOnce(true).setGroupSummary(false).setGroup("download").setColor(Color.parseColor("#00C882")).build();
        l.c().url(this.t).asBitmap(new C0796a());
        e();
        if (!TextUtils.isEmpty(this.o)) {
            com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.b.a(this.o, this);
        }
        this.f12920q = 1;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.c
    public com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.c b() {
        return this.r;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.c
    public int c() {
        return this.f12920q;
    }

    private SpannableString b(String str) {
        int indexOf = str.indexOf("/");
        int length = str.length();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#626665")), indexOf, length, 33);
        return spannableString;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.c
    public void a(int i, long j, long j2) {
        if (this.f12920q == 4) {
            return;
        }
        this.l.setProgressBar(ResourceID.DOWNLOAD_PB_PROGRESSBAR, 100, i, false);
        this.l.setTextViewText(ResourceID.DOWNLOAD_TV_SIZE, b(String.format("%s/%s", a(j), a(j2))));
        this.l.setTextViewText(ResourceID.DOWNLOAD_TV_APP_NAME, this.n);
        this.l.setTextViewText(ResourceID.DOWNLOAD_TV_CONTROL, "暂停");
        this.l.setTextViewText(ResourceID.DOWNLOAD_TV_PROGRESS_VALUE, String.format("正在下载%d%%", Integer.valueOf(i)));
        e();
        this.f12920q = 2;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.c
    public void a(File file) {
        if (this.f12920q == 4) {
            return;
        }
        this.l.setTextViewText(ResourceID.DOWNLOAD_TV_APP_NAME, String.format("%s - 下载完成", this.n));
        this.l.setTextViewText(ResourceID.DOWNLOAD_TV_CONTROL, "立即安装");
        this.l.setViewVisibility(ResourceID.DOWNLOAD_TV_PROGRESS_CONTAINER, 8);
        this.l.setViewVisibility(ResourceID.DOWNLOAD_PB_PROGRESSBAR, 8);
        e();
        this.f12920q = 7;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.c
    public void a() {
        if (this.f12920q == 4) {
            return;
        }
        this.l.setTextViewText(ResourceID.DOWNLOAD_TV_CONTROL, "重试");
        e();
        j.c().post(new b());
        this.f12920q = 3;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.c
    public void a(com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.c cVar) {
        this.r = cVar;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification.c
    public void a(String str) {
        this.s = str;
    }

    private String a(long j) {
        double d = (j / 1024.0d) / 1024.0d;
        if (d < 1.0d) {
            return "0" + this.m.format(d) + "MB";
        }
        return this.m.format(d) + "MB";
    }
}
