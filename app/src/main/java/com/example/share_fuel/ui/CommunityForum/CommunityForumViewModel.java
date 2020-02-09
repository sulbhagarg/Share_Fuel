package com.example.share_fuel.ui.CommunityForum;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CommunityForumViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CommunityForumViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}