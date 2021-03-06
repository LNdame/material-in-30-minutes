/*
 * Copyright (C) 2015 Saúl Díaz
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

package com.sefford.material.sample.common.logging;

import android.content.Context;
import com.sefford.kor.common.interfaces.Loggable;

/**
 * Logger interface based on Jorge Rodriguez's <tylosan@gmail.com>
 *
 * @author Saul Diaz <saul@chicisimo.com>
 */
public interface Logger extends Loggable {

    void bind(Context context);

    void identify(long userId);

    void e(String logtag, String message);

    void e(String logtag, String message, Throwable e);

    void d(String logtag, String message);

    void w(String logtag, String message);

    void w(String logtag, String message, Throwable e);

    void v(String logtag, String message);

    void printPerformanceLog(String tag, String element, long start);
}
