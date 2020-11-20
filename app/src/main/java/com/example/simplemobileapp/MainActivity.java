package com.example.simplemobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button btnReverse, btnUndoRedo;
    List<Editable> list;
//    HashMap<Integer, Editable> output = new HashMap<Integer, Editable>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<Editable>();

        editText = findViewById(R.id.editText);
//        output.put(2, editText.getText());
//        output.put(1, null);
//        output.put(3, null);
//        list.add(0, editText.getText().toString());
        list.add(0, editText.getText());

        textView = findViewById(R.id.textView);
        btnReverse = findViewById(R.id.button_reverse);
        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String outputReverse = new StringBuilder(list.get(0)).reverse().toString();
                textView.setText("Output: " + outputReverse);
                System.out.println(outputReverse);
                System.out.println(list);
//                output.put(1, outputReverse);
//                textView.setText("Output: " + editText.getText());
            }
        });
        btnUndoRedo = findViewById(R.id.button_undo);
        btnUndoRedo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText("Output: " + list.get(-1));
//                output.put();
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();

            }
        });
        btnUndoRedo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView.setText("Output: " + list.get(+1));
                Toast.makeText(MainActivity.this, "long click", Toast.LENGTH_SHORT).show();
                return false;
            }
        });


    }

}