package com.amap.api.maps;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.amap.api.col.p0003sl.b0;
import com.amap.api.maps.AMap;

/* compiled from: AMap.java */
/* loaded from: classes11.dex */
class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AMap.OnMapSnapshotListener f2034a;
    final /* synthetic */ AMap.c b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ AMap d;

    /* compiled from: AMap.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2035a;

        /* compiled from: AMap.java */
        /* renamed from: com.amap.api.maps.c$a$a, reason: collision with other inner class name */
        class C0114a implements AMap.OnMapScreenShotListener {
            C0114a() {
            }

            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap) {
            }

            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap, int i) {
                a aVar = a.this;
                c cVar = c.this;
                ViewGroup viewGroup = aVar.f2035a;
                cVar.getClass();
                ImageView imageView = new ImageView(viewGroup.getContext());
                imageView.setImageBitmap(bitmap);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup.addView(imageView);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.2f, 0.2f, 0.2f, 0.2f);
                TranslateAnimation translateAnimation = new TranslateAnimation((float) (viewGroup.getWidth() * 0.05d), -((float) (viewGroup.getWidth() * 0.5d)), (float) (viewGroup.getHeight() * 0.75d), (float) (viewGroup.getHeight() * 0.75d));
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(scaleAnimation);
                animationSet.addAnimation(translateAnimation);
                animationSet.setStartOffset(1500L);
                animationSet.setDuration(200L);
                animationSet.setFillBefore(true);
                animationSet.setFillAfter(true);
                animationSet.setInterpolator(new AccelerateInterpolator());
                viewGroup.startAnimation(animationSet);
                animationSet.setAnimationListener(new b(cVar, viewGroup));
                c cVar2 = c.this;
                cVar2.f2034a.onMapTile(cVar2.b.b(), bitmap, i);
                if (!c.this.b.e()) {
                    c.this.c.run();
                    return;
                }
                c cVar3 = c.this;
                AMap aMap = cVar3.d;
                AMap.c cVar4 = cVar3.b;
                AMap.OnMapSnapshotListener onMapSnapshotListener = cVar3.f2034a;
                Runnable runnable = cVar3.c;
                aMap.getClass();
                aMap.animateCamera(cVar4.a(), new d(aMap, new c(aMap, onMapSnapshotListener, cVar4, runnable), runnable));
            }
        }

        a(ViewGroup viewGroup) {
            this.f2035a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d.mapDelegate.getMapScreenShot(new C0114a(), c.this.b.d());
        }
    }

    c(AMap aMap, AMap.OnMapSnapshotListener onMapSnapshotListener, AMap.c cVar, Runnable runnable) {
        this.d = aMap;
        this.f2034a = onMapSnapshotListener;
        this.b = cVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        FrameLayout frameLayout;
        if (this.d.mapDelegate instanceof b0) {
            ViewGroup viewGroup = (ViewGroup) ((b0) this.d.mapDelegate).getGLMapView().getParent();
            frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setBackgroundColor(-1);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            int width = viewGroup.getWidth() / 20;
            frameLayout.setPadding(width, width, width, width);
            viewGroup.addView(frameLayout);
        } else {
            frameLayout = null;
        }
        a aVar = new a(frameLayout);
        ViewGroup viewGroup2 = (ViewGroup) frameLayout.getParent();
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.2f, 1.0f, 0.2f);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (viewGroup2.getWidth() * 0.05d), 0.0f, (float) (viewGroup2.getHeight() * 0.75d));
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(600L);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(new DecelerateInterpolator());
        frameLayout.startAnimation(animationSet);
        animationSet.setAnimationListener(new com.amap.api.maps.a(this, aVar));
    }
}
