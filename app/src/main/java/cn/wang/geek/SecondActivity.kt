package cn.wang.geek

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cn.wang.geek.util.logd
import kotlinx.android.synthetic.main.activity_main.*

/**
 * projectName:Geek
 *
 * package:cn.wang.geek
 *
 * Created by Jerry on 2017/5/23 16:15.
 */
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logd("oncreate" + intent)

        textview.setOnClickListener({
            val intent: Intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("test", "hahah")
            startActivity(intent)
        })

//        val intent = Intent()
//        intent.setClass(this, SecondActivity::class.java)
//        val resolveActivity = packageManager.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY)
//        val resolveActivity1 = intent.resolveActivity(packageManager)
//
//        logd("packagemanager.resolveActivity: " + resolveActivity)
//        logd("intent.resolveActivity: " + resolveActivity1)


        logd("sUserid: ${Constants.sUserId}")
    }

    override fun onStart() {
        super.onStart()
        logd("onstart")
    }

    override fun onRestart() {
        super.onRestart()
        logd("onrestart")
    }

    override fun onResume() {
        super.onResume()
        logd("onresume")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        logd("onnewintent: " + intent)
    }

    override fun onPause() {
        super.onPause()
        logd("onpause")
    }

    override fun onStop() {
        super.onStop()
        logd("onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        logd("ondestroy")
    }
}