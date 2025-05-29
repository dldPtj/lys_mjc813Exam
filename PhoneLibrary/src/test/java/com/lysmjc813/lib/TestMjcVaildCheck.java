package com.lysmjc813.lib;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestMjcVaildCheck {
    @Test
    public void testisVaildPhoneNumber() {
        MjcVaildCheck mvc = new MjcVaildCheck();
        assertThat(mvc.isVaildPhoneNumber(null)).isEqualTo(false);
        assertThat(mvc.isVaildPhoneNumber("")).isEqualTo(false);
        assertThat(mvc.isVaildPhoneNumber("010-39a2-0203")).isEqualTo(false);
        assertThat(mvc.isVaildPhoneNumber("010-1111-2222")).isEqualTo(true);
    }
    public void testisVaildZipNumber() {
        MjcVaildCheck mvc = new MjcVaildCheck();
        assertThat(mvc.isVaildZipNumber(null)).isEqualTo(false);
        assertThat(mvc.isVaildZipNumber("")).isEqualTo(false);
        assertThat(mvc.isVaildZipNumber("9100233")).isEqualTo(false);
        assertThat(mvc.isVaildZipNumber("03214")).isEqualTo(false);
        assertThat(mvc.isVaildZipNumber("87516")).isEqualTo(true);
    }
    public void testisVaildEmail() {
        MjcVaildCheck mvc = new MjcVaildCheck();
        assertThat(mvc.isVaildEmail(null)).isEqualTo(false);
        assertThat(mvc.isVaildEmail("")).isEqualTo(false);
        assertThat(mvc.isVaildEmail("abcd1234@naver.com")).isEqualTo(true);
        assertThat(mvc.isVaildEmail("hi1357@hanmail.net")).isEqualTo(true);
        assertThat(mvc.isVaildEmail("hjkowi1022@gmail.cxm")).isEqualTo(false);
    }
}
