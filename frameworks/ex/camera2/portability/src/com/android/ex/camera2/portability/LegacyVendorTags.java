/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.ex.camera2.portability;

import android.util.Log;

/**
 * Vendor tag declarations for the Legacy Camera2 API implementation.
 */
public class LegacyVendorTags {

    private static final String TAG = "LegacyVendorTags";

    /**
     * Hidden enum for scene modes supported only by the Camera1 API.
     */
    public static final int CONTROL_SCENE_MODE_HDR;

    static {
        int tempSceneMode = -1;
        try {
            tempSceneMode =
                    Class.forName("android.hardware.camera2.CameraCharacteristics").
                            getField("CONTROL_SCENE_MODE_HDR").getInt(null);
        } catch (Exception e) {
            Log.e(TAG, "Error while reflecting on SCENE_MODE_HDR enum, HDR will not be available: "
                    + e);
        } finally {
            CONTROL_SCENE_MODE_HDR = tempSceneMode;
        }
    }

    private LegacyVendorTags() {
        throw new AssertionError();
    }
}