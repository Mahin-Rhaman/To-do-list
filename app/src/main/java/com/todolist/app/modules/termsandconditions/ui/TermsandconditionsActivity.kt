package com.todolist.app.modules.termsandconditions.ui

import androidx.activity.viewModels
import com.todolist.app.R
import com.todolist.app.appcomponents.base.BaseActivity
import com.todolist.app.databinding.ActivityTermsandconditionsBinding
import com.todolist.app.modules.termsandconditions.`data`.viewmodel.TermsandconditionsVM
import kotlin.String
import kotlin.Unit

class TermsandconditionsActivity :
    BaseActivity<ActivityTermsandconditionsBinding>(R.layout.activity_termsandconditions) {
  private val viewModel: TermsandconditionsVM by viewModels<TermsandconditionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.termsandconditionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowLeft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "TERMSANDCONDITIONS_ACTIVITY"

  }
}
