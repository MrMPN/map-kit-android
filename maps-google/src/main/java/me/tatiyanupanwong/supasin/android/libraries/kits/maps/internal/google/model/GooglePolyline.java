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

package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.google.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Arrays;
import java.util.List;

import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.Cap;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.LatLng;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.PatternItem;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.Polyline;

class GooglePolyline implements Polyline {

    private final com.google.android.gms.maps.model.Polyline mDelegate;

    private GooglePolyline(com.google.android.gms.maps.model.Polyline delegate) {
        mDelegate = delegate;
    }

    @Override
    public void remove() {
        mDelegate.remove();
    }

    @Override
    public String getId() {
        return mDelegate.getId();
    }

    @Override
    public void setPoints(List<LatLng> points) {
        mDelegate.setPoints(GoogleLatLng.unwrap(points));
    }

    @Override
    public List<LatLng> getPoints() {
        return GoogleLatLng.wrap(mDelegate.getPoints());
    }

    @Override
    public void setWidth(float width) {
        mDelegate.setWidth(width);
    }

    @Override
    public float getWidth() {
        return mDelegate.getWidth();
    }

    @Override
    public void setColor(int color) {
        mDelegate.setColor(color);
    }

    @Override
    public int getColor() {
        return mDelegate.getColor();
    }

    @Override
    public void setStartCap(@NonNull Cap startCap) {
        mDelegate.setStartCap(GoogleCap.unwrap(startCap));
    }

    @NonNull
    @Override
    public Cap getStartCap() {
        return GoogleCap.wrap(mDelegate.getStartCap());
    }

    @Override
    public void setEndCap(@NonNull Cap endCap) {
        mDelegate.setEndCap(GoogleCap.unwrap(endCap));
    }

    @NonNull
    @Override
    public Cap getEndCap() {
        return GoogleCap.wrap(mDelegate.getEndCap());
    }

    @Override
    public void setJointType(int jointType) {
        mDelegate.setJointType(jointType);
    }

    @Override
    public int getJointType() {
        return mDelegate.getJointType();
    }

    @Override
    public void setPattern(@Nullable List<PatternItem> pattern) {
        mDelegate.setPattern(GooglePatternItem.unwrap(pattern));
    }

    @Nullable
    @Override
    public List<PatternItem> getPattern() {
        return GooglePatternItem.wrap(mDelegate.getPattern());
    }

    @Override
    public void setZIndex(float zIndex) {
        mDelegate.setZIndex(zIndex);
    }

    @Override
    public float getZIndex() {
        return mDelegate.getZIndex();
    }

    @Override
    public void setVisible(boolean visible) {
        mDelegate.setVisible(visible);
    }

    @Override
    public boolean isVisible() {
        return mDelegate.isVisible();
    }

    @Override
    public void setGeodesic(boolean geodesic) {
        mDelegate.setGeodesic(geodesic);
    }

    @Override
    public boolean isGeodesic() {
        return mDelegate.isGeodesic();
    }

    @Override
    public void setClickable(boolean clickable) {
        mDelegate.setClickable(clickable);
    }

    @Override
    public boolean isClickable() {
        return mDelegate.isClickable();
    }

    @Override
    public void setTag(@Nullable Object tag) {
        mDelegate.setTag(tag);
    }

    @Nullable
    @Override
    public Object getTag() {
        return mDelegate.getTag();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        GooglePolyline that = (GooglePolyline) obj;

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


    static Polyline wrap(com.google.android.gms.maps.model.Polyline delegate) {
        return new GooglePolyline(delegate);
    }


    static class Options implements Polyline.Options {
        private final com.google.android.gms.maps.model.PolylineOptions mDelegate;

        Options() {
            mDelegate = new com.google.android.gms.maps.model.PolylineOptions();
        }

        @NonNull
        @Override
        public Polyline.Options add(LatLng point) {
            mDelegate.add(GoogleLatLng.unwrap(point));
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options add(LatLng... points) {
            mDelegate.addAll(GoogleLatLng.unwrap(Arrays.asList(points)));
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options addAll(Iterable<LatLng> points) {
            mDelegate.addAll(GoogleLatLng.unwrap(points));
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options width(float width) {
            mDelegate.width(width);
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options color(int color) {
            mDelegate.color(color);
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options startCap(@NonNull Cap startCap) {
            mDelegate.startCap(GoogleCap.unwrap(startCap));
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options endCap(@NonNull Cap endCap) {
            mDelegate.endCap(GoogleCap.unwrap(endCap));
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options jointType(int jointType) {
            mDelegate.jointType(jointType);
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options pattern(@Nullable List<PatternItem> pattern) {
            mDelegate.pattern(GooglePatternItem.unwrap(pattern));
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options zIndex(float zIndex) {
            mDelegate.zIndex(zIndex);
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options visible(boolean visible) {
            mDelegate.visible(visible);
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options geodesic(boolean geodesic) {
            mDelegate.geodesic(geodesic);
            return this;
        }

        @NonNull
        @Override
        public Polyline.Options clickable(boolean clickable) {
            mDelegate.clickable(clickable);
            return this;
        }

        @Override
        public List<LatLng> getPoints() {
            return GoogleLatLng.wrap(mDelegate.getPoints());
        }

        @Override
        public float getWidth() {
            return mDelegate.getWidth();
        }

        @Override
        public int getColor() {
            return mDelegate.getColor();
        }

        @NonNull
        @Override
        public Cap getStartCap() {
            return GoogleCap.wrap(mDelegate.getStartCap());
        }

        @NonNull
        @Override
        public Cap getEndCap() {
            return GoogleCap.wrap(mDelegate.getEndCap());
        }

        @Override
        public int getJointType() {
            return mDelegate.getJointType();
        }

        @Nullable
        @Override
        public List<PatternItem> getPattern() {
            return GooglePatternItem.wrap(mDelegate.getPattern());
        }

        @Override
        public float getZIndex() {
            return mDelegate.getZIndex();
        }

        @Override
        public boolean isVisible() {
            return mDelegate.isVisible();
        }

        @Override
        public boolean isGeodesic() {
            return mDelegate.isGeodesic();
        }

        @Override
        public boolean isClickable() {
            return mDelegate.isClickable();
        }


        static com.google.android.gms.maps.model.PolylineOptions unwrap(Polyline.Options wrapped) {
            return ((GooglePolyline.Options) wrapped).mDelegate;
        }
    }

}
