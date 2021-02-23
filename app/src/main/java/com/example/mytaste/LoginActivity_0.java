package com.example.mytaste;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class LoginActivity_0 extends AppCompatActivity {

    private SectionsPagerAdapter sectionsPagerAdapter;
    private ViewPager viewPager;
    private Button loginButton;
    private EditText loginEmailET;
    private EditText loginPasswdET;
    private Switch loginRememberSW;
    private FloatingActionButton loginHelperFAB;
    private EditText registerEmailET;
    private EditText registerPasswdET;
    private EditText registerPasswd2ET;
    private Button registerButton;
    private FloatingActionButton registerHelperFAB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_0);

        sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        //fragment_login_0
        loginEmailET = findViewById(R.id.et_email_login_0);
        loginPasswdET = findViewById(R.id.et_passwd_login_0);
        loginRememberSW = findViewById(R.id.sw_remember_login_0);
        loginButton = findViewById(R.id.bt_login_0);
        loginHelperFAB = findViewById(R.id.fab_helper_login_0);

        //fragment_register_0
        registerEmailET = findViewById(R.id.et_email_refister_0);
        registerPasswdET = findViewById(R.id.et_passwd_register_0);
        registerPasswd2ET = findViewById(R.id.et_passwd2_register_0);
        registerButton = findViewById(R.id.bt_register_0);
        registerHelperFAB = findViewById(R.id.fab_helper_register_0);

//        registerButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                sendVerificationEmail();
//            }
//        });

    }

    private void sendVerificationEmail() {
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter{
        public SectionsPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    Tab_login_0 tab_login_0=new Tab_login_0();
                    return tab_login_0;
                case 1:
                    Tab_register_0 tab_register_0=new Tab_register_0();
                    return tab_register_0;
                case 2:
                    Tab_reset_0 tab_reset_0=new Tab_reset_0();
                    return tab_reset_0;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "登入";
                case 1:
                    return "註冊";
                case 2:
                    return "重設/忘記密碼";
                default:
                    return null;
            }
        }
    }
}