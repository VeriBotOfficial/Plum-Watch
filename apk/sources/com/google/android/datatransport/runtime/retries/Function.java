package com.google.android.datatransport.runtime.retries;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes11.dex */
public interface Function<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput r1) throws Throwable;
}
