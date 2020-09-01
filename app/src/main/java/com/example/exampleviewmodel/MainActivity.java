package com.example.exampleviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultId;
    Button addBtn,resetBtn;

    ResultViewModel resultViewModel;
    //int result=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resultId = findViewById(R.id.resultId);
        addBtn = findViewById(R.id.AddId);
        resetBtn = findViewById(R.id.resetId);

        resultViewModel = ViewModelProviders.of(this).get(ResultViewModel.class);



        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            addResult();

            }
        });



        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resetResult();

            }
        });


        resultId.setText(String.valueOf(resultViewModel.getResult()));






    }

    private void resetResult() {

        resultViewModel.resetResult();

        String result = String.valueOf(resultViewModel.getResult());

        resultId.setText(result);

    }


    public  void addResult()
    {
        resultViewModel.addResult();

        String result = String.valueOf(resultViewModel.getResult());

        resultId.setText(result);

    }
}