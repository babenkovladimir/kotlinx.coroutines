/*
 * Copyright 2016-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.experimental.selects

import kotlinx.coroutines.experimental.*

/**
 * Loops while [select] expression returns `true`.
 *
 * The statement of the form:
 *
 * ```
 * whileSelect {
 *     /*body*/
 * }
 * ```
 *
 * is a shortcut for:
 *
 * ```
 * while(select<Boolean> {
 *    /*body*/
 * }) {}
 */
@ExperimentalCoroutinesApi
public suspend inline fun whileSelect(crossinline builder: SelectBuilder<Boolean>.() -> Unit) {
    while(select<Boolean>(builder)) {}
}
