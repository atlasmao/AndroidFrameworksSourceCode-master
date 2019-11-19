/*
 * Copyright (C) 2012 The Android Open Source Project
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

package android.support.v8.renderscript;

/**
 * Class for exposing the native RenderScript double2 type back
 * to the Android system.
 *
 **/
public class Double2 {
    public Double2() {
    }

    public Double2(double initX, double initY) {
        x = initX;
        y = initY;
    }

    public double x;
    public double y;
}




