package com.wakeup.common.logger.settings;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.wakeup.common.R;
import com.wakeup.common.logger.core.entity.GLogEntity;

/* loaded from: classes2.dex */
public class GLogSettingLayout extends LinearLayout {
    private TextView classNameText;
    private Context context;
    private int defaultLevel;
    private Spinner defaultLevelSpinner;
    private GLogEntity entity;
    private CheckBox forceShowCheck;
    private CheckBox formatJsonCheck;
    private int jsonLevel;
    private Spinner jsonLevelSpinner;
    private final String[] levelArray;
    private int maxLengthCount;
    private EditText maxLengthEdit;
    private String moduleName;
    private EditText moduleNameEdit;
    private CheckBox showAllCheck;
    private CheckBox showDivideCheck;
    private int traceCount;
    private EditText traceCountEdit;
    private String typeName;
    private EditText typeNameEdit;

    public boolean checkSetting() {
        if (TextUtils.isEmpty(this.moduleName) || this.moduleName.length() > 8) {
            Toast.makeText(this.context, "请输入1 - 8位ModuleName", 0).show();
            return false;
        }
        if (TextUtils.isEmpty(this.typeName) || this.typeName.length() > 8) {
            Toast.makeText(this.context, "请输入1 - 8位TypeName", 0).show();
            return false;
        }
        int i = this.traceCount;
        if (i < 0 || i > 100) {
            Toast.makeText(this.context, "请输入1 - 100tranceCount数值", 0).show();
            return false;
        }
        int i2 = this.maxLengthCount;
        if (i2 >= 0 && i2 <= 100) {
            return true;
        }
        Toast.makeText(this.context, "请输入1 - 100maxLengthCount数值", 0).show();
        return false;
    }

    public void saveEntity() {
        this.entity.initModuleName(this.moduleName);
        this.entity.initTypeName(this.typeName);
        this.entity.initDefaultLevel(this.defaultLevel);
        this.entity.initJsonLevel(this.jsonLevel);
        this.entity.initFormatJson(this.formatJsonCheck.isChecked());
        this.entity.initTraceCount(this.traceCount);
        this.entity.initForceShow(this.forceShowCheck.isChecked());
        this.entity.initShowDivide(this.showDivideCheck.isChecked());
        this.entity.initShowAll(this.showAllCheck.isChecked());
        this.entity.initMaxLengthCount(this.maxLengthCount);
    }

    public void initEntity(GLogEntity entity) {
        this.entity = entity;
        this.classNameText.setText(entity.getClassName());
        this.moduleName = entity.getModuleName();
        this.moduleNameEdit.setText(entity.getModuleName());
        this.moduleNameEdit.addTextChangedListener(new GLogSettingTextWatcher(15230));
        this.typeName = entity.getTypeName();
        this.typeNameEdit.setText(entity.getTypeName());
        this.typeNameEdit.addTextChangedListener(new GLogSettingTextWatcher(15231));
        this.defaultLevel = entity.getDefaultLevel();
        initLevelSpinner(this.defaultLevelSpinner, entity, 11510);
        this.jsonLevel = entity.getJsonLevel();
        initLevelSpinner(this.jsonLevelSpinner, entity, 11511);
        this.formatJsonCheck.setChecked(entity.isFormatJson());
        this.traceCount = entity.getTraceCount();
        this.traceCountEdit.setText(String.valueOf(entity.getTraceCount()));
        this.traceCountEdit.addTextChangedListener(new GLogSettingTextWatcher(15232));
        this.forceShowCheck.setChecked(entity.isForceShow());
        this.showDivideCheck.setChecked(entity.isShowDivide());
        this.showAllCheck.setChecked(entity.isShowAll());
        this.maxLengthCount = entity.getMaxLengthCount();
        this.maxLengthEdit.setText(String.valueOf(entity.getMaxLengthCount()));
        this.maxLengthEdit.addTextChangedListener(new GLogSettingTextWatcher(15233));
    }

