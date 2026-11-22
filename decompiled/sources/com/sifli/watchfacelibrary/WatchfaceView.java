package com.sifli.watchfacelibrary;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes17.dex */
public class WatchfaceView extends ViewModel {
    private MutableLiveData<WatchfaceMessage> mutableLiveData;

    public MutableLiveData<WatchfaceMessage> getMutableLiveData() {
        if (this.mutableLiveData == null) {
            this.mutableLiveData = new MutableLiveData<>();
        }
        return this.mutableLiveData;
    }
}
