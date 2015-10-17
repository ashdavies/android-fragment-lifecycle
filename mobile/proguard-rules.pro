# AutoParcelGson
-keep class **.AutoParcelGson_*
-keepnames @auto.parcelgson.AutoParcelGson class *

# Butterknife
-dontwarn butterknife.internal.**
-keep class butterknife.** { *; }
-keep class **$$ViewBinder { *; }
-keepclasseswithmembernames class * { @butterknife.* <fields>; }
-keepclasseswithmembernames class * { @butterknife.* <methods>; }

# Crashlytics
-keep class com.crashlytics.** { *; }
-keepattributes SourceFile,LineNumberTable

# Retrofit
-dontwarn retrofit.**
-keep class retrofit.** { *; }
-keepattributes Signature
-keepattributes Exceptions

# Retrolamdba
-dontwarn java.lang.invoke.*

# Realm
-dontwarn javax.**
-dontwarn io.realm.**
-keep class io.realm.annotations.RealmModule
-keep @io.realm.annotations.RealmModule class *

# RxJava
-dontwarn rx.internal.util.unsafe.*
-keep class rx.schedulers.Schedulers { public static <methods>; }
-keep class rx.schedulers.ImmediateScheduler { public <methods>; }
-keep class rx.schedulers.TestScheduler { public <methods>; }
-keep class rx.schedulers.Schedulers { public static ** test(); }

# Okio
-dontwarn java.nio.file.*
-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
-dontwarn okio.**
-keep class sun.misc.Unsafe { *; }

# Timer
-dontwarn org.jetbrains.annotations.NonNls
