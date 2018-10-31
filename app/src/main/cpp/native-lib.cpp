#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_toptech_sarakarmous_empolyed_Mainmyaccunt2_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
