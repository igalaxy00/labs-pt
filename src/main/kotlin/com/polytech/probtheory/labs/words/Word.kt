package com.polytech.probtheory.labs.words

import com.polytech.probtheory.model.Info


class Word(val word: CharArray) : Info {
    override fun toString(): String {
        return "Word(word=$word)"
    }
}