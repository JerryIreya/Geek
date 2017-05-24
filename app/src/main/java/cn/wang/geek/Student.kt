package cn.wang.geek

import android.os.Parcel
import android.os.Parcelable

/**
 * projectName:Geek
 *
 *
 * package:cn.wang.geek
 *
 *
 * Created by Jerry on 2017/5/24 16:58.
 */

class Student : Parcelable {

    private var name: String? = null
    private var age: Int = 0

    protected constructor(`in`: Parcel) {
        name = `in`.readString()
        age = `in`.readInt()
    }

    internal constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeInt(age)
    }

    companion object {

        val CREATOR: Parcelable.Creator<Student> = object : Parcelable.Creator<Student> {
            override fun createFromParcel(`in`: Parcel): Student {
                return Student(`in`)
            }

            override fun newArray(size: Int): Array<Student> {
                return newArray(size)
            }
        }
    }
}
