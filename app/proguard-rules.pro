# ProGuard rules for SoloRetreat

# Keep Room entities
-keep class com.soloretreat.data.local.entity.* { *; }
-keep class com.soloretreat.data.model.* { *; }

# Keep serializers
-keepattributes *Annotation*
-keepattributes Signature
-keepattributes Exceptions

# Kotlin serialization
-keep class kotlinx.serialization.** { *; }

# Hilt
-keep class dagger.hilt.** { *; }
-keep class javax.inject.** { *; }
-keep class * extends dagger.hilt.android.lifecycle.HiltViewModel

# WorkManager
-keep class * extends androidx.work.Worker
-keep class * extends androidx.work.InputMerger

# Glance
-keep class androidx.glance.** { *; }

# Keep line numbers for debugging
-keepattributes SourceFile,LineNumberTable