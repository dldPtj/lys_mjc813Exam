package org.mjc;

import org.mjc.MjcValidCheck;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestMjcVaildCheck {
    @Test
    public void testisVaildPhoneNumber() {
        MjcValidCheck mvc = new MjcValidCheck();
        assertThat(mvc.isValidPhoneNumber(null)).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("")).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("010-39a2-0203")).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("010-1111-2222")).isEqualTo(true);
    }
    public void testisVaildZipNumber() {
        MjcValidCheck mvc = new MjcValidCheck();
        assertThat(mvc.isValidZipNumber(null)).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("")).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("9100233")).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("03214")).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("87516")).isEqualTo(true);
    }
    public void testisVaildEmail() {
        MjcValidCheck mvc = new MjcValidCheck();
        assertThat(mvc.isValidEmail(null)).isEqualTo(false);
        assertThat(mvc.isValidEmail("")).isEqualTo(false);
        assertThat(mvc.isValidEmail("abcd1234@naver.com")).isEqualTo(true);
        assertThat(mvc.isValidEmail("hi1357@hanmail.net")).isEqualTo(true);
        assertThat(mvc.isValidEmail("hjkowi1022@gmail.cxm")).isEqualTo(false);
    }
}
