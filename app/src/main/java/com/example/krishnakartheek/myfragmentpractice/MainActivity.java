package com.example.krishnakartheek.myfragmentpractice;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonOne,buttonTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne=(Button)findViewById(R.id.frg_one);
        buttonTwo=(Button)findViewById(R.id.frg_two);
        replaceFragment(new FooFragment());

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             replaceFragment(new FooFragment());
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new TwoFragment());

            }

        });

    }
    void replaceFragment(Fragment fragment){
        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
// Replace the contents of the container with the new fragment
        ft.replace(R.id.your_placeholder, fragment);
// or ft.add(R.id.your_placeholder, new FooFragment());
// Complete the changes added above
        ft.commit();

    }
}
