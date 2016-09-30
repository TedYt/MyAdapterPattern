package com.ted.defaultadapterpattern;

/**
 * Copyright (C) 2008 The Android Open Source Project
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Created by Ted.Yt on 9/30/16.
 *
 *
 * 只实现其关心的方法
 */
public class JobImpl extends JobDefault {

    @Override
    public void speakChinese(){
        super.speakChinese();
        System.out.println("I can speak Chinese");
    }

    @Override
    public void speakEnglish() {
        super.speakEnglish();
    }
}
