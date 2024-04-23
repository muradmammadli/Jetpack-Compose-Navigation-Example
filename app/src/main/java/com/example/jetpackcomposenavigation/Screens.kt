package com.example.jetpackcomposenavigation

sealed class Screens(val route: String) {
    object First : Screens("first")
    object Second : Screens("second")
    object Third : Screens("third")
}