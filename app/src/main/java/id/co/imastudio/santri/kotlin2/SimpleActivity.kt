package id.co.imastudio.santri.kotlin2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_simple.*
import java.util.*

class SimpleActivity : AppCompatActivity() {
    var dataArray = arrayOf("10","50","80","40","100","30","-10","70","60")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
        Arrays.sort(dataArray)
        var adapter = ArrayAdapter(SimpleActivity@this, android.R.layout.simple_list_item_1,dataArray)
         listview.adapter= adapter
    }
}
