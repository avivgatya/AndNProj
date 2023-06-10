package com.example.andproj;

import com.example.andproj.Models.NewsHeadLines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadLines> list,String message);
    void onError(String message);


}
