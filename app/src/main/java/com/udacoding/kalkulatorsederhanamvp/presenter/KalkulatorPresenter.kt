package com.udacoding.kalkulatorsederhanamvp.presenter

import com.udacoding.kalkulatorsederhanamvp.model.Kalkulator

// todo 7 masukan interface ke construct presenter
class KalkulatorPresenter(val kkView: KalkulatorView) {
    // todo 3 bikin function hitung kali di presenter
    fun hitungKali(nilai1 : String, nilai2 : String){

        // todo 13 cek validasi
        if(nilai1.isNotEmpty() && nilai2.isNotEmpty()) {

            // todo 4 convert ke integer
            val nilaia: Int = nilai1.toInt()
            val nilaib: Int = nilai2.toInt()

            val total: Int = nilaia.times(nilaib)

            // todo 5 panggil model masukan nilai presenter ke model
            val kalkulator = Kalkulator()
            kalkulator.total = total


            // todo 8 masukan model ke interface
            kkView.bindView(kalkulator)
        }
        else{
            kkView.isEmpty()
        }
    }

    fun hitungBagi(nilai1 : String, nilai2 : String){
        if(nilai1.isNotEmpty() && nilai2.isNotEmpty()) {
            // todo 4 convert ke integer
            val nilaia: Int = nilai1.toInt()
            val nilaib: Int = nilai2.toInt()

            val total: Int = nilaia.div(nilaib)

            // todo 5 panggil model masukan nilai presenter ke model
            val kalkulator = Kalkulator()
            kalkulator.total = total


            // todo 8 masukan model ke interface
            kkView.bindView(kalkulator)
        }else{
            kkView.isEmpty()
        }
    }

    fun hitungTambah(nilai1 : String, nilai2 : String){

        if(nilai1.isNotEmpty() && nilai2.isNotEmpty()) {
            // todo 4 convert ke integer
            val nilaia: Int = nilai1.toInt()
            val nilaib: Int = nilai2.toInt()

            val total: Int = nilaia.plus(nilaib)

            // todo 5 panggil model masukan nilai presenter ke model
            val kalkulator = Kalkulator()
            kalkulator.total = total


            // todo 8 masukan model ke interface
            kkView.bindView(kalkulator)
        }else{
            kkView.isEmpty()
        }
    }

    fun hitungKurang(nilai1 : String, nilai2 : String){

        if(nilai1.isNotEmpty() && nilai2.isNotEmpty()) {
            // todo 4 convert ke integer
            val nilaia: Int = nilai1.toInt()
            val nilaib: Int = nilai2.toInt()

            val total: Int = nilaia.minus(nilaib)

            // todo 5 panggil model masukan nilai presenter ke model
            val kalkulator = Kalkulator()
            kalkulator.total = total


            // todo 8 masukan model ke interface
            kkView.bindView(kalkulator)
        }else{
            kkView.isEmpty()
        }
    }
}