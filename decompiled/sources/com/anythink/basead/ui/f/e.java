package com.anythink.basead.ui.f;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3279a = "TouchEventClickTrigger";
    private static final int b = -1;
    private static final int c = 10;
    private int e;
    private int f;
    private com.anythink.basead.ui.d.a h;
    private boolean i;
    private int d = -1;
    private boolean g = false;

    public final e a(boolean z) {
        this.i = z;
        return this;
    }

    public final e a(com.anythink.basead.ui.d.a aVar) {
        this.h = aVar;
        return this;
    }

    private void a(final View view) {
        if (this.i) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.anythink.basead.ui.f.e.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    try {
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        View view2 = view;
                        while (view2.getParent() != null) {
                            Object parent = view2.getParent();
                            if (!(parent instanceof View)) {
                                break;
                            } else {
                                view2 = (View) parent;
                            }
                        }
                        View view3 = view;
                        if (view2 == view3) {
                            return;
                        }
                        final int[] iArr = new int[2];
                        view3.getLocationOnScreen(iArr);
                        final int width = view.getWidth();
                        final int height = view.getHeight();
                        final boolean[] zArr = {false};
                        view2.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.basead.ui.f.e.1.1
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view4, MotionEvent motionEvent) {
                                int rawX = (int) motionEvent.getRawX();
                                int rawY = (int) motionEvent.getRawY();
                                int[] iArr2 = iArr;
                                int i = iArr2[0];
                                int i2 = iArr2[1];
                                int action = motionEvent.getAction();
                                if (action == 0) {
                                    zArr[0] = false;
                                } else if (action != 1) {
                                    if (action == 2 && rawX > i && rawX < i + width && rawY > i2 && rawY < i2 + height) {
                                        zArr[0] = true;
                                    }
                                } else if (zArr[0]) {
                                    e.this.a(12);
                                }
                                return false;
                            }
                        });
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        com.anythink.basead.ui.d.a aVar = this.h;
        if (aVar != null) {
            aVar.a(i, 13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r0 != 3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 0
            if (r0 == 0) goto L60
            r2 = 1
            r3 = -1
            if (r0 == r2) goto L3e
            r4 = 2
            if (r0 == r4) goto L12
            r2 = 3
            if (r0 == r2) goto L3e
            goto L76
        L12:
            int r0 = r5.d
            if (r0 == r3) goto L76
            int r0 = r6.findPointerIndex(r0)
            if (r0 != r3) goto L1d
            goto L76
        L1d:
            float r1 = r6.getY(r0)
            int r1 = (int) r1
            float r6 = r6.getX(r0)
            int r6 = (int) r6
            int r0 = r5.e
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            int r1 = r5.f
            int r6 = r6 - r1
            int r6 = java.lang.Math.abs(r6)
            r1 = 10
            if (r0 > r1) goto L3b
            if (r6 <= r1) goto L76
        L3b:
            r5.g = r2
            goto L76
        L3e:
            boolean r0 = r5.g
            if (r0 == 0) goto L47
            r0 = 13
            r5.a(r0)
        L47:
            int r0 = r5.d
            int r0 = r6.findPointerIndex(r0)
            float r2 = r6.getX(r0)
            int r2 = (int) r2
            r5.f = r2
            float r6 = r6.getY(r0)
            int r6 = (int) r6
            r5.e = r6
            r5.g = r1
            r5.d = r3
            goto L76
        L60:
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.e = r0
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.f = r0
            int r6 = r6.getPointerId(r1)
            r5.d = r6
            r5.g = r1
        L76:
            boolean r6 = r5.g
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.ui.f.e.a(android.view.MotionEvent):boolean");
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.e = (int) motionEvent.getY();
            this.f = (int) motionEvent.getX();
            this.d = motionEvent.getPointerId(0);
            this.g = false;
        } else if (action == 1) {
            if (this.g) {
                a(13);
            }
            int findPointerIndex2 = motionEvent.findPointerIndex(this.d);
            this.f = (int) motionEvent.getX(findPointerIndex2);
            this.e = (int) motionEvent.getY(findPointerIndex2);
            this.g = false;
            this.d = -1;
        } else if (action == 2 && (findPointerIndex = motionEvent.findPointerIndex(this.d)) != -1) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int abs = Math.abs(x - this.f);
            if (Math.abs(y - this.e) > 10 || abs > 10) {
                this.g = true;
                ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        return true;
    }
}
