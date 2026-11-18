package com.baidu.ar;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import com.phancy.mini.api.file.FileSystemManager;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UUID f6958a;

    public h3(Context context) {
        if (f6958a == null) {
            synchronized (h3.class) {
                if (f6958a == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("bd_plugin_ar_device_id.xml", 0);
                    String string = sharedPreferences.getString("device_id", null);
                    if (string != null) {
                        f6958a = UUID.fromString(string);
                    } else {
                        String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        try {
                            if (!"9774d56d682e549c".equals(string2) && !TextUtils.isEmpty(string2)) {
                                f6958a = UUID.nameUUIDFromBytes(string2.getBytes(FileSystemManager.ENCODING_UTF8));
                            }
                            if (f6958a != null) {
                                sharedPreferences.edit().putString("device_id", f6958a.toString()).apply();
                            }
                        } catch (UnsupportedEncodingException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }

    public UUID a() {
        return f6958a;
    }
}
