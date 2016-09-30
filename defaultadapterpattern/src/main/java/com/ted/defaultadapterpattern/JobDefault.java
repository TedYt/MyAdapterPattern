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
 * 当想要实现一个接口但又不想实现所有接口方法，只想去实现一部分时，
 * 就用默认的适配器模式，他的方法是在接口和具体实现类中添加一个抽象类
 * 用抽象类去 空实现 目标接口的所有方法。
 * 而具体的实现类只需要覆盖其需要完成的方法即可
 *
 */
public abstract class JobDefault implements Job{

    public void speakJapanese(){ }

    public void speakEnglish(){ }

    public void speakFrench(){ }

    public void speakChinese(){ }
}
