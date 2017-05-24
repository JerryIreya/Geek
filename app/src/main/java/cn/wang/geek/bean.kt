package cn.wang.geek

import android.os.Parcel
import android.os.Parcelable

/**
 * projectName:Geek
 *
 * package:cn.wang.geek
 *
 * Created by Jerry on 2017/5/24 16:54.
 */

data class User constructor(var username: String, var age: Int) : Parcelable {

    constructor(parcel: Parcel) : this(parcel.readString(), parcel.readInt())

    init {
        this.username = username
        this.age = age
    }

    companion object {
        val CREATOR: Parcelable.Creator<User> = object : Parcelable.Creator<User> {
            override fun newArray(size: Int): Array<User> {
                return newArray(size)
            }

            override fun createFromParcel(source: Parcel): User {
                return User(source)
            }

        }
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(username)
        dest.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }
}
