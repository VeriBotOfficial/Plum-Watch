package com.wakeup.module.record;

import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* loaded from: classes4.dex */
class FileObserver extends android.os.FileObserver {
    private final Handler mHandler;
    private final int mMask;
    private List<SingleFileObserver> mObservers;
    private final String mPath;
    private final MyListener ml;

    FileObserver(String str, MyListener myListener) {
        super(str, 4095);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mPath = str;
        this.mMask = 4095;
        this.ml = myListener;
    }

    @Override // android.os.FileObserver
    public void startWatching() {
        if (this.mObservers != null) {
            return;
        }
        this.mObservers = new ArrayList();
        Stack stack = new Stack();
        stack.push(this.mPath);
        while (!stack.isEmpty()) {
            String str = (String) stack.pop();
            this.mObservers.add(new SingleFileObserver(str, this.mMask));
            File[] listFiles = new File(str).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.isDirectory() && !file.getName().equals(".") && !file.getName().equals("..")) {
                        stack.push(file.getPath());
                    }
                }
            }
        }
        Iterator<SingleFileObserver> it = this.mObservers.iterator();
        while (it.hasNext()) {
            it.next().startWatching();
        }
    }

    @Override // android.os.FileObserver
    public void stopWatching() {
        List<SingleFileObserver> list = this.mObservers;
        if (list == null) {
            return;
        }
        Iterator<SingleFileObserver> it = list.iterator();
        while (it.hasNext()) {
            it.next().stopWatching();
        }
        this.mObservers.clear();
        this.mObservers = null;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        if (i == 8) {
            this.mHandler.post(new Runnable() { // from class: com.wakeup.module.record.FileObserver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    FileObserver.this.lambda$onEvent$0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$0() {
        this.ml.callback();
    }

    class SingleFileObserver extends android.os.FileObserver {
        final String mPath;

        SingleFileObserver(String str, int i) {
            super(str, i);
            this.mPath = str;
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            FileObserver.this.onEvent(i, this.mPath + "/" + str);
        }
    }
}
