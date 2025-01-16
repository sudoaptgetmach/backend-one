package org.mach.projects.literalura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class JsonConverter implements JsonInterface {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T obtainData(String json, Class<T> anyClass) {
        try {
            return objectMapper.readValue(json, anyClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error, can't process JSON.", e);
        }
    }

}
