@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package dev.inkremental.dsl.androidx.appcompat.widget

import androidx.appcompat.widget.AppCompatCheckedTextView
import dev.inkremental.Inkremental
import dev.inkremental.bind
import dev.inkremental.dsl.android.initWith
import dev.inkremental.dsl.android.widget.CheckedTextViewScope
import dev.inkremental.dsl.androidx.appcompat.AppcompatV7Setter
import dev.inkremental.dsl.androidx.appcompat.CustomAppCompatv7Setter
import dev.inkremental.v
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

fun appCompatCheckedTextView(configure: AppCompatCheckedTextViewScope.() -> Unit = {}) =
    v<AppCompatCheckedTextView>(configure.bind(AppCompatCheckedTextViewScope))
abstract class AppCompatCheckedTextViewScope : CheckedTextViewScope() {
  @JvmName("initAppCompatCheckedTextView")
  fun init(arg: (AppCompatCheckedTextView) -> Unit): Unit = initWith<AppCompatCheckedTextView>(arg)
  companion object : AppCompatCheckedTextViewScope() {
    init {
      Inkremental.registerAttributeSetter(AppcompatV7Setter)
      Inkremental.registerAttributeSetter(CustomAppCompatv7Setter)
    }
  }
}
