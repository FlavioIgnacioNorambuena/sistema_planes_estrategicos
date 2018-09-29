package com.ubb.sistema_planes_estrategicos.Exceptions;

public class VisionNotFoundException extends RuntimeException{
    public VisionNotFoundException(String visionTitle) {
        super("could not find vision with title: " + visionTitle + ".");
    }

}
