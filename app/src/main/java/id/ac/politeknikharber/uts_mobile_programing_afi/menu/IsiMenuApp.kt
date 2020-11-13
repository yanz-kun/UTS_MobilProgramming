package id.ac.politeknikharber.uts_mobile_programing_afi.menu

import id.ac.politeknikharber.uts_mobile_programing_afi.R

object IsiMenuApp {
    private val foto = intArrayOf(
        R.drawable.newspaper,
        R.drawable.calculator,
        R.drawable.information,
        R.drawable.cancel
    )
    private val nama = arrayOf(
        "Pendidikan",
        "Calculator",
        "information",
        "Close"
    )

    val data:ArrayList<MenuApp>
        get() {
            val listGambar:ArrayList<MenuApp> = arrayListOf()
            for(i in foto.indices){
                val menuApp = MenuApp()
                menuApp.foto = foto[i]
                menuApp.nama = nama[i]
                listGambar.add(menuApp)
            }
            return listGambar
        }
}