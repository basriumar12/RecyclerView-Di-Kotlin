package id.co.imastudio.santri.kotlin2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_buah.*

class DetailBuah : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_buah)

        //membuat variabel dan di tangkap data dri intent
        var tangkap = intent.getStringExtra("txt")
        var tangkap2 = intent.getIntExtra("img",0)

        //menangkap data intent dan di set ke layout
        detailtxt.text = tangkap
        imgdetail.setImageResource(tangkap2)
    }
}
