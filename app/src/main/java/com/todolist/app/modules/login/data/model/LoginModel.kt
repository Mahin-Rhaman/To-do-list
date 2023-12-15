package com.todolist.app.modules.login.`data`.model

import com.todolist.app.R
import com.todolist.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonality: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThisIsYourCommunity: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_is_your_community)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOurCommunityIs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_our_community_is3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
