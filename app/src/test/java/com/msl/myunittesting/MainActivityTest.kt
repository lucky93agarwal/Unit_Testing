package com.msl.myunittesting



import org.junit.Assert.*
import org.junit.After
import org.junit.Before
import org.junit.Test

class MainActivityTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun user_mobile_is_empty(){
        val user_mobile =""
        val assert = LoginUtils.validation(user_mobile,"123456789", true)
        assert(assert == "Please enter a your phone number.")
        /*assertEquals(true,assert)*/
    }
    @Test
    fun user_mobile_length(){
        val user_mobile = "884014"
        assert(LoginUtils.validation(user_mobile,"123456",true)=="Please enter a valid phone number.")
    }


    @Test
    fun user_pass_is_empty(){
        val user_pass =""
        assert(LoginUtils.validation("1234567890",user_pass,true) == "Please enter your password.")
    }
    @Test
    fun user_pass_length(){
        val user_pass = "88401"
        assert(LoginUtils.validation("1234567890",user_pass,true)=="Please enter at least 6 digit password.")
    }

    @Test
    fun user_terms_and_condition_length(){
        val user_terms_and_condition = false
        assert(LoginUtils.validation("1234567890","123456",user_terms_and_condition)=="Please check Terms and Condition.")
    }
}