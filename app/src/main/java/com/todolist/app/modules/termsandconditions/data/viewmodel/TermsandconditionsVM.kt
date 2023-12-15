package com.todolist.app.modules.termsandconditions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.todolist.app.modules.termsandconditions.`data`.model.TermsandconditionsModel
import org.koin.core.KoinComponent

class TermsandconditionsVM : ViewModel(), KoinComponent {
  val termsandconditionsModel: MutableLiveData<TermsandconditionsModel> =
      MutableLiveData(TermsandconditionsModel())

  var navArguments: Bundle? = null
}
