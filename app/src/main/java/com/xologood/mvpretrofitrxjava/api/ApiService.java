package com.xologood.mvpretrofitrxjava.api;


import com.xologood.mvpretrofitrxjava.bean.bean;

import retrofit2.http.GET;
import rx.Observable;

/**
 * des:ApiService
 * Created by xsf
 * on 2016.06.15:47
 */
public interface ApiService {
    @GET(ApiConstants.BEAN)
    Observable<bean> getBean();

}
