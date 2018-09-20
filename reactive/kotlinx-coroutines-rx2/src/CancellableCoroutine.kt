/*
 * Copyright 2016-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.experimental.rx2

import io.reactivex.functions.*
import kotlinx.coroutines.experimental.*
import kotlin.coroutines.experimental.*

@Suppress("CONFLICTING_JVM_DECLARATIONS", "RETURN_TYPE_MISMATCH_ON_INHERITANCE")
internal open class CancellableCoroutine<T>(
    parentContext: CoroutineContext,
    active: Boolean
) : AbstractCoroutine<T>(parentContext, active), Cancellable {
    // Cancellable impl
    @JvmName("cancel")
    @Suppress("NOTHING_TO_OVERRIDE", "ACCIDENTAL_OVERRIDE")
    final override fun cancelCancellable() { cancel(cause = null) }
}