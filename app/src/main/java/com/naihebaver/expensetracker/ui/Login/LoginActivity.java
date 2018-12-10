package com.naihebaver.expensetracker.ui.Login;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;

import com.naihebaver.expensetracker.ExpenseTrackerApp;
import com.naihebaver.expensetracker.ui.BaseActivity;
import com.naihebaver.expensetracker.ui.MainActivity;
import com.naihebaver.expensetracker.R;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        boolean logged = PreferenceManager.getDefaultSharedPreferences(ExpenseTrackerApp.getContext()).getBoolean(getString(R.string.already_accepted_user_key), false);
        if (logged) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(intent);
            finish();
        }
    }

}
