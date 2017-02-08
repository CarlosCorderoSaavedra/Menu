package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView mangoTextView = (TextView) findViewById(R.id.menu_item_1);
        String menuOneText = mangoTextView.getText().toString();
        Log.i("MainActivity.java", menuOneText);
        // Find second menu item TextView and print the text to the logs
        TextView blueberryTextView = (TextView) findViewById(R.id.menu_item_2);
        String menuTwoText = blueberryTextView.getText().toString();
        Log.i("MainActivity.java", menuTwoText);
        // Find third menu item TextView and print the text to the logs
        TextView chocoTextView = (TextView) findViewById(R.id.menu_item_3);
        String menuTreeText = chocoTextView.getText().toString();
        Log.i("MainActivity.java", "menuTreeText");
    }
}
