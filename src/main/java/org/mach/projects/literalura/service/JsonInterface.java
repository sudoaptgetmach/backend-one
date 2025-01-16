package org.mach.projects.literalura.service;

public interface JsonInterface {
    <T> T obtainData(String json, Class<T> anyClass);
}
