package com.project.apiSmall.util;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;
import java.util.stream.Stream;


@Component
public class Utils {

    private final Random random = new SecureRandom();
    private final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String generateUserId(int length) {
        return generateRandomString(length);
    }

    private String generateRandomString(int length) {
        StringBuilder returnValue = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            returnValue.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return new String(returnValue);
    }

}