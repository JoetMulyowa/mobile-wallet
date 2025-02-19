/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.core.network.model.entity.payload

import kotlinx.serialization.Serializable

@Serializable
data class PayPayload(
    val transactionDate: String,
    val transactionAmount: Int,
    val note: String,
    val dateFormat: String,
    val paymentTypeId: Int = 1,
    val locale: String = "en",
)
