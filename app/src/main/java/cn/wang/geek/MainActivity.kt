package cn.wang.geek

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cn.wang.geek.util.logd
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        textview.text = stringFromJNI()

        textview.setOnClickListener({
            val intent: Intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("test", "hahah")
            startActivity(intent)
        })

        Constants.sUserId = 2
        logd("sUserId: ${Constants.sUserId}")

        var user: User = User("haha", 23)
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
