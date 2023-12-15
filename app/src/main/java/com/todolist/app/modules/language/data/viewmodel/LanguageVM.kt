package com.todolist.app.modules.language.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.todolist.app.modules.language.`data`.model.LanguageModel
import org.koin.core.KoinComponent

class LanguageVM : ViewModel(), KoinComponent {
  val languageModel: MutableLiveData<LanguageModel> = MutableLiveData(LanguageModel())

  var navArguments: Bundle? = null
}
