package cn.wang.geek.util

import android.util.Log

/**
 * projectName:Geek
 *
 * package:cn.wang.geek.util
 *
 * Created by Jerry on 2017/5/23 14:55.
 */

//----------------------------------------------------------------------------------------Log Util
val TAG: String = "GeekIreya"
//The prefix of tag for logger
val TAG_PREFIX: String = TAG + "---[ "
//The suffix of tag for logger
val TAG_SUFFIX: String = " ]"

fun Any.logv(msg: String) = Log.v(TAG_PREFIX + this.javaClass.simpleName + TAG_SUFFIX, msg)

fun Any.logd(msg: String) = Log.d(TAG_PREFIX + this.javaClass.simpleName + TAG_SUFFIX, msg)

fun Any.logi(msg: String) = Log.i(TAG_PREFIX + this.javaClass.simpleName + TAG_SUFFIX, msg)

fun Any.logw(msg: String) = Log.w(TAG_PREFIX + this.javaClass.simpleName + TAG_SUFFIX, msg)

fun Any.loge(msg: String) = Log.e(TAG_PREFIX + this.javaClass.simpleName + TAG_SUFFIX, msg)
