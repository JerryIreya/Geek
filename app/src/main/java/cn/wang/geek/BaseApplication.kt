package cn.wang.geek

import android.app.ActivityManager
import android.app.Application
import android.content.Context
import android.os.Process
import cn.wang.geek.util.logd

/**
 * projectName:Geek
 *
 * package:cn.wang.geek
 *
 * Created by Jerry on 2017/5/24 15:54.
 */
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val myPid = Process.myPid()
        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager

        val runningAppProcesses = activityManager.runningAppProcesses
        runningAppProcesses.forEach {
            if (it.pid == myPid) {
                logd("pid: ${it.pid}, myPid: $myPid, processName: ${it.processName}")
                return@forEach
            }
            logd("if语句外，foreach内，return了，看看还能执行到吗")
        }
        logd("foreach外，return，看看还能执行到吗")
    }

}