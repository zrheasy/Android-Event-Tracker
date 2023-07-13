package com.zrh.tracker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @author zrh
 * @date 2023/7/13
 */
public interface TrackEngine {
    void setUserId(@Nullable String uid);

    void setUserProperty(@NonNull String key, @Nullable String value);

    void track(@NonNull Event event);
}
