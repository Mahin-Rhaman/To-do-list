package com.todolist.app.modules.termsandconditions.`data`.model

import com.todolist.app.R
import com.todolist.app.appcomponents.di.MyApp
import kotlin.String

data class TermsandconditionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_conditions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor2)

)
