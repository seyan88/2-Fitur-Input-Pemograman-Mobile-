package com.example.tugas2inputcontrol

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var tvTanggal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTanggal = findViewById(R.id.tv_tanggal)
    }

    //1. Fitur Menampilkan DatePicker (Pemilih Tanggal)
    fun showDatePicker(view: View) {
        val calendar = Calendar.getInstance()
        val tahun = calendar.get(Calendar.YEAR)
        val bulan = calendar.get(Calendar.MONTH)
        val hari = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
                val tanggal = "$dayOfMonth/${month + 1}/$year"
                tvTanggal.text = tanggal
            },
            tahun, bulan, hari
        )

        datePickerDialog.show()
    }

    fun hapusTanggal(view: View) {
        // 2.Menampilkan alert dialog konfirmasi
        val alertDialog = AlertDialog.Builder(this)
            .setTitle("Konfirmasi")
            .setMessage("Apakah Anda yakin ingin menghapus tanggal?")
            .setPositiveButton("Ya") { _, _ ->
                tvTanggal.text = ""
            }
            .setNegativeButton("Batal", null)
            .create()

        alertDialog.show()
    }
}