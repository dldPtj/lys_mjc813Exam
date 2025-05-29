package com.lysmjc813.lib;

import static java.util.regex.Pattern.matches;

public class MjcVaildCheck {

    public boolean isVaildPhoneNumber(String text) {
        if(text.matches("^01[0-9]-\\d{3,4}-\\d{4}$")){
            return true;
        } else {
            return false;
        }
    }

    public boolean isVaildZipNumber(String text) {
        if (text.length() != 5 || text.charAt(0) == 0 || text == null || text == "" ) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isVaildEmail(String text) {
        String mobEmail[] = text.split(".");
        String email2 = mobEmail[1];
        if (email2 == "com" || email2 == "net") {
            return true;
        } else if(text == null || text == "") {
            return false;
        } else {
            return false;
        }
    }

}
