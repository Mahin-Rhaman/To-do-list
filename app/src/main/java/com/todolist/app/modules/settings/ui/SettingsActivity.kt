package com.todolist.app.modules.settings.ui

import androidx.activity.viewModels
import com.todolist.app.R
import com.todolist.app.appcomponents.base.BaseActivity
import com.todolist.app.databinding.ActivitySettingsBinding
import com.todolist.app.modules.settings.`data`.viewmodel.SettingsVM
import kotlin.String
import kotlin.Unit

class SettingsActivity : BaseActivity<ActivitySettingsBinding>(R.layout.activity_settings) {
  private val viewModel: SettingsVM by viewModels<SettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowLeft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_ACTIVITY"

  }
}
