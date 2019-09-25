package com.example.myprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_proses.setOnClickListener {
            var jumlahBeli = edit_jumlahBeli.text.toString().toInt()
            var harga = edit_harga.text.toString().toInt()
            var uangBayar = edit_uangBayar.text.toString().toInt()
            var total = jumlahBeli * harga
            var ukem = uangBayar - total
            var ket = when{
                total == 0 -> tv_keterangan.text ="uang pas"
                total > 0 -> tv_keterangan.text ="uang sisa"
                total < 0 -> tv_keterangan.text ="uang kurang"
                else -> tv_keterangan.text = "keterangan error"
            }

            tv_totalBelanja.text =total.toString()
            tv_uangKembali.text =ukem.toString()

        }
        btn_reset.setOnClickListener{
            tv_keterangan.text =""
            tv_uangKembali.text =""
            tv_totalBelanja.text=""
        }
        btn_keluar.setOnClickListener {
            moveTaskToBack(true)
        }

    }
}
