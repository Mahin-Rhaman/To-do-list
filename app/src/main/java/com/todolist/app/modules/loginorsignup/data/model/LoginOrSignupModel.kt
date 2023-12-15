package com.todolist.app.modules.loginorsignup.`data`.model

import com.todolist.app.R
import com.todolist.app.appcomponents.di.MyApp
import kotlin.String

data class LoginOrSignupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoourcommunity: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_our_community)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOurCommunityIs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_our_community_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetInThrough: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_get_in_through)

)
