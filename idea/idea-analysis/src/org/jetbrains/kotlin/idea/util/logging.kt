/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.util

import com.intellij.openapi.diagnostic.Logger
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Logger instantiation: 'val log by logger'
 */
val logger: ReadOnlyProperty<Any, Logger> get() = LoggerDelegate()

class LoggerDelegate : ReadOnlyProperty<Any, Logger> {
    lateinit var logger: Logger

    override fun getValue(thisRef: Any, property: KProperty<*>): Logger {
        if (!::logger.isInitialized) {
            logger = Logger.getInstance(thisRef.javaClass)
        }
        return logger
    }
}
