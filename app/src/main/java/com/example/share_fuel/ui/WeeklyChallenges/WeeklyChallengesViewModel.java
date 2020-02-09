package com.example.share_fuel.ui.WeeklyChallenges;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WeeklyChallengesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WeeklyChallengesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}