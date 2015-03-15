package com.spring.integration.sample.lab1;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

import java.io.File;

/**
 *
 * @author ajay
 */
public class FileSelector implements MessageSelector {

    @Override
    public boolean accept(Message<?> message) {
        if (message.getPayload() instanceof File
                && ((File) message.getPayload()).getName().startsWith("msg1")) {
            return false;
        }
        return true;
    }
}
