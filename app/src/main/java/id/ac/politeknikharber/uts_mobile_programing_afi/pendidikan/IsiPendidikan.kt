package id.ac.politeknikharber.uts_mobile_programing_afi.pendidikan

import id.ac.politeknikharber.uts_mobile_programing_afi.R

object IsiPendidikan {
    private val namaJenjang = arrayOf(
        "Paud",
        "SD",
        "SMP",
        "SMA",
        "Perguruan Tinggi"
    )

    private val des = arrayOf(
        "Pendidikan anak usia dini (PAUD) adalah jenjang pendidikan sebelum jenjang pendidikan dasar yang merupakan suatu upaya pembinaan yang ditujukan bagi anak sejak lahir sampai dengan usia enam tahun yang dilakukan melalui pemberian rangsangan pendidikan untuk membantu pertumbuhan dan perkembangan jasmani dan rohani agar anak memiliki kesiapan dalam memasuki pendidikan lebih lanjut, yang diselenggarakan pada jalur formal, nonformal, dan informa",
        "Sekolah dasar (disingkat SD; bahasa Inggris: Elementary School atau Primary School) adalah jenjang paling dasar pada pendidikan formal di Indonesia. Sekolah dasar ditempuh dalam waktu 6 tahun, mulai dari kelas 1 sampai kelas 6. Saat ini murid kelas 6 diwajibkan mengikuti Ujian Nasional (EBTANAS) yang mempengaruhi kelulusan siswa. Lulusan sekolah dasar dapat melanjutkan pendidikan ke tingkat SLTP. ",
        "ekolah Menengah Pertama (disingkat SMP, bahasa Inggris: junior high school atau Middle School) adalah jenjang pendidikan dasar pada pendidikan formal di Indonesia yang ditempuh setelah lulus sekolah dasar (atau sederajat). Sekolah menengah pertama ditempuh dalam waktu 3 tahun, mulai dari kelas 7 sampai kelas 9. Pada tahun ajaran 1994/1995 hingga 2003/2004, sekolah ini pernah disebut sekolah lanjutan tingkat pertama (SLTP). ",
        "Sekolah Menengah Atas (disingkat SMA; bahasa Inggris: Senior High School atau High School), adalah jenjang pendidikan menengah pada pendidikan formal di Indonesia setelah lulus Sekolah Menengah Pertama (atau sederajat). Sekolah menengah atas ditempuh dalam waktu 3 tahun, mulai dari kelas 10 sampai kelas 12.\n Pada saat pendaftaran masuk SMA yang menggunakan sistem online, siswa dapat memilih sekolah yang diinginkan dan memilih jurusan yang diminati. Pada akhir tahun ketiga (yakni kelas 12), siswa diwajibkan mengikuti Ujian Nasional (dahulu Ebtanas) yang memengaruhi kelulusan siswa. Lulusan SMA dapat melanjutkan pendidikan ke perguruan tinggi atau langsung bekerja. ",
        "Perguruan tinggi adalah tahap akhir opsional pada pendidikan formal. Biasanya disampaikan dalam bentuk universitas, akademi, colleges, seminari, sekolah musik, dan institut teknologi. Peserta didik perguruan tinggi disebut mahasiswa, sedangkan tenaga pendidiknya disebut dosen. ",
    )

    private val foto = intArrayOf(
        R.drawable.paud,
        R.drawable.sd,
        R.drawable.smp,
        R.drawable.sma ,
        R.drawable.kuliah
    )


    val dataPendidikan:ArrayList<DataPendidikan>
     get() {
         val listPendidikan:ArrayList<DataPendidikan> = arrayListOf()
         for(i in namaJenjang.indices){
            val data = DataPendidikan()
             data.judul = namaJenjang[i]
             data.des = des[i]
             data.foto = foto[i]
             listPendidikan.add(data)
         }
         return listPendidikan
     }
}