package com.baidu.mapapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapsdkplatform.comapi.commonutils.AssetsLoadUtil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes13.dex */
public class BitmapDescriptorFactory {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7896a = "BaiduMapSDK-BitmapDescriptorFactory";

    public static BitmapDescriptor fromAsset(String str) {
        Context context = BMapManager.getContext();
        if (context == null) {
            return null;
        }
        try {
            Bitmap loadAssetsFile = AssetsLoadUtil.loadAssetsFile(str, context);
            BitmapDescriptor fromBitmap = fromBitmap(loadAssetsFile);
            if (loadAssetsFile != null) {
                loadAssetsFile.recycle();
            }
            return fromBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static BitmapDescriptor fromAssetWithDpi(String str) {
        BitmapDescriptor fromBitmap;
        Bitmap bitmap;
        Context context = BMapManager.getContext();
        if (context == null) {
            return null;
        }
        try {
            Bitmap loadAssetsFile = AssetsLoadUtil.loadAssetsFile(str, context);
            if (loadAssetsFile == null) {
                return null;
            }
            int densityDpi = SysOSUtil.getDensityDpi();
            if (densityDpi > 480) {
                Matrix matrix = new Matrix();
                matrix.postScale(2.0f, 2.0f);
                bitmap = Bitmap.createBitmap(loadAssetsFile, 0, 0, loadAssetsFile.getWidth(), loadAssetsFile.getHeight(), matrix, true);
                fromBitmap = fromBitmap(bitmap);
            } else if (densityDpi > 320) {
                Matrix matrix2 = new Matrix();
                matrix2.postScale(1.5f, 1.5f);
                bitmap = Bitmap.createBitmap(loadAssetsFile, 0, 0, loadAssetsFile.getWidth(), loadAssetsFile.getHeight(), matrix2, true);
                fromBitmap = fromBitmap(bitmap);
            } else {
                fromBitmap = fromBitmap(loadAssetsFile);
                bitmap = null;
            }
            loadAssetsFile.recycle();
            if (bitmap != null) {
                bitmap.recycle();
            }
            return fromBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return new BitmapDescriptor(bitmap);
    }

    public static BitmapDescriptor fromFile(String str) {
        Context context;
        if (str == null || str.equals("") || (context = BMapManager.getContext()) == null) {
            return null;
        }
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            Bitmap decodeStream = BitmapFactory.decodeStream(openFileInput);
            openFileInput.close();
            if (decodeStream != null) {
                BitmapDescriptor fromBitmap = fromBitmap(decodeStream);
                decodeStream.recycle();
                return fromBitmap;
            }
        } catch (FileNotFoundException e) {
            Log.e(f7896a, "FileNotFoundException happened", e);
        } catch (IOException e2) {
            Log.e(f7896a, "IOException happened", e2);
        }
        return null;
    }

    public static BitmapDescriptor fromFileWithDpi(String str, int i) {
        Context context;
        if (str == null || str.equals("") || (context = BMapManager.getContext()) == null) {
            return null;
        }
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            Bitmap decodeStream = BitmapFactory.decodeStream(openFileInput);
            openFileInput.close();
            if (decodeStream != null) {
                if (i <= 0) {
                    i = SysOSUtil.getDensityDpi();
                }
                decodeStream.setDensity(i);
                BitmapDescriptor fromBitmap = fromBitmap(decodeStream);
                decodeStream.recycle();
                return fromBitmap;
            }
        } catch (FileNotFoundException e) {
            Log.e(f7896a, "FileNotFoundException happened", e);
        } catch (IOException e2) {
            Log.e(f7896a, "IOException happened", e2);
        }
        return null;
    }

    public static BitmapDescriptor fromPath(String str) {
        Bitmap decodeFile;
        if (TextUtils.isEmpty(str) || (decodeFile = BitmapFactory.decodeFile(str)) == null) {
            return null;
        }
        BitmapDescriptor fromBitmap = fromBitmap(decodeFile);
        decodeFile.recycle();
        return fromBitmap;
    }

    public static BitmapDescriptor fromPathWithDpi(String str, int i) {
        Bitmap decodeFile;
        if (TextUtils.isEmpty(str) || (decodeFile = BitmapFactory.decodeFile(str)) == null) {
            return null;
        }
        if (i <= 0) {
            i = SysOSUtil.getDensityDpi();
        }
        decodeFile.setDensity(i);
        BitmapDescriptor fromBitmap = fromBitmap(decodeFile);
        decodeFile.recycle();
        return fromBitmap;
    }

    public static BitmapDescriptor fromResource(int i) {
        Bitmap decodeResource;
        Context context = BMapManager.getContext();
        if (context == null || (decodeResource = BitmapFactory.decodeResource(context.getResources(), i)) == null) {
            return null;
        }
        BitmapDescriptor fromBitmap = fromBitmap(decodeResource);
        decodeResource.recycle();
        return fromBitmap;
    }

    public static BitmapDescriptor fromResourceWithDpi(int i, int i2) {
        Bitmap decodeResource;
        Context context = BMapManager.getContext();
        if (context == null || (decodeResource = BitmapFactory.decodeResource(context.getResources(), i)) == null) {
            return null;
        }
        if (i2 <= 0) {
            i2 = SysOSUtil.getDensityDpi();
        }
        decodeResource.setDensity(i2);
        BitmapDescriptor fromBitmap = fromBitmap(decodeResource);
        decodeResource.recycle();
        return fromBitmap;
    }

    public static BitmapDescriptor fromView(View view) {
        if (view == null) {
            return null;
        }
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            Bitmap drawingCache = view.getDrawingCache();
            BitmapDescriptor fromBitmap = fromBitmap(drawingCache);
            if (drawingCache != null) {
                drawingCache.recycle();
            }
            view.destroyDrawingCache();
            return fromBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromViewWithDpi(View view, int i) {
        if (view == null) {
            return null;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            Log.e(f7896a, "Get bitmap failed");
            return null;
        }
        if (i <= 0) {
            i = SysOSUtil.getDensityDpi();
        }
        drawingCache.setDensity(i);
        BitmapDescriptor fromBitmap = fromBitmap(drawingCache);
        drawingCache.recycle();
        view.destroyDrawingCache();
        return fromBitmap;
    }
}
