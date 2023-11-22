package com.msl.myunittesting

object LoginUtils {
    fun validation(mobile: String, password: String, rememberMe: Boolean): String?{
        if(mobile.isEmpty() ) return "Please enter a your phone number."

        if(mobile.length <10) return "Please enter a valid phone number."

        if(password.isEmpty()) return "Please enter your password."
        if(password.length <6) return "Please enter at least 6 digit password."
        if(!rememberMe) return "Please check Terms and Condition."

        return null
    }

}