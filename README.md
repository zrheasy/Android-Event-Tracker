# Android-Event-Tracker

一个简单的埋点框架，提供EventTracker门面类供业务统一调用。

### 使用步骤：

#### 1.下载AAR并添加到项目中。

#### 2.实现TrackEngine接口。

```kotlin
class LogcatTrackEngine(private val isDebug: Boolean) : TrackEngine {

    override fun setUserId(uid: String?) {

    }

    override fun setUserProperty(key: String, value: String?) {

    }

    override fun track(event: Event) {
        if (isDebug)
            Log.d("EventTracker", event.toString())
    }
}
```

#### 3.为EventTracker设置Engine。

```kotlin
EventTracker.setEngine(LogcatTrackEngine(true))
```

#### 4.构建埋点事件并上报。

```kotlin
EventTracker.build("Login").with("userName", "qwer@gmail.com").track()
```

#### 5.设置用户uid和属性。

```kotlin
EventTracker.setUserId("007")
EventTracker.setUserProperty("sex", "boy")
```