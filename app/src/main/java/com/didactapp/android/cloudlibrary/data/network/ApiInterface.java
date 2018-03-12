package com.didactapp.android.cloudlibrary.data.network;

import com.didactapp.android.cloudlibrary.models.Book;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {


    @GET("books.json")
    Call<List<Book>> getBookList();
}