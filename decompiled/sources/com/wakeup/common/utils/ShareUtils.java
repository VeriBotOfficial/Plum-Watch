package com.wakeup.common.utils;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.webkit.internal.AssetHelper;
import com.blankj.utilcode.util.IntentUtils;
import com.blankj.utilcode.util.UriUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ShareUtils {
    private ShareUtils() {
    }

    public static void shareTextUrl(final Context context, String title, String content) {
        shareSystemTextUrl(context, title, content);
    }

    public static boolean shareImage(Context context, String path) {
        if (!com.blankj.utilcode.util.FileUtils.isFileExists(path)) {
            return false;
        }
        shareSystemImage(context, path);
        return true;
    }

    public static void shareFile(Context context, String path) {
        if (TextUtils.isEmpty(path)) {
            return;
        }
        shareSystemFile(context, path);
    }

    private static String getMineType(String filePath) {
        try {
            File file = new File(filePath);
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(file.getName().substring(file.getName().lastIndexOf(".") + 1));
        } catch (Exception unused) {
            return "application/octet-stream";
        }
    }

    private static String getMineType2(String file) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(file);
            return mediaMetadataRetriever.extractMetadata(12);
        } catch (Exception unused) {
            return "application/octet-stream";
        }
    }

    public static void shareSystemFile(Context context, String path) {
        String mineType = getMineType(path);
        Uri file2Uri = UriUtils.file2Uri(new File(path));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(mineType);
        intent.putExtra("android.intent.extra.STREAM", file2Uri);
        intent.setDataAndType(file2Uri, mineType);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435457);
        context.startActivity(Intent.createChooser(intent, "分享"));
    }

    public static void shareSystemFile2(Context context, String path) {
        String mineType2 = getMineType2(path);
        Uri file2Uri = UriUtils.file2Uri(new File(path));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(mineType2);
        intent.putExtra("android.intent.extra.STREAM", file2Uri);
        intent.setDataAndType(file2Uri, mineType2);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435457);
        context.startActivity(Intent.createChooser(intent, "分享"));
    }

    public static void shareFile2(Context context, String path) {
        Uri file2Uri = UriUtils.file2Uri(new File(path));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.STREAM", file2Uri);
        intent.setDataAndType(file2Uri, "*/*");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435457);
        context.startActivity(Intent.createChooser(intent, "分享"));
    }

    public static void shareSystemFiles(Context context, List<String> paths) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = paths.iterator();
        ClipData clipData = null;
        while (it.hasNext()) {
            Uri file2Uri = UriUtils.file2Uri(new File(it.next()));
            arrayList.add(file2Uri);
            if (clipData == null) {
                clipData = ClipData.newUri(context.getContentResolver(), "", file2Uri);
            } else {
                clipData.addItem(new ClipData.Item(file2Uri));
            }
        }
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.setType("*/*");
        intent.setClipData(clipData);
        intent.putExtra("android.intent.extra.STREAM", arrayList);
        intent.addFlags(268435457);
        context.startActivity(Intent.createChooser(intent, ""));
    }

    public static void shareSystemImage(Context context, String path) {
        context.startActivity(IntentUtils.getShareImageIntent(path));
    }

    public static void shareSystemTextUrl(final Context context, String title, String content) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", content);
        intent.putExtra("android.intent.extra.SUBJECT", title);
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        context.startActivity(Intent.createChooser(intent, "share text"));
    }
}
