package com.quickblox.sample.videochat.kotlin.activities

import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.quickblox.sample.videochat.kotlin.R
import kotlinx.android.synthetic.main.activity_splash.*


private const val SPLASH_DELAY = 1500

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val metrics = applicationContext.resources.displayMetrics
        val ratio =  metrics.heightPixels.toFloat() / metrics.widthPixels.toFloat()
         Log.e("AAAA", ratio.toString())
        

        if(ratio<=1.8){
            setContentView(R.layout.layout_hix_3_wide)
        }else{
            setContentView(R.layout.layout_hix_3)
        }


//        window.setFlags(
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
//        setContentView(R.layout.activity_splash)

//        supportActionBar?.hide()
//
//        fillVersion()
//
//        Handler().postDelayed({
//            if (SharedPrefsHelper.hasQbUser()) {
//                LoginService.start(this, SharedPrefsHelper.getQbUser())
//                OpponentsActivity.start(this)
//            } else {
//                LoginActivity.start(this)
//            }
//            finish()
//        }, SPLASH_DELAY.toLong())
    }

    private fun fillVersion() {
        text_splash_app_title.text =  getString(R.string.app_name)
        val versionName = packageManager.getPackageInfo(packageName, 0).versionName
        text_splash_app_version.text = getString(R.string.splash_app_version, versionName)
    }
}