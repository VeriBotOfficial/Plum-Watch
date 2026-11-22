package com.sifli.siflicore.module;

/* loaded from: classes14.dex */
public abstract class SFModuleBase implements IModule {
    protected SFModuleCallback callback;
    private String name;

    @Override // com.sifli.siflicore.module.IModule
    public void onBleWriteDone() {
    }

    public SFModuleBase(String str) {
        this.name = str;
    }

    @Override // com.sifli.siflicore.module.IModule
    public String getName() {
        return this.name;
    }

    public void setCallback(SFModuleCallback sFModuleCallback) {
        this.callback = sFModuleCallback;
    }
}
