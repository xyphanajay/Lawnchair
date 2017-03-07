/*
 * Copyright (C) 2015 The Android Open Source Project
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

package ch.deletescape.lawnchair.config;

import android.content.Context;
import ch.deletescape.lawnchair.Utilities;

/**
 * Defines a set of flags used to control various launcher behaviors
 */
public final class FeatureFlags {
    private FeatureFlags() {}

    // Custom flags go below this
    public static boolean LAUNCHER3_ALL_APPS_PULL_UP = true;

    // When enabled fling down gesture on the first workspace triggers search.
    public static final boolean PULLDOWN_SEARCH = false;
    // When enabled the status bar may show dark icons based on the top of the wallpaper.
    public static final boolean LIGHT_STATUS_BAR = false;

    // Feature flag to enable moving the QSB on the 0th screen of the workspace.
    public static boolean qsbOnFirstSceen(Context context){
        return Utilities.getPrefs(context).getBoolean("pref_qsbOnFirstScreen", true);
    }
    public static boolean pinchToOverview(Context context){
        return Utilities.getPrefs(context).getBoolean("pref_pinchToOverview", true);
    }
}
