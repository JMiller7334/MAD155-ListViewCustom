package com.ebookfrenzy.mad155_listviewcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listview)
        //val myArray = arrayOf("kotlin", "javascript", "swift", "lua", "python", "html")

        var list = ArrayList<Model>() // list is an array without an end index, mutable means it can be modified

        //construct a class and pass it to our new array
        list.add(Model("Dave", "Teacher", R.drawable.ic_launcher_background))
        list.add(Model("Jacob", "Student", R.drawable.ic_launcher_foreground))

        //val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            //this, android.R.layout.simple_expandable_list_item_1, myArray
        //)
        //pass in the file/objects/classes created for this custom lisrview
        listView.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)

        //listView.setOnItemClickListener { adapterView, view, i, l ->
            //Toast.makeText(this, "Item: "+myArray[i], Toast.LENGTH_SHORT).show()
        //}
    }
}