package com.xologood.mvpretrofitrxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xologood.mvpframework.base.RxManager;
import com.xologood.mvpframework.util.ToastUitl;
import com.xologood.mvpframework.util.helper.RxSchedulers;
import com.xologood.mvpretrofitrxjava.api.Api;
import com.xologood.mvpretrofitrxjava.bean.bean;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.state)
    TextView state;
    @Bind(R.id.activity_main)
    RelativeLayout activityMain;
    private RxManager mRxManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mRxManager = new RxManager();
        mRxManager.add(Api.getInstance().service
                .getBean()
                .compose(RxSchedulers.<bean>io_main())
                .subscribe(new Action1<bean>() {
            @Override
            public void call(bean bean) {
                if (bean != null) {
                    ToastUitl.showLong(bean.getStatus());
                    state.setText(bean.getParamz().getFeeds().get(0).getData().getSubject());
                }
            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                ToastUitl.showLong("请求失败！");
            }
        }));
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mRxManager.clear();
    }
}
