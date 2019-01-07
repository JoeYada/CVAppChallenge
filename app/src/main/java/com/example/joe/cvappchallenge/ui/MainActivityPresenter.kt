package com.example.joe.cvappchallenge.ui

import android.util.Log
import com.example.joe.cvappchallenge.models.ApiRespone
import com.example.joe.cvappchallenge.remote.RemoteHelper
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainActivityPresenter(val view: MainActivityContract.View):MainActivityContract.Presenter {
    override fun getCv(name: String) {
        RemoteHelper.getCV(name).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<ApiRespone>{
                override fun onSuccess(t: ApiRespone) {
                    Log.d("CV", "${t.sampleCvs[0].email}")
                    view.showCV(t)
                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onError(e: Throwable) {
                    e.printStackTrace()
                }
            })
    }

    override fun onCreate() {
    }
}