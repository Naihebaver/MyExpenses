package com.naihebaver.expensetracker.ui.help;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.naihebaver.expensetracker.ui.BaseActivity;
import com.naihebaver.expensetracker.R;

public class HelpActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setToolbar(toolbar);
    }

}
