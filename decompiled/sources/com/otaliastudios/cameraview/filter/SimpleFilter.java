package com.otaliastudios.cameraview.filter;

/* loaded from: classes17.dex */
public final class SimpleFilter extends BaseFilter {
    private final String fragmentShader;

    public SimpleFilter(String str) {
        this.fragmentShader = str;
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public String getFragmentShader() {
        return this.fragmentShader;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter
    protected BaseFilter onCopy() {
        return new SimpleFilter(this.fragmentShader);
    }
}
