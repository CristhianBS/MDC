package com.cbernals.practicemdc1.utils

object Utils{
    fun getColorFromString(color: String): Int =
        when (color){
            "BLACK" -> -16777216
            "BLUE" -> -16776961
            "CYAN" -> -16711681
            "DKGRAY" -> -12303292
            "GRAY" -> -7829368
            "GREEN" -> -16711936
            "LTGRAY" -> -3355444
            "MAGENTA" -> -65281
            "RED" -> -65536
            "TRANSPARENT" -> 0
            "WHITE" -> -1
            "YELLOW" -> -256
            else -> 0
        }
}