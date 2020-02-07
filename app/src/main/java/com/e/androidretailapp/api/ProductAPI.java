package com.e.androidretailapp.api;

import com.e.androidretailapp.model.Product;
import com.e.androidretailapp.serverresponse.ImageResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ProductAPI {


    @POST("products")
    Call<Product> addProduct(@Body Product product);

    @FormUrlEncoded
    @POST("users")
    Call<Product> checkUser(@Field("productName") String ProductName, @Field("productDescription") String ProductDescription, @Field("productManufacture") String ProductManufacture, @Field("productPrice") String ProductPrice, @Field("productQuantity") String ProductQuantity, @Field("productUses") String ProductUses);

    @Multipart
    @POST("upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part img);

    @GET("products/me")
    Call<Product> getProductDetails(@Header("Authorization") String token);


}
