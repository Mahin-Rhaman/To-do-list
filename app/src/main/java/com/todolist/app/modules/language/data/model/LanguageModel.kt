package com.todolist.app.modules.language.`data`.model

import com.todolist.app.R
import com.todolist.app.appcomponents.di.MyApp
import kotlin.String

data class LanguageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourSettingsSo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_settings_so)

)
