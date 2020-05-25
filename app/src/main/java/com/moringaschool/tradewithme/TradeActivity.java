package com.moringaschool.tradewithme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

//import butterknife.Bind;
import butterknife.BindView;
import butterknife.ButterKnife;

public class TradeActivity extends AppCompatActivity {
    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;

    private String[] trade = new String[] {"Electronic Shop", "Jumia",
            "Kilimall", "Phone Shop", "Luca", "Basil",
            "Billy", "Cake Shop", "Naivas", "Phone Booth",
            "Kevin"};
    private String[] goods = new String[] {"Electronics", "Household items", "Household items",
            "Phones", "Furniture", "Clothes", "Vehicles", "Cakes", "Household items",
            "Phones", "Onions Tomatoes" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_trade);
            ButterKnife.bind(this);

        mListView = (ListView) findViewById(R.id.listView);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, trade);
//        mListView.setAdapter(adapter);

        MyTradeArrayAdapter adapter = new MyTradeArrayAdapter(this, android.R.layout.simple_list_item_1, trade, goods);
        mListView.setAdapter(adapter);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(TradeActivity.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("People Trading In: " + location);
    }
}
