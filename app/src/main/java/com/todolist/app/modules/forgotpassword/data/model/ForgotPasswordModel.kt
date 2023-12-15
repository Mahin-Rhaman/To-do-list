package com.todolist.app.modules.forgotpassword.`data`.model

import com.todolist.app.R
import com.todolist.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonality: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpingOthersMeans: String? =
      MyApp.getInstance().resources.getString(R.string.msg_helping_others_means)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIfYouAreAlways: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_you_are_always)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null
)
