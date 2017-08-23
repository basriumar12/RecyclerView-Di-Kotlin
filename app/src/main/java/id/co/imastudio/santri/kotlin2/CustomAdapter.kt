package id.co.imastudio.santri.kotlin2

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by Server on 22/08/2017.
 */
class CustomAdapter :RecyclerView.Adapter<CustomAdapter.Myholder> {
    var c : Activity? =null
    var databuah2 : Array<String>?=null
    var datagamabr : Array<Int>?=null
    constructor(recylerActivity: RecylerActivity, dataBuah: Array<String>, dataGambar: Array<Int>)
    {
        c = recylerActivity
        databuah2 = dataBuah
        datagamabr = dataGambar
    }
        //set data ke recylerview
    override fun onBindViewHolder(holder: Myholder?, position: Int) {
        //manggil dan set data
        holder?.txt?.text = databuah2?.get(position)
        holder?.img?.setImageResource(datagamabr?.get(position)!!)

        holder?.img?.setOnClickListener{

            var intent = Intent(c,DetailBuah::class.java)
            intent.putExtra("txt",databuah2?.get(position))
            intent.putExtra("img",datagamabr?.get(position))
            c?.startActivity(intent)
        }



        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
//mencreate pada layout list item
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Myholder {
        var view = LayoutInflater.from(c).inflate(R.layout.list_item,parent,false)
        return Myholder(view)

        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    //tampilkan data
    override fun getItemCount(): Int {
        //return data gmbr
        return databuah2?.size!!
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //deklarasi id pada customAdapter, id yang ada pada list_item
    class Myholder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var txt : TextView?= itemView?.findViewById(R.id.namabuah)
        var img : ImageView?= itemView?.findViewById(R.id.imglsitietm)


    }

}



