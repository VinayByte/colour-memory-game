package com.vinay.colourmemory.vo

/**
 * Created by VINAY'S on 30/10/21.
 */
data class Card(
    val id: Int,
    var isFaceUp: Boolean,
    val colourId: Int,
    val cardBg: Int,
    var isMatched: Boolean
)