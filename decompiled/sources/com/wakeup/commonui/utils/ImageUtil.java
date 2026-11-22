package com.wakeup.commonui.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commonui.R;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public class ImageUtil {
    private static final String TAG = "ImageUtil";
    private static final int ID_PLACEHOLDER = R.drawable.ic_default_placeholder;
    private static final int ID_ERROR = R.drawable.ic_default_placeholder;

    public interface OnImageUtilCallBack {
        void onResourceReady(Bitmap bitmap, String str, long j);
    }

    public static void load(Context context, Object obj, ImageView imageView) {
        if (obj == null || imageView == null) {
            return;
        }
        if (obj instanceof String) {
            Glide.with(context).load((String) obj).into(imageView);
        } else if (obj instanceof Drawable) {
            Glide.with(context).load((Drawable) obj).into(imageView);
        } else if (obj instanceof Integer) {
            Glide.with(context).load((Integer) obj).into(imageView);
        }
    }

    public static void load(ImageView imageView, Object obj) {
        load(imageView, obj, ID_PLACEHOLDER, ID_ERROR);
    }

    public static void load(ImageView imageView, Object obj, int i, int i2) {
        if (obj == null || imageView == null) {
            return;
        }
        RequestBuilder<Drawable> requestBuilder = null;
        if (obj instanceof String) {
            String str = (String) obj;
            Context context = imageView.getContext();
            if (ActivityUtils.assertValidRequest(context)) {
                requestBuilder = Glide.with(context).load(str);
            }
        } else if (obj instanceof Drawable) {
            requestBuilder = Glide.with(imageView.getContext()).load((Drawable) obj);
        } else if (obj instanceof Integer) {
            requestBuilder = Glide.with(imageView.getContext()).load((Integer) obj);
        } else if (obj instanceof File) {
            requestBuilder = Glide.with(imageView.getContext()).load((File) obj);
        } else if (obj instanceof Bitmap) {
            requestBuilder = Glide.with(imageView.getContext()).load((Bitmap) obj);
        } else if (obj instanceof Uri) {
            requestBuilder = Glide.with(imageView.getContext()).load((Uri) obj);
        }
        if (requestBuilder != null) {
            if (i != 0) {
                requestBuilder.placeholder(i);
            }
            if (i2 != 0) {
                requestBuilder.error(i2);
            }
            requestBuilder.into(imageView);
        }
    }

    public static void loadImage(ImageView imageView, String str) {
        Context context;
        if (imageView == null || TextUtils.isEmpty(str) || (context = imageView.getContext()) == null) {
            return;
        }
        Glide.with(context).load(str).into(imageView);
    }

    public static void loadImageWithRoundedCorners(ImageView imageView, String str) {
        loadImageWithRoundedCorners(imageView, str, 12);
    }

    public static void loadImageWithRoundedCorners(ImageView imageView, String str, int i) {
        Glide.with(imageView.getContext()).load(str).apply((BaseRequestOptions<?>) new RequestOptions().transform(new RoundedCorners(SizeUtils.dp2px(i)))).into(imageView);
    }

    public static void loadImageWithRoundedCorners(ImageView imageView, String str, int i, int i2, int i3) {
        RequestBuilder<Drawable> load = Glide.with(imageView.getContext()).load(str);
        load.apply((BaseRequestOptions<?>) new RequestOptions().transform(new RoundedCorners(SizeUtils.dp2px(i))));
        if (i2 != 0) {
            load.placeholder(i2);
        }
        if (i3 != 0) {
            load.placeholder(i3);
        }
        load.into(imageView);
    }

    public static void loadImageWithCircleCrop(ImageView imageView, String str) {
        Glide.with(imageView.getContext()).load(str).transform(new CircleCrop()).into(imageView);
    }

    public static void loadHead(ImageView imageView, Object obj) {
        load(imageView, obj, R.drawable.image_default_avatar, R.drawable.image_default_avatar);
    }

    public static void loadBitmap(String str, float f, float f2, final Function1<Bitmap, Unit> function1) {
        Glide.with(Utils.getApp()).asBitmap().load(str).into((RequestBuilder<Bitmap>) new CustomTarget<Bitmap>(SizeUtils.dp2px(f), SizeUtils.dp2px(f2)) { // from class: com.wakeup.commonui.utils.ImageUtil.1
            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
            }

            @Override // com.bumptech.glide.request.target.Target
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
            }

            public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
                function1.invoke(bitmap);
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            public void onLoadFailed(Drawable drawable) {
                function1.invoke(null);
            }
        });
    }

    public static void loadBitmap(String str, float f, Function1<Bitmap, Unit> function1) {
        loadBitmap(str, f, f, function1);
    }

    public static void loadBitmapWithRoundedCorners(String str, float f, float f2, int i, final Function1<Bitmap, Unit> function1) {
        Glide.with(Utils.getApp()).asBitmap().load(str).apply((BaseRequestOptions<?>) new RequestOptions().transform(new RoundedCorners(SizeUtils.dp2px(i)))).into((RequestBuilder<Bitmap>) new CustomTarget<Bitmap>(SizeUtils.dp2px(f), SizeUtils.dp2px(f2)) { // from class: com.wakeup.commonui.utils.ImageUtil.2
            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
            }

            @Override // com.bumptech.glide.request.target.Target
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
            }

            public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
                function1.invoke(bitmap);
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            public void onLoadFailed(Drawable drawable) {
                function1.invoke(null);
            }
        });
    }

    public static void getBitMap(final Activity activity, final String str, final long j, final OnImageUtilCallBack onImageUtilCallBack) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (activity.isDestroyed()) {
            LogUtils.w(TAG, "Picture loading failed,activity is Destroyed");
            return;
        }
        int dp2px = UIHelper.dp2px(40.0f);
        try {
            Glide.with(activity).asBitmap().load(str).into((RequestBuilder<Bitmap>) new SimpleTarget<Bitmap>(dp2px, dp2px) { // from class: com.wakeup.commonui.utils.ImageUtil.3
                @Override // com.bumptech.glide.request.target.Target
                public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                    onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
                }

                public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
                    if (activity == null || TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (activity.isDestroyed()) {
                        LogUtils.w(ImageUtil.TAG, "Picture loading failed,activity is Destroyed");
                    } else {
                        onImageUtilCallBack.onResourceReady(bitmap, str, j);
                    }
                }
            });
        } catch (Exception e) {
            LogUtils.e(TAG, "Exception    " + e.getMessage());
        }
    }
}
