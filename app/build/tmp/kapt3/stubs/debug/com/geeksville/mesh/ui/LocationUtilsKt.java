package com.geeksville.mesh.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u001a&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001\u001a&\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001\u001a!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0019\u001a!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0019\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0019\u001a&\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0001\u001a\u0016\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#\u001a\u000e\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0001\u00a8\u0006\'"}, d2 = {"DMSToDegrees", "", "degrees", "minutes", "seconds", "isPostive", "", "", "", "addDistance", "", "lat", "longitude", "distMeters", "theta", "bearing", "lat1", "lon1", "lat2", "lon2", "degreesToD", "", "", "_degIn", "isLatitude", "(DZ)[Ljava/lang/String;", "degreesToDM", "degreesToDMS", "latLongToMeter", "lat_a", "lng_a", "lat_b", "lng_b", "positionToMeter", "a", "Lcom/geeksville/mesh/MeshProtos$Position;", "b", "radToBearing", "rad", "app_debug"})
public final class LocationUtilsKt {
    
    /**
     * Format as degrees, minutes, secs
     *
     * @param degIn
     * @param isLatitude
     * @return a string like 120deg
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String[] degreesToDMS(double _degIn, boolean isLatitude) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String[] degreesToDM(double _degIn, boolean isLatitude) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String[] degreesToD(double _degIn, boolean isLatitude) {
        return null;
    }
    
    /**
     * A not super efficent mapping from a starting lat/long + a distance at a
     * certain direction
     *
     * @param lat
     * @param longitude
     * @param distMeters
     * @param theta
     * in radians, 0 == north
     * @return an array with lat and long
     */
    @org.jetbrains.annotations.NotNull()
    public static final double[] addDistance(double lat, double longitude, double distMeters, double theta) {
        return null;
    }
    
    /**
     * @return distance in meters along the surface of the earth (ish)
     */
    public static final double latLongToMeter(double lat_a, double lng_a, double lat_b, double lng_b) {
        return 0.0;
    }
    
    public static final double positionToMeter(@org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.MeshProtos.Position a, @org.jetbrains.annotations.NotNull()
    com.geeksville.mesh.MeshProtos.Position b) {
        return 0.0;
    }
    
    /**
     * Convert degrees/mins/secs to a single double
     *
     * @param degrees
     * @param minutes
     * @param seconds
     * @param isPostive
     * @return
     */
    public static final double DMSToDegrees(int degrees, int minutes, float seconds, boolean isPostive) {
        return 0.0;
    }
    
    public static final double DMSToDegrees(double degrees, double minutes, double seconds, boolean isPostive) {
        return 0.0;
    }
    
    /**
     * Computes the bearing in degrees between two points on Earth.
     *
     * @param lat1
     * Latitude of the first point
     * @param lon1
     * Longitude of the first point
     * @param lat2
     * Latitude of the second point
     * @param lon2
     * Longitude of the second point
     * @return Bearing between the two points in degrees. A value of 0 means due
     * north.
     */
    public static final double bearing(double lat1, double lon1, double lat2, double lon2) {
        return 0.0;
    }
    
    /**
     * Converts an angle in radians to degrees
     */
    public static final double radToBearing(double rad) {
        return 0.0;
    }
}