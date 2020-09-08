package com.example.exampleviewmodel;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ResultViewModel extends ViewModel {



    private MutableLiveData<Integer> score;

    public MutableLiveData<Integer> getScore()
    {
        if(score == null)
        {
            score = new MutableLiveData<>();
            score.setValue(0);
        }
        return score;


    }





    public void addResult()
    {
        int i = score.getValue() + 1;
        score.setValue(i);

    }

    public void resetResult()
    {
        score.setValue(0);

    }




}
