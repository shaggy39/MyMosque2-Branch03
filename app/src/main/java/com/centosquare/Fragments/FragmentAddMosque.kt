package com.centosquare

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Window
import com.centosquare.R.id.toolbar





class FragmentAddMosque : Fragment() {

    var v:View?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }//end of onCreate method

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_add_mosque, container, false)

       // //<For Toolbar>
    val toolbar = activity!!.findViewById(R.id.toolbar) as android.support.v7.widget.Toolbar?
    //  (activity as AppCompatActivity).supportActionBar?.hide()
        toolbar?.visibility = View.VISIBLE
       var title=toolbar?.findViewById<TextView>(R.id.toolbar_title)
//SET THE TOOLBAR TITLE
        title?.text = "Add Mosque"
        //</For Toolbar>
        //(activity as AppCompatActivity).setSupportActionBar(toolbar)

        return v
    }//End onCreateView Method

}


