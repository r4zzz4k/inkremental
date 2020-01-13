@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package dev.inkremental.dsl.google.android.material.internal

import com.google.android.material.internal.BaselineLayout
import dev.inkremental.dsl.android.view.ViewGroupScope
import dev.inkremental.dsl.google.android.material.CustomMaterialSetter
import dev.inkremental.dsl.google.android.material.MaterialSetter
import kotlin.Suppress
import kotlin.Unit
import trikita.anvil.Anvil
import trikita.anvil.bind
import trikita.anvil.v

fun baselineLayout(configure: BaselineLayoutScope.() -> Unit = {}) =
    v<BaselineLayout>(configure.bind(BaselineLayoutScope))
abstract class BaselineLayoutScope : ViewGroupScope() {
  companion object : BaselineLayoutScope() {
    init {
      Anvil.registerAttributeSetter(MaterialSetter)
      Anvil.registerAttributeSetter(CustomMaterialSetter)
    }
  }
}
