package com.ebookfrenzy.mad155_listviewcustom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdapter (var ctx: Context, var ourResource:Int,
                       var items: ArrayList<Model> //make the resources for the adapter
                       ): ArrayAdapter<Model>(ctx, ourResource, items){//import them to the existing adapter class

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResource, null) //inflater config

        //goto layout and get the ids/liks of textboxes, ect for the listview
        val name = view.findViewById<TextView>(R.id.name)
        val extra = view.findViewById<TextView>(R.id.extraText)
        val image = view.findViewById<ImageView>(R.id.image1)
        // assign values to our listview elements
        // this directly relates to the class we just created
        name.text = (items[position].Name)//position comes from the library func parameter/arg position: refers to position in array.
        extra.text = (items[position].extraText)
        image.setImageDrawable(ctx.resources.getDrawable(items[position].img)) //get the image and loads it to the imageview

        return view // return our completed view that now has values assigned
    }
}