package com.sifli.siflireadersdk.module;

/* loaded from: classes16.dex */
public abstract class SFModuleBase implements IModule {
    private String name;

    public SFModuleBase(String str) {
        this.name = str;
    }

    @Override // com.sifli.siflireadersdk.module.IModule
    public String getName() {
        return this.name;
    }
}
