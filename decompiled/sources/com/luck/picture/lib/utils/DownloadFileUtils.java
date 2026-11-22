package com.luck.picture.lib.utils;

import android.content.Context;
import com.luck.picture.lib.interfaces.OnCallbackListener;
import com.luck.picture.lib.thread.PictureThreadUtils;

/* loaded from: classes17.dex */
public class DownloadFileUtils {
    public static void saveLocalFile(final Context context, final String str, final String str2, final OnCallbackListener<String> onCallbackListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<String>() { // from class: com.luck.picture.lib.utils.DownloadFileUtils.1
            /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[Catch: Exception -> 0x022c, TryCatch #0 {Exception -> 0x022c, blocks: (B:3:0x0006, B:6:0x0030, B:8:0x003f, B:10:0x0047, B:13:0x0050, B:14:0x0055, B:16:0x005e, B:17:0x00ac, B:19:0x01e9, B:21:0x01f1, B:22:0x0219, B:24:0x0225, B:29:0x01fd, B:31:0x0205, B:32:0x0212, B:34:0x0067, B:36:0x0071, B:37:0x0084, B:38:0x0078, B:40:0x00ba, B:43:0x00c4, B:45:0x00d3, B:47:0x00db, B:50:0x00e4, B:51:0x00ea, B:53:0x00f3, B:54:0x0141, B:55:0x00fc, B:57:0x0106, B:58:0x0119, B:59:0x010d, B:61:0x014f, B:63:0x015e, B:65:0x0166, B:68:0x016f, B:69:0x0174, B:71:0x017d, B:72:0x01db, B:73:0x0186, B:75:0x018e, B:77:0x0196, B:79:0x01a0, B:80:0x01b3, B:81:0x01a7), top: B:2:0x0006 }] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0067 A[Catch: Exception -> 0x022c, TryCatch #0 {Exception -> 0x022c, blocks: (B:3:0x0006, B:6:0x0030, B:8:0x003f, B:10:0x0047, B:13:0x0050, B:14:0x0055, B:16:0x005e, B:17:0x00ac, B:19:0x01e9, B:21:0x01f1, B:22:0x0219, B:24:0x0225, B:29:0x01fd, B:31:0x0205, B:32:0x0212, B:34:0x0067, B:36:0x0071, B:37:0x0084, B:38:0x0078, B:40:0x00ba, B:43:0x00c4, B:45:0x00d3, B:47:0x00db, B:50:0x00e4, B:51:0x00ea, B:53:0x00f3, B:54:0x0141, B:55:0x00fc, B:57:0x0106, B:58:0x0119, B:59:0x010d, B:61:0x014f, B:63:0x015e, B:65:0x0166, B:68:0x016f, B:69:0x0174, B:71:0x017d, B:72:0x01db, B:73:0x0186, B:75:0x018e, B:77:0x0196, B:79:0x01a0, B:80:0x01b3, B:81:0x01a7), top: B:2:0x0006 }] */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00f3 A[Catch: Exception -> 0x022c, TryCatch #0 {Exception -> 0x022c, blocks: (B:3:0x0006, B:6:0x0030, B:8:0x003f, B:10:0x0047, B:13:0x0050, B:14:0x0055, B:16:0x005e, B:17:0x00ac, B:19:0x01e9, B:21:0x01f1, B:22:0x0219, B:24:0x0225, B:29:0x01fd, B:31:0x0205, B:32:0x0212, B:34:0x0067, B:36:0x0071, B:37:0x0084, B:38:0x0078, B:40:0x00ba, B:43:0x00c4, B:45:0x00d3, B:47:0x00db, B:50:0x00e4, B:51:0x00ea, B:53:0x00f3, B:54:0x0141, B:55:0x00fc, B:57:0x0106, B:58:0x0119, B:59:0x010d, B:61:0x014f, B:63:0x015e, B:65:0x0166, B:68:0x016f, B:69:0x0174, B:71:0x017d, B:72:0x01db, B:73:0x0186, B:75:0x018e, B:77:0x0196, B:79:0x01a0, B:80:0x01b3, B:81:0x01a7), top: B:2:0x0006 }] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00fc A[Catch: Exception -> 0x022c, TryCatch #0 {Exception -> 0x022c, blocks: (B:3:0x0006, B:6:0x0030, B:8:0x003f, B:10:0x0047, B:13:0x0050, B:14:0x0055, B:16:0x005e, B:17:0x00ac, B:19:0x01e9, B:21:0x01f1, B:22:0x0219, B:24:0x0225, B:29:0x01fd, B:31:0x0205, B:32:0x0212, B:34:0x0067, B:36:0x0071, B:37:0x0084, B:38:0x0078, B:40:0x00ba, B:43:0x00c4, B:45:0x00d3, B:47:0x00db, B:50:0x00e4, B:51:0x00ea, B:53:0x00f3, B:54:0x0141, B:55:0x00fc, B:57:0x0106, B:58:0x0119, B:59:0x010d, B:61:0x014f, B:63:0x015e, B:65:0x0166, B:68:0x016f, B:69:0x0174, B:71:0x017d, B:72:0x01db, B:73:0x0186, B:75:0x018e, B:77:0x0196, B:79:0x01a0, B:80:0x01b3, B:81:0x01a7), top: B:2:0x0006 }] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x017d A[Catch: Exception -> 0x022c, TryCatch #0 {Exception -> 0x022c, blocks: (B:3:0x0006, B:6:0x0030, B:8:0x003f, B:10:0x0047, B:13:0x0050, B:14:0x0055, B:16:0x005e, B:17:0x00ac, B:19:0x01e9, B:21:0x01f1, B:22:0x0219, B:24:0x0225, B:29:0x01fd, B:31:0x0205, B:32:0x0212, B:34:0x0067, B:36:0x0071, B:37:0x0084, B:38:0x0078, B:40:0x00ba, B:43:0x00c4, B:45:0x00d3, B:47:0x00db, B:50:0x00e4, B:51:0x00ea, B:53:0x00f3, B:54:0x0141, B:55:0x00fc, B:57:0x0106, B:58:0x0119, B:59:0x010d, B:61:0x014f, B:63:0x015e, B:65:0x0166, B:68:0x016f, B:69:0x0174, B:71:0x017d, B:72:0x01db, B:73:0x0186, B:75:0x018e, B:77:0x0196, B:79:0x01a0, B:80:0x01b3, B:81:0x01a7), top: B:2:0x0006 }] */
            /* JADX WARN: Removed duplicated region for block: B:73:0x0186 A[Catch: Exception -> 0x022c, TryCatch #0 {Exception -> 0x022c, blocks: (B:3:0x0006, B:6:0x0030, B:8:0x003f, B:10:0x0047, B:13:0x0050, B:14:0x0055, B:16:0x005e, B:17:0x00ac, B:19:0x01e9, B:21:0x01f1, B:22:0x0219, B:24:0x0225, B:29:0x01fd, B:31:0x0205, B:32:0x0212, B:34:0x0067, B:36:0x0071, B:37:0x0084, B:38:0x0078, B:40:0x00ba, B:43:0x00c4, B:45:0x00d3, B:47:0x00db, B:50:0x00e4, B:51:0x00ea, B:53:0x00f3, B:54:0x0141, B:55:0x00fc, B:57:0x0106, B:58:0x0119, B:59:0x010d, B:61:0x014f, B:63:0x015e, B:65:0x0166, B:68:0x016f, B:69:0x0174, B:71:0x017d, B:72:0x01db, B:73:0x0186, B:75:0x018e, B:77:0x0196, B:79:0x01a0, B:80:0x01b3, B:81:0x01a7), top: B:2:0x0006 }] */
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.String doInBackground() {
                /*
                    Method dump skipped, instructions count: 562
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.utils.DownloadFileUtils.AnonymousClass1.doInBackground():java.lang.String");
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(String str3) {
                PictureThreadUtils.cancel(this);
                OnCallbackListener onCallbackListener2 = onCallbackListener;
                if (onCallbackListener2 != null) {
                    onCallbackListener2.onCall(str3);
                }
            }
        });
    }
}
