package com.example.joe.cvappchallenge.ui

import com.example.joe.cvappchallenge.models.ApiRespone
import com.example.joe.week5github.base.BasePresenter
import com.example.joe.week5github.base.BaseView

interface MainActivityContract {
    interface View:BaseView{
        fun showCV(cv: ApiRespone)
    }

    interface Presenter:BasePresenter{
        fun getCv(name:String)
    }
}