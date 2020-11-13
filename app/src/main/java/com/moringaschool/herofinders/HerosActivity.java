package com.moringaschool.herofinders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HerosActivity extends AppCompatActivity {


    @BindView(R.id.locationTextView)
    TextView mLocationTextView;
    @BindView(R.id.listView)
    ListView mListView;
    private String[] parks = new String[] {"Abadare", "Kora",
            "Arabuko sokoke", "Amboseli", "Malindi", "Saiwa",
            "Tsavo", "Equinox", "Malka maris", "Watamu",
            "Meru", "Hell gate", "Ruma",
            "Oldonyo", "Nanyar"};
    private String[] animals = new String[] {"  Antelope", "Girafffe", "Lion",
            "Monkeys", "Ostrich", "Peacock", "Cheetahs", "Warthog", "Hyena",
            "Leopard", "Zebra", "Hare", "Crocodile", "Elephant", "Wildcats", "Lizard" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heros);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        MyHerosArrayAdapter adapter = new MyHerosArrayAdapter(this, android.R.layout.simple_list_item_1, parks, animals);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                String parks = ((TextView)view).getText().toString();
                Toast.makeText(HerosActivity.this, parks, Toast.LENGTH_LONG).show();
            }
        });
        mLocationTextView.setText("Here are all the parks near: " + location);
    }