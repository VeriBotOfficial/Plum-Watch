package com.bytedance.sdk.openadsdk.kg;

import com.bytedance.sdk.component.utils.sg;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes14.dex */
public abstract class fxn {
    protected boolean fxn = false;
    private final ExecutorService kg = Executors.newSingleThreadExecutor();

    protected abstract void fxn(List<File> list);

    protected abstract boolean fxn(long j, int i);

    protected abstract boolean fxn(File file, long j, int i);

    public void fxn(File file) throws IOException {
        this.kg.submit(new CallableC0543fxn(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kg(File file) throws IOException {
        if (this.fxn) {
            List<File> fxn = sg.fxn(file);
            new Object[]{"touchInBackground", fxn.toString()};
            fxn(fxn);
        } else {
            try {
                sg.kg(file);
            } catch (Throwable unused) {
            }
            fxn(sg.fxn(file.getParentFile()));
        }
    }

    long kg(List<File> list) {
        Iterator<File> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().length();
        }
        return j;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.kg.fxn$fxn, reason: collision with other inner class name */
    private class CallableC0543fxn implements Callable<Void> {
        private final File kg;

        private CallableC0543fxn(File file) {
            this.kg = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            fxn.this.kg(this.kg);
            return null;
        }
    }
}
