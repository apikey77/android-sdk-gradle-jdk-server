# Android SDK example

- Android Gradle Plugin: `8.5.2`
- Kotlin: `1.9.24`
- Compile SDK: `35`
- Minimum SDK: `24`
- Java/JDK: `17`

## Open and build

1. Open this repository in Android Studio.
2. Allow Gradle to download dependencies.
3. Select the `app` configuration and run it on an emulator or device.

From a terminal with Android SDK and JDK 17 configured:

```bash
./gradlew assembleDebug
```

The debug APK will be generated at:

```text
app/build/outputs/apk/debug/app-debug.apk
```

If the Gradle wrapper has not been generated yet, use Android Studio's Gradle sync or install Gradle 8.7 and run:

```bash
gradle wrapper --gradle-version 8.7
```

Then commit the generated `gradlew`, `gradlew.bat`, and `gradle/wrapper/` files.
