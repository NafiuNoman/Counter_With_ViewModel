package com.example.exampleviewmodel;


import androidx.lifecycle.ViewModel;

public class ResultViewModel extends ViewModel {


    private Integer result;

    public Integer getResult()

    {
        if (result == null)
        {
            return 0;
        }

        return result;

    }


    public void addResult()
    {
        if(result == null)
        {
            result = 0;
        }
        result += 1;

    }

    public void resetResult()
    {
        result = 0;
    }



}
