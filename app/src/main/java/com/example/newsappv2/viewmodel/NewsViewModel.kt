package com.example.newsappv2.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsappv2.R
import com.example.newsappv2.model.ListImage
import com.example.newsappv2.model.News

class NewsViewModel: ViewModel() {
    val listNews : MutableLiveData<MutableList<News>> = MutableLiveData()

    //    private val news = Resources.getSystem().getString(R.string.news) ERROR
    private val news = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit  esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum"
    private val bjorka = "Presiden Joko Widodo membentuk tim khusus menyusul sejumlah serangan siber dari hacker Bjorka ke instansi pemerintahan.\n" +
            "\n" +
            "Pembentukan tim dilakukan setelah pemerintah menggelar rapat di Istana Kepresidenan Jakarta. Tim itu akan menindaklanjuti serangan-serangan siber yang diterima beberapa waktu terakhir.\n" +
            "\n" +
            "\"Perlu ada emergency response team terkait untuk menjaga data, tata kelola data, yang baik di Indonesia dan untuk menjaga kepercayaan publik,\" kata Menteri Komunikasi dan Informatika Jhonny G Plate di Istana Kepresidenan Jakarta, Senin (12/9).\n" +
            "\n" +
            "Jhonny menyebut tim tersebut akan terdiri dari Badan Siber dan Sandi Nasional (BSSN), Kominfo, Polri, dan Badan Intelijen Negara (BIN).\n" +
            "\n" +
            "Baca artikel CNN Indonesia \"Jokowi Bentuk Tim Khusus Respons Serangan Bjorka\" selengkapnya di sini: https://www.cnnindonesia.com/nasional/20220912162500-32-846753/jokowi-bentuk-tim-khusus-respons-serangan-bjorka.\n" +
            "\n" +
            "Download Apps CNN Indonesia sekarang https://app.cnnindonesia.com/"
    private val bbm = "Badan Eksekutif Mahasiswa Universitas Indonesia (BEM UI) menyatakan menolak kenaikan harga bahan bakar minyak (BBM) jenis Pertalite hingga Solar.\n" +
            "\n" +
            "Koordinator Sosial Politik BEM UI Melki Sedek Huang mengatakan kenaikan BBM berdampak secara signifikan terhadap berbagai sektor kehidupan krusial masyarakat.\n" +
            "\n" +
            "\"Seperti mengakibatkan kenaikan harga (inflasi) berbagai sektor krusial yang mempengaruhi daya untuk memenuhi kehidupan sehari-hari rakyat,\" kata Melki dalam keterangan tertulis, Selasa (13/9).\n" +
            "\n" +
            "Dia mengungkapkan bahwa Pusat Informasi Harga Pangan Strategis Nasional (PIHPSN) mencatat telah terjadi kenaikan harga di berbagai komoditas pangan secara signifikan, seperti komoditas cabai.\n" +
            "\n" +
            "Melki menyebut komoditas cabai mengalami peningkatan harga hingga 15,76 persen imbas kenaikan harga BBM. Menurut BEM UI, kenaikan harga komoditas pangan itu akan terus terjadi."

    private val listData = mutableListOf(
        News("Dukun Full Senyum", news,"Faizal","13 September 2021", mutableListOf(ListImage(R.drawable.full_senyum),ListImage(R.drawable.danilla))),
        News("Hacker Bjorka", bjorka,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.bjorka),ListImage(R.drawable.danilla))),
        News("BBM naik woy, laka duit", bbm,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.demo_bbm_naik),ListImage(R.drawable.tolak_bbm_naik),ListImage(R.drawable.bbm))),
        News("Lorem", news,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.danilla))),
        News("Lorem", bjorka,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.danilla))),
        News("Lorem", bbm,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.danilla))),
        News("Lorem", news,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.danilla))),
        News("Lorem", bjorka,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.danilla))),
        News("Lorem", bbm,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.danilla))),
        News("Lorem", news,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.danilla))),
        News("Lorem", bjorka,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.danilla))),
        News("Lorem", bbm,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.danilla))),
        News("Lorem", news,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.danilla))),
        News("Lorem", bjorka,"Faizal","13 September 2022", mutableListOf(ListImage(R.drawable.danilla))),

        )

    fun getData(){
        listNews.value = listData
    }
}
