package io.swagger2.api.config;

import org.springframework.core.convert.converter.Converter;
import io.swagger2.model.EventId;
import java.lang.*;

public class StringToEnumConverter implements Converter<String, EventId> {
    @Override
    public EventId convert(String source) {
        return EventId.valueOf(source.toUpperCase());
    }
    
	/*public StringToEnumConverter append(Object string) {
		// TODO Auto-generated method stub
		return append(String.valueOf(string));
	}*/
}

