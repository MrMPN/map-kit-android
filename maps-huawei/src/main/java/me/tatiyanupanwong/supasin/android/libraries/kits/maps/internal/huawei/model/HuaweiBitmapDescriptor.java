/*
 * Copyright (C) 2020 Supasin Tatiyanupanwong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.huawei.model;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.BitmapDescriptor;

class HuaweiBitmapDescriptor implements BitmapDescriptor {

    static final Factory FACTORY = new Factory() {
        @NonNull
        @Override
        public BitmapDescriptor defaultMarker() {
            return new HuaweiBitmapDescriptor(BitmapDescriptorFactory.defaultMarker());
        }

        @NonNull
        @Override
        public BitmapDescriptor defaultMarker(float hue) {
            return new HuaweiBitmapDescriptor(BitmapDescriptorFactory.defaultMarker(hue));
        }

        @NonNull
        @Override
        public BitmapDescriptor fromAsset(String assetName) {
            return new HuaweiBitmapDescriptor(BitmapDescriptorFactory.fromAsset(assetName));
        }

        @NonNull
        @Override
        public BitmapDescriptor fromBitmap(Bitmap image) {
            return new HuaweiBitmapDescriptor(BitmapDescriptorFactory.fromBitmap(image));
        }

        @NonNull
        @Override
        public BitmapDescriptor fromFile(String fileName) {
            return new HuaweiBitmapDescriptor(BitmapDescriptorFactory.fromFile(fileName));
        }

        @NonNull
        @Override
        public BitmapDescriptor fromPath(String absolutePath) {
            return new HuaweiBitmapDescriptor(BitmapDescriptorFactory.fromPath(absolutePath));
        }

        @NonNull
        @Override
        public BitmapDescriptor fromResource(int resourceId) {
            return new HuaweiBitmapDescriptor(BitmapDescriptorFactory.fromResource(resourceId));
        }
    };


    private final com.huawei.hms.maps.model.BitmapDescriptor mDelegate;

    private HuaweiBitmapDescriptor(com.huawei.hms.maps.model.BitmapDescriptor delegate) {
        mDelegate = delegate;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        HuaweiBitmapDescriptor that = (HuaweiBitmapDescriptor) obj;

        return mDelegate.equals(that.mDelegate);
    }

    @Override
    public int hashCode() {
        return mDelegate.hashCode();
    }

    @NonNull
    @Override
    public String toString() {
        return mDelegate.toString();
    }


    static BitmapDescriptor wrap(com.huawei.hms.maps.model.BitmapDescriptor delegate) {
        return new HuaweiBitmapDescriptor(delegate);
    }

    static com.huawei.hms.maps.model.BitmapDescriptor unwrap(BitmapDescriptor wrapped) {
        return ((HuaweiBitmapDescriptor) wrapped).mDelegate;
    }

}
