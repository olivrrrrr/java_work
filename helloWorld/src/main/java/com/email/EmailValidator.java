package com.email;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
        public boolean isValid (String emailAddress) {
            Pattern pattern = Pattern.compile("@");
            Matcher matcher = pattern.matcher(emailAddress);
            return matcher.find();
        }
    }
