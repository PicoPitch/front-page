package com.james.umc_picopitch_project

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Kakao Sdk 초기화
        KakaoSdk.init(this, "88475c4f780929110c9aebdf573e34fc\n")
    }
}