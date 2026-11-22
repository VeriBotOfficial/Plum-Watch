package com.bytedance.adsdk.kg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.kg.rb.jz;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes13.dex */
public class tw {
    private static final Map<String, rlu<sg>> fxn = new HashMap();
    private static final Set<Object> kg = new HashSet();
    private static final byte[] gff = {BuiltinOptions.UniqueOptions, BuiltinOptions.LeakyReluOptions, 3, 4};

    public static rlu<sg> fxn(Context context, String str) {
        return fxn(context, str, "url_".concat(String.valueOf(str)));
    }

    public static rlu<sg> fxn(final Context context, final String str, final String str2) {
        return fxn(str2, new Callable<mvp<sg>>() { // from class: com.bytedance.adsdk.kg.tw.1
            @Override // java.util.concurrent.Callable
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public mvp<sg> call() throws Exception {
                mvp<sg> fxn2 = rb.fxn(context).fxn(context, str, str2);
                if (str2 != null && fxn2.fxn() != null) {
                    com.bytedance.adsdk.kg.gff.rb.fxn().fxn(str2, fxn2.fxn());
                }
                return fxn2;
            }
        });
    }

    public static rlu<sg> kg(Context context, String str) {
        return kg(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static rlu<sg> kg(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return fxn(str2, new Callable<mvp<sg>>() { // from class: com.bytedance.adsdk.kg.tw.4
            @Override // java.util.concurrent.Callable
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public mvp<sg> call() throws Exception {
                return tw.gff(applicationContext, str, str2);
            }
        });
    }

    public static mvp<sg> gff(Context context, String str) {
        return gff(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static mvp<sg> gff(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return kg(context.getAssets().open(str), str2);
            }
            return fxn(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new mvp<>((Throwable) e);
        }
    }

    public static rlu<sg> fxn(Context context, int i) {
        return fxn(context, i, gff(context, i));
    }

    public static rlu<sg> fxn(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return fxn(str, new Callable<mvp<sg>>() { // from class: com.bytedance.adsdk.kg.tw.5
            @Override // java.util.concurrent.Callable
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public mvp<sg> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return tw.kg(context2, i, str);
            }
        });
    }

    public static mvp<sg> kg(Context context, int i) {
        return kg(context, i, gff(context, i));
    }

    public static mvp<sg> kg(Context context, int i, String str) {
        try {
            return kg(context.getResources().openRawResource(i), gff(context, i));
        } catch (Resources.NotFoundException e) {
            return new mvp<>((Throwable) e);
        }
    }

    private static String gff(Context context, int i) {
        return "rawRes" + (fxn(context) ? "_night_" : "_day_") + i;
    }

    private static boolean fxn(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static rlu<sg> fxn(final InputStream inputStream, final String str) {
        return fxn(str, new Callable<mvp<sg>>() { // from class: com.bytedance.adsdk.kg.tw.6
            @Override // java.util.concurrent.Callable
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public mvp<sg> call() throws Exception {
                return tw.kg(inputStream, str);
            }
        });
    }

    public static mvp<sg> kg(InputStream inputStream, String str) {
        return fxn(inputStream, str, true);
    }

    private static mvp<sg> fxn(InputStream inputStream, String str, boolean z) {
        try {
            return fxn(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.bytedance.adsdk.kg.bh.bh.fxn(inputStream);
            }
        }
    }

    public static mvp<sg> fxn(JsonReader jsonReader, String str) {
        return fxn(jsonReader, str, true);
    }

    private static mvp<sg> fxn(JsonReader jsonReader, String str, boolean z) {
        try {
            try {
                sg fxn2 = jz.fxn(jsonReader);
                com.bytedance.adsdk.kg.gff.rb.fxn().fxn(str, fxn2);
                mvp<sg> mvpVar = new mvp<>(fxn2);
                if (z) {
                    fxn(jsonReader);
                }
                return mvpVar;
            } catch (Exception e) {
                mvp<sg> mvpVar2 = new mvp<>(e);
                if (z) {
                    fxn(jsonReader);
                }
                return mvpVar2;
            }
        } catch (Throwable th) {
            if (z) {
                fxn(jsonReader);
            }
            throw th;
        }
    }

    public static void fxn(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static mvp<sg> fxn(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return kg(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.kg.bh.bh.fxn(zipInputStream);
        }
    }

    private static mvp<sg> kg(Context context, ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            sg sgVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    sgVar = fxn(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).fxn();
                } else {
                    if (!name.endsWith(PictureMimeType.PNG) && !name.endsWith(".webp") && !name.endsWith(PictureMimeType.JPG) && !name.endsWith(".jpeg")) {
                        if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        if (name.contains("../")) {
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            String[] split = name.split("/");
                            String str2 = split[split.length - 1];
                            String str3 = str2.split("\\.")[0];
                            File file = new File(context.getCacheDir(), str2);
                            new FileOutputStream(file);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } finally {
                                }
                            } catch (Throwable unused) {
                                new StringBuilder("Unable to save font ").append(str3).append(" to the temporary file: ").append(str2);
                            }
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                new StringBuilder("Failed to delete temp font file ").append(file.getAbsolutePath());
                            }
                            hashMap2.put(str3, createFromFile);
                        }
                    }
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] split2 = name.split("/");
                        hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (sgVar == null) {
                return new mvp<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                hie fxn2 = fxn(sgVar, (String) entry.getKey());
                if (fxn2 != null) {
                    fxn2.fxn(com.bytedance.adsdk.kg.bh.bh.fxn((Bitmap) entry.getValue(), fxn2.fxn(), fxn2.kg()));
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z = false;
                for (com.bytedance.adsdk.kg.gff.gff gffVar : sgVar.ckl().values()) {
                    if (gffVar.fxn().equals(entry2.getKey())) {
                        gffVar.fxn((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                }
            }
            if (hashMap.isEmpty()) {
                Iterator<Map.Entry<String, hie>> it = sgVar.xdg().entrySet().iterator();
                while (it.hasNext()) {
                    hie value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String jq = value.jq();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (jq.startsWith("data:") && jq.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(jq.substring(jq.indexOf(44) + 1), 0);
                            value.fxn(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, hie> entry3 : sgVar.xdg().entrySet()) {
                if (entry3.getValue().dgx() == null) {
                    return new mvp<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().jq()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.kg.gff.rb.fxn().fxn(str, sgVar);
            }
            return new mvp<>(sgVar);
        } catch (IOException e) {
            return new mvp<>((Throwable) e);
        }
    }

    private static hie fxn(sg sgVar, String str) {
        for (hie hieVar : sgVar.xdg().values()) {
            if (hieVar.jq().equals(str)) {
                return hieVar;
            }
        }
        return null;
    }

    private static rlu<sg> fxn(final String str, Callable<mvp<sg>> callable) {
        final sg fxn2 = str == null ? null : com.bytedance.adsdk.kg.gff.rb.fxn().fxn(str);
        if (fxn2 != null) {
            return new rlu<>(new Callable<mvp<sg>>() { // from class: com.bytedance.adsdk.kg.tw.7
                @Override // java.util.concurrent.Callable
                /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
                public mvp<sg> call() throws Exception {
                    return new mvp<>(sg.this);
                }
            });
        }
        if (str != null) {
            Map<String, rlu<sg>> map = fxn;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        rlu<sg> rluVar = new rlu<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            rluVar.fxn(new dgx<sg>() { // from class: com.bytedance.adsdk.kg.tw.2
                @Override // com.bytedance.adsdk.kg.dgx
                public void fxn(sg sgVar) {
                    tw.fxn.remove(str);
                    atomicBoolean.set(true);
                    if (tw.fxn.size() == 0) {
                        tw.kg(true);
                    }
                }
            });
            rluVar.gff(new dgx<Throwable>() { // from class: com.bytedance.adsdk.kg.tw.3
                @Override // com.bytedance.adsdk.kg.dgx
                public void fxn(Throwable th) {
                    tw.fxn.remove(str);
                    atomicBoolean.set(true);
                    if (tw.fxn.size() == 0) {
                        tw.kg(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, rlu<sg>> map2 = fxn;
                map2.put(str, rluVar);
                if (map2.size() == 1) {
                    kg(false);
                }
            }
        }
        return rluVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void kg(boolean z) {
        ArrayList arrayList = new ArrayList(kg);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }
}
