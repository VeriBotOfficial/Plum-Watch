package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;
import com.phancy.mini.widget.SwitchButton;
import com.phancy.mini.widget.TitleBar;

/* loaded from: classes17.dex */
public final class MiniSettingPanelBinding implements ViewBinding {
    public final LinearLayout animLayout;
    public final TextView authTitle;
    public final ScrollView contentFrame;
    public final FrameLayout emptyFrame;
    private final LinearLayout rootView;
    public final RelativeLayout scopeAlbum;
    public final SwitchButton scopeAlbumSwitch;
    public final RelativeLayout scopeBluetooth;
    public final View scopeBluetoothLine;
    public final TextView scopeBluetoothMore;
    public final RelativeLayout scopeCalendar;
    public final View scopeCalendarLine;
    public final SwitchButton scopeCalendarSwitch;
    public final RelativeLayout scopeCamera;
    public final View scopeCameraLine;
    public final SwitchButton scopeCameraSwitch;
    public final RelativeLayout scopeContact;
    public final View scopeContactLine;
    public final SwitchButton scopeContactSwitch;
    public final RelativeLayout scopeLocation;
    public final View scopeLocationLine;
    public final TextView scopeLocationMore;
    public final RelativeLayout scopeRecord;
    public final View scopeRecordLine;
    public final SwitchButton scopeRecordSwitch;
    public final RelativeLayout scopeWerun;
    public final View scopeWerunLine;
    public final SwitchButton scopeWerunSwitch;
    public final TitleBar titleBar;

    private MiniSettingPanelBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, ScrollView scrollView, FrameLayout frameLayout, RelativeLayout relativeLayout, SwitchButton switchButton, RelativeLayout relativeLayout2, View view, TextView textView2, RelativeLayout relativeLayout3, View view2, SwitchButton switchButton2, RelativeLayout relativeLayout4, View view3, SwitchButton switchButton3, RelativeLayout relativeLayout5, View view4, SwitchButton switchButton4, RelativeLayout relativeLayout6, View view5, TextView textView3, RelativeLayout relativeLayout7, View view6, SwitchButton switchButton5, RelativeLayout relativeLayout8, View view7, SwitchButton switchButton6, TitleBar titleBar) {
        this.rootView = linearLayout;
        this.animLayout = linearLayout2;
        this.authTitle = textView;
        this.contentFrame = scrollView;
        this.emptyFrame = frameLayout;
        this.scopeAlbum = relativeLayout;
        this.scopeAlbumSwitch = switchButton;
        this.scopeBluetooth = relativeLayout2;
        this.scopeBluetoothLine = view;
        this.scopeBluetoothMore = textView2;
        this.scopeCalendar = relativeLayout3;
        this.scopeCalendarLine = view2;
        this.scopeCalendarSwitch = switchButton2;
        this.scopeCamera = relativeLayout4;
        this.scopeCameraLine = view3;
        this.scopeCameraSwitch = switchButton3;
        this.scopeContact = relativeLayout5;
        this.scopeContactLine = view4;
        this.scopeContactSwitch = switchButton4;
        this.scopeLocation = relativeLayout6;
        this.scopeLocationLine = view5;
        this.scopeLocationMore = textView3;
        this.scopeRecord = relativeLayout7;
        this.scopeRecordLine = view6;
        this.scopeRecordSwitch = switchButton5;
        this.scopeWerun = relativeLayout8;
        this.scopeWerunLine = view7;
        this.scopeWerunSwitch = switchButton6;
        this.titleBar = titleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MiniSettingPanelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniSettingPanelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_setting_panel, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniSettingPanelBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        View findChildViewById4;
        View findChildViewById5;
        View findChildViewById6;
        View findChildViewById7;
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.auth_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.content_frame;
            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
            if (scrollView != null) {
                i = R.id.empty_frame;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.scope_album;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.scope_album_switch;
                        SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, i);
                        if (switchButton != null) {
                            i = R.id.scope_bluetooth;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.scope_bluetooth_line))) != null) {
                                i = R.id.scope_bluetooth_more;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.scope_calendar;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout3 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.scope_calendar_line))) != null) {
                                        i = R.id.scope_calendar_switch;
                                        SwitchButton switchButton2 = (SwitchButton) ViewBindings.findChildViewById(view, i);
                                        if (switchButton2 != null) {
                                            i = R.id.scope_camera;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout4 != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.scope_camera_line))) != null) {
                                                i = R.id.scope_camera_switch;
                                                SwitchButton switchButton3 = (SwitchButton) ViewBindings.findChildViewById(view, i);
                                                if (switchButton3 != null) {
                                                    i = R.id.scope_contact;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                    if (relativeLayout5 != null && (findChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.scope_contact_line))) != null) {
                                                        i = R.id.scope_contact_switch;
                                                        SwitchButton switchButton4 = (SwitchButton) ViewBindings.findChildViewById(view, i);
                                                        if (switchButton4 != null) {
                                                            i = R.id.scope_location;
                                                            RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                            if (relativeLayout6 != null && (findChildViewById5 = ViewBindings.findChildViewById(view, (i = R.id.scope_location_line))) != null) {
                                                                i = R.id.scope_location_more;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView3 != null) {
                                                                    i = R.id.scope_record;
                                                                    RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (relativeLayout7 != null && (findChildViewById6 = ViewBindings.findChildViewById(view, (i = R.id.scope_record_line))) != null) {
                                                                        i = R.id.scope_record_switch;
                                                                        SwitchButton switchButton5 = (SwitchButton) ViewBindings.findChildViewById(view, i);
                                                                        if (switchButton5 != null) {
                                                                            i = R.id.scope_werun;
                                                                            RelativeLayout relativeLayout8 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (relativeLayout8 != null && (findChildViewById7 = ViewBindings.findChildViewById(view, (i = R.id.scope_werun_line))) != null) {
                                                                                i = R.id.scope_werun_switch;
                                                                                SwitchButton switchButton6 = (SwitchButton) ViewBindings.findChildViewById(view, i);
                                                                                if (switchButton6 != null) {
                                                                                    i = R.id.title_bar;
                                                                                    TitleBar titleBar = (TitleBar) ViewBindings.findChildViewById(view, i);
                                                                                    if (titleBar != null) {
                                                                                        return new MiniSettingPanelBinding(linearLayout, linearLayout, textView, scrollView, frameLayout, relativeLayout, switchButton, relativeLayout2, findChildViewById, textView2, relativeLayout3, findChildViewById2, switchButton2, relativeLayout4, findChildViewById3, switchButton3, relativeLayout5, findChildViewById4, switchButton4, relativeLayout6, findChildViewById5, textView3, relativeLayout7, findChildViewById6, switchButton5, relativeLayout8, findChildViewById7, switchButton6, titleBar);
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
