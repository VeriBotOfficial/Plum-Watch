package com.wakeup.common.logger.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.wakeup.common.R;
import com.wakeup.common.logger.core.GLoggerSettingsManager;
import com.wakeup.common.logger.core.entity.GLogEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class GLogSettingsActivity extends AppCompatActivity {
    private ImageView backButton;
    private Button saveButton;
    private final List<GLogSettingLayout> settingLayouts = new ArrayList();
    private LinearLayout settingsLayout;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, (Class<?>) GLogSettingsActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glog_settings);
        this.backButton = (ImageView) findViewById(R.id.iv_glog_settings_back);
        this.saveButton = (Button) findViewById(R.id.btn_glog_settings_save);
        this.settingsLayout = (LinearLayout) findViewById(R.id.layout_glog_settings);
        initSettingLayouts();
        initSaveButton();
        initBackButton();
    }

    private void initSettingLayouts() {
        for (GLogEntity gLogEntity : GLoggerSettingsManager.getEntities()) {
            GLogSettingLayout gLogSettingLayout = new GLogSettingLayout(this);
            gLogSettingLayout.initEntity(gLogEntity);
            this.settingLayouts.add(gLogSettingLayout);
            this.settingsLayout.addView(gLogSettingLayout);
        }
    }

    private void initSaveButton() {
        this.saveButton.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.common.logger.settings.GLogSettingsActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GLogSettingsActivity.this.lambda$initSaveButton$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSaveButton$0(View view) {
        Iterator<GLogSettingLayout> it = this.settingLayouts.iterator();
        while (it.hasNext()) {
            if (!it.next().checkSetting()) {
                return;
            }
        }
        Iterator<GLogSettingLayout> it2 = this.settingLayouts.iterator();
        while (it2.hasNext()) {
            it2.next().saveEntity();
        }
        finish();
    }

    private void initBackButton() {
        this.backButton.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.common.logger.settings.GLogSettingsActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GLogSettingsActivity.this.lambda$initBackButton$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBackButton$1(View view) {
        finish();
    }
}
