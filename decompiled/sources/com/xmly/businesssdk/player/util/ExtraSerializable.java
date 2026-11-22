package com.xmly.businesssdk.player.util;

import android.content.Context;
import com.xmly.businesssdk.utils.Logger;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ExtraSerializable {
    public static final String CONF_FILE = "FmxosMusicPlayerExtraData.conf";
    private final Context context;

    public ExtraSerializable(Context context) {
        this.context = context;
    }

    private static void close(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            Logger.d("FxPlayer", "close()", e);
        }
    }

    private File createFile() {
        File file = new File(this.context.getFilesDir(), "fmxosPlatform");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, CONF_FILE);
    }

    public Object get() {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(createFile()));
            try {
                try {
                    Object readObject = objectInputStream.readObject();
                    close(objectInputStream);
                    return readObject;
                } catch (Exception e) {
                    e = e;
                    Logger.d("FxPlayer", "get()", e);
                    close(objectInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                objectInputStream2 = objectInputStream;
                close(objectInputStream2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            objectInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            close(objectInputStream2);
            throw th;
        }
    }

    public void put(Serializable serializable) {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(createFile()));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            objectOutputStream = objectOutputStream2;
        }
        try {
            objectOutputStream.writeObject(serializable);
            objectOutputStream.flush();
        } catch (Exception e2) {
            e = e2;
            objectOutputStream2 = objectOutputStream;
            Logger.d("FxPlayer", "put()", e);
            objectOutputStream = objectOutputStream2;
            close(objectOutputStream);
        } catch (Throwable th2) {
            th = th2;
            close(objectOutputStream);
            throw th;
        }
        close(objectOutputStream);
    }
}