    private void initLevelSpinner(Spinner spinner, GLogEntity entity, int levelType) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.context, R.layout.item_glog_setting_spinner, this.levelArray);
        arrayAdapter.setDropDownViewResource(R.layout.item_glog_setting_spinner_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        if (levelType == 11510) {
            int defaultLevel = entity.getDefaultLevel();
            if (defaultLevel == 2) {
                spinner.setSelection(1);
            } else if (defaultLevel == 3) {
                spinner.setSelection(2);
            } else if (defaultLevel == 4) {
                spinner.setSelection(3);
            } else if (defaultLevel == 5) {
                spinner.setSelection(4);
            } else if (defaultLevel != 6) {
                spinner.setSelection(0);
            } else {
                spinner.setSelection(5);
            }
        } else {
            int jsonLevel = entity.getJsonLevel();
            if (jsonLevel == 2) {
                spinner.setSelection(1);
            } else if (jsonLevel == 3) {
                spinner.setSelection(2);
            } else if (jsonLevel == 4) {
                spinner.setSelection(3);
            } else if (jsonLevel == 5) {
                spinner.setSelection(4);
            } else if (jsonLevel != 6) {
                spinner.setSelection(0);
            } else {
                spinner.setSelection(5);
            }
        }
        spinner.setOnItemSelectedListener(new GLogSettingSelectedListener(levelType));
    }

    private class GLogSettingSelectedListener implements AdapterView.OnItemSelectedListener {
        private static final int TYPE_SPINNER_DEFAULT_LEVEL = 11510;
        private static final int TYPE_SPINNER_JSON_LEVEL = 11511;
        private final int levelType;

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }

        private GLogSettingSelectedListener(int levelType) {
            this.levelType = levelType;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            if (this.levelType == TYPE_SPINNER_DEFAULT_LEVEL) {
                if (i == 1) {
                    GLogSettingLayout.this.defaultLevel = 2;
                    return;
                }
                if (i == 2) {
                    GLogSettingLayout.this.defaultLevel = 3;
                    return;
                }
                if (i == 3) {
                    GLogSettingLayout.this.defaultLevel = 4;
                    return;
                }
                if (i == 4) {
                    GLogSettingLayout.this.defaultLevel = 5;
                    return;
                } else if (i != 5) {
                    GLogSettingLayout.this.defaultLevel = 1;
                    return;
                } else {
                    GLogSettingLayout.this.defaultLevel = 6;
                    return;
                }
            }
            if (i == 1) {
                GLogSettingLayout.this.jsonLevel = 2;
                return;
            }
            if (i == 2) {
                GLogSettingLayout.this.jsonLevel = 3;
                return;
            }
            if (i == 3) {
                GLogSettingLayout.this.jsonLevel = 4;
                return;
            }
            if (i == 4) {
                GLogSettingLayout.this.jsonLevel = 5;
            } else if (i != 5) {
                GLogSettingLayout.this.jsonLevel = 1;
            } else {
                GLogSettingLayout.this.jsonLevel = 6;
            }
        }
    }

    private class GLogSettingTextWatcher implements TextWatcher {
        private static final int TYPE_TEXT_WATCHER_MAX_LENGTH = 15233;
        private static final int TYPE_TEXT_WATCHER_MODULE_NAME = 15230;
        private static final int TYPE_TEXT_WATCHER_TRACE_COUNT = 15232;
        private static final int TYPE_TEXT_WATCHER_TYPE_NAME = 15231;
        private final int textType;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        private GLogSettingTextWatcher(int textType) {
            this.textType = textType;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            switch (this.textType) {
                case TYPE_TEXT_WATCHER_MODULE_NAME /* 15230 */:
                    GLogSettingLayout.this.moduleName = charSequence.toString();
                    break;
                case TYPE_TEXT_WATCHER_TYPE_NAME /* 15231 */:
                    GLogSettingLayout.this.typeName = charSequence.toString();
                    break;
                case TYPE_TEXT_WATCHER_TRACE_COUNT /* 15232 */:
                    try {
                        GLogSettingLayout.this.traceCount = Integer.parseInt(charSequence.toString());
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                case TYPE_TEXT_WATCHER_MAX_LENGTH /* 15233 */:
                    try {
                        GLogSettingLayout.this.maxLengthCount = Integer.parseInt(charSequence.toString());
                        break;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
            }
        }
    }

    private void initLayout(Context context) {
        this.context = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.layout_glog_setting, this);
        this.classNameText = (TextView) findViewById(R.id.tv_glog_class_name);
        this.moduleNameEdit = (EditText) findViewById(R.id.et_glog_module_name);
        this.typeNameEdit = (EditText) findViewById(R.id.et_glog_type_name);
        this.defaultLevelSpinner = (Spinner) findViewById(R.id.sp_glog_default_level);
        this.jsonLevelSpinner = (Spinner) findViewById(R.id.sp_glog_json_level);
        this.formatJsonCheck = (CheckBox) findViewById(R.id.cb_glog_format_json);
        this.traceCountEdit = (EditText) findViewById(R.id.et_glog_trace_count);
        this.forceShowCheck = (CheckBox) findViewById(R.id.cb_glog_force_show);
        this.showDivideCheck = (CheckBox) findViewById(R.id.cb_glog_show_divide);
        this.showAllCheck = (CheckBox) findViewById(R.id.cb_glog_show_all);
        this.maxLengthEdit = (EditText) findViewById(R.id.et_glog_max_length);
    }

    public GLogSettingLayout(Context context) {
        super(context);
        this.levelArray = new String[]{"V", "D", TokenNames.I, ExifInterface.LONGITUDE_WEST, "E", "WTF"};
        this.moduleName = "";
        this.typeName = "";
        this.defaultLevel = 1;
        this.jsonLevel = 1;
        this.traceCount = 0;
        this.maxLengthCount = 1;
        initLayout(context);
    }

    public GLogSettingLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.levelArray = new String[]{"V", "D", TokenNames.I, ExifInterface.LONGITUDE_WEST, "E", "WTF"};
        this.moduleName = "";
        this.typeName = "";
        this.defaultLevel = 1;
        this.jsonLevel = 1;
        this.traceCount = 0;
        this.maxLengthCount = 1;
        initLayout(context);
    }

    public GLogSettingLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.levelArray = new String[]{"V", "D", TokenNames.I, ExifInterface.LONGITUDE_WEST, "E", "WTF"};
        this.moduleName = "";
        this.typeName = "";
        this.defaultLevel = 1;
        this.jsonLevel = 1;
        this.traceCount = 0;
        this.maxLengthCount = 1;
        initLayout(context);
    }
}
