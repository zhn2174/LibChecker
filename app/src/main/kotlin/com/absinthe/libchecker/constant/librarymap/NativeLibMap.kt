package com.absinthe.libchecker.constant.librarymap

import com.absinthe.libchecker.R
import com.absinthe.libchecker.constant.LibChip
import java.util.regex.Pattern

object NativeLibMap : BaseMap() {
    private val MAP: HashMap<String, LibChip> = hashMapOf(
        Pair(
            "libflutter.so",
            LibChip(
                R.drawable.ic_lib_flutter,
                "Flutter"
            )
        ),
        Pair(
            "libapp.so",
            LibChip(
                R.drawable.ic_lib_flutter,
                "Flutter"
            )
        ),
        Pair(
            "libBugly.so",
            LibChip(
                R.drawable.ic_lib_bugly,
                "Bugly"
            )
        ),
        Pair(
            "libBugly-rqd.so",
            LibChip(
                R.drawable.ic_lib_bugly,
                "Bugly"
            )
        ),
        Pair(
            "libtpnsSecurity.so",
            LibChip(
                R.drawable.ic_lib_tencent,
                "信鸽推送"
            )
        ),
        Pair(
            "libxguardian.so",
            LibChip(
                R.drawable.ic_lib_tencent,
                "信鸽推送"
            )
        ),
        Pair(
            "libhippybridge.so",
            LibChip(
                R.drawable.ic_lib_tencent,
                "Hippy"
            )
        ),
        Pair(
            "libflexbox.so",
            LibChip(
                R.drawable.ic_lib_tencent,
                "Hippy"
            )
        ),
        Pair(
            "libmmkv.so",
            LibChip(
                R.drawable.ic_lib_tencent,
                "MMKV"
            )
        ),
        Pair(
            "libBeacon.so",
            LibChip(
                R.drawable.ic_lib_tencent,
                "腾讯流量联盟"
            )
        ),
        Pair(
            "libmarsxlog.so",
            LibChip(
                R.drawable.ic_lib_tencent,
                "Mars"
            )
        ),
        Pair(
            "libwcdb.so",
            LibChip(
                R.drawable.ic_lib_tencent,
                "WCDB"
            )
        ),
        Pair(
            "libwtecdh.so",
            LibChip(
                R.drawable.ic_lib_tencent,
                "米大师"
            )
        ),
        Pair(
            "libmtanativecrash_v2.so",
            LibChip(
                R.drawable.ic_lib_tencent,
                "腾讯移动分析"
            )
        ),
        Pair(
            "libMtaNativeCrash.so",
            LibChip(
                R.drawable.ic_lib_tencent,
                "腾讯移动分析"
            )
        ),
        Pair(
            "libliteavsdk.so",
            LibChip(
                R.drawable.ic_lib_tencent_cloud,
                "腾讯云直播 SDK"
            )
        ),
        Pair(
            "libsaturn.so",
            LibChip(
                R.drawable.ic_lib_tencent_cloud,
                "腾讯云直播 SDK"
            )
        ),
        Pair(
            "libqalmsfboot.so",
            LibChip(
                R.drawable.ic_lib_tencent_cloud,
                "腾讯云通信 SDK"
            )
        ),
        Pair(
            "libqalcodecwrapper.so",
            LibChip(
                R.drawable.ic_lib_tencent_cloud,
                "腾讯云通信 SDK"
            )
        ),
        Pair(
            "libwtcrypto.so",
            LibChip(
                R.drawable.ic_lib_tencent_cloud,
                "腾讯云通信 SDK"
            )
        ),
        Pair(
            "libImSDK.so",
            LibChip(
                R.drawable.ic_lib_tencent_cloud,
                "腾讯云通信 SDK"
            )
        ),
        Pair(
            "libijkplayer.so",
            LibChip(
                R.drawable.ic_lib_bilibili,
                "IJKPlayer"
            )
        ),
        Pair(
            "libijksdl.so",
            LibChip(
                R.drawable.ic_lib_bilibili,
                "IJKPlayer"
            )
        ),
        Pair(
            "libijkffmpeg.so",
            LibChip(
                R.drawable.ic_lib_bilibili,
                "IJKPlayer"
            )
        ),
        Pair(
            "libndkbitmap.so",
            LibChip(
                R.drawable.ic_lib_bilibili,
                "烈焰弹幕使"
            )
        ),
        Pair(
            "libreactnativejni.so",
            LibChip(
                R.drawable.ic_lib_react,
                "React Native"
            )
        ),
        Pair(
            "libjsc.so",
            LibChip(
                R.drawable.ic_lib_react,
                "React Native"
            )
        ),
        Pair(
            "libfolly_json.so",
            LibChip(
                R.drawable.ic_lib_react,
                "React Native"
            )
        ),
        Pair(
            "libjsinspector.so",
            LibChip(
                R.drawable.ic_lib_react,
                "React Native"
            )
        ),
        Pair(
            "libjsinspector.so",
            LibChip(
                R.drawable.ic_lib_react,
                "React Native"
            )
        ),
        Pair(
            "libjscexecutor.so",
            LibChip(
                R.drawable.ic_lib_react,
                "React Native"
            )
        ),
        Pair(
            "libJavaScriptCore.so",
            LibChip(
                R.drawable.ic_lib_react,
                "React Native"
            )
        ),
        Pair(
            "libglog_init.so",
            LibChip(
                R.drawable.ic_lib_react,
                "React Native"
            )
        ),
        Pair(
            "libfb.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Facebook SDK"
            )
        ),
        Pair(
            "libjiagu.so",
            LibChip(
                R.drawable.ic_lib_360,
                "360 加固"
            )
        ),
        Pair(
            "libc++_shared.so",
            LibChip(
                R.drawable.ic_lib_cpp,
                "C++ 共享库"
            )
        ),
        Pair(
            "libgnustl_shared.so",
            LibChip(
                R.drawable.ic_lib_cpp,
                "C++ 共享库"
            )
        ),
        Pair(
            "libstlport_shared.so",
            LibChip(
                R.drawable.ic_lib_cpp,
                "C++ STL"
            )
        ),
        Pair(
            "libwind.so",
            LibChip(
                R.drawable.ic_lib_weibo,
                "微博 SDK"
            )
        ),
        Pair(
            "libutility.so",
            LibChip(
                R.drawable.ic_lib_weibo,
                "微博 SDK"
            )
        ),
        Pair(
            "libweibosdkcore.so",
            LibChip(
                R.drawable.ic_lib_weibo,
                "微博 SDK"
            )
        ),
        Pair(
            "libmsc.so",
            LibChip(
                R.drawable.ic_lib_xunfei,
                "讯飞 SDK"
            )
        ),
        Pair(
            "libluajava.so",
            LibChip(
                R.drawable.ic_lib_lua,
                "AndroLua"
            )
        ),
        Pair(
            "libRSSupport.so",
            LibChip(
                R.drawable.ic_android_outline,
                "RenderScript"
            )
        ),
        Pair(
            "librsjni.so",
            LibChip(
                R.drawable.ic_android_outline,
                "RenderScript"
            )
        ),
        Pair(
            "librsjni_androidx.so",
            LibChip(
                R.drawable.ic_android_outline,
                "RenderScript"
            )
        ),
        Pair(
            "libframesequence.so",
            LibChip(
                R.drawable.ic_android_outline,
                "FrameSequence"
            )
        ),
        Pair(
            "libweexcore.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "Weex"
            )
        ),
        Pair(
            "libWeexEagle.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "Weex"
            )
        ),
        Pair(
            "libweexjst.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "Weex"
            )
        ),
        Pair(
            "libweexjss.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "Weex"
            )
        ),
        Pair(
            "libweexjsb.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "Weex"
            )
        ),
        Pair(
            "libweexjssr.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "Weex"
            )
        ),
        Pair(
            "libgcanvas.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "GCanvas"
            )
        ),
        Pair(
            "libWTF.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "Weex"
            )
        ),
        Pair(
            "libandfix.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "AndFix"
            )
        ),
        Pair(
            "libcrashsdk.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "岳鹰 SDK"
            )
        ),
        Pair(
            "libMNN.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "MNN"
            )
        ),
        Pair(
            "libMNN_CL.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "MNN"
            )
        ),
        Pair(
            "libMNN_Express.so",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "MNN"
            )
        ),
        Pair(
            "libtencentloc.so",
            LibChip(
                R.drawable.ic_lib_tencent_map,
                "腾讯地图 SDK"
            )
        ),
        Pair(
            "libtxmapengine.so",
            LibChip(
                R.drawable.ic_lib_tencent_map,
                "腾讯地图 SDK"
            )
        ),
        Pair(
            "libyuv.so",
            LibChip(
                R.drawable.ic_lib_google,
                "libYUV"
            )
        ),
        Pair(
            "libYUV.so",
            LibChip(
                R.drawable.ic_lib_google,
                "libYUV"
            )
        ),
        Pair(
            "libglog.so",
            LibChip(
                R.drawable.ic_lib_google,
                "glog"
            )
        ),
        Pair(
            "libarcore_sdk_jni.so",
            LibChip(
                R.drawable.ic_lib_google_arcore,
                "ARCore"
            )
        ),
        Pair(
            "libunity.so",
            LibChip(
                R.drawable.ic_lib_unity,
                "Unity"
            )
        ),
        Pair(
            "libmain.so",
            LibChip(
                R.drawable.ic_lib_unity,
                "Unity"
            )
        ),
        Pair(
            "libmono.so",
            LibChip(
                R.drawable.ic_lib_unity,
                "Unity"
            )
        ),
        Pair(
            "libyoga.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Yoga"
            )
        ),
        Pair(
            "libyouga.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Yoga"
            )
        ),
        Pair(
            "liblib_fb_fbjni.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Yoga"
            )
        ),
        Pair(
            "librealm-jni.so",
            LibChip(
                R.drawable.ic_lib_realm,
                "realm"
            )
        ),
        Pair(
            "libcrashlytics.so",
            LibChip(
                R.drawable.ic_lib_firebase,
                "Crashlytics"
            )
        ),
        Pair(
            "libopencv_java3.so",
            LibChip(
                R.drawable.ic_lib_opencv,
                "OpenCV"
            )
        ),
        Pair(
            "libpl_droidsonroids_gif.so",
            LibChip(
                R.drawable.ic_lib_gif,
                "android-gif-drawable"
            )
        ),
        Pair(
            "libCtaApiLib.so",
            LibChip(
                R.drawable.ic_lib_jverification,
                "极光认证 SDK"
            )
        ),
        Pair(
            "libsqlcipher.so",
            LibChip(
                R.drawable.ic_lib_sql,
                "SQLCipher"
            )
        ),
        Pair(
            "libstlport_shared.so",
            LibChip(
                R.drawable.ic_lib_sql,
                "SQLCipher"
            )
        ),
        Pair(
            "libsgsecuritybody.so",
            LibChip(
                R.drawable.ic_lib_ali_security,
                "阿里聚安全"
            )
        ),
        Pair(
            "libsgavmp.so",
            LibChip(
                R.drawable.ic_lib_ali_security,
                "阿里聚安全"
            )
        ),
        Pair(
            "libsgmain.so",
            LibChip(
                R.drawable.ic_lib_ali_security,
                "阿里聚安全"
            )
        ),
        Pair(
            "libsgsgmiddletier.so",
            LibChip(
                R.drawable.ic_lib_ali_security,
                "阿里聚安全"
            )
        ),
        Pair(
            "libimagepipeline.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Fresco"
            )
        ),
        Pair(
            "libstatic-webp.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Fresco"
            )
        ),
        Pair(
            "libbitmaps.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Fresco"
            )
        ),
        Pair(
            "libgifimage.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Fresco"
            )
        ),
        Pair(
            "libmemchunk.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Fresco"
            )
        ),
        Pair(
            "libwebpimage.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Fresco"
            )
        ),
        Pair(
            "libnative-filters.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Fresco"
            )
        ),
        Pair(
            "libnative-imagetranscoder.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Fresco"
            )
        ),
        Pair(
            "libwebp.so",
            LibChip(
                R.drawable.ic_lib_facebook,
                "Fresco"
            )
        ),
        Pair(
            "libentryexpro.so",
            LibChip(
                R.drawable.ic_lib_unionpay,
                "银联 SDK"
            )
        ),
        Pair(
            "libuptsmaddon.so",
            LibChip(
                R.drawable.ic_lib_unionpay,
                "银联 SDK"
            )
        ),
        Pair(
            "libuptsmaddonmi.so",
            LibChip(
                R.drawable.ic_lib_unionpay,
                "银联 SDK"
            )
        ),
        Pair(
            "libuptsmservice.so",
            LibChip(
                R.drawable.ic_lib_unionpay,
                "银联 SDK"
            )
        ),
        Pair(
            "libsdk_patcher_jni.so",
            LibChip(
                R.drawable.ic_lib_xiaomi,
                "小米更新 SDK"
            )
        ),
        Pair(
            "libconnectionbase.so",
            LibChip(
                R.drawable.ic_lib_xiaomi,
                "小米游戏 SDK"
            )
        ),
        Pair(
            "libmilinkconnection.so",
            LibChip(
                R.drawable.ic_lib_xiaomi,
                "小米游戏 SDK"
            )
        ),
        Pair(
            "libmibraindec.so",
            LibChip(
                R.drawable.ic_lib_xiaoai,
                "小爱 SDK"
            )
        ),
        Pair(
            "libmibrainjni.so",
            LibChip(
                R.drawable.ic_lib_xiaoai,
                "小爱 SDK"
            )
        ),
        Pair(
            "libmibrainsdk.so",
            LibChip(
                R.drawable.ic_lib_xiaoai,
                "小爱 SDK"
            )
        ),
        Pair(
            "libmibrainvad2.so",
            LibChip(
                R.drawable.ic_lib_xiaoai,
                "小爱 SDK"
            )
        ),
        Pair(
            "libapssdk.so",
            LibChip(
                R.drawable.ic_lib_amap,
                "高德 SDK"
            )
        ),
        Pair(
            "libBaiduSpeechSDK.so",
            LibChip(
                R.drawable.ic_lib_baidu,
                "DuMix"
            )
        ),
        Pair(
            "libvad.dnn.so",
            LibChip(
                R.drawable.ic_lib_baidu,
                "DuMix"
            )
        ),
        Pair(
            "libbdSpilWakeup.so",
            LibChip(
                R.drawable.ic_lib_baidu,
                "DuMix"
            )
        ),
        Pair(
            "libbdEASRAndroid.so",
            LibChip(
                R.drawable.ic_lib_baidu,
                "DuMix"
            )
        ),
        Pair(
            "libImgRecognition.so",
            LibChip(
                R.drawable.ic_lib_baidu,
                "DuMix"
            )
        ),
        Pair(
            "libindoor.so",
            LibChip(
                R.drawable.ic_lib_baidu,
                "百度 LBS"
            )
        ),
        Pair(
            "libarcore_sdk_c.so",
            LibChip(
                R.drawable.ic_question,
                "ViroCore"
            )
        ),
        Pair(
            "libmp3lame.so",
            LibChip(
                R.drawable.ic_question,
                "LAME"
            )
        ),
        Pair(
            "libmonosgen-2.0.so",
            LibChip(
                R.drawable.ic_lib_xamarin,
                "Xamarin"
            )
        ),
        Pair(
            "libmonodroid.so",
            LibChip(
                R.drawable.ic_lib_xamarin,
                "Xamarin"
            )
        ),
        Pair(
            "libmonodroid_bundle_app.so",
            LibChip(
                R.drawable.ic_lib_xamarin,
                "Xamarin"
            )
        ),
        Pair(
            "libmono-btls-shared.so",
            LibChip(
                R.drawable.ic_lib_xamarin,
                "Xamarin"
            )
        ),
        Pair(
            "libaot-mscorlib.dll.so",
            LibChip(
                R.drawable.ic_lib_xamarin,
                "Xamarin"
            )
        ),
        Pair(
            "libxamarin-app.so",
            LibChip(
                R.drawable.ic_lib_xamarin,
                "Xamarin"
            )
        ),
        Pair(
            "libmono-native.so",
            LibChip(
                R.drawable.ic_lib_xamarin,
                "Xamarin"
            )
        ),
        Pair(
            "libbmob.so",
            LibChip(
                R.drawable.ic_question,
                "Bmob 后端云"
            )
        ),
        Pair(
            "libdexjni.so",
            LibChip(
                R.drawable.ic_question,
                "梆梆安全"
            )
        ),
        Pair(
            "libDexHelper.so",
            LibChip(
                R.drawable.ic_question,
                "梆梆安全"
            )
        ),
        Pair(
            "libDexHelper-x86.so",
            LibChip(
                R.drawable.ic_question,
                "梆梆安全"
            )
        ),
        Pair(
            "libSecShell.so",
            LibChip(
                R.drawable.ic_question,
                "梆梆安全"
            )
        ),
        Pair(
            "libSecShell-x86.so",
            LibChip(
                R.drawable.ic_question,
                "梆梆安全"
            )
        ),
        Pair(
            "libsecexe.so",
            LibChip(
                R.drawable.ic_question,
                "梆梆安全"
            )
        ),
        Pair(
            "libnms.so",
            LibChip(
                R.drawable.ic_lib_bytedance,
                "Pangle SDK"
            )
        ),
        Pair(
            "libtobEmbedEncrypt.so",
            LibChip(
                R.drawable.ic_lib_bytedance,
                "Pangle SDK"
            )
        ),
        Pair(
            "libbuffer_pg.so",
            LibChip(
                R.drawable.ic_lib_bytedance,
                "Pangle SDK"
            )
        ),
        Pair(
            "libfile_lock_pg.so",
            LibChip(
                R.drawable.ic_lib_bytedance,
                "Pangle SDK"
            )
        ),
        Pair(
            "libgetuiext3.so",
            LibChip(
                R.drawable.ic_question,
                "个推"
            )
        ),
        Pair(
            "libepic.so",
            LibChip(
                R.drawable.ic_question,
                "Epic"
            )
        ),
        Pair(
            "libxcrash.so",
            LibChip(
                R.drawable.ic_lib_iqiyi,
                "xCrash"
            )
        ),
        Pair(
            "libxcrash_dumper.so",
            LibChip(
                R.drawable.ic_lib_iqiyi,
                "xCrash"
            )
        ),
        Pair(
            "libJni_wgs2gcj.so",
            LibChip(
                R.drawable.ic_question,
                "wgs2gcj"
            )
        ),
        Pair(
            "libtensorflowlite_jni.so",
            LibChip(
                R.drawable.ic_lib_tensorflow,
                "TensorFlow Lite"
            )
        ),
        Pair(
            "libgojni.so",
            LibChip(
                R.drawable.ic_lib_golang,
                "Golang"
            )
        ),
        Pair(
            "libhyphenate.so",
            LibChip(
                R.drawable.ic_question,
                "环信 IM"
            )
        ),
        Pair(
            "libQPlayer.so",
            LibChip(
                R.drawable.ic_lib_qiniu,
                "PLDroidPlayer"
            )
        ),
        Pair(
            "libRongIMLib.so",
            LibChip(
                R.drawable.ic_lib_rongyun,
                "融云 IM"
            )
        ),
        Pair(
            "libboost_multidex.so",
            LibChip(
                R.drawable.ic_lib_bytedance,
                "BoostMultiDex"
            )
        ),
        Pair(
            "libpingpp.so",
            LibChip(
                R.drawable.ic_question,
                "Ping++"
            )
        ),
        Pair(
            "libagora-rtc-sdk-jni.so",
            LibChip(
                R.drawable.ic_lib_webrtc,
                "WebRTC"
            )
        ),
        Pair(
            "libUE4.so",
            LibChip(
                R.drawable.ic_lib_unreal_engine,
                "Unreal Engine"
            )
        ),
    )

    override fun getMap(): HashMap<String, LibChip> {
        return MAP
    }

    override fun findRegex(name: String): LibChip? {
        return when {
            Pattern.matches("libAMapSDK_MAP_v(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_amap, "高德地图 SDK", "regex_amap_sdk")
            Pattern.matches("libaot-Xamarin\\.Android\\.(.*)\\.dll\\.so", name) -> LibChip(R.drawable.ic_lib_xamarin, "Xamarin", "regex_xamarin")
            Pattern.matches("libcronet\\.(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_chromium, "Cronet", "regex_cronet")
            Pattern.matches("libsgavmpso-(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_ali_security, "阿里聚安全", "regex_ali_security")
            Pattern.matches("libsgmainso-(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_ali_security, "阿里聚安全", "regex_ali_security")
            Pattern.matches("libsgsecuritybodyso-(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_ali_security, "阿里聚安全", "regex_ali_security")
            Pattern.matches("libsgsgmiddletierso-(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_ali_security, "阿里聚安全", "regex_ali_security")
            Pattern.matches("libBaiduMapSDK_v(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_baidu, "百度地图 SDK", "regex_baidu_map")
            Pattern.matches("libBaiduMapSDK_base_v(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_baidu, "百度地图 SDK", "regex_baidu_map")
            Pattern.matches("libBaiduMapSDK_map_v(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_baidu, "百度地图 SDK", "regex_baidu_map")
            Pattern.matches("liblocSDK(.*)[0-9]a\\.so", name) -> LibChip(R.drawable.ic_lib_baidu, "百度地图 SDK", "regex_baidu_map")
            Pattern.matches("libcocklogic-(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_alibaba, "百川 SDK", "regex_ali_baichuan")
            Pattern.matches("libbdpush_V(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_baidu, "百度云推送", "regex_baidu_push")
            Pattern.matches("libjcore(.*)\\.so", name) -> LibChip(R.drawable.ic_lib_jpush, "极光推送", "regex_jpush")
            Pattern.matches("libtnet-(.*)\\.so", name) -> LibChip(R.drawable.ic_question, "libtnet", "regex_libtnet")
            else -> null
        }
    }
}