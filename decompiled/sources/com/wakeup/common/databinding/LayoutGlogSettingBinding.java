package com.wakeup.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.common.R;

/* loaded from: classes2.dex */
public final class LayoutGlogSettingBinding implements ViewBinding {
    public final CheckBox cbGlogForceShow;
    public final CheckBox cbGlogFormatJson;
    public final CheckBox cbGlogShowAll;
    public final CheckBox cbGlogShowDivide;
    public final EditText etGlogMaxLength;
    public final EditText etGlogModuleName;
    public final EditText etGlogTraceCount;
    public final EditText etGlogTypeName;
    private final LinearLayout rootView;
    public final Spinner spGlogDefaultLevel;
    public final Spinner spGlogJsonLevel;
    public final TextView tvGlogClassName;

    private LayoutGlogSettingBinding(LinearLayout rootView, CheckBox cbGlogForceShow, CheckBox cbGlogFormatJson, CheckBox cbGlogShowAll, CheckBox cbGlogShowDivide, EditText etGlogMaxLength, EditText etGlogModuleName, EditText etGlogTraceCount, EditText etGlogTypeName, Spinner spGlogDefaultLevel, Spinner spGlogJsonLevel, TextView tvGlogClassName) {
        this.rootView = rootView;
        this.cbGlogForceShow = cbGlogForceShow;
        this.cbGlogFormatJson = cbGlogFormatJson;
        this.cbGlogShowAll = cbGlogShowAll;
        this.cbGlogShowDivide = cbGlogShowDivide;
        this.etGlogMaxLength = etGlogMaxLength;
        this.etGlogModuleName = etGlogModuleName;
        this.etGlogTraceCount = etGlogTraceCount;
        this.etGlogTypeName = etGlogTypeName;
        this.spGlogDefaultLevel = spGlogDefaultLevel;
        this.spGlogJsonLevel = spGlogJsonLevel;
        this.tvGlogClassName = tvGlogClassName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutGlogSettingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static LayoutGlogSettingBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_glog_setting, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutGlogSettingBinding bind(View rootView) {
        int i = R.id.cb_glog_force_show;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, i);
        if (checkBox != null) {
            i = R.id.cb_glog_format_json;
            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(rootView, i);
            if (checkBox2 != null) {
                i = R.id.cb_glog_show_all;
                CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(rootView, i);
                if (checkBox3 != null) {
                    i = R.id.cb_glog_show_divide;
                    CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(rootView, i);
                    if (checkBox4 != null) {
                        i = R.id.et_glog_max_length;
                        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, i);
                        if (editText != null) {
                            i = R.id.et_glog_module_name;
                            EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, i);
                            if (editText2 != null) {
                                i = R.id.et_glog_trace_count;
                                EditText editText3 = (EditText) ViewBindings.findChildViewById(rootView, i);
                                if (editText3 != null) {
                                    i = R.id.et_glog_type_name;
                                    EditText editText4 = (EditText) ViewBindings.findChildViewById(rootView, i);
                                    if (editText4 != null) {
                                        i = R.id.sp_glog_default_level;
                                        Spinner spinner = (Spinner) ViewBindings.findChildViewById(rootView, i);
                                        if (spinner != null) {
                                            i = R.id.sp_glog_json_level;
                                            Spinner spinner2 = (Spinner) ViewBindings.findChildViewById(rootView, i);
                                            if (spinner2 != null) {
                                                i = R.id.tv_glog_class_name;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                if (textView != null) {
                                                    return new LayoutGlogSettingBinding((LinearLayout) rootView, checkBox, checkBox2, checkBox3, checkBox4, editText, editText2, editText3, editText4, spinner, spinner2, textView);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
