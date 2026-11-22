package com.baidu.platform.comapi.wnplatform;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.baidumap.DownloadListener;
import com.baidu.ar.baidumap.EglCoreDownloader;

/* loaded from: classes13.dex */
public class ArSoDownLoader {
    private Context b;
    private EglCoreDownloader c;
    private ISoDownLoadCallBack e;

    /* renamed from: a, reason: collision with root package name */
    private boolean f8876a = false;
    private boolean d = false;
    private Handler f = new Handler(Looper.getMainLooper()) { // from class: com.baidu.platform.comapi.wnplatform.ArSoDownLoader.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ArSoDownLoader.this.f8876a = true;
                return;
            }
            if (i == 1) {
                Boolean bool = (Boolean) message.obj;
                ArSoDownLoader.this.f8876a = false;
                if (ArSoDownLoader.this.e == null || !bool.booleanValue()) {
                    return;
                }
                ArSoDownLoader.this.e.a();
                return;
            }
            if (i != 2) {
                if (i != 3 || ArSoDownLoader.this.e == null) {
                    return;
                }
                ArSoDownLoader.this.e.a(((Integer) message.obj).intValue());
                return;
            }
            ArSoDownLoader.this.f8876a = false;
            if (ArSoDownLoader.this.e != null) {
                ArSoDownLoader.this.e.b();
            }
        }
    };

    private static class Holder {

        /* renamed from: a, reason: collision with root package name */
        static final ArSoDownLoader f8879a = new ArSoDownLoader();

        private Holder() {
        }
    }

    public interface ISoDownLoadCallBack {
        void a();

        void a(int i);

        void b();
    }

    private class Msg {
    }

    public void b() {
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        EglCoreDownloader eglCoreDownloader = this.c;
        if (eglCoreDownloader != null) {
            eglCoreDownloader.release();
            this.c = null;
        }
    }

    public static ArSoDownLoader a() {
        return Holder.f8879a;
    }

    public void a(Context context, ISoDownLoadCallBack iSoDownLoadCallBack) {
        this.e = iSoDownLoadCallBack;
        this.b = context;
        if (context == null || this.f8876a) {
            return;
        }
        if (this.c == null) {
            this.c = EglCoreDownloader.getInstance(context);
        }
        this.c.download(new DownloadListener() { // from class: com.baidu.platform.comapi.wnplatform.ArSoDownLoader.2
            @Override // com.baidu.ar.baidumap.DownloadListener
            public void onDownloadComplete(boolean z) {
                if (ArSoDownLoader.this.f == null || ArSoDownLoader.this.b == null) {
                    return;
                }
                Message message = new Message();
                message.what = 1;
                message.obj = new Boolean(z);
                ArSoDownLoader.this.f.sendMessage(message);
            }

            @Override // com.baidu.ar.baidumap.DownloadListener
            public void onDownloadError(int i, String str) {
                if (ArSoDownLoader.this.f == null || ArSoDownLoader.this.b == null) {
                    return;
                }
                Message message = new Message();
                message.what = 2;
                message.obj = str;
                ArSoDownLoader.this.f.sendMessage(message);
            }

            @Override // com.baidu.ar.baidumap.DownloadListener
            public void onDownloadProcess(int i) {
                if (ArSoDownLoader.this.f != null) {
                    Message message = new Message();
                    message.what = 3;
                    message.obj = Integer.valueOf(i);
                    ArSoDownLoader.this.f.sendMessage(message);
                }
            }

            @Override // com.baidu.ar.baidumap.DownloadListener
            public void onDownloadStart(boolean z) {
                if (ArSoDownLoader.this.f != null) {
                    Message message = new Message();
                    message.what = 0;
                    ArSoDownLoader.this.f.sendMessage(message);
                }
            }
        });
    }
}
