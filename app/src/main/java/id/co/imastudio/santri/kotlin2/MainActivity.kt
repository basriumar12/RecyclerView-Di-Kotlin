package id.co.imastudio.santri.kotlin2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnlistview.setOnClickListener{
            actionPindah(SimpleActivity())
        }
        btnrecylerview.setOnClickListener{
            actionPindah(RecylerActivity())
        }

    }

    private fun actionPindah(simpleActivity: Any) {
        startActivity(Intent(applicationContext,simpleActivity::class.java))


    }
}
