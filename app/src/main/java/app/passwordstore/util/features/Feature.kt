/*
 * Copyright © 2014-2022 The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */

package app.passwordstore.util.features

/** List of all feature flags for the app. */
enum class Feature(
  /** Default value for the flag. */
  val defaultValue: Boolean,
  /** Key to retrieve the current value for the flag. */
  val configKey: String,
) {

  /** Opt into the new PGP backend powered by the PGPainless library. */
  @Deprecated(
    "The PGPainless backend is now the only available one",
    level = DeprecationLevel.ERROR
  )
  EnablePGPainlessBackend(false, "enable_pgp_v2_backend"),
  ;

  companion object {
    @JvmField val VALUES = values()
  }
}
