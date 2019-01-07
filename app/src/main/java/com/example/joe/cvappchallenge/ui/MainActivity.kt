package com.example.joe.cvappchallenge.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.joe.cvappchallenge.R
import com.example.joe.cvappchallenge.models.ApiRespone
import com.example.joe.week5github.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainActivityContract.Presenter>(), MainActivityContract.View {
    lateinit var presenter: MainActivityPresenter
    var cvList = ArrayList<ApiRespone>()
    lateinit var api : ApiRespone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cvList = ArrayList()
        presenter = MainActivityPresenter(this)
        presenter.getCv("Laura Jones")

    }

    override fun init() {

    }

    override fun getViewPresenter(): MainActivityContract.Presenter = presenter

    override fun showCV(cv: ApiRespone) {
        tvName.text = cv.sampleCvs[0].name
        tvPhoneNum.text = cv.sampleCvs[0].phoneNumber
        tvEmail.text = cv.sampleCvs[0].email
        tvPostalAddress.text = cv.sampleCvs[0].address.street + "\n" +
                cv.sampleCvs[0].address.town + "\n" +
                cv.sampleCvs[0].address.postCode
        tvProfile.text = cv.sampleCvs[0].profile
        for (i in 0 until cv.sampleCvs[0].coreSkills.size){
            tvSkills.text = cv.sampleCvs[0].coreSkills[i] + "\n"
        }
        for (i in 0 until cv.sampleCvs[0].careerSummary.size){
            tvCareer.text = cv.sampleCvs[0].careerSummary[i].from + "\n" +
                    cv.sampleCvs[0].careerSummary[i].to + "\n" +
                    cv.sampleCvs[0].careerSummary[i].outline + "\n"
                    for (j in 0 until cv.sampleCvs[0].careerSummary[i].keyResponsibilites.size){
                        cv.sampleCvs[0].careerSummary[i].keyResponsibilites[j] + "\n"
                    }
        }
        for (i in 0 until cv.sampleCvs[0].educationQualifications.size){
            tvEducations.text = cv.sampleCvs[0].educationQualifications[i]
        }
    }


}
