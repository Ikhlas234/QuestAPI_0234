package com.example.mydatasiswa.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mydatasiswa.uicontroller.route.DestinasiEntry
import com.example.mydatasiswa.uicontroller.route.DestinasiHome
import com.example.mydatasiswa.uicontroller.view.EntrySiswaScreen
import com.example.mydatasiswa.uicontroller.view.HomeScreen

@Composable
fun DataSiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    HostNavigasi(navController = navController, modifier = modifier)
}

@Composable
