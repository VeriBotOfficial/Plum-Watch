package com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.helper;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f12846a = -1;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.helper.a$a, reason: collision with other inner class name */
    public static class C0787a {

        /* renamed from: a, reason: collision with root package name */
        private int f12847a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private long i;
        private long j;

        int a() {
            return this.f12847a;
        }

        int b() {
            return this.b;
        }

        int c() {
            return this.e;
        }

        int d() {
            return this.f;
        }

        public void setDownRawX(int i) {
            this.c = i;
        }

        public void setDownRawY(int i) {
            this.d = i;
        }

        public void setDownX(int i) {
            this.f12847a = i;
        }

        public void setDownY(int i) {
            this.b = i;
        }

        public void setEventEndTime(long j) {
            this.j = j;
        }

        public void setEventStartTime(long j) {
            this.i = j;
        }

        public void setUpRawX(int i) {
            this.g = i;
        }

        public void setUpX(int i) {
            this.e = i;
        }

        public void setUpY(int i) {
            this.f = i;
        }
    }

    public interface c {
        void onTouch(MotionEvent motionEvent);
    }

    public static View.OnTouchListener a() {
        return new b();
    }

    private static Object b(View view) {
        try {
            Object tag = view.getTag(f12846a);
            if (!(tag instanceof C0787a) && !(tag instanceof Map)) {
                if (!(view instanceof ViewGroup)) {
                    return null;
                }
                for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                    Object b2 = b(((ViewGroup) view).getChildAt(i));
                    if (b2 != null) {
                        return b2;
                    }
                }
                return null;
            }
            return tag;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static class b implements View.OnTouchListener {
        C0787a t = new C0787a();
        private SoftReference<c> u;

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                SoftReference<c> softReference = this.u;
                if (softReference != null && softReference.get() != null) {
                    this.u.get().onTouch(motionEvent);
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.t.setDownX((int) motionEvent.getX());
                    this.t.setDownY((int) motionEvent.getY());
                    this.t.setDownRawX((int) motionEvent.getRawX());
                    this.t.setDownRawY((int) motionEvent.getRawY());
                    this.t.setEventStartTime(System.currentTimeMillis());
                } else if (action == 1) {
                    this.t.setUpX((int) motionEvent.getX());
                    this.t.setUpY((int) motionEvent.getY());
                    this.t.setUpRawX((int) motionEvent.getRawX());
                    this.t.setDownRawY((int) motionEvent.getRawY());
                    this.t.setEventEndTime(System.currentTimeMillis());
                }
                view.setTag(a.f12846a, this.t);
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        public b(c cVar) {
            if (cVar != null) {
                this.u = new SoftReference<>(cVar);
            }
        }
    }

    public static View.OnTouchListener a(c cVar) {
        return new b(cVar);
    }

    public static Map<String, Integer> a(View view) {
        if (view == null) {
            return null;
        }
        TreeMap treeMap = new TreeMap();
        Object b2 = b(view);
        C0787a c0787a = b2 instanceof C0787a ? (C0787a) b2 : null;
        if (c0787a == null) {
            if (b2 instanceof Map) {
                return (Map) b2;
            }
            return null;
        }
        treeMap.put(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.c, Integer.valueOf(c0787a.c() == 0 ? 1 : c0787a.c()));
        treeMap.put(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.d, Integer.valueOf(c0787a.d() == 0 ? 1 : c0787a.d()));
        treeMap.put(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.f13039a, Integer.valueOf(c0787a.a() == 0 ? 1 : c0787a.a()));
        treeMap.put(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.b, Integer.valueOf(c0787a.b() == 0 ? 1 : c0787a.b()));
        treeMap.put(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.e, Integer.valueOf(view.getWidth() == 0 ? 1 : view.getWidth()));
        treeMap.put(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.f, Integer.valueOf(view.getHeight() == 0 ? 1 : view.getHeight()));
        treeMap.put("ad_width", Integer.valueOf(view.getWidth() == 0 ? 1 : view.getWidth()));
        treeMap.put("ad_height", Integer.valueOf(view.getHeight() != 0 ? view.getHeight() : 1));
        return treeMap;
    }
}
