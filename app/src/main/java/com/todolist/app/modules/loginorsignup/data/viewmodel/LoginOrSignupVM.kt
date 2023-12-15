package com.todolist.app.modules.loginorsignup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.todolist.app.modules.loginorsignup.`data`.model.LoginOrSignupModel
import org.koin.core.KoinComponent

class LoginOrSignupVM : ViewModel(), KoinComponent {
  val loginOrSignupModel: MutableLiveData<LoginOrSignupModel> =
      MutableLiveData(LoginOrSignupModel())

  var navArguments: Bundle? = null
}
