package com.example.mydatasiswa.uicontroller.route

import com.example.praktikum11.R

object DestinasiDetail : DestinasiNavigasi {
    override val route = "detail"
    override val titleRes = R.string.detail_siswa
    const val ID_SISWA = "id_siswa"
    val routeWithArgs = "$route/{$ID_SISWA}"
}
