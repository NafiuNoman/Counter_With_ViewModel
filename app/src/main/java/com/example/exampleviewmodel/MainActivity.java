package com.example.exampleviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultId;
    Button addBtn,resetBtn;

    ResultViewModel resultViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resultId = findViewById(R.id.resultId);
        addBtn = findViewById(R.id.AddId);
        resetBtn = findViewById(R.id.resetId);


        resultViewModel = new ViewModelProvider(this).get(ResultViewModel.class);

        resultViewModel.getScore().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                resultId.setText(String.valueOf(integer));
            }
        });




        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            plusResult();

            }
        });



        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                defaultResult();

            }
        });











    }

    private void defaultResult() {

        resultViewModel.resetResult();



    }


    public  void plusResult()
    {
        resultViewModel.addResult();



    }
}