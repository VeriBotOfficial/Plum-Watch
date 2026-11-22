package com.wakeup.commonui.utils.pictureselector;

import android.content.Context;
import android.net.Uri;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.engine.CompressFileEngine;
import com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener;
import com.luck.picture.lib.utils.DateUtils;
import com.wakeup.common.log.LogUtils;
import java.io.File;
import java.util.ArrayList;
import top.zibin.luban.Luban;
import top.zibin.luban.OnNewCompressListener;
import top.zibin.luban.OnRenameListener;

/* loaded from: classes2.dex */
public class ImageFileCompressEngine implements CompressFileEngine {
    private final String TAG = "ImageFileCompressEngine";

    @Override // com.luck.picture.lib.engine.CompressFileEngine
    public void onStartCompress(Context context, ArrayList<Uri> arrayList, final OnKeyValueResultCallbackListener onKeyValueResultCallbackListener) {
        Luban.with(context).load(arrayList).ignoreBy(100).setRenameListener(new OnRenameListener() { // from class: com.wakeup.commonui.utils.pictureselector.ImageFileCompressEngine$$ExternalSyntheticLambda0
            @Override // top.zibin.luban.OnRenameListener
            public final String rename(String str) {
                return ImageFileCompressEngine.lambda$onStartCompress$0(str);
            }
        }).setCompressListener(new OnNewCompressListener() { // from class: com.wakeup.commonui.utils.pictureselector.ImageFileCompressEngine.1
            @Override // top.zibin.luban.OnNewCompressListener
            public void onStart() {
                LogUtils.i("ImageFileCompressEngine", "压缩开始");
            }

            @Override // top.zibin.luban.OnNewCompressListener
            public void onSuccess(String str, File file) {
                LogUtils.i("ImageFileCompressEngine", "压缩成功：" + file.getAbsolutePath());
                OnKeyValueResultCallbackListener onKeyValueResultCallbackListener2 = onKeyValueResultCallbackListener;
                if (onKeyValueResultCallbackListener2 != null) {
                    onKeyValueResultCallbackListener2.onCallback(str, file.getAbsolutePath());
                }
            }

            @Override // top.zibin.luban.OnNewCompressListener
            public void onError(String str, Throwable th) {
                LogUtils.e("ImageFileCompressEngine", "压缩失败：" + (th == null ? "" : th.getLocalizedMessage()));
                OnKeyValueResultCallbackListener onKeyValueResultCallbackListener2 = onKeyValueResultCallbackListener;
                if (onKeyValueResultCallbackListener2 != null) {
                    onKeyValueResultCallbackListener2.onCallback(str, null);
                }
            }
        }).launch();
    }

    static /* synthetic */ String lambda$onStartCompress$0(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        return DateUtils.getCreateFileName("CMP_") + (lastIndexOf != -1 ? str.substring(lastIndexOf) : PictureMimeType.JPG);
    }
}
