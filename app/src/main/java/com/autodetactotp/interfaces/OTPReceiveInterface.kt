package com.autodetactotp.interfaces

interface OTPReceiveInterface {
    fun onOtpReceived(otp : String)
    fun onOtpTimeout()
}