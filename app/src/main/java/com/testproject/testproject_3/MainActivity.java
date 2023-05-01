package com.testproject.testproject_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView plList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plList = findViewById(R.id.tv_pl_names);

        String[] names = {"Java", "Python", "JavaScript", "Ruby", "Matlab", "C", "C++", "Objective C", "Pascal", "PHP", "Lisp", "Rust", "Haskell", "asdf", "qwerty"};
        plList.setText("");
        for(String name : names){
            plList.append(name + "\n");
        }
    }
}