package com.capiro.mathlibrary

import kotlin.math.sqrt
import kotlin.math.pow
data class Point(val x: Double, val y: Double)

fun Point.calculateDistanceTo(point:Point): Double {
    return sqrt((x-point.x).pow(2) + (y - point.y).pow(2))
}