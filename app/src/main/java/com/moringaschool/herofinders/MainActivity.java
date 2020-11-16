package com.moringaschool.herofinders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener {
    @BindView(R.id.findHerosButton) Button mFindHerosButton;
    @BindView(R.id.herosEditText) EditText mheroEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    private Button Logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindHerosButton.setOnClickListener(this);
        Logout = (Button) findViewById(R.id.buttonLogout);


    }

    @Override
    public void onClick(View v) {
        if (v == mFindHerosButton) {
            String heros = mherosEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, HerosActivity.class);
            intent.putExtra("Heros", heros);
            startActivity(intent);
        }
    }

}
