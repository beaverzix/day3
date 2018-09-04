package com.egco427.day3

import android.app.ListActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter

class MainActivity : ListActivity() {
    var mobileList = arrayOf("Samsung","Apple","Huawei","Oppe","lenovo","HTC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,mobileList)
        listAdapter = adapter
    }
}
