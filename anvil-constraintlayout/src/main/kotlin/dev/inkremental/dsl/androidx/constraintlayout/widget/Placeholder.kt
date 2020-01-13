@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package dev.inkremental.dsl.androidx.constraintlayout.widget

import androidx.constraintlayout.widget.Placeholder
import dev.inkremental.dsl.android.view.ViewGroupScope
import trikita.anvil.*

fun placeholder(configure: PlaceholderScope.() -> Unit = {}) =
    v<Placeholder>(configure.bind(PlaceholderScope))
abstract class PlaceholderScope : ViewGroupScope() {
    fun contentId(contentId: Int): Unit = attr("contentId", contentId)
    fun emptyVisibility(visibility: Int): Unit = attr("emptyVisibility", visibility)
    companion object : PlaceholderScope()
}
