/*
 * Developed By Suman Kumar Dey
 * Linkedln: www.linkedin.com/in/suman1040
 */

package com.example.speechTherapy.ui.practice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PracticeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text
}