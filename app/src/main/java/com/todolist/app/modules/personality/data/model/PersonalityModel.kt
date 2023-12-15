package com.todolist.app.modules.personality.`data`.model

import com.todolist.app.R
import com.todolist.app.appcomponents.di.MyApp
import kotlin.String

data class PersonalityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonality: String? = MyApp.getInstance().resources.getString(R.string.lbl_personality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditPhoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_photo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserName: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstName: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastName: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHobby: String? = MyApp.getInstance().resources.getString(R.string.lbl_hobby)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateOfBirth: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_country)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etUserNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFirstNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLastNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etHobbyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDateOfBirthValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCountryValue: String? = null
)
